package cc.wellcloud.iyou;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * springboot启动类
 *
 * @author wangll
 */
@SpringBootApplication
@EnableSwagger2
public class IyouApplication {

    public static void main(String[] args) {
        SpringApplication.run(IyouApplication.class, args);
    }
}

