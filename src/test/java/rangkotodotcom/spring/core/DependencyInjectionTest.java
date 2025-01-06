package rangkotodotcom.spring.core;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import rangkotodotcom.spring.core.data.Bar;
import rangkotodotcom.spring.core.data.Foo;
import rangkotodotcom.spring.core.data.FooBar;

import static org.junit.jupiter.api.Assertions.assertSame;

public class DependencyInjectionTest {

    private ApplicationContext applicationContext;

    @BeforeEach
    void setUp() {
        applicationContext = new AnnotationConfigApplicationContext(DependencyInjectionConfiguration.class);
    }

    @Test
    void testDI() {
        Foo foo = applicationContext.getBean(Foo.class);
        Bar bar = applicationContext.getBean(Bar.class);
        FooBar fooBar = applicationContext.getBean(FooBar.class);

//        assertSame(foo, fooBar.getFoo());
//        assertSame(bar, fooBar.getBar());
    }


    @Test
    void testNoDI(){
        var foo = new Foo();
        var bar = new Bar();

//        var fooBar = new FooBar(foo, bar);
//
//        Assertions.assertSame(foo,fooBar.getFoo());
//        Assertions.assertSame(bar,fooBar.getBar());
    }
}
