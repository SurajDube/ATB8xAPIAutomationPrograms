package com.thetestingacademy.sampleCheck;

public class APITest003NoDesignPattern {
    public void step1(){
        System.out.println("step 1 ");
    }
    public void step2(){
        System.out.println("step 2 ");
    }
    public void step3(String s1){
        System.out.println("step 3 ");
    }


    public static void main(String[] args) {
        APITest003NoDesignPattern np = new APITest003NoDesignPattern();
        np.step1();
        np.step2();
        np.step3("Suraj");
    }
}
