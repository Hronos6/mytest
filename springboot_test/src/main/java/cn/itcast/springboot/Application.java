package cn.itcast.springboot;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	//运行springBoot应用
	public static void main(String[] args) {
		//SpringApplication.run(Application.class, args);
		//创建SpringApplication应用对象
		SpringApplication springApplication=new SpringApplication(Application.class);
		/**
		 * 设置横幅模式（设计关闭）
		 */
		springApplication.setBannerMode(Banner.Mode.OFF);
		/**
		 * 运行
		 */
		springApplication.run(args);
	}
}
