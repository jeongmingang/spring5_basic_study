package spring5_basic_study;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	
	public static void main(String[] args) {
		Greeter gc1 = new Greeter();
		Greeter gc2 = new Greeter();
		
		System.out.printf("(gc1==gc2) = %s%n", gc1==gc2);	//false(다른객체)
		
		
		try (AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppContext.class)){
			Greeter g = ctx.getBean("greeter", Greeter.class);
			Greeter g2 = ctx.getBean("greeter", Greeter.class);
			
			System.out.printf("(g1==g2) = %s%n", g==g2);	//싱글톤이라면 true(같은 객체)
			
			String msg = g.greet("스프링5");	//문자열을 리턴
			System.out.println(msg);
			ctx.close();
		}
	}
}
