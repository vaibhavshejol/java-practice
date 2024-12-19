package com.amazingcode.in.example.lambdaexpressions;

public class RunnableLambdaExpression {
    public static void main(String []args){
        
        // // Using anonymous class before java 8
        // Runnable runnable = new Runnable(){
        //     @Override
        //     public void run(){
        //         for(int i=1; i<=10; i++){
        //             System.out.println("Count = "+i);
        //         }
        //     }
        // };

        // Using lamda expression from java 8
        Runnable runnable = () -> {
            for(int i=1; i<=10; i++){
                System.out.println("Count = "+i);
            }
        };

        Thread t = new Thread(runnable);
        Thread t2 = new Thread(runnable);
        t.start();
        t2.start();
    }
}
