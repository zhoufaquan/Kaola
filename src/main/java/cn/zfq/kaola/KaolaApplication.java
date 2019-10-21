package cn.zfq.kaola;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("cn.zfq.kaola.dao")
public class KaolaApplication {

    public static void main(String[] args) {
        SpringApplication.run(KaolaApplication.class, args);
    }

}
