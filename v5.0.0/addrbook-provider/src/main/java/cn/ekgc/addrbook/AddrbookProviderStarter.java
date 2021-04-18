package cn.ekgc.addrbook;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * <b>Addrbook-Provider启动类</b>
 */
@MapperScan("cn.ekgc.addebook.dao")
@EnableEurekaClient
@SpringBootApplication
public class AddrbookProviderStarter {
	public static void main(String[] args) {
		SpringApplication.run(AddrbookProviderStarter.class,args);
	}
}
