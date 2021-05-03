package spring5_basic_study;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		Greeter gc1 = new Greeter();
		Greeter gc2 = new Greeter();
		System.out.println("gc1 == gc2 >> " + (gc1 == gc2));
		
		try(AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppContext.class)){
			Greeter g = ctx.getBean("greeter", Greeter.class);
			Greeter g2 = ctx.getBean("greeter", Greeter.class);
			
			System.out.println("g == g2 >> " + (g==g2)); // 싱글턴 패턴이기 때문에 true가 나옴
			String msg = g.greet("스프링5");
			System.out.println(msg);
		}
		
	}

}
