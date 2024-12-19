package com.amazingcode.in.example.anonymousclass;

public class AnonymousClassWithInsideMethodOrContructorArgument{
	public static void main(String []args){
		Thread t = new Thread(new Runnable(){
            @Override
			public void run(){
				System.out.println("Hello, This is Anonymous Class With Inside Method Or Contructor Argument.");
			}
		});
		t.start();
	}
}
