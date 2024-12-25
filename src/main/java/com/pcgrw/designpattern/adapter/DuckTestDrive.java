package com.pcgrw.designpattern.adapter;

public class DuckTestDrive {
    public static void main(String[] args) {
        Turkey turkey = new WildTurkey();
        TurkeyAdapter turkeyAdapter = new TurkeyAdapter(turkey);
        testDuck(turkeyAdapter);
    }

    public static void testDuck(Duck duck){
        duck.quaky();
        duck.fly();
    }
}
