package GUI;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class FereastraPrincipala extends JFrame implements ActionListener {

    private JPanel panouPrincipal;
    private JPanel panouMeniu;
    private JPanel panouAdresa;
    private JPanel panouClient;
    private JPanel panouPachet;
    private JPanel panouLivrator;
    private JPanel panouComanda;
    private CardLayout cardLayout;

    private JButton butonMeniuAdresa;
    private JButton butonMeniuClient;
    private JButton butonMeniuPachet;
    private JButton butonMeniuLivrator;
    private JButton butonMeniuComanda;

    public FereastraPrincipala() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 600);
        setTitle("Firma de curierat");

        // initializare panouri si layout
        panouPrincipal = new JPanel();
        panouMeniu = new JPanel();
        panouAdresa = new JPanel();
        panouClient = new JPanel();
        panouPachet = new JPanel();
        panouLivrator = new JPanel();
        panouComanda = new JPanel();
        cardLayout = new CardLayout();
        panouPrincipal.setLayout(cardLayout);

        // initializare butoane meniu
        butonMeniuAdresa = new JButton("Adresa");
        butonMeniuAdresa.addActionListener(this);
        butonMeniuClient = new JButton("Client");
        butonMeniuClient.addActionListener(this);
        butonMeniuPachet = new JButton("Pachet");
        butonMeniuPachet.addActionListener(this);
        butonMeniuLivrator = new JButton("Livrator");
        butonMeniuLivrator.addActionListener(this);
        butonMeniuComanda = new JButton("Comanda");
        butonMeniuComanda.addActionListener(this);

        // adaugare butoane in panou meniu
        panouMeniu.add(butonMeniuAdresa);
        panouMeniu.add(butonMeniuClient);
        panouMeniu.add(butonMeniuPachet);
        panouMeniu.add(butonMeniuLivrator);
        panouMeniu.add(butonMeniuComanda);
        butonMeniuAdresa.setPreferredSize(new Dimension(150, 50));
        butonMeniuClient.setPreferredSize(new Dimension(150, 50));
        butonMeniuPachet.setPreferredSize(new Dimension(150, 50));
        butonMeniuLivrator.setPreferredSize(new Dimension(150, 50));
        butonMeniuComanda.setPreferredSize(new Dimension(150, 50));


        // adaugare panouri in panou principal
        panouPrincipal.add(panouMeniu, "meniu");
        panouPrincipal.add(panouAdresa, "adresa");
        panouPrincipal.add(panouClient, "client");
        panouPrincipal.add(panouPachet, "pachet");
        panouPrincipal.add(panouLivrator, "livrator");
        panouPrincipal.add(panouComanda, "comanda");

        // afisare panou principal
        getContentPane().add(panouPrincipal, BorderLayout.CENTER);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {


        if (e.getSource() == butonMeniuAdresa) {
            cardLayout.show(panouPrincipal, "adresa");
            AdresaPanel adresaPanel = new AdresaPanel();
            panouAdresa.add(adresaPanel);
        } else if (e.getSource() == butonMeniuClient) {
            cardLayout.show(panouPrincipal, "client");
            ClientPanel clientPanel=new ClientPanel();
            panouClient.add(clientPanel);
        } else if (e.getSource() == butonMeniuPachet) {
            cardLayout.show(panouPrincipal, "pachet");
           PachetPanel pachetPanel=new PachetPanel();
           panouPachet.add(pachetPanel);
        } else if (e.getSource() == butonMeniuLivrator) {
            cardLayout.show(panouPrincipal, "livrator");
            LivratorPanel livratorPanel=new LivratorPanel();
            panouLivrator.add(livratorPanel);
        } else if (e.getSource() == butonMeniuComanda) {
            cardLayout.show(panouPrincipal, "comanda");
            ComandaPanel comandaPanel = new ComandaPanel();

            panouComanda.add(comandaPanel);
        }



    }

}



