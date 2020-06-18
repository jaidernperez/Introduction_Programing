package usta.sistemas;

import javax.swing.*;
import java.awt.*;

public class Form2 extends JFrame {

    public Form2() {
        setLayout(new FlowLayout(FlowLayout.LEFT, 10, 20));
        for (int i = 0; i <= 10; i++) {
            add(new JButton("My button" + i));
        }
        setSize(600,400);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
