package PLF_7_6_2023;

public class Aufgabe1 {
    public static void main(String[] args) {
        calculatePrice();
    }

    static void calculatePrice(){
        float stueckpreis = 10f;
        int menge = 1;
        float rabatt = 0.80f; //20%

        float gesamtpreis = stueckpreis*menge*rabatt;
        System.out.println("Total price for " + menge + " piece(s) " + stueckpreis + " € each and" + " 20% discount is: " + "€" + gesamtpreis);
    }
}
