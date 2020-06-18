package usta.sistemas.forms;

import usta.sistemas.frames.FormAddStudent;
import usta.sistemas.frames.FormAddVP;

import javax.swing.*;
import java.awt.*;

/**
 * Description: This form represents the main menu of the software
 *
 * @author Jaider Pérez
 * @version 18/06/2020
 */
public class FormPrincipal extends JFrame {
    /**
     * This function contains the properties of the form
     */
    public FormPrincipal() {
        super("SAC USTA");
        setLayout(new BorderLayout(9, 10));
        JPanel panelSuperior = new JPanel();
        JLabel labelMenu = new JLabel("Main Menu", SwingConstants.CENTER);
        labelMenu.setFont(new Font("Times New Roman", Font.PLAIN, 30));
        panelSuperior.add(labelMenu);

        JPanel leftPanel = new JPanel();
        leftPanel.setLayout(new GridLayout(9, 1));

        JButton buttonNewStudent = new JButton("New Students");
        buttonNewStudent.setBounds(0, 0, 100, 30);
        buttonNewStudent.addActionListener(this::openFormStudents);

        JLabel labelSpacer1 = new JLabel("    ");

        JButton buttonListStudents = new JButton("List of the Students");
        buttonListStudents.setBounds(0, 0, 100, 30);
        buttonListStudents.addActionListener(this::openFormShowAllStudents);

        JLabel labelSpacer2 = new JLabel("    ");

        JButton buttonAddValoresPecuniarios = new JButton("New Pecuniary Values");
        buttonAddValoresPecuniarios.setBounds(0, 0, 100, 30);
        buttonAddValoresPecuniarios.addActionListener(this::openFormValoresPecuniarios);

        JLabel labelSpacer3 = new JLabel("   ");

        JButton buttonListValoresPecuniarios = new JButton("List Pecuniary Values");
        buttonListValoresPecuniarios.setBounds(0, 0, 100, 30);
        buttonListValoresPecuniarios.addActionListener(this::openFormListValoresPecuniarios);

        JLabel labelSpacer4 = new JLabel("    ");

        JButton buttonAbout = new JButton("About this");
        buttonAbout.setBounds(0, 0, 100, 30);
        buttonAbout.addActionListener(this::openFormAbout);

        leftPanel.add(buttonNewStudent);
        leftPanel.add(labelSpacer1);
        leftPanel.add(buttonListStudents);
        leftPanel.add(labelSpacer2);
        leftPanel.add(buttonAddValoresPecuniarios);
        leftPanel.add(labelSpacer3);
        leftPanel.add(buttonListValoresPecuniarios);
        leftPanel.add(labelSpacer4);
        leftPanel.add(buttonAbout);

        JPanel lowerPanel = new JPanel();
        lowerPanel.add(new JLabel("Created by: Jaider Pérez"));

        JPanel rightPanel = new JPanel();
        rightPanel.setLayout(new GridLayout(3, 1));
        rightPanel.add(new JLabel(""));
        JLabel image = new JLabel();
        image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/usta/sistemas/images/USTA.png")));
        rightPanel.add(image);
        rightPanel.add(new JLabel(""));

        add(panelSuperior, BorderLayout.NORTH);
        add(leftPanel, BorderLayout.WEST);
        add(rightPanel, BorderLayout.EAST);
        add(lowerPanel, BorderLayout.SOUTH);

        setVisible(true);
        setBounds(0, 0, 500, 500);
        setResizable(true);
        setLocationRelativeTo(null);
    }

    /**
     * This function calls the modal form FormAddStudent
     *
     * @param evt Returns the command associated with the action performed
     */
    private void openFormStudents(java.awt.event.ActionEvent evt) {
        //FormStudents formStudents = new FormStudents(this);
        FormAddStudent formStudents = new FormAddStudent(this);
    }

    /**
     * This function calls the modal form FormShowAllStudents
     *
     * @param evt Returns the command associated with the action performed
     */
    private void openFormShowAllStudents(java.awt.event.ActionEvent evt) {
        FormShowAllStudents formShowAllStudents = new FormShowAllStudents(this);
    }

    /**
     * This function calls the modal form FormListValoresPecuniarios
     *
     * @param evt Returns the command associated with the action performed
     */
    private void openFormListValoresPecuniarios(java.awt.event.ActionEvent evt) {
        FormListValoresPecuniarios formListValoresPecuniarios = new FormListValoresPecuniarios(this);
    }

    /**
     * This function calls the modal form FormAddVP
     *
     * @param evt Returns the command associated with the action performed
     */
    private void openFormValoresPecuniarios(java.awt.event.ActionEvent evt) {
        //FormValoresPecuniarios formValoresPecuniarios = new FormValoresPecuniarios(this);
        FormAddVP formAddVP = new FormAddVP(this);
    }

    /**
     * This function calls the modal form FormAbout
     *
     * @param evt Returns the command associated with the action performed
     */
    private void openFormAbout(java.awt.event.ActionEvent evt) {
        FormAbout formAbout = new FormAbout(this);
    }
}
