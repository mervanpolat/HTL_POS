import java.util.Scanner;

public class GluecksprogrammImEntwicklung {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String antwort = "";


        System.out.println("Willkommen bei meinem Glücksprogramm!");

        while (!antwort.equalsIgnoreCase("genug")) {
            System.out.println("Bist du gestresst oder nervös? (Ja/Nein)");
            antwort = scanner.nextLine();

            if (antwort.equalsIgnoreCase("Nein")){
                System.out.println("Okay, dann wünsche ich dir einen schönen Tag");
            }


            if (antwort.equalsIgnoreCase("ja")) {
                System.out.println("Keine Sorge, ich helfen dir, dich zu beruhigen.");

                for (int i = 0; i < 3; i++) {
                    System.out.println("Atme tief ein und aus.");
                }

                for (int i = 0; i < 2; i++) {
                    System.out.println("Stell dir einen schönen Ort vor, an dem du gerne wärst.");
                }

                for (int i = 0; i < 1; i++) {
                    System.out.println("Stell dich in deine beste Position in dem du dich gut fühlst und komm wieder in den reales leben.");
                }
                System.out.println("Wenn du meine Hilfe weiter benötigst drück auf 'ja'");
                String antwort2 = scanner.nextLine();

                boolean sport = antwort2.equalsIgnoreCase("ja");

                if (sport) {
                    System.out.println("Hier habe ich mehrere Vorschläge für dich:");
                    // hier könnten die Sportübungen ausgeführt werden
                }
                if (sport) {
                    // System.out.println("Lass uns ein paar leichte Sportübungen machen, um dich zu entspannen.");
                    String Übung = " \n" +
                            "Es gibt eine Vielzahl von Sportarten und Übungen, die für die Meditation und das Wohlbefinden der Seele geeignet sein können. Hier sind einige Beispiele:\n" +
                            "\n" +
                            "Yoga: Yoga ist eine ganzheitliche Übung, die Körper, Geist und Seele verbindet. Die verschiedenen Asanas (Körperhaltungen), Atemübungen und Meditationstechniken, die im Yoga praktiziert werden, können dazu beitragen, Stress abzubauen, den Geist zu beruhigen und das allgemeine Wohlbefinden zu verbessern.\n" +
                            "\n" +
                            "Tai Chi: Tai Chi ist eine traditionelle chinesische Kampfkunst, die sich auf langsames und sanftes Bewegen konzentriert. Es kann dazu beitragen, die Körperhaltung zu verbessern, die Flexibilität zu erhöhen und Stress abzubauen.\n" +
                            "\n" +
                            "Pilates: Pilates ist eine Übungsmethode, die sich auf die Stärkung des Körperkerns konzentriert. Es kann dazu beitragen, die Körperhaltung zu verbessern, den Körper zu straffen und den Geist zu beruhigen.\n" +
                            "\n" +
                            "Wandern: Wandern ist eine großartige Möglichkeit, sich körperlich zu betätigen und gleichzeitig die Natur zu genießen. Es kann dazu beitragen, Stress abzubauen, den Geist zu beruhigen und das allgemeine Wohlbefinden zu verbessern.\n" +
                            "\n" +
                            "Laufen: Laufen kann ein großartiger Weg sein, um Stress abzubauen und den Geist zu beruhigen. Es kann auch dazu beitragen, die körperliche Fitness zu verbessern und das Selbstvertrauen zu stärken.\n" +
                            "\n" +
                            "Schwimmen: Schwimmen ist eine gute Möglichkeit, sich körperlich zu betätigen, ohne dabei die Gelenke zu belasten. Es kann dazu beitragen, Stress abzubauen, die Flexibilität zu erhöhen und das allgemeine Wohlbefinden zu verbessern.\n" +
                            "\n" +
                            "Letztendlich ist es wichtig, eine Sportart oder Übung zu wählen, die einem persönlich gefällt und mit der man sich wohl fühlt. So kann man die Übung regelmäßig in den Alltag integrieren und von den positiven Auswirkungen auf die Seele profitieren.\n" +
                            "\n";
                    System.out.println(Übung);


                    System.out.println("Wie fühlst du dich jetzt?");
                    antwort = scanner.nextLine();

                    if (antwort.equalsIgnoreCase("besser")) {
                        System.out.println("Das freut uns zu hören! ich bin immer hier, um dir zu helfen.");
                    } else {
                        System.out.println("Keine Sorge, das wird schon wieder. Wir können das nochmal machen, wenn du willst.");
                    }
                } else {
                    System.out.println("Okay, wenn du Hilfe brauchst, bin ich immer hier für dich.");
                }


            }//da wird nochmal die Schleife gerufen, wenn der/die Nutzer:innen sich noch immer nicht wohl gefühlt haben
            // Das Programm ist noch immer in der Entwicklung phase!!
            if (antwort.equalsIgnoreCase("Andere")) {
                System.out.println("Versuchen wir nochmal von Anfang");
            }

            {
                for (int i = 0; i < 1 ; i++) {
                    System.out.println("Bist du gestresst oder nervös? (Ja/Nein)");
                    antwort = scanner.nextLine();
                }


                System.out.println("Möchtest du noch etwas anderes besprechen oder hast du genug für heute? (Andere/genug)");
                antwort = scanner.nextLine();

                if (antwort.equalsIgnoreCase("genug")) {
                    System.out.println("Danke, dass du mein Glücksprogramm ausprobiert hast. ich hoffen, es hat dir geholfen!");
                } else {
                    System.out.println("Versuchen wir wieder von Anfang");
                }
            }
        }
    }
}
