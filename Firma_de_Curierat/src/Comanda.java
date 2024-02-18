import java.awt.*;
import java.io.FileWriter;
import java.io.IOException;


public class Comanda extends Pachet {

    private Pachet pachete;
    private Adresa adresaLivrare;
    private float costTotal;
    private boolean estePlatita;

    public Comanda(Pachet pachete, Adresa adresaLivrare, float costTotal, boolean estePlatita) {
        super(pachete.getGreutate(), pachete.getExpeditor(), pachete.getDestinatar(), pachete.getExpediat());
        this.pachete = pachete;
        this.adresaLivrare = adresaLivrare;
        this.costTotal = costTotal;
        this.estePlatita = estePlatita;
    }


    public Pachet getPachete() {
        return pachete;
    }

    public void setPachete(Pachet pachete) {
        this.pachete = pachete;
    }

    public Adresa getAdresaLivrare() {
        return adresaLivrare;
    }

    public void setAdresaLivrare(Adresa adresaLivrare) {
        this.adresaLivrare = adresaLivrare;
    }

    public float getCostTotal() {
        return costTotal;
    }

    public void setCostTotal(float costTotal) {
        this.costTotal = costTotal;
    }

    public boolean isEstePlatita() {
        return estePlatita;
    }

    public void setEstePlatita(boolean estePlatita) {
        this.estePlatita = estePlatita;
    }

    public void salveazaComandaInFisier(String numeFisier) throws IOException {
        FileWriter fileWriter = null;

        try {
            fileWriter = new FileWriter(numeFisier, true);

            fileWriter.write("Pachet: " + this.pachete + "\n");
            fileWriter.write("Adresa: " + this.adresaLivrare + "\n");
            fileWriter.write("cost: " + this.costTotal + "\n");
            fileWriter.write("e platita: " + (this.estePlatita ? "da" : "nu") + "\n");
            fileWriter.write("\n");

            System.out.println("Comanda salvat cu succes în fișierul " + numeFisier);
        } catch (IOException e) {
            System.out.println("Eroare la salvarea pachetului în fișierul " + numeFisier + ": " + e.getMessage());
        } finally {
            if (fileWriter != null) {
                fileWriter.close();
            }
        }


    }
}