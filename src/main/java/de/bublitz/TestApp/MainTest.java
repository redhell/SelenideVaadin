package de.bublitz.TestApp;

import javax.swing.*;

public class MainTest {
    public static void main(String[] args) {
        JFrame meinFrame = new JFrame("Beispiel JFrame");
        meinFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        meinFrame.setName("TestFrame");
        meinFrame.setSize(600, 600);
        meinFrame.add(new JLabel("Beispiel JLabel"));
        meinFrame.setVisible(true);
    }
}
