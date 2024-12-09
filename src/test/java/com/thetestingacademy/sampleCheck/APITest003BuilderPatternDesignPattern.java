package com.thetestingacademy.sampleCheck;

public class APITest003BuilderPatternDesignPattern {
   public APITest003BuilderPatternDesignPattern step1(){
       System.out.println("Step1 is started");
       System.out.println("Step1 is end");
       return this;
   }
    public APITest003BuilderPatternDesignPattern step2(){
        System.out.println("Step2 is started");
        System.out.println("Step2 is end");
        return this;
    }
    public APITest003BuilderPatternDesignPattern step3(String name){
        System.out.println("Step3 is started");
        System.out.println("Step3 is end");
        return this;
    }

    public static void main(String[] args) {
        APITest003BuilderPatternDesignPattern bp =new APITest003BuilderPatternDesignPattern();
        bp.step1().step2().step3("Suraj");
    }
}
