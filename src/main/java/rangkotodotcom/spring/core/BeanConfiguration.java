package rangkotodotcom.spring.core;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import rangkotodotcom.spring.core.data.Foo;

@Configuration
public class BeanConfiguration {

    @Bean
    public Foo foo(){
        Foo foo =new Foo();

        return foo;
    }
}
