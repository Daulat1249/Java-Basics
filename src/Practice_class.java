public class Practice_class {
    public static void main(String[] args) {

        Vehicle miniVan = new Vehicle();
        int range;
        //assign values to fields in minivan
        miniVan.passengers = 7;
        miniVan.fuelCap = 16;
        miniVan.mpg = 21;

        range = miniVan.fuelCap * miniVan.mpg;
        System.out.println("Minivan can carry "+miniVan.passengers+" with a range of "+range);
    }
}
