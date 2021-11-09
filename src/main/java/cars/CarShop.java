package cars;

//import jdk.internal.org.objectweb.asm.tree.InsnList;

import java.util.ArrayList;
import java.util.List;

public class CarShop {
    private String traderName;
    private int maxPrice;
    public static List<Car> CarsForSell = new ArrayList<>();






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





    public CarShop(String traderName, int maxPrice, List<Car> cars) {
        this.traderName = traderName;
        this.maxPrice = maxPrice;
        this.CarsForSell = cars;




    }


}
