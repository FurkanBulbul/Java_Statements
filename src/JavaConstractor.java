package Java_Application;

public class JavaConstractor {


    public static void main(String[] args) {
        JavaConstractor house = new JavaConstractor(12, 4, 6);

        System.out.println("Windows: " + house.getWindows() + " Doors: " + house.getDoors() + " Bedrooms: " + house.getBedrooms());
    }

    private int nbrOfWindows;
    private int nbrOfDoors;
    private int nbrOfBedrooms;

    public JavaConstractor(int windows, int doors, int bedrooms) {

        this.nbrOfWindows = windows;
        this.nbrOfDoors = doors;
        this.nbrOfBedrooms = bedrooms;

    }
    
    public int getWindows() {
        return nbrOfWindows;
    }

    public int getDoors() {
        return nbrOfDoors;
    }

    public int getBedrooms() {
        return nbrOfBedrooms;
    }

}