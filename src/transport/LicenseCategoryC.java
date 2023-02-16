package transport;

public class LicenseCategoryC extends Driver {

    public LicenseCategoryC(String name,
                            boolean driveLicense,
                            double experience) {
        super(name, driveLicense, experience);
    }

    @Override
    public void startMoving() {
        System.out.println("Водитель категории C" + getName() +
                "начал движение");
    }

    @Override
    public void stopMoving() {
        System.out.println("Водитель категории C" + getName() +
                "закончил движение");
    }

    @Override
    public void refuel() {
        System.out.println("Водитель категории C" + getName() +
                "заправляет автобус");
    }

}
