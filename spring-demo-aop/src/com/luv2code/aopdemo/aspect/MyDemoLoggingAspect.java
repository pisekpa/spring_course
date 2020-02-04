package com.luv2code.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyDemoLoggingAspect {

	// this is where we add all of our related advices for logging
	
	// let's start with an @Before advice

	
	//@Before("execution(public void addAccount())")  // 1.
	//@Before("execution(public void updateAccount())")  // 2. can't use ;not have class
	//@Before("execution(public void com.luv2code.aopdemo.dao.AccountDAO.addAccount())")  //3.
	//@Before("execution(public void add*())")  //4.
	//@Before("execution(void add*())")  //5.
	@Before("execution(* add*())")  //5.
	public void beforeAddAccountAdvice() {
		
		System.out.println("\n=====>>> Executing @Before advice on addAccount()");
		//System.out.println("\n=====>>> Executing @Before advice on updateAccount()");
		
	}
}










