package Einfuehrung_Fehlerbehandlung.src;

import java.io.IOException;
import java.nio.file.Path;
import java.util.Scanner;

public class Auslesen {
    public static void main(String[] args) {
        readFile("testfile.csv");
    }

    public static void readFile(String filename) {
        Path path = Path.of(filename);

        try (Scanner scanner = new Scanner(path)) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] parts = line.split(";");
                System.out.println(parts[1]);
            }
        } catch (IOException ioe) {
            System.out.println(ioe.getMessage());
        }
    }
}
