package cars;

import java.util.ArrayList;
import java.util.List;

public class CarShop {
    String traderName;
    int maxPrice;
    List<Car> cars = new ArrayList<>();


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
        return cars.add(car);
    }



    public CarShop(String traderName, int maxPrice, List<Car> cars) {
        this.traderName = traderName;
        this.maxPrice = maxPrice;
        this.cars = cars;




    }
}
