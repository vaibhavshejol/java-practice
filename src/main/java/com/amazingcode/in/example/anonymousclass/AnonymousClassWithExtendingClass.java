package com.amazingcode.in.example.anonymousclass;

public class AnonymousClassWithExtendingClass{
	public static void main(String []agrs){
		Thread t = new Thread(){
			@Override
			public void run(){
				System.out.println("Hello, This is Anonymous Class With Extending Class.");
			}
		};
		t.start();
	}
}