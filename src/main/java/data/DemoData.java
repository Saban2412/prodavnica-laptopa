package data;
import com.example.demo.data;
import com.example.demo.model;
import model.Accessory;
import model.Laptop;

import java.util.ArrayList;
import java.util.List;

public class DemoData {
    public static List<Laptop> laptops = new ArrayList<>();
    public static List<Accessory> accessories = new ArrayList<>();

    static{
        Laptop L1 = new Laptop(1, "Lenovo", "ThinkPad", 2000);
        Laptop L2 = new Laptop(2, "Macbook", "M3", 2000);
        Laptop L3 = new Laptop(1, "HP", "Emirov", 2000);

        laptops.add(L1);
        laptops.add(L2);
        laptops.add(L3);

        addAccessory(new Accessory(1, "Logitech mis", "mis", 23, L1));
        addAccessory(new Accessory(2, "Ryzen e34", "tastatura", 120, L3));
        addAccessory(new Accessory(3, "Logitech slusalice", "slusalice", 60, L2));
    }


    private static void AddAccessory(Accessory a){
        accessories.add(a);
        a.getLaptop().getAccessories().add(a);
    }

}
