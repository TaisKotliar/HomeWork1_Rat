package ua.org.oa.TaisKotliar;

import java.util.Date;

public class Rat {

    /**
     * Rat name
     */
    private String Name;

    /**
     * Rat birthday
     */
    private Date Birthday;

    /**
     * Rat color
     */
    private String Color;

    /**
     * Rat weight
     */
    private double Weight;

    /**
     * Rat constructor
     * @param Name New rat name
     */
    public Rat(String Name, String Color, double Weight) {
        this.Name = Name;
        this.Birthday = new Date();
        this.Color = Color;
        this.Weight = Weight;
    }

    public String toString() {
        return (Name + ", " + Birthday + ", " + Weight + " gramm");
    }

    /**
     * Return Rat name
     * @return Rat name
     */
    public String getName() {
        return Name;
    }

    /**
     * Return color
     * @return color
     */
    public String getColor() {
        return Color;
    }

    /**
     * Set date of rat birthday
     * @param newBirthday year month day of rat birthday
     */
    public void setBirthday(Date newBirthday) {
        Birthday = newBirthday;
    }

    /**
     * Return date of rat birthday
     * @return rat birthday
     */
    public Date getBirthday() {
        return Birthday;
    }

    /**
     * Return rat weight in gramms
     * @return rat weight
     */
    public double getWeight(){
        return Weight;
    }
}
