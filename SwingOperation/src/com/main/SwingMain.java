package com.main;

import javax.swing.*;

/**
 * Created by Sai Krishna on 20-01-2016.
 */

public class SwingMain {

    public static void main(String[] args){
        JFrame jFrame = new JFrame();
        JButton jButton = new JButton("Submit");
        jButton.setBounds(200,200,100,40);
        jFrame.add(jButton);
        jFrame.setSize(500,500);
        jFrame.setLayout(null);
        jFrame.setVisible(true);
    }
}
