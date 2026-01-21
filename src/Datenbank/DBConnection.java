package Datenbank;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    // Zugangsdaten (bitte an eure Workbench anpassen!)
    private static final String URL = "jdbc:mysql://localhost:3306/";
    private static final String USER = "24pfse";
    private static final String PASSWORD = "geb24";

    private static Connection connection = null;

    // Öffnet die Verbindung
    public static Connection getConnection() {
        try {
            if (connection == null || connection.isClosed()) {
                connection = DriverManager.getConnection(URL, USER, PASSWORD);
                System.out.println("Datenbank-Verbindung aktiv.");
            }
        } catch (SQLException e) {
            System.err.println("Verbindungsfehler: " + e.getMessage());
        }
        return connection;
    }

    // Schließt die Verbindung (Wichtig für PDF Punkt [18])
    public static void closeConnection() {
        try {
            if (connection != null && !connection.isClosed()) {
                connection.close();
                System.out.println("Datenbank-Verbindung sicher beendet.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
