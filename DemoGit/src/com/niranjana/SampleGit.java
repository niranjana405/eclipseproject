package com.niranjana;


class Student1
{
	int age;
	String name;
	String city;
	
	void  setAge(int a) {
		
		age=a;
	}
	int getAge() {	
	
		return age;
	}
void  setName(String b) {
		
		name=b;
	}
	String getName() {	
	
		return name;
	}
	
void  setCity(String c) {
		
		city=c;
	}
	String getCity() {	
	
		return city;
	}
	
	
	
	
}

public class SampleGit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student1 st1=new Student1();
		st1.setAge(-4);
		int age1=st1.getAge();
		st1.setCity("London");
String city1=st1.getCity();	
		
		
	System.out.println(age1);
	System.out.println(city1);


	}

}
