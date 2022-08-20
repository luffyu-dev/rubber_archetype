#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.web;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.rubber.*")
@MapperScan("com.rubber.**.dao.mapper")
@SpringBootApplication
public class RubberServerWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(RubberServerWebApplication.class, args);
    }

}
