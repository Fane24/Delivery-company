package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;

public class Loghin implements ActionListener {
    private final JLabel statusLabel;
    private final JTextField idField;
    private final JPasswordField passwordField;
    private final JButton nextButton;

    public Loghin(JLabel statusLabel, JTextField idField, JPasswordField passwordField, JButton nextButton) {
        this.statusLabel = statusLabel;
        this.idField = idField;
        this.passwordField = passwordField;
        this.nextButton = nextButton;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Logare")) {
            String id = idField.getText();
            String password = new String(passwordField.getPassword());

            if (id.equals("student") && password.equals("1234")) {
                statusLabel.setText("Bun venit, student!");

                try {
                    FileWriter fileWriter = new FileWriter("parola.txt");
                    fileWriter.write(passwordField.getPassword());
                    fileWriter.close();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }

            } else {
                statusLabel.setText("ID sau parola gresite!");
            }
            idField.setText("");
            passwordField.setText("");
        } else if (e.getActionCommand().equals("Resetare")) {
            idField.setText("");
            passwordField.setText("");
            statusLabel.setText("Introduceti ID-ul si parola");
        } else if (e.getActionCommand().equals("Next")) {
            FereastraPrincipala fereastraPrincipala = new FereastraPrincipala();
            fereastraPrincipala.setVisible(true);
            JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(nextButton);
            frame.dispose();
        }
    }

    public static void main(String[] args) {
        JPanel panel = new JPanel(new GridLayout(4, 2));

        JLabel idLabel = new JLabel("  ID:");
        panel.add(idLabel);

        JTextField idField = new JTextField();
        panel.add(idField);

        JLabel passwordLabel = new JLabel("  Parola:");
        panel.add(passwordLabel);

        JPasswordField passwordField = new JPasswordField();
        panel.add(passwordField);

        JButton loginButton = new JButton("Logare");
        panel.add(loginButton);

        JButton resetButton = new JButton("Reset");
        panel.add(resetButton);

        JButton nextButton = new JButton("Next");
        panel.add(nextButton);

        JLabel statusLabel = new JLabel("Introduceți ID-ul și parola");
        statusLabel.setHorizontalAlignment(JLabel.CENTER);

        JFrame frame = new JFrame("Login Form");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(panel, BorderLayout.CENTER);
        frame.getContentPane().add(statusLabel, BorderLayout.SOUTH);
        frame.setSize(400, 200);
        frame.setVisible(true);

        Loghin loginForm = new Loghin(statusLabel, idField, passwordField, nextButton);
        loginButton.addActionListener(loginForm);
        resetButton.addActionListener(loginForm);
        nextButton.addActionListener(loginForm);

    }
}
