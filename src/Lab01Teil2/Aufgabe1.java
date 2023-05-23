package Lab01Teil2;

public class Aufgabe1 {
    public static void main(String[] args) {
        // Aufgabe1: Wertebereich überprüfen
        // Legen Sie eine Integer-Variable mit einem beliebigen Wert an. Schreiben Sie nun eine boolesche Bedingung,
        // die überprüft, ob der Wert der Variablen zwischen 1 und 10 (jeweils exklusive) liegt.
        // Geben Sie den booleschen Wert auf der Konsole aus.
        // Schreiben Sie anschließend eine weitere Bedingung, die überprüft, ob der Wert der Variablen zwischen
        // 1 und 10 – aber diesmal inklusive der beiden Grenzen – liegt. Geben Sie auch hier den booleschen Wert auf der Konsole aus.
        // Testen Sie Ihr Programm mit unterschiedlichen Werten, z.B. 0, 1, 2, 9, 10, 11, -5, 1000, ...

        int num = 1;
        boolean test = num > 1 && num < 10;
        System.out.println(test);   //Prints false

        boolean test2 = num >= 1 || num <= 10;
        System.out.println(test2);  //Prints true
    }
}
