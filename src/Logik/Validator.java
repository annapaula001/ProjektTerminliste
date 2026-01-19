package Logik;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validator {

    /**
     * Prüft, ob das eingegebene Datum dem Format DD.MM.YYYY entspricht.
     * Beispiel: 24.12.2024 ist gültig, 24-12-24 ist ungültig.
     */
    public static boolean pruefeDatum(String eingabe) {
        // Das Regex-Muster:
        // ^        = Anfang des Textes
        // [0-3][0-9] = Erste Stelle 0-3, zweite Stelle 0-9 (Tag)
        // \.       = Ein echter Punkt (muss mit Backslash maskiert werden)
        // [0-1][0-9] = Monat (01 bis 12)
        // \.       = Noch ein Punkt
        // [0-9]{4} = Genau vier Zahlen für das Jahr
        // $        = Ende des Textes
        String regexDatum = "^[0-3][0-9]\\.[0-1][0-9]\\.[0-9]{4}$";

        // Wir erstellen ein Pattern (Muster) und einen Matcher (Prüfer)
        Pattern pattern = Pattern.compile(regexDatum);
        Matcher matcher = pattern.matcher(eingabe);

        // gibt true zurück, wenn die Eingabe dem Muster entspricht
        return matcher.matches();
    }

    /**
     * Prüft, ob die Uhrzeit dem Format HH:MM entspricht (24h-Format).
     * Beispiel: 08:30 ist gültig, 8:3 ist ungültig.
     */
    public static boolean pruefeUhrzeit(String eingabe) {
        // Regex für HH:MM (Stunden 00-23, Minuten 00-59)
        String regexZeit = "^([01]?[0-9]|2[0-3]):[0-5][0-9]$";

        return eingabe.matches(regexZeit);
    }
}