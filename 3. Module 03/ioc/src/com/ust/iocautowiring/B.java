package com.ust.iocautowiring;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Qualifier;

public class B {
	
//	int x;
	A a;
	public B() {
		// TODO Auto-generated constructor stub
	}
	
	public B(A a) {
		this.a=a;
		System.out.println("from b() constructor");
	}
	
	@Qualifier("a")
	public void setA(A a) {
		System.out.println("setA() called....");
		this.a = a ;
	}
	
	@PostConstruct //this annotation treats the following method as init() method.
	public void setUp() {
		System.out.println("from setUp()....");
	}
	
	@PreDestroy
	public void windup() {
		System.out.println("from windUp()....");
	}

}
