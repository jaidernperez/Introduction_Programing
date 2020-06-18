package usta.sistemas.frames;

import usta.sistemas.classes.FileDataStudent;
import usta.sistemas.utilities.SpringUtilities;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

/**
 * Description: In this form enters the student's information: name, surname, and faculty
 *
 * @author Jaider Pérez
 * @version 18/06/2020
 */
public class FormAddStudent extends JDialog {

    private final JTextField textName;
    private final JTextField textLastName;
    private final JTextField textFaculty;

    public FormAddStudent(java.awt.Frame parent) {
        super(parent, true);
        // Config JDialog
        setTitle("SAC USTA");
        setSize(500, 300);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        // Create panels
        JPanel headerPanel = new JPanel();
        headerPanel.setBorder(new EmptyBorder(10, 0, 10, 0));

        JLabel labelTitle = new JLabel("New Student ", SwingConstants.CENTER);
        labelTitle.setFont(new Font("Times New Roman", Font.BOLD, 20));
        headerPanel.add(labelTitle);

        JPanel footerPanel = new JPanel();
        footerPanel.setBorder(new EmptyBorder(10, 0, 10, 0));
        JButton buttonCreate = new JButton("Create");
        buttonCreate.addActionListener(e -> createNewStudent());
        footerPanel.add(buttonCreate);

        JLabel image = new JLabel();
        image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/usta/sistemas/images/addStudent.png")));

        JPanel controlPanel = new JPanel(new GridBagLayout());
        add(headerPanel, BorderLayout.NORTH);
        add(controlPanel, BorderLayout.CENTER);
        add(footerPanel, BorderLayout.SOUTH);
        add(image,BorderLayout.WEST);

        // Create fields
        JPanel panel = new JPanel(new SpringLayout());

        panel.add(new JLabel("Name: "));
        panel.add(textName = new JTextField(15));

        panel.add(new JLabel("Last Name: "));
        panel.add(textLastName = new JTextField(15));

        panel.add(new JLabel("Faculty: "));
        panel.add(textFaculty = new JTextField(15));

        SpringUtilities.makeCompactGrid(panel, 3, 2, 10, 10, 15, 15);
        controlPanel.add(panel);

        // Show JDialog
        setVisible(true);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
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
