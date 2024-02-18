public class Livrator {
    private String nume;
    private String prenume;
    private String telefon;
    private String vehicul;

    public Livrator(String nume, String prenume, String telefon, String vehicul) {
        this.nume = nume;
        this.prenume = prenume;
        this.telefon = telefon;
        this.vehicul = vehicul;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public String getVehicul() {
        return vehicul;
    }

    public void setVehicul(String vehicul) {
        this.vehicul = vehicul;
    }

    @Override
    public String toString() {
        return "Livrator{" +
                "nume='" + nume + '\'' +
                ", prenume='" + prenume + '\'' +
                ", telefon='" + telefon + '\'' +
                ", vehicul='" + vehicul + '\'' +
                '}';
    }
}
