public class Air {
    //-------------------ATTRIBUTES----------------
    private  double density;
    private double saturation;
    private String clear;
    private String H20;
    private String location;

    //------------------GETTERS/SETTERS-------------------


    public double getDensity() {
        return density;
    }

    public void setDensity(double density) {
        this.density = density;
    }

    public double getSaturation() {
        return saturation;
    }

    public void setSaturation(double saturation) {
        this.saturation = saturation;
    }

    public String getClear() {
        return clear;
    }

    public void setClear(String clear) {
        this.clear = clear;
    }

    public String getH20() {
        return H20;
    }

    public void setH20(String h20) {
        H20 = h20;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
