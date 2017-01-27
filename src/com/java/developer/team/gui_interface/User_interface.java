package com.java.developer.team.gui_interface;

import javax.swing.*;
import java.awt.*;

/**
 * Created by root on 27.01.2017.
 */
public class User_interface extends JFrame {
    private JPanel panel,p2,p3;
    private JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b0;
    private JButton bPlus,bMinus,bDivide,bEqually,bPercent;
    private JButton bBackspace,bCe,bC;
    private JFormattedTextField ftf;

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
        BorderLayout borLay = new BorderLayout();
        panel.setLayout(borLay);
        ftf = new JFormattedTextField();
        panel.add(ftf, BorderLayout.NORTH);
        p2 = new JPanel();
        b1 = new JButton("1");
        p2.add(b1);
        b2 = new JButton("2");
        p2.add(b2);
        p2.add(new JButton("3"));

        panel.add(p2, BorderLayout.CENTER);
    }

    public void action(){

    }

}
