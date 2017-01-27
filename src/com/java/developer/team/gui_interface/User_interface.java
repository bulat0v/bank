package com.java.developer.team.gui_interface;

import javax.swing.*;

/**
 * Created by root on 27.01.2017.
 */
public class User_interface extends JFrame {
    private JPanel panel;
    private JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b0;
    private JButton bPlus,bMinus,bDivide,bEqually,bPercent;
    private JButton bBackspace,bCe,bC;
    private JLabel label;

    public User_interface(){
        panel = new JPanel();
        setTitle("Калькулятор");
        setSize(300, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        initComponents();
        action();
        add(panel);
        setVisible(true);
    }

    public void initComponents(){
        label = new JLabel();
        label.setBounds(5,5,290,30);
        panel.add(label);
        bBackspace = new JButton("Backspace");
        bBackspace.setBounds(5,40,100,20);
        panel.add(bBackspace);
    }

    public void action(){

    }

}
