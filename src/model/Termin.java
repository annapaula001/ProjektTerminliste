package model;

import java.sql.Date;
import java.sql.Time;

public class Termin {
    private int idTermin;
    private Date datum;
    private Time uhrzeit;
    private String grund;
    private String status;

    // Verweise auf die anderen Tabellen (Foreign Keys)
    private int idPatient; // Speichert die idPatient
    private int idArzt;    // Speichert die idArzt

    // Konstruktor
    public Termin(int idTermin, Date datum, Time uhrzeit, String grund, String status, int idPatient, int idArzt) {
        this.idTermin = idTermin;
        this.datum = datum;
        this.uhrzeit = uhrzeit;
        this.grund = grund;
        this.status = status;
        this.idPatient = idPatient;
        this.idArzt = idArzt;
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

    public int getidPatient() { return idPatient; }
    public void setidPatient(int idPatient) { this.idPatient = idPatient; }

    public int getidArzt() { return idArzt; }
    public void setidArzt(int arztId) { this.idArzt = idArzt; }

    @Override
    public String toString() {
        return "Termin am " + datum + " um " + uhrzeit;
    }
}