import com.sun.xml.internal.bind.v2.model.core.ID;

import java.io.*;
import java.io.FileWriter;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicLong;


public class Pachet  {

    private int greutate;
    private Livrator expeditor;
    private Client destinatar;
    private boolean expediat;


    public Pachet(int greutate, Livrator expeditor, Client destinatar,boolean expediat) {
        this.greutate = greutate;
        this.expeditor = expeditor;
        this.destinatar = destinatar;
        this.expediat = expediat;

    }


    public int getGreutate() {
        return greutate;
    }

    public void setGreutate(int greutate) {
        this.greutate = greutate;
    }

    public Livrator getExpeditor() {
        return expeditor;
    }

    public void setExpeditor(Livrator expeditor) {
        this.expeditor = expeditor;
    }

    public Client getDestinatar() {
        return destinatar;
    }

    public void setDestinatar(Client destinatar) {
        this.destinatar = destinatar;
    }

    public boolean getExpediat() {
        return expediat;
    }

    public void setExpediat(boolean expediat) {
        this.expediat = expediat;
    }
    //Metoda


        // implementarea metodei pentru adăugarea
        public static void adaugaPachet(Pachet pachet) {
            try {
                // Creare obiect FileWriter și BufferedWriter pentru scrierea în fișierul pachete.txt
                FileWriter fw = new FileWriter("pachete.txt", true);
                BufferedWriter bw = new BufferedWriter(fw);

                // Adăugare informații despre pachet în fișier
//                String destinatie, int greutate, String expeditor, String destinatar,boolean expediat
                bw.write( pachet.getGreutate() + ","  + pachet.getExpeditor() + ","+pachet.getDestinatar()+","+pachet.getExpediat());
                bw.newLine(); // Adăugare linie nouă pentru pachetul următor
                bw.close(); // Închidere BufferedWriter
                System.out.println("Pachet adăugat cu succes în fișierul pachete.txt.");
            } catch (IOException e) {
                System.out.println("Eroare la scrierea în fișierul pachete.txt: " + e.getMessage());
            }
        }


    public void salveazaPachetInFisier(String numeFisier) throws IOException {
        FileWriter fileWriter = null;

        try {
            fileWriter = new FileWriter(numeFisier, true);

            fileWriter.write("Greutate: " + this.greutate + "\n");
            fileWriter.write("Expeditor: " + this.expeditor + "\n");
            fileWriter.write("Destinatar: " + this.destinatar + "\n");
            fileWriter.write("Expediat: " + (this.expediat ? "da" : "nu") + "\n");
            fileWriter.write("\n");

            System.out.println("Pachet salvat cu succes în fișierul " + numeFisier);
        } catch (IOException e) {
            System.out.println("Eroare la salvarea pachetului în fișierul " + numeFisier + ": " + e.getMessage());
        } finally {
            if (fileWriter != null) {
                fileWriter.close();
            }
        }
    }
}
