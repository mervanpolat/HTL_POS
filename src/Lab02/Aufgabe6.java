package Lab02;

public class Aufgabe6 {
    public static void main(String[] args) {

        // Aufgabe 6: Zufallszahlen
        // Erzeugen Sie drei Zufallszahlen und speichern Sie diese in einer Variablen.
        // Verwenden Sie anschließend die Funktion Math.max(), um das Maximum der drei Zahlen zu ermitteln und geben
        // sie sowohl die generierten Zufallszahlen als auch das ermittelte Maximum auf der Konsole aus.

        //Zufallszahlen
        int max =  114;
        int min = 19;

        int a = (int) (Math.random()*(max-min));
        int b = (int) (Math.random()*(max-min));
        int c = (int) (Math.random()*(max-min));

        System.out.println("Die höchste Zahl aus den drei Zuffalszahlen " + a + ", " + b + ", " + c + " ist "+ Math.max(Math.max(a,b),c));
    }
}
