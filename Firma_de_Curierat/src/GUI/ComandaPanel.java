package GUI;

import java.awt.BorderLayout;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class ComandaPanel extends JPanel {
    private JTextArea textArea;

    public ComandaPanel() {
        setLayout(new BorderLayout());

        textArea = new JTextArea();
        JScrollPane scrollPane = new JScrollPane(textArea);
        add(scrollPane, BorderLayout.CENTER);

        // Citirea si afisarea continutului din comanda.txt
        try (BufferedReader reader = new BufferedReader(new FileReader("comanda.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                textArea.append(line + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Citirea si afisarea continutului din livrator.txt
        try (BufferedReader reader = new BufferedReader(new FileReader("livrator.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                textArea.append(line + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
