package usta.sistemas.forms;

import usta.sistemas.classes.FileDataStudent;

import javax.swing.*;
import java.awt.*;
import java.util.Objects;

/**
 * Description: This form shows the data of the student in a file text
 *
 * @author Jaider Pérez
 * @version 18/06/2020
 */
public class FormShowAllStudents extends JDialog {

    /**
     * This function contains the properties of the form
     *
     * @param parent Represents the connection to the parent class
     */
    public FormShowAllStudents(java.awt.Frame parent) {
        super(parent, true);
        setLayout(new BorderLayout());
        setTitle("SAC USTA");

        JPanel panelSuperior = new JPanel();
        panelSuperior.setLayout(new GridLayout(2, 1));
        JLabel labelMenu = new JLabel("List of students ", SwingConstants.CENTER);
        labelMenu.setFont(new Font("Times New Roman", Font.BOLD, 20));
        panelSuperior.add(labelMenu);

        JLabel labelSeparator = new JLabel("   ");
        panelSuperior.add(labelSeparator);

        String[] columnNames = {"Name", "LastName", "Faculty"};
        JTable dataTable = new JTable(Objects.requireNonNull(FileDataStudent.getAllData()), columnNames);
        dataTable.setBounds(10, 50, 500, 300);
        JScrollPane panelCentral = new JScrollPane(dataTable);

        add(panelSuperior, BorderLayout.NORTH);
        add(panelCentral, BorderLayout.CENTER);

        setSize(500, 500);
        setResizable(false);
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        pack();
    }
}

