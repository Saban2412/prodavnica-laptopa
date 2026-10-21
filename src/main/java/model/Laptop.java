package model;
import java.util.List;
public class Laptop {
    private int id;
    private String marka;
    private String model;
    private double price;
    private List<Accessory> accessories;

    public Laptop(int id, String model, String marka, double price) {
        this.id = id;
        this.model = model;
        this.marka = marka;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public List<Accessory> getAccessories() {
        return accessories;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
