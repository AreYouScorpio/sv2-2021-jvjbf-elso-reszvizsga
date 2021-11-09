package cars;

//import jdk.internal.org.objectweb.asm.tree.InsnList;

import java.util.ArrayList;
import java.util.List;

public class CarShop {
    private String traderName;
    private int maxPrice;
    public static List<Car> CarsForSell = new ArrayList<>();

    public CarShop(String traderName, int maxPrice) {
        this.traderName = traderName;
        this.maxPrice = maxPrice;
    }


    public String getTraderName() {
        return traderName;
    }

    public int getMaxPrice() {
        return maxPrice;
    }

    public List<Car> getCarsForSell() {
        return CarsForSell;
    }

    boolean addCar(Car car){
        if (car.price<maxPrice) {
            CarsForSell.add(car);
            return true;
        }
        return false;
    }

    int sumCarPrice(){
        int totalPrice=0;
        for (int i=0; i<getCarsForSell().size();i++) {
            totalPrice+= getCarsForSell().get(i).getPrice();
        }
        return totalPrice;
    }



}
