package com.amazingcode.in.example.anonymousclass;

public class AnonymousClassWithImplementingInterface{
	public static void main(String []args){
		Runnable r = new Runnable(){
            @Override
			public void run(){
				System.out.println("Hello, This is Anonymous Class With Implementing Interface.");
			}
		};
		Thread t = new Thread(r);
		t.start();
	}
}
