package transport;

import java.util.List;

import static transport.CheckUtility.checkBrand;
import static transport.CheckUtility.checkModel;

public abstract class Transport <T extends Driver> implements Competing {


    public String brand;
    public String model;
    public double engineVolume;
    public T driver;

    public List<Mechanic> mechanicList;


    public Transport(String brand,
                     String model,
                     double engineVolume,
                     T driver,
                     List<Mechanic> mechanicList) {
        this.brand = checkBrand(brand);
        this.model = checkModel(model);
        this.engineVolume = CheckUtility.checkEngineVolume(engineVolume);
        setDriver(driver);
        this.mechanicList = mechanicList;
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

    public List<Mechanic> getMechanicList() {
        return mechanicList;
    }

    public void setMechanicList(List<Mechanic> mechanicList) {
        this.mechanicList = mechanicList;
    }

    @Override
    public String toString() {
        return brand + ", " +
                model + ", " +
                engineVolume + ". ";
    }

    public abstract void startMoving();

    public abstract void finishMoving();

    public abstract void printType();

    public boolean needDiagnostic() {
        try {
            passDiagnostic();
        } catch (TransportTypeException transportTypeException) {
            return false;
        }
            return true;
    }
    public abstract void passDiagnostic() throws TransportTypeException;


}



