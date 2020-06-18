package usta.sistemas.forms;

import usta.sistemas.classes.FileDataStudent;

import javax.swing.*;
import java.awt.*;

/**
 * Description: In this form enters the student's information: name, surname, and faculty
 *
 * @author Jaider Pérez
 * @version 18/06/2020
 */
public class FormStudents extends JDialog {
    public JTextField textName, textLastName, textFaculty;

    /**
     * This function contains the properties of the form
     *
     * @param parent Represents the connection to the parent class
     */
    public FormStudents(java.awt.Frame parent) {
        super(parent, true);
        setLayout(new BorderLayout());
        setTitle("SAC USTA");

        JPanel panelSuperior = new JPanel();
        JLabel labelTitle = new JLabel("New Student ", SwingConstants.CENTER);
        labelTitle.setFont(new Font("Times New Roman", Font.BOLD, 25));
        panelSuperior.add(labelTitle);

        JPanel centralPanel = new JPanel();
        centralPanel.setLayout(new GridLayout(5, 2));
        centralPanel.add(new JLabel(""));
        centralPanel.add(new JLabel(""));
        centralPanel.add(new JLabel("Name: ", SwingConstants.CENTER));
        centralPanel.add(textName = new JTextField(""));
        centralPanel.add(new JLabel("LastName: ", SwingConstants.CENTER));
        centralPanel.add(textLastName = new JTextField(""));
        centralPanel.add(new JLabel("Faculty: ", SwingConstants.CENTER));
        centralPanel.add(textFaculty = new JTextField(""));
        centralPanel.add(new JLabel(""));
        centralPanel.add(new JLabel(""));

        JPanel lowerPanel = new JPanel();
        JButton buttonCreate = new JButton("Create");
        buttonCreate.setBounds(0, 0, 100, 50);
        lowerPanel.add(buttonCreate);
        buttonCreate.addActionListener(e -> createNewStudent());

        add(panelSuperior, BorderLayout.NORTH);
        add(centralPanel, BorderLayout.CENTER);
        add(lowerPanel, BorderLayout.SOUTH);

        setSize(400, 400);
        setResizable(false);
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        pack();
    }

    /**
     * This function save data into file
     */
    public void createNewStudent() {
        if (validateFields()) {
            boolean answer = FileDataStudent.addStudent(textName.getText(), textLastName.getText(), textFaculty.getText());
            if (answer) {
                cleanFields();
                JOptionPane.showMessageDialog(null, "The data was saved successfully");
            } else {
                JOptionPane.showMessageDialog(null, "The data could not be saved");
            }
        }
    }

    /**
     * This function validates the information entered by the user in the FormStudents
     *
     * @return Boolean that represents whether the information is correct or incorrect
     */
    private boolean validateFields() {
        if (textName.getText().length() < 3) {
            JOptionPane.showMessageDialog(null, "The name must be a minimum of three chars");
            textName.requestFocus();
            return false;
        } else if (textLastName.getText().length() < 3) {
            JOptionPane.showMessageDialog(null, "The last name must be a minimum of three chars");
            textLastName.requestFocus();
            return false;
        } else if (textFaculty.getText().length() < 3) {
            JOptionPane.showMessageDialog(null, "The faculty must be a minimum of three chars");
            textFaculty.requestFocus();
            return false;
        }
        return true;
    }

    /**
     * This function cleans the form fields
     */
    private void cleanFields() {
        textName.setText("");
        textLastName.setText("");
        textFaculty.setText("");
    }
}
