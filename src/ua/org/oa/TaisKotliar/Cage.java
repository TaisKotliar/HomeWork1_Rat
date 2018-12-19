package ua.org.oa.TaisKotliar;

public class Cage {
    /**
     * Cage height in meters
     */
    private double Height;

    /**
     * Cage length in meters
     */
    private double Length;

    /**
     * Cage width in meters
     */
    private double Width;

    /**
     * Сage name
     */
    private String CageName;

    /**
     * cage material
     */
    public String Material;

    /**
     * Сreate cagу
     * @param height   cage height
     * @param length   cage length
     * @param width    cage width
     * @param material cage material
     */
    public Cage(String cageName, double height, double length, double width, String material) {
        this.Height = height;
        this.Length = length;
        this.Width = width;
        this.Material = material;
        this.CageName = cageName;
    }

    /**
     * Кeturn cage name
     * @return cage name
     */
    public String getName() {
        return CageName;
    }

    /**
     * Кeturn cage height
     * @return cage height in meters
     */
    public double getHeight() {
        return Height;
    }

    /**
     * Кeturn cage length
     * @return cage length in meters
     */
    public double getLength() {
        return Length;
    }

    /**
     * Кeturn cage width
     * @return cage width in meters
     */
    public double getWidth() {
        return Width;
    }

    /**
     * Сalculate cage volume
     * @return volume in meters
     */
    public double getVolume() {

        return Height * Length * Width;
    }

}
