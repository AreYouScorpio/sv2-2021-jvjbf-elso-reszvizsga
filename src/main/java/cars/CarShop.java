package cars;

import java.util.ArrayList;
import java.util.List;

public class CarShop {
    private String traderName;
    private int maxPrice;
    public static List<Car> cars = new ArrayList<>();



    public String getTraderName() {
        return traderName;
    }

    public int getMaxPrice() {
        return maxPrice;
    }

    public List<Car> getCars() {
        return cars;
    }

    boolean addCar(Car car){
        if (car.price<maxPrice) {
            cars.add(car);
            return true;
        }
        return false;
    }



    public CarShop(String traderName, int maxPrice, List<Car> cars) {
        this.traderName = traderName;
        this.maxPrice = maxPrice;
        this.cars = cars;




    }
}
