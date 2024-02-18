package GUI;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.*;

public class PachetPanel extends JPanel {
    private JTextField textgreutate;
    private JTextField textexpeditor;
    private JTextField textdestinatar;

    public PachetPanel() {
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

        JPanel panougreutate = new JPanel();
        JLabel labelgreutate = new JLabel("Greutate:");
        textgreutate = new JTextField();
        textgreutate.setPreferredSize(new Dimension(150, 25));
        panougreutate.add(labelgreutate);
        panougreutate.add(textgreutate);

        JPanel panouexpeditor = new JPanel();
        JLabel labelexpeditor = new JLabel("Expeditor:");
        textexpeditor = new JTextField();
        textexpeditor.setPreferredSize(new Dimension(150, 25));
        panouexpeditor.add(labelexpeditor);
        panouexpeditor.add(textexpeditor);

        JPanel panoudestinatar = new JPanel();
        JLabel labeldestinatar = new JLabel("Destinatar:");
        textdestinatar = new JTextField();
        textdestinatar.setPreferredSize(new Dimension(150, 25));
        panoudestinatar.add(labeldestinatar);
        panoudestinatar.add(textdestinatar);

        JCheckBox checkBoxExpediat = new JCheckBox("Expediat");
        checkBoxExpediat.setSelected(false);
        add(checkBoxExpediat);

        // Adaugare panouri
        add(panougreutate);
        add(panouexpeditor);
        add(panoudestinatar);

        // Butonul de salvare
        JButton saveButton = new JButton("Salvare");
        saveButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    FileWriter writer = new FileWriter("pachet.txt");
                    writer.write(textgreutate.getText() + "\n");
                    writer.write(textexpeditor.getText() + "\n");
                    writer.write(textdestinatar.getText() + "\n");
                    writer.write(checkBoxExpediat.isSelected() + "\n");
                    writer.close();
                    JOptionPane.showMessageDialog(null, "Pachetul a fost salvat cu succes");
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(null, "Eroare la salvarea pachetului: " + ex.getMessage());
                }
            }
        });
        add(saveButton);
        JButton closeButton = new JButton("Close");
        closeButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(PachetPanel.this);
                frame.dispose();
            }
        });
        add(closeButton);
    }
}
