package transport;

public class LicenseCategoryD extends Driver  {

    public LicenseCategoryD(String name,
                            boolean driveLicense,
                            double experience) {
        super(name, driveLicense, experience);
    }
    @Override
    public void startMoving() {
        System.out.println("Водитель категории D" + getName() + "начал движение");
    }

    @Override
    public void stopMoving() {
        System.out.println("Водитель категории D" + getName() + "закончил движение");
    }

    @Override
    public void refuel() {
        System.out.println("Водитель категории D" + getName() + "заправляет автомобиль");
    }
}
