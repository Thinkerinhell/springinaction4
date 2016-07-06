package chapter3.concert;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class Audience {
	
	@Pointcut("execution(** chapter3.concert.Performance.perform(..))")
	public void performance() {}
	
	@Before("performance()")
	public void silencePhones(){
		System.out.println("Turn off handphones before performance");
	}
	
	@Before("performance()")
	public void takeSeats() {
	System.out.println("Taking seats");
	}
	
	@AfterReturning("performance()")
	public void applause() {
	System.out.println("CLAP CLAP CLAP!!!");
	}
	
	@AfterThrowing("performance()")
	public void demandRefund() {
	System.out.println("Demanding a refund");
	}
}
