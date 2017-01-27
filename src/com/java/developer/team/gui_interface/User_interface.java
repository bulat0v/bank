package com.java.developer.team.gui_interface;

import javax.swing.*;
import java.awt.*;

/**
 * Created by root on 27.01.2017.
 */
public class User_interface extends JFrame {
    private JPanel panel,p2,p3,p4;
    private JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b0;
    private JButton bPlus,bMinus,bDivide,bEqually,bPercent,bMulti;
    private JButton bBackspace,bCe,bC;
    private JFormattedTextField ftf;
    private BorderLayout borLay;
    private GridLayout gridL, gridL2;

    public User_interface(){
        setTitle("Калькулятор");
        setSize(270, 340);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        initComponents();
        action();
        add(panel);
        setVisible(true);
    }

    public void initComponents(){
        panel = new JPanel();
        borLay = new BorderLayout();
        panel.setLayout(borLay);
        ftf = new JFormattedTextField();
        panel.add(ftf, BorderLayout.NORTH);


        p2 = new JPanel();
        gridL = new GridLayout(5,3,1,1);
        p2.setLayout(gridL);

        bBackspace = new JButton("Backspace");
        bBackspace.setPreferredSize(new Dimension(100,50));
        bCe = new JButton("CE");
        bCe.setPreferredSize(new Dimension(50,50));
        bC = new JButton("C");
        bC.setPreferredSize(new Dimension(50,50));
        b1 = new JButton("1");
        b1.setPreferredSize(new Dimension(50,50));
        b2 = new JButton("2");
        b2.setPreferredSize(new Dimension(50,50));
        b3 = new JButton("3");
        b3.setPreferredSize(new Dimension(50,50));
        b4 = new JButton("4");
        b3.setPreferredSize(new Dimension(50,50));
        b5 = new JButton("5");
        b5.setPreferredSize(new Dimension(50,50));
        b6 = new JButton("6");
        b6.setPreferredSize(new Dimension(50,50));
        b7 = new JButton("7");
        b7.setPreferredSize(new Dimension(50,50));
        b8 = new JButton("8");
        b8.setPreferredSize(new Dimension(50,50));
        b9 = new JButton("9");
        b9.setPreferredSize(new Dimension(50,50));
        b0 = new JButton("0");
        b9.setPreferredSize(new Dimension(50,50));
        p2.add(bBackspace);
        p2.add(bCe);
        p2.add(bC);
        p2.add(b7);
        p2.add(b8);
        p2.add(b9);
        p2.add(b4);
        p2.add(b5);
        p2.add(b6);
        p2.add(b1);
        p2.add(b2);
        p2.add(b3);
        p2.add(new JButton());
        p2.add(b0);
        p2.add(new JButton());
        panel.add(p2, BorderLayout.CENTER);

        p3 = new JPanel();
        gridL2 = new GridLayout(6,1,1,1);
        p3.setLayout(gridL2);
        bPercent = new JButton("%");
        bMulti = new JButton("*");
        bDivide = new JButton("/");
        bMinus = new JButton("-");
        bPlus = new JButton("+");
        bEqually = new JButton("=");
        p3.add(bPercent);
        p3.add(bMulti);
        p3.add(bDivide);
        p3.add(bMinus);
        p3.add(bPlus);
        p3.add(bEqually);
        panel.add(p3, "East");
    }

    public void action(){


    }

}
