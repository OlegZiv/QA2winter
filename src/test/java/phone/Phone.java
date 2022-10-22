package phone;

public class Phone {
    //------------------------ATTRIBUTES-----------------
    private String brand;
    private  int amount;
    private double weight;
    private double size;
    private Float  slim;
    private boolean deliveryRequested;


    //-------------------GETTERS/SETTERS-------------------------


    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public Float getSlim() {
        return slim;
    }

    public void setSlim(Float slim) {
        this.slim = slim;
    }

    public boolean isDeliveryRequested() {
        return deliveryRequested;
    }

    public void setDeliveryRequested(boolean deliveryRequested) {
        this.deliveryRequested = deliveryRequested;
    }
}
