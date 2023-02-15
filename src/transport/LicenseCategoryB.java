package transport;

public class LicenseCategoryB extends Driver{

    public LicenseCategoryB(String name,
                            boolean driveLicense,
                            double experience) {
        super(name, driveLicense, experience);
    }
    @Override
    public void startMoving() {
        System.out.println("Водитель категории В" + getName() +
                "начал движение");
    }

    @Override
    public void stopMoving() {
        System.out.println("Водитель категории В" + getName() +
                "закончил движение");
    }

    @Override
    public void refuel() {
        System.out.println("Водитель категории В" + getName() +
                "заправляет автомобиль");
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
