package com.luv2code.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(2)
public class MyDemoLoggingAspect {
	
	

//	@Before("forDaoPackage()")  
//	public void beforeAddAccountAdvice() {
//		System.out.println("\n=====>>> Executing @Before advice on method()");
//		//System.out.println("\n=====>>> Executing @Before advice on updateAccount()");		
//	}
//	
//	@Before("forDaoPackage()")
//	public void performApiAnalytics() {
//		System.out.println("\n=====>>> Performing API analytiscs");
//	}
	
	@Before("com.luv2code.aopdemo.aspect.LuvAopExpressions.forDaoPackageNoGetterSetter()")
	public void logToCloudAsync() {
		System.out.println("\n=====>>> Logging to Cloud un async fashion");
	}
	
}










