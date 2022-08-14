#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.web;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("${groupId}.*")
@MapperScan("${groupId}.**.dao.mapper")
@SpringBootApplication
public class RubberServerArchetypeWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(RubberServerArchetypeWebApplication.class, args);
    }

}
