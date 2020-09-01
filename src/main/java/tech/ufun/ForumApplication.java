package tech.ufun;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @author zhanglei
 * @date 2020-08-26 10:15
 */
@SpringBootApplication
@EnableTransactionManagement
@MapperScan("tech.ufun.*.mapper")
public class ForumApplication {
    public static void main(String[] args) {
        SpringApplication.run(ForumApplication.class, args);
    }
}
