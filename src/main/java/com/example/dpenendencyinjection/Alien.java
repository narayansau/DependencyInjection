package com.example.dpenendencyinjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope(value="prototype")   // Create object only when called
public class Alien{
	private  int aid;
	private String aName;
	private String Tech;
	@Autowired
	@Qualifier("laptop")
	private Laptop  myLaptop ;
	
	
	public Laptop getMyLaptop() {
		return myLaptop;
	}
	
	public void setMyLaptop(Laptop myLaptop) {
		this.myLaptop=myLaptop;
	}
	
	public int getAid() {
		return aid;
	}
	
	public void setAid(int aid) {
		this.aid=aid;
	}
	
	public String getaName() {
		return aName;
	}
	
	public void setaName(String aName) {
		this.aName=aName;
	}
	
	public String getTech() {
		return Tech;
	}
	
	public void setTech(String tech) {
		Tech=tech;
	}
	
	public Alien() {
		System.out.println( "Alien Got Initialize" );
		show();
	}
	
	public Alien(int aid, String aName, String tech) {
		this.aid=aid;
		this.aName=aName;
		Tech=tech;
	}
	
	public void show()
	{
		System.out.println( " Show my Alien !!!!" );
		System.out.println( toString() );
	//	myLaptop.compile();
}
	
	@Override
	public String toString() {
		return "Alien{" +
				"aid=" + aid +
				", aName='" + aName + '\'' +
				", Tech='" + Tech + '\'' +
				", myLaptop=" + myLaptop +
				'}';
	}
}
