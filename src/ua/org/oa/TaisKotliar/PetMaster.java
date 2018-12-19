package ua.org.oa.TaisKotliar;

public class PetMaster {
    /**
     * define is cage suitable for one rat
     * @param myCage testing cage
     * @return true if cage is suitable
     */
    public boolean isCageSuitable(Cage myCage) {
        if ((myCage.getHeight() < 0.4 || myCage.getLength() < 0.6 || myCage.getWidth() < 0.4) || !myCage.Material.equals("steel")) {
            return false;
        } else {
            return true;
        }
    }
}