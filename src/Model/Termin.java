package Model;

import java.sql.Date;
import java.sql.Time;

public class Termin {
    private int idTermin;
    private Date datum;
    private Time uhrzeit;
    private String grund;
    private String status;

    // Verweise auf die anderen Tabellen (Foreign Keys)
    private int patientId; // Speichert die idPatient
    private int arztId;    // Speichert die idArzt

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

    // Getter und Setter
    public int getIdTermin() { return idTermin; }
    public void setIdTermin(int idTermin) { this.idTermin = idTermin; }

    public Date getDatum() { return datum; }
    public void setDatum(Date datum) { this.datum = datum; }

    public Time getUhrzeit() { return uhrzeit; }
    public void setUhrzeit(Time uhrzeit) { this.uhrzeit = uhrzeit; }

    public String getGrund() { return grund; }
    public void setGrund(String grund) { this.grund = grund; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }

    public int getPatientId() { return patientId; }
    public void setPatientId(int patientId) { this.patientId = patientId; }

    public int getArztId() { return arztId; }
    public void setArztId(int arztId) { this.arztId = arztId; }

    @Override
    public String toString() {
        return "Termin am " + datum + " um " + uhrzeit;
    }
}