package usta.sistemas.forms;

import javax.swing.*;
import java.awt.*;

/**
 * Description: This form represents the initial menu of the software
 *
 * @author Jaider Pérez
 * @version 18/06/2020
 */
public class FormMenu extends JFrame {

    /**
     * This function contains the properties of the form
     */
    public FormMenu() {
        JLabel labelTitleSoft = new JLabel("SAC USTA", SwingConstants.CENTER);
        labelTitleSoft.setFont(new Font("Bradley Hand ITC", Font.BOLD, 40));
        labelTitleSoft.setBounds(45, 50, 300, 30);
        add(labelTitleSoft);

        JButton buttonStart = new JButton("Start");
        buttonStart.setBounds(145, 190, 100, 50);
        buttonStart.addActionListener(e -> {
        FormPrincipal formPrincipal = new FormPrincipal();
        setVisible(false);
        });
        add(buttonStart);

        JLabel labelInformationMarker = new JLabel("Created by: Jaider Pérez", SwingConstants.LEFT);
        labelInformationMarker.setBounds(5, 330, 595, 20);
        add(labelInformationMarker);

        setLayout(null);
        setVisible(true);
        setBounds(0, 0, 400, 400);
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
