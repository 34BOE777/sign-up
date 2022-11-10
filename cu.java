package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {

    public static void main(String[] args) {
JFrame frame = new JFrame("Sign up Operation");
JLabel label1 = new JLabel("User name: ");
label1.setBounds(20,20,80,30);

JTextField text = new JTextField();
text.setBounds(100,20,100,30);

JLabel label2 = new JLabel("password");
label2.setBounds(20,50,80,30);

JPasswordField p1 = new JPasswordField();
p1.setBounds(100,50,100,30);

JButton b1 = new JButton("sign up");
b1.setBounds(100,120,100,30);

JLabel l3 = new JLabel();
l3.setBounds(20,150,400,50);

b1.addActionListener(new ActionListener() {
@Override
public void actionPerformed(ActionEvent actionEvent) {
String data = "Your name is: " + text.getText() + "your passwotd is "+ p1.getText();
l3.setText(data);
}
});
frame.add(label1);
frame.add(label2);
frame.add(l3);
frame.add(b1);
frame.add(p1);
frame.add(text);

frame.setSize(400,400);
frame.setLayout(null);
frame.setVisible(true);


    }
}
