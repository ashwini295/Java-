package com.thetestingacademy.ex01_sampleCheck;

public class APITesting004BuilderDesignPattern
{
    public APITesting004BuilderDesignPattern step1()
    {
        System.out.println("Step 1");
        return this;
    }

    public APITesting004BuilderDesignPattern step2()
    {
        System.out.println("Step 2");
        return this;
    }

    public APITesting004BuilderDesignPattern step3(String param1)
    {
        System.out.println("Step3");
        return this;
    }

    public static void main(String[] args) {

        APITesting004BuilderDesignPattern bp = new APITesting004BuilderDesignPattern();
        bp.step1().step2().step3("Ashwini_Hello");
    }

}
