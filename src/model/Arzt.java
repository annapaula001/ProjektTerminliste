package model;


 //Speichert die Daten, die in der Tabelle "arzt" liegen


public class Arzt{
    private int idArzt;
    private String titel;
    private String vorname;
    private String nachname;
    private String fachgebiet;
    private String telefon;

    // Konstruktor um neues Objekt Arzt zu erstellen
    public Arzt(int idArzt, String titel, String vorname, String nachname, String fachgebiet, String telefon) {
        this.idArzt = idArzt;
        this.titel = titel;
        this.vorname = vorname;
        this.nachname = nachname;
        this.fachgebiet = fachgebiet;
        this.telefon = telefon;
    }

    // Getter um Daten abzufragen
    public int getIdArzt() { return idArzt; }
    public String getTitel() { return titel; }
    public String getVorname() { return vorname; }
    public String getNachname() { return nachname; }
    public String getFachgebiet() { return fachgebiet; }
    public String getTelefon() { return telefon; }

    // Setter um Daten zzu ändern
    public void setIdArzt(int idArzt) { this.idArzt = idArzt; }
    public void setTitel(String titel) { this.titel = titel; }
    public void setVorname(String vorname) { this.vorname = vorname; }
    public void setNachname(String nachname) { this.nachname = nachname; }
    public void setFachgebiet(String fachgebiet) { this.fachgebiet = fachgebiet; }
    public void setTelefon(String telefon) { this.telefon = telefon; }

    // Bestimmt wie der Arzt in Listen zB Dropdown-Menüs angezeigt wird
    @Override
    public String toString() {
        return titel + " " + vorname + " " + nachname + " (" + fachgebiet + ")";
    }
}