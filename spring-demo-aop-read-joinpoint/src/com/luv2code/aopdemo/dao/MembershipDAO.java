package com.luv2code.aopdemo.dao;

import org.springframework.stereotype.Component;

@Component
public class MembershipDAO {
	
	//public void addAccount() {
	//public void addSillyMember() { // 14.
	public boolean addSillyMember() {
		System.out.println(getClass() + ":DOING STUFF: ADDING A MEMBERSHIP ACCOUNT");
		
		return true;
	}
	
	public void goToSleep() {
		
		System.out.println(getClass() + ": I'm going to sleep now...");
	}

}
