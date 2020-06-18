package usta.sistemas.forms;

import usta.sistemas.classes.FileValoresPecuniarios;

import javax.swing.*;
import java.awt.*;
import java.util.Objects;

/**
 * Description: This form shows the registered pecuniary values
 *
 * @author Jaider Pérez
 * @version 18/06/2020
 */
public class FormListValoresPecuniarios extends JDialog {

    /**
     * This function contains the properties of the form
     *
     * @param parent Represents the connection to the parent class
     */
    public FormListValoresPecuniarios(java.awt.Frame parent) {
        super(parent, true);
        setLayout(new BorderLayout());
        setTitle("SAC USTA");

        JPanel panelSuperior = new JPanel();
        panelSuperior.setLayout(new GridLayout(2, 1));
        JLabel title = new JLabel("Valores Pecuniarios", SwingConstants.CENTER);
        title.setFont(new Font("Times New Roman", Font.BOLD, 20));
        panelSuperior.add(title);

        JLabel labelSeparator = new JLabel(" ");
        panelSuperior.add(labelSeparator);

        String[] columnNames = {"Code", "Name", "Faculty", "Value"};
        JTable dataTable = new JTable(Objects.requireNonNull
                (FileValoresPecuniarios.getValoresPecuniarios()), columnNames);
        dataTable.setBounds(10, 50, 500, 300);
        JScrollPane panelCentral = new JScrollPane(dataTable);

        add(panelSuperior, BorderLayout.NORTH);
        add(panelCentral);

        setSize(500, 500);
        setResizable(false);
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        pack();
    }
}
