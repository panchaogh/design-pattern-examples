package com.pcgrw.designpattern.observer.swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingObserverExample {
    JFrame frame;

    public static void main(String[] args) {
        SwingObserverExample example = new SwingObserverExample();
        example.go();
    }

    public void go(){
        frame = new JFrame();
        JButton button = new JButton("Should I do it");
        button.addActionListener(new AngelActionListener());
        button.addActionListener(new DevilActionListener());
        frame.getContentPane().add(BorderLayout.CENTER, button);
        frame.setSize(200,100);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class AngelActionListener implements ActionListener{

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Don`t do it,you might regret it!");
    }
}

class DevilActionListener implements ActionListener{

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Come on,do it!");
    }
}
