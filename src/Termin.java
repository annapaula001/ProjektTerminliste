public class Termin {
}
package model;

import java.sql.Date;
import java.sql.Time;

public class Termin {
    private int idTermin;
    private Date datum;
    private Time uhrzeit;
    private String grund;
    private String status;

    // Die Verknüpfungen zu den anderen Tabellen
    private int patientId;  //(FK)
    private int arztId;    //(FK)

    // Konstruktor
    public Termin(int idTermin, Date datum, Time uhrzeit, String grund, String status, int patientId, int arztId) {
        this.idTermin = idTermin;
        this.datum = datum;
        this.uhrzeit = uhrzeit;
        this.grund = grund;
        this.status = status;
        this.patientId = patientId;
        this.arztId = arztId;
    }

}