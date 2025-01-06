package rangkotodotcom.spring.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.NoUniqueBeanDefinitionException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import rangkotodotcom.spring.core.data.Foo;

public class DuplicateTest {
    @Test
    void testDuplicate() {
        ApplicationContext context = new AnnotationConfigApplicationContext(DuplicateConfiguration.class);

        Assertions.assertThrows(NoUniqueBeanDefinitionException.class, ()->{
            Foo foo = context.getBean(Foo.class);
        });
    }

    @Test
    void testGetBean() {
        ApplicationContext context = new AnnotationConfigApplicationContext(DuplicateConfiguration.class);

        Foo foo = context.getBean(Foo.class);
        Foo foo1 = context.getBean("foo1", Foo.class);
        Foo foo2 = context.getBean("foo2", Foo.class);

        Assertions.assertSame(foo,foo1);
        Assertions.assertNotSame(foo,foo2);
        Assertions.assertNotSame(foo1,foo2);
    }
}
