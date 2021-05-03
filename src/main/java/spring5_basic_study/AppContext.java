package spring5_basic_study;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppContext {
	
	/*
	 * 객체를 생성하고 초기화하는 설정
	 * 스프링이 생성하는 객체를 Bean, 이 Bean 객체에 대한 정보를 담고 있는 메서드가 greeter()
	 */
	@Bean
	public Greeter greeter() {
		Greeter g = new Greeter();
		g.setFormat("%s, 안녕하세요!");
		return g;
	}
}
