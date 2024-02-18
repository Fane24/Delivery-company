public class Client {
    private String nume;
    private String adresa;
    private String nrTelefon;
    private String email;

    public Client(String nume, String adresa, String nrTelefon, String email) {
        this.nume = nume;
        this.nrTelefon = nrTelefon;
        this.email = email;
    }

    public Client() {

    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getNrTelefon() {
        return nrTelefon;
    }

    public void setNrTelefon(String nrTelefon) {
        this.nrTelefon = nrTelefon;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Client{" +
                "nume='" + nume + '\'' +
                ", adresa='" + adresa + '\'' +
                ", nrTelefon='" + nrTelefon + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
  /*public class ClientGUI {
    private JTextField textFieldNume;
    private JTextField textFieldAdresa;
    private JTextField textFieldTelefon;
    private JButton btnAdaugaClient;

    // constructor si alte metode

    private void adaugaClientActionPerformed(ActionEvent event) {
        String nume = textFieldNume.getText();
        String adresa = textFieldAdresa.getText();
        String telefon = textFieldTelefon.getText();

        // cream obiectul Client cu datele preluate din interfață grafică
        Client client = new Client(nume, adresa, telefon);

        // apelam metoda de scriere in fisier pentru a salva datele in fisierul text
        try {
            FileWriter fileWriter = new FileWriter("clienti.txt", true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            bufferedWriter.write(client.getNume() + "," + client.getAdresa() + "," + client.getTelefon());
            bufferedWriter.newLine();

            bufferedWriter.close();
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
*/

}
