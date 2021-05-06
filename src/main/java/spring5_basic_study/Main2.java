package spring5_basic_study;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main2 {
	
	public static void main(String[] args) {
		try (AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppContext.class)){
			Greeter g1 = ctx.getBean("greeter", Greeter.class);
			Greeter g2 = ctx.getBean("greeter", Greeter.class);
			
			System.out.println("(g1==g2) = " + (g1==g2));	//싱글톤이라면 true(같은 객체)
			ctx.close();
		}
	}
}
