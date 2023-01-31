package transport;

import static transport.CheckUtility.checkBrand;
import static transport.CheckUtility.checkModel;

public abstract class Transport <T extends Driver> implements Competing {

    public String brand;
    public String model;
    public double engineVolume;
    public T driver;


    public Transport(String brand,
                     String model,
                     double engineVolume,
                     T driver) {
        this.brand = checkBrand(brand);
        this.model = checkModel(model);
        this.engineVolume = CheckUtility.checkEngineVolume(engineVolume);
        setDriver(driver);
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }


    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    public T getDriver() {
        return driver;
    }

    public void setDriver(T driver) {
        this.driver = driver;
    }

    @Override
    public String toString() {
        return brand + ", " +
                model + ", " +
                engineVolume + ". ";
    }
    public abstract void startMoving ();

    public abstract void finishMoving();

    public abstract void printType();

    public abstract void passDiagnostic ();




   /*public void print() {
    System.out.println(this);*/
    }


