package rangkotodotcom.spring.core;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import rangkotodotcom.spring.core.data.Foo;

@Slf4j
@Configuration
public class DuplicateConfiguration {

    @Primary
    @Bean
    public Foo foo1(){
        return new Foo();
    }

    @Bean
    public Foo foo2(){
        return new Foo();
    }
}
