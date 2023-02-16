package transport;

import java.util.List;

public class Car <T extends LicenseCategoryB> extends Transport  {

    public CarBody getCarBody() {
        return carBody;
    }

    public void setCarBody(CarBody carBody) {
        this.carBody = carBody;
    }

    private CarBody carBody;
    public Car(String brand,
               String model,
               double engineVolume,
               LicenseCategoryB driver,
               CarBody carBody,
               List<Mechanic> mechanicList) {
        super(brand, model, engineVolume, driver, mechanicList);
        this.setCarBody(carBody);
    }



    @Override
    public void startMoving() {
        System.out.println("Автомобиль марки" + getBrand() + "начал движение");
    }

    @Override
    public void finishMoving() {
        System.out.println("Автомобиль марки" + getBrand() + "начал движение");

    }

    @Override
    public void pitStop() {
        System.out.println("Пит-стоп");

    }

    @Override
    public void bestLapTime() {
        System.out.println("Лучшее время круга");

    }
    @Override
    public void printType(){
        System.out.println("Кузов автомобиля " + getBrand() + " - " + carBody);
    }

    @Override
    public boolean needDiagnostic() {
        return true;
    }


    @Override
    public void maxSpeed() {
        int minBound = 150;
        int maxBound = 300;
        int maxSpeed = ((int) (minBound + (maxBound - minBound)* Math.random()));
        System.out.println("Максимальная скорость у автомобиля " + maxSpeed);

    }
    @Override
    public void passDiagnostic() {
        System.out.println("Пройти дигностику!");
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}