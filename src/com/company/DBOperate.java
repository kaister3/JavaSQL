package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DBOperate extends JFrame {

    private DBOperate() {
        this.setTitle("Hello,SQL!");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(500, 100, 330, 200);
        JPanel contentPane = new JPanel();
        Font f = new Font("SFMono", Font.PLAIN, 20);
        contentPane.setLayout(null);

        JLabel username = new JLabel("User Name");
        username.setBounds(10,10,120,30);
        username.setFont(f);
        contentPane.add(username);

        JLabel password = new JLabel("Password");
        password.setBounds(10, 50, 120, 30);
        password.setFont(f);
        contentPane.add(password);

        JTextField usr = new JTextField();
        usr.setBounds(200, 20, 120, 30);
        usr.setFont(f);
        contentPane.add(usr);

        JPasswordField pwd = new JPasswordField();
        pwd.setBounds(200, 50, 120, 30);
        contentPane.add(pwd);

        JButton loginButton = new JButton("Log in");
        loginButton.setBounds(100, 100, 100, 50);
        loginButton.setFont(f);
        loginButton.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {

                        String name = usr.getText();
                        String pass = new String(pwd.getPassword());
                        System.out.println(name);
                        System.out.println(pass);

                        DBUnit data = new DBUnit(name, pass);
                    }
                }
        );
        contentPane.add(loginButton);

        this.add(contentPane);
        this.setVisible(true);

    }

    public static  void main(String[] args) {
        DBOperate window = new DBOperate();
    }
}