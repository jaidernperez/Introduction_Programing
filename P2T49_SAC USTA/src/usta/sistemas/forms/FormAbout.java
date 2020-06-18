package usta.sistemas.forms;

import javax.swing.*;
import java.awt.*;

/**
 * Description: This form contains the program and author information
 *
 * @author Jaider Pérez
 * @version 18/06/2020
 */
public class FormAbout extends JDialog {

    /**
     * This function contains the properties of the form
     *
     * @param parent Represents the connection to the parent class
     */
    public FormAbout(java.awt.Frame parent) {
        super(parent, true);
        setLayout(new BorderLayout());
        setTitle("SAC USTA");

        JPanel panelSuperior = new JPanel();
        JLabel labelTitle = new JLabel("About this program ");
        labelTitle.setFont(new Font("Times New Roman", Font.BOLD, 30));
        panelSuperior.add(labelTitle);

        JLabel image = new JLabel();
        image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/usta/sistemas/images/Jaider.jpg")));
        panelSuperior.add(image);

        JPanel centralPanel = new JPanel();
        centralPanel.setLayout(new GridLayout(4, 1));
        JLabel labelMaker = new JLabel("Created by: Jaider Pérez", SwingConstants.CENTER);
        JLabel labelDate = new JLabel("Date: 06/06/2020", SwingConstants.CENTER);
        JLabel labelDescription = new JLabel("Description: This program simulate a section of SAC USTA ", SwingConstants.CENTER);
        JLabel labelEmail = new JLabel("Email: jaider.perez@usantoto.edu.co ", SwingConstants.CENTER);

        centralPanel.add(labelMaker);
        centralPanel.add(labelDate);
        centralPanel.add(labelDescription);
        centralPanel.add(labelEmail);

        add(panelSuperior, BorderLayout.NORTH);
        add(centralPanel, BorderLayout.CENTER);

        setSize(400, 400);
        setResizable(false);
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        pack();
    }
}
