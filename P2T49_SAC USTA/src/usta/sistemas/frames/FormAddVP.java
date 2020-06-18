package usta.sistemas.frames;

import usta.sistemas.classes.FileValoresPecuniarios;
import usta.sistemas.utilities.SpringUtilities;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

/**
 * Description: In this form enter the information of a student's pecuniary values: code, name, faculty and value
 *
 * @author Jaider Pérez
 * @version 18/06/2020
 */
public class FormAddVP extends JDialog {

    public JTextField textCode, textName, textFaculty, textValue;

    public FormAddVP(Frame parent) {
        super(parent, true);
        // Config JDialog
        setTitle("SAC USTA");
        setSize(450, 300);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        // Create panels
        JPanel headerPanel = new JPanel();
        headerPanel.setBorder(new EmptyBorder(10, 0, 10, 0));

        JLabel labelTitle = new JLabel("New Pecuniary Value", SwingConstants.CENTER);
        labelTitle.setFont(new Font("Times New Roman", Font.BOLD, 20));
        headerPanel.add(labelTitle);

        JPanel footerPanel = new JPanel();
        footerPanel.setBorder(new EmptyBorder(10, 0, 10, 0));
        JButton buttonCreate = new JButton("Create");
        buttonCreate.addActionListener(e -> createNewPecuniaryValue());
        footerPanel.add(buttonCreate);

        JLabel image = new JLabel();
        image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/usta/sistemas/images/addPV.png")));

        JPanel controlPanel = new JPanel(new GridBagLayout());
        add(headerPanel, BorderLayout.NORTH);
        add(controlPanel, BorderLayout.CENTER);
        add(footerPanel, BorderLayout.SOUTH);
        add(image,BorderLayout.WEST);

        // Create fields
        JPanel panel = new JPanel(new SpringLayout());

        panel.add(new JLabel("Code: "));
        panel.add(textCode =new JTextField(15));

        panel.add(new JLabel("Name: "));
        panel.add(textName =new JTextField(15));

        panel.add(new JLabel("Faculty: "));
        panel.add(textFaculty =new JTextField(15));

        panel.add(new JLabel("Value: "));
        panel.add(textValue =new JTextField(15));

        SpringUtilities.makeCompactGrid(panel, 4, 2, 10, 10, 15, 15);
        controlPanel.add(panel);

        // Show JDialog
        setVisible(true);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
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
        if (!textCode.getText().matches("[0-9]*")||textCode.getText().length()<3) {
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
