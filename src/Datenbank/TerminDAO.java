
package Datenbank;

import Model.Termin;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class TerminDAO {

    // 1. Alle Termine holen (Thema: List)
    public List<Termin> getAllTermine() {
        List<Termin> liste = new ArrayList<>();
        String sql = "SELECT * FROM termin"; // Name eurer Tabelle prüfen

        try (Connection conn = DBConnection.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                // Wir erstellen für jede Zeile in SQL ein Java-Objekt
                Termin t = new Termin(
                        rs.getInt("idTermin"),
                        rs.getDate("datum"),
                        rs.getTime("uhrzeit"),
                        rs.getString("grund"),
                        rs.getString("status"),
                        rs.getInt("fk_idPatient"),
                        rs.getInt("fk_idArzt")
                );
                liste.add(t); // Ab in die Liste damit!
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return liste;
    }

    // 2. Neuen Termin speichern
    public void addTermin(Termin t) {
        String sql = "INSERT INTO termin (datum, uhrzeit, grund, status, fk_idPatient, fk_idArzt) VALUES (?, ?, ?, ?, ?, ?)";

        try (Connection conn = DBConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setDate(1, t.getDatum());
            pstmt.setTime(2, t.getUhrzeit());
            pstmt.setString(3, t.getGrund());
            pstmt.setString(4, t.getStatus());
            pstmt.setInt(5, t.getidPatient());
            pstmt.setInt(6, t.getidArzt());

            pstmt.executeUpdate();
            System.out.println("Termin erfolgreich gespeichert!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // 3. Termin bearbeiten (Update)
    public void updateTermin(Termin t) {
        String sql = "UPDATE termin SET datum=?, uhrzeit=?, grund=?, status=? WHERE idTermin=?";

        try (Connection conn = DBConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setDate(1, t.getDatum());
            pstmt.setTime(2, t.getUhrzeit());
            pstmt.setString(3, t.getGrund());
            pstmt.setString(4, t.getStatus());
            pstmt.setInt(5, t.getIdTermin());

            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // 4. Termin löschen
    public void deleteTermin(int id) {
        String sql = "DELETE FROM termin WHERE idTermin = ?";

        try (Connection conn = DBConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setInt(1, id);
            pstmt.executeUpdate();
            System.out.println("Termin gelöscht.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
