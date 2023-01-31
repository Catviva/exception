package transport;

public class Bus <T extends LicenseCategoryD> extends Transport  {
    private Capacity capacity;

    public Bus(String brand, String model, double engineVolume, Driver driver, Capacity capacity) {
        super(brand, model, engineVolume, driver);
        this.capacity = capacity;
    }

    @Override
    public void startMoving() {
        System.out.println("Автобус марки" + getBrand() + "начал движение");
    }

    @Override
    public void finishMoving() {
        System.out.println("Автобус марки" + getBrand() + "закончил движение");

    }

    @Override
    public void pitStop() {
        System.out.println("Пит-стоп");

    }

    @Override
    public void bestLapTime() {
        int minTime = 30;
        int maxTime = 240;
        int bestLapTime = ((int) (minTime + (maxTime - minTime)* Math.random()));
        System.out.println("Лучшее время круга у автобуса " + bestLapTime);

    }

    @Override
    public void maxSpeed() {
        int minBound = 80;
        int maxBound = 150;
        int maxSpeed = ((int) (minBound + (maxBound - minBound)* Math.random()));
        System.out.println("Максимальная скорость у автобуса" + maxSpeed);

    }
    @Override
    public void printType() {
        System.out.println("Максимальнаая вместимость автобуса " + getBrand() + " - " + capacity);
    }
    @Override
    public void passDiagnostic () {
        throw new TransportTypeException("Автобусы диагностику проходить не должны");

    }
}
