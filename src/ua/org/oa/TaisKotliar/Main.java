package ua.org.oa.TaisKotliar;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Main {
    static SimpleDateFormat dtFormat = new SimpleDateFormat("yyyy-MM-dd");

    public static void testRat(Rat ratToTest) throws ParseException {

        System.out.println("-------------");
        System.out.println("Name: " + ratToTest.getName());
        System.out.println("Color: " + ratToTest.getColor());
        System.out.println("Birthday: " + ratToTest.getBirthday());
        System.out.println("Weight: " + ratToTest.getWeight() + " gram");
        System.out.println("-------------");
    }

    public static void testCage(Cage cageToTest) {
        System.out.println("Name: " + cageToTest.getName());
        System.out.println("Length: " + cageToTest.getLength());
        System.out.println("Height: " + cageToTest.getHeight());
        System.out.println("Width: " + cageToTest.getWidth());
        System.out.println("Volume: " + cageToTest.getVolume());
        System.out.println("-------------");
    }

    public static void testPetMaster(PetMaster petMaster, Cage cageToTest) {
        if (petMaster.isCageSuitable(cageToTest) == true) {
            System.out.println("PetMaster says this cage is suitable");
        } else {
            System.out.println("PetMaster says this cage is NOT suitable");
        }
    }

    public static void main(String[] args) throws ParseException {
        Rat rat1 = new Rat("Scotty", "Gray", 460);
        Rat rat2 = new Rat("Chip", "Hoody", 390);

        rat1.setBirthday(dtFormat.parse("2017-10-02"));
        rat2.setBirthday(dtFormat.parse("2017-10-01"));

        testRat(rat1);
        testRat(rat2);

        Cage cage1 = new Cage("The First Cage", 0.7, 0.8, 0.4, "steel");
        Cage cage2 = new Cage("The Second Cage", 0.7, 0.8, 0.4, "glass");
        Cage cage3 = new Cage("The Third Cage", 0.4, 0.3, 0.2, "steel");

        testCage(cage1);
        testCage(cage2);
        testCage(cage3);

        PetMaster petMaster = new PetMaster();

        testPetMaster(petMaster, cage1);
        testPetMaster(petMaster, cage2);
        testPetMaster(petMaster, cage3);
    }
}