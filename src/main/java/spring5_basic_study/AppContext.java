package spring5_basic_study;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration	//해당 클래스를 스프링 설정클래스로 지정
public class AppContext {
	//스프링은 객체를 생성, 초기화하는 기능을 제공
	//스프링이 생성하는 객체를 빈(Bean)객체라고 함
	//@Bean 에노테이션을 해당 메서드가 생성한 객체를 스프링이 관리하는 빈 객체로 등록
	@Bean	
	public Greeter greeter() {
		Greeter g = new Greeter();
		g.setFormat("%s, 안녕하세요!");
		return g;
	}
}
