package usta.sistemas.forms;

import usta.sistemas.classes.FileValoresPecuniarios;

import javax.swing.*;
import java.awt.*;

/**
 * Description: In this form enter the information of a student's pecuniary values: code, name, faculty and value
 *
 * @author Jaider Pérez
 * @version 18/06/2020
 */
public class FormValoresPecuniarios extends JDialog {
    public JTextField textCode, textName, textFaculty, textValue;

    /**
     * This function contains the properties of the form
     *
     * @param parent Represents the connection to the parent class
     */
    public FormValoresPecuniarios(java.awt.Frame parent) {
        super(parent, true);
        setLayout(new BorderLayout());
        setTitle("SAC USTA");

        JPanel panelSuperior = new JPanel();
        JLabel title = new JLabel("Valores Pecuniarios");
        title.setFont(new Font("Times New Roman", Font.BOLD, 30));
        panelSuperior.add(title);

        JPanel centralPanel = new JPanel();
        centralPanel.setLayout(new GridLayout(6, 3));
        centralPanel.add(new JLabel(""));
        centralPanel.add(new JLabel(""));
        centralPanel.add(new JLabel(""));
        centralPanel.add(new JLabel("Code: ", SwingConstants.CENTER));
        centralPanel.add(textCode = new JTextField(""));
        centralPanel.add(new JLabel(""));
        centralPanel.add(new JLabel("Name: ", SwingConstants.CENTER));
        centralPanel.add(textName = new JTextField(""));
        centralPanel.add(new JLabel(""));
        centralPanel.add(new JLabel("Faculty: ", SwingConstants.CENTER));
        centralPanel.add(textFaculty = new JTextField(""));
        centralPanel.add(new JLabel(""));
        centralPanel.add(new JLabel("Value: ", SwingConstants.CENTER));
        centralPanel.add(textValue = new JTextField(""));
        centralPanel.add(new JLabel(""));

        JPanel lowerPanel = new JPanel();
        JButton buttonAdd = new JButton("Add");
        buttonAdd.setBounds(0, 0, 100, 50);
        lowerPanel.add(buttonAdd);
        buttonAdd.addActionListener(e -> createNewPecuniaryValue());

        add(panelSuperior, BorderLayout.NORTH);
        add(centralPanel, BorderLayout.CENTER);
        add(lowerPanel, BorderLayout.SOUTH);

        setSize(500, 500);
        setResizable(false);
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        pack();
    }

    /**
     * This function saves the information obtained in the form in a text file
     */
    public void createNewPecuniaryValue() {
        if (validateFields()) {
            boolean answer = FileValoresPecuniarios.addValoresPecuniarios(textCode.getText(),
                    textName.getText(), textFaculty.getText(), textValue.getText());
            if (answer) {
                cleanFields();
                JOptionPane.showMessageDialog(null, "The data was saved successfully");
            } else {
                JOptionPane.showMessageDialog(null, "The data could not be saved");
            }
        }
    }

    /**
     * This function validates the information obtained in the form
     *
     * @return Boolean that represents whether the information obtained is correct or incorrect
     */
    private boolean validateFields() {
        if (!textCode.getText().matches("[0-9]*") || textCode.getText().length() < 3) {
            JOptionPane.showMessageDialog(null, "The code is wrong");
            textCode.requestFocus();
            return false;
        } else if (textName.getText().length() < 10) {
            JOptionPane.showMessageDialog(null, "The name must be a minimum of ten chars");
            textName.requestFocus();
            return false;
        } else if (textFaculty.getText().length() < 8) {
            JOptionPane.showMessageDialog(null, "The faculty must be a minimum of eight chars");
            textFaculty.requestFocus();
            return false;
        } else if (!textValue.getText().matches("[0-9]*")) {
            JOptionPane.showMessageDialog(null, "The Value must be a integer");
            textValue.requestFocus();
            return false;
        }
        return true;
    }

    /**
     * This function cleans the form fields
     */
    private void cleanFields() {
        textName.setText("");
        textCode.setText("");
        textValue.setText("");
        textFaculty.setText("");
    }
}

