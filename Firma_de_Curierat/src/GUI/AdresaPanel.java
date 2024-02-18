package GUI;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.*;

public class AdresaPanel extends JPanel {

    private JTextField textStrada;
    private JTextField textNumar;
    private JTextField textBloc;
    private JTextField textScara;
    private JTextField textApartament;

    public AdresaPanel() {
        setLayout(  new BoxLayout(this, BoxLayout.Y_AXIS));

        JPanel panouStrada = new JPanel();
        JLabel labelStrada = new JLabel("Strada:");
        textStrada = new JTextField();
        textStrada.setPreferredSize(new Dimension(150, 25));
        panouStrada.add(labelStrada);
        panouStrada.add(textStrada);

        JPanel panouNumar = new JPanel();
        JLabel labelNumar = new JLabel("Număr:");
        textNumar = new JTextField();
        textNumar.setPreferredSize(new Dimension(150, 25));
        panouNumar.add(labelNumar);

        panouNumar.add(textNumar);

        JPanel panouBloc = new JPanel();
        JLabel labelBloc = new JLabel("Bloc:");
        textBloc = new JTextField();
        textBloc.setPreferredSize(new Dimension(150, 25));
        panouBloc.add(labelBloc);
        panouBloc.add(textBloc);

        JPanel panouScara = new JPanel();
        JLabel labelScara = new JLabel("Scară:");
        textScara = new JTextField();
        textScara.setPreferredSize(new Dimension(150, 25));
        panouScara.add(labelScara);
        panouScara.add(textScara);

        JPanel panouApartament = new JPanel();
        JLabel labelApartament = new JLabel("Apartament:");
        textApartament = new JTextField();
        textApartament.setPreferredSize(new Dimension(150, 25));
        panouApartament.add(labelApartament);
        panouApartament.add(textApartament);

        // Adaugare panouri
        add(panouStrada);
        add(panouNumar);
        add(panouBloc);
        add(panouScara);
        add(panouApartament);

        // Butonul de salvare
        JButton saveButton = new JButton("Salvare");
        saveButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    FileWriter writer = new FileWriter("adresa.txt");
                    writer.write(textStrada.getText() + "\n");
                    writer.write(textNumar.getText() + "\n");
                    writer.write(textBloc.getText() + "\n");
                    writer.write(textScara.getText() + "\n");
                    writer.write(textApartament.getText() + "\n");
                    writer.close();
                    JOptionPane.showMessageDialog(null, "Adresa a fost salvată cu succes!");
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(null, "Eroare la salvare: " + ex.getMessage());
                }
            }
        });
        add(saveButton);
        JButton closeButton = new JButton("Close");
        closeButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(AdresaPanel.this);
                frame.dispose();
            }
        });
        add(closeButton);
    }
}