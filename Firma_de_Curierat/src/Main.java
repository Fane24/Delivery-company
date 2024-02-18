
import GUI.AdresaPanel;
import GUI.FereastraPrincipala;
import GUI.Loghin;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Client c=new Client("Marian","Calea Vitan","074537","marian@yahoo.com");
        Livrator l=new Livrator("Marian","andrei","038934","BMW");
        Adresa adresa=new Adresa("Calea Vitan",211,"BUC","031288");

        Pachet pachet=new Pachet(21,l,c,true);
        Comanda comanda=new Comanda(pachet,adresa,211,true);
        comanda.salveazaComandaInFisier("comanda.txt");
        pachet.adaugaPachet(pachet);
        pachet.salveazaPachetInFisier("pachete.txt");
        FereastraPrincipala fereastraPrincipala=new FereastraPrincipala();
        FereastraPrincipala fereastraPrincipala1=new FereastraPrincipala();
        AdresaPanel adresaPanel=new AdresaPanel();
        JFrame frame = new JFrame("Login Form");

    }
}
