
package GUI;

import javax.swing.*;
        import java.awt.*;

public class Hauptfenster extends JFrame {

    public Hauptfenster() {
        // Grundeinstellungen des Fensters
        setTitle("Terminmanagement System");
        setSize(900, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Zentriert das Fenster auf dem Bildschirm

        // Layout festlegen (BorderLayout ist wie eine Windrose: Nord, Süd, Ost, West, Mitte)
        setLayout(new BorderLayout());

        // Test-Inhalt hinzufügen
        JLabel infoText = new JLabel("Das Termin-System ist bereit.", SwingConstants.CENTER);
        add(infoText, BorderLayout.CENTER);
    }
}