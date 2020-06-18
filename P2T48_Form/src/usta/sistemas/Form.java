package usta.sistemas;

import javax.swing.*;

/**
 * Description: This program generate forms
 *
 * @author Jaider Pérez
 * @version 04/06/2020
 */
public class Form extends JFrame {

    public Form() {
        JLabel label1 = new JLabel("This is my form");
        label1.setBounds(5, 5, 300, 30);
        add(label1);
        setLayout(null);
        setVisible(true);
        setBounds(0, 0, 400, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JButton button1 = new JButton("Button");
        add(button1);
        button1.setBounds(150, 180, 100, 50);
    }

    public static void main(String[] args) {
        Form form = new Form();
        Form2 form2 = new Form2();

    }
}
