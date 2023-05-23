package Lab06Teil3;

public class Aufgabe17 {

    public static void main(String[] args) {
        // Test the function
        System.out.println(arbeitszeit(100, 10, 5));  // Should return 20
    }

    public static int arbeitszeit(int baume, int arbeiter, int maschinen) {
        // Each machine can cut 3 trees per day
        int maschinen_schnitt = maschinen * 3;

        // The remaining workers, who have to use handsaws, can cut 1 tree per day
        int handsaegen_schnitt = Math.max(0, arbeiter - maschinen);

        // Calculate the total number of trees cut per day
        int schnitt_pro_tag = maschinen_schnitt + handsaegen_schnitt;

        // Calculate the total days required
        int tage = (int) Math.ceil((double) baume / schnitt_pro_tag);

        return tage;
    }
}
