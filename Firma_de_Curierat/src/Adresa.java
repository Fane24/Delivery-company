public class Adresa {
    private String numeStrada;
    private int numarStrada;
    private String oras;
    private String codPostal;

    public Adresa(String numeStrada, int numarStrada, String oras, String codPostal) {
        this.numeStrada = numeStrada;
        this.numarStrada = numarStrada;
        this.oras = oras;
        this.codPostal = codPostal;
    }

    public String getNumeStrada() {
        return numeStrada;
    }

    public void setNumeStrada(String numeStrada) {
        this.numeStrada = numeStrada;
    }

    public int getNumarStrada() {
        return numarStrada;
    }

    public void setNumarStrada(int numarStrada) {
        this.numarStrada = numarStrada;
    }

    public String getOras() {
        return oras;
    }

    public void setOras(String oras) {
        this.oras = oras;
    }

    public String getCodPostal() {
        return codPostal;
    }

    public void setCodPostal(String codPostal) {
        this.codPostal = codPostal;
    }

    @Override
    public String toString() {
        return numeStrada + " " + numarStrada + ", " + oras + ", " + codPostal;
    }
}
