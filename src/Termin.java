import java.sql.Date;
import java.sql.Time;
public class Termin {
    private int idTermin;
    private Date datum;
    private Time uhrzeit;
    private String grund;
    private String status;

    // Die Verknüpfungen zu den anderen Tabellen
    private int idPatient;  //(FK)
    private int idArzt;    //(FK)

    // Konstruktor
    public Termin(int idTermin, Date datum, Time uhrzeit, String grund, String status, int patientId, int arztId) {
        this.idTermin = idTermin;
        this.datum = datum;
        this.uhrzeit = uhrzeit;
        this.grund = grund;
        this.status = status;
        this.idPatient = idPatient;
        this.idArzt = idArzt;
    }

     public int getIdTermin() {
        return idTermin;
             }
public void setIdTermin(int idTermin) {
        this.idTermin = idTermin;
}
public Date getDatum() {}
public void setDatum(Date datum) {}
public Time getUhrzeit() {return uhrzeit;}
public void setUhrzeit(Time uhrzeit) {}
public String getGrund() {return grund;}
public void setGrund(String grund) {}
public String getStatus() {return status;}
public void setStatus(String status) {}
public int getIdPatient() {return idPatient;}
public void setIdPatient(int idPatient) {}
public int getIdArzt() {return idArzt;}
public void setIdArzt(int idArzt) {}
}