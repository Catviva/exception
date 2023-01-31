package transport;

public class Truck <T extends LicenseCategoryC> extends Transport  {

    private final Enum<CapacityType> capacityType;

    public Truck(String brand,
                 String model,
                 double engineVolume,
                 LicenseCategoryC driver, CapacityType capacityType) {
        super(brand, model, engineVolume, driver);
        this.capacityType = capacityType;
    }



    @Override
    public void startMoving() {
        System.out.println("Грузовой автомобиль марки" + getBrand() + "начал движение");
    }

    @Override
    public void finishMoving() {
        System.out.println("Грузовой автомобиль марки" + getBrand() + "закончил движение");

    }

    @Override
    public void printType() {
        System.out.println("Грузоподъёмность " + getBrand() + " - " + capacityType);
    }

    @Override
    public void pitStop () {
        System.out.println("Пит-стоп у грузового автомобиля");
    }

    @Override
    public void bestLapTime() {
        System.out.println("Лучшее время круга");

    }

    @Override
    public void maxSpeed() {
        System.out.println("Мксимальная скорость");
    }
    @Override
    public void passDiagnostic (){
        System.out.println("Пройти диагностику!");
    }

}
