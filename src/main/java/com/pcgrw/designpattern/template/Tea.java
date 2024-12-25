package com.pcgrw.designpattern.template;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 */
public class Tea extends CaffeineBeverage{
    @Override
    void brew() {
        System.out.println("Steeping the tea");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding lemon");
    }

    @Override
    boolean customerWantsCondiments() {
        return false;
    }

    private void getUserInput(){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
    }
}
