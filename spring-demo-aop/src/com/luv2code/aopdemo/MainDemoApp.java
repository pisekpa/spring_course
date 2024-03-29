package com.luv2code.aopdemo;

import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.luv2code.aopdemo.dao.AccountDAO;
import com.luv2code.aopdemo.dao.MembershipDAO;
import com.luv2code.aopdemo.DemoConfig;

public class MainDemoApp {

	public static void main(String[] args) {

		// read spring config java class
		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(DemoConfig.class);
		
		// get the bean from spring container
		AccountDAO theAccountDAO = context.getBean("accountDAO", AccountDAO.class);
		
		//get membership bean from spring container
		MembershipDAO theMembershipDAO = context.getBean("membershipDAO" , MembershipDAO.class);
		
		// call the business method
		//theAccountDAO.addAccount();
		Account myAccount = new Account();
		//theAccountDAO.addAccount(myAccount); // match with @Before("execution(* add*(com.luv2code.aopdemo.Account))") 
		theAccountDAO.addAccount(myAccount , true); //
		theAccountDAO.doWork();
		
		//call the membership business method
		theMembershipDAO.addSillyMember();
		theMembershipDAO.goToSleep();
		

		// do it again!
		//System.out.println("\nlet's call it again!\n");
		
		// call the business method again
		//theAccountDAO.addAccount();
				
		// close the context
		context.close();
	}

}










