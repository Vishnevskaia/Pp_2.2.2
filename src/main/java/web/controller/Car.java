package web.controller;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Car {
    private int carSeries;
    private String carModel;
    private String transmission;
    private ArrayList cars;

    public int carCount = 4;
    List<Car> newCars;

    public Car(int carSeries, String carModel, String transmission) {
        this.carSeries = carSeries;
        this.carModel = carModel;
        this.transmission = transmission;
    }

    public static ArrayList<Car> addCars() {
        ArrayList<Car> cars = new ArrayList<>();
        cars.add(new Car(47060, "Renault Symbol", "mechanical"));
        cars.add(new Car(78646, "BMW x7", "manual"));
        cars.add(new Car(69881, "Range rover sport", "manual"));
        cars.add(new Car(47221, "Mazda CX-9", "manual"));
        cars.add(new Car(78000, "Lada kalina", "mechanical"));
        return cars;
    }


    public static List<Car> getSomeCars(int carCount, List<Car> cars) {
        List<Car> cars1 = cars.stream()
                .limit(carCount)
                .toList();
        return cars1;

    }

    public List getCars() {
        return cars;
    }


    public int getCarSeries() {
        return carSeries;
    }

    public void setCarSeries(int carSeries) {
        this.carSeries = carSeries;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    @Override
    public String toString() {
        return "Car{" +
                "carSeries=" + carSeries +
                ", carModel='" + carModel + '\'' +
                ", transmission='" + transmission + '\'' +
                '}';
    }
}
