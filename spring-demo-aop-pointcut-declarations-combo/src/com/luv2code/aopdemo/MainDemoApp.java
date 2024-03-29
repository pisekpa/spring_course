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
		
		//call the account getter/setter methods
		theAccountDAO.setName("foobar");
		theAccountDAO.setServiceCode("silver");
		
		String name = theAccountDAO.getName();
		String code = theAccountDAO.getServiceCode();
		
		//call the membership business method
		theMembershipDAO.addSillyMember();
		theMembershipDAO.goToSleep();
		

				
		// close the context
		context.close();
	}

}










