package Lab06Teil1;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        //Namen einlesen
        Mervan("Cano");

    }

    static void Mervan(String name) {
        do {
            System.out.print("Enter your nickname: ");
            Scanner input = new Scanner(System.in);
            name = input.nextLine();

            if (name.length() >= 3) {
                System.out.println(name);
            } else {
                System.out.println("Enter a name which consists at least of three characters!");
            }

        } while (!(name.length()>=3));
    }
}
