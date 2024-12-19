package com.amazingcode.in.example.anonymousclass;

// interface with an variable and method
interface Age{
	int X = 21;
	void getAge();
}

//Creating anonymous class for implemeting Age interface method
public class AnonymousClass{
	public static void main(String []args){
		//Anonymous class
		Age age = new Age(){
			@Override
			public void getAge(){
				System.out.println("Age is : "+X);
			}
		};
		age.getAge();
		//Here object of Age is not created but an object of a class is created, so created object called as anonymous class.
	}
}