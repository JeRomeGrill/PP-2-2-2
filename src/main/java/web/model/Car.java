package web.model;

import java.util.ArrayList;
import java.util.List;

public class Car {
    private String manufacturer;
    private String model;
    private int year;

    public Car(String manufacturer, String model, int year) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.year = year;
    }

    public static List<Car> createFiveCars() {
        List <Car> cars = new ArrayList<>();
        cars.add(new Car ("BMW", "M3",2018));
        cars.add(new Car ("Audi", "A6",2020));
        cars.add(new Car ("Hyundai", "Creta",2022));
        cars.add(new Car ("Kia", "Rio",2021));
        cars.add(new Car ("Ford", "Focus",2015));
        return cars;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "Car{" +
                "manufacturer='" + manufacturer + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                '}';
    }

    public void setYear(int year) {
        this.year = year;
    }
}
