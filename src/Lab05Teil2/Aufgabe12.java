package Lab05Teil2;
import java.util.Scanner;

public class Aufgabe12 {
    public static void main(String[] args) {
        //Aufgabe 12: Vielfaches
        //Erstellen Sie ein Programm, das alle Zahlen zwischen 1500 und 2700 ausgibt, die ein Vielfaches von 5 und 7 sind.
        //1505
        //1540
        //1575
        //1610
        //1645
        //...
        //2625
        //2660
        //2695

        for (int i = 1500; i <= 2700 ; i++) {
            if (i % 7 == 0 && i % 5 == 0) {
                System.out.println(i);
            }
        }

        //1505
        //1540
        //1575
        //1610
        //1645
        //1680
        //1715
        //1750
        //1785
        //1820
        //1855
        //1890
        //1925
        //1960
        //1995
        //2030
        //2065
        //2100
        //2135
        //2170
        //2205
        //2240
        //2275
        //2310
        //2345
        //2380
        //2415
        //2450
        //2485
        //2520
        //2555
        //2590
        //2625
        //2660
        //2695
    }
}
