#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.web;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import ${package}.dao.dal.IAtpPlayerInfoDal;
import ${package}.dao.entity.AtpPlayerInfoEntity;
import org.junit.jupiter.api.Test;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;

import javax.annotation.Resource;

@SpringBootTest
@ComponentScan("${groupId}.*")
@MapperScan("${groupId}.**.dao.mapper")
class RubberServerArchetypeWebApplicationTests {

    @Resource
    private IAtpPlayerInfoDal iAtpPlayerInfoDal;

    @Test
    void contextLoads() {

        Page<AtpPlayerInfoEntity> page = new Page<>();
        page.setCurrent(1);
        page.setSize(10);
        iAtpPlayerInfoDal.page(page);
        System.out.println(page);
    }

}
