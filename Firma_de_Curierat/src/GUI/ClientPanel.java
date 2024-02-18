package GUI;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.*;

public class ClientPanel extends JPanel {
    private JTextField textNume;
    private JTextField textPrenume;
    private JTextField textTelefon;


    public ClientPanel() {
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

        JPanel panouNume = new JPanel();
        JLabel labelNume = new JLabel("Nume:");
        textNume = new JTextField();
        textNume.setPreferredSize(new Dimension(150, 25));
        panouNume.add(labelNume);
        panouNume.add(textNume);

        JPanel panouPrenume = new JPanel();
        JLabel labelPrenume = new JLabel("Prenume:");
        textPrenume = new JTextField();
        textPrenume.setPreferredSize(new Dimension(150, 25));
        panouPrenume.add(labelPrenume);
        panouPrenume.add(textPrenume);

        JPanel panouTelefon = new JPanel();
        JLabel labelTelefon = new JLabel("Telefon:");
        textTelefon = new JTextField();
        textTelefon.setPreferredSize(new Dimension(150, 25));
        panouTelefon.add(labelTelefon);
        panouTelefon.add(textTelefon);




        // Adaugare panouri
        add(panouNume);
        add(panouPrenume);
        add(panouTelefon);



        // Butonul de salvare
        JButton saveButton = new JButton("Salvare");
        saveButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    FileWriter writer = new FileWriter("client.txt");
                    writer.write(textNume.getText() + "\n");
                    writer.write(textPrenume.getText() + "\n");
                    writer.write(textTelefon.getText() + "\n");


                    writer.close();
                    JOptionPane.showMessageDialog(null, "Datele clientului au fost salvate cu succes!");
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(null, "Eroare la salvare: " + ex.getMessage());
                }
            }
        });
        add(saveButton);
        //buton close
        JButton closeButton = new JButton("Close");
        closeButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(ClientPanel.this);
                frame.dispose();
            }
        });
        add(closeButton);
    }

}