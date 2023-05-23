package Lab01Teil1;

public class Aufgabe4 {
    public static void main(String[] args) {
        // Aufgabe4: Wegzeitberechnen
        // Sie sind in der Schule und wollen zum Stephansdom. Der Stephansdom ist 6 km entfernt, Ihre Gehgeschwindigkeit beträgt 5 km/h.
        // • Wie lange brauchen Sie in Stunden?
        // • Wie viele Minuten sind das?
        // • Schlüsseln Sie die Zeit in Stunden und Minuten auf.
        // • Verwenden Sie Kommentare im Programm, um die Rechenschritte zu erläutern.

        float s, v, t, hours, minutes, totalMinutes;

        s = 6;          // Weg
        v = 5;          // Geschwindigkeit
        t = s / v;      // Formel für die Zeit Berechnung

        hours = t;
        minutes = (t*10) % 60;      //Die Nachkommastellen werden zur Minute konvertiert.
        totalMinutes = t * 60;      //Die Zeit die in Stunden angegeben ist, wird zur Minute konvertiert.

        System.out.println("Ich brauche " + (int)hours + " Stunde und " + (int)minutes + " Minuten.");
        // Prints Ich brauche 1 Stunde und 12 Minuten.
        System.out.println("Das sind insgesamt "+ (int)totalMinutes + " Minuten.");
        // Prints Das sind insgesamt 72 Minuten.
    }
}
