
package gui;

import javax.swing.SwingUtilities;

/**
 * Der AppLauncher ist der "Zündschlüssel" des Programms.
 * Er enthält die main-Methode und nichts anderes.
 */
public class AppLauncher {

    public static void main(String[] args) {
        // Wir sagen Java: "Starte die grafische Oberfläche (GUI) sicher im Hintergrund"
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                // Hier rufen wir unser Hauptfenster auf
                Hauptfenster meinFenster = new Hauptfenster();

                // Und machen es sichtbar
                meinFenster.setVisible(true);
            }
        });
    }
}