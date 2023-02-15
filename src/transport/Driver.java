package transport;

import java.util.Objects;

public abstract class Driver {
    public String name;
    public boolean driveLicense;
    public double experience;

    public Driver(String name, boolean driveLicense, double experience) {
        this.name = name;
        this.driveLicense = driveLicense;
        this.experience = experience;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public boolean isDriveLicense() {
        return driveLicense;
    }

    public void setDriveLicense(boolean driveLicense) {

        this.driveLicense = driveLicense;
    }

    public double getExperience() {

        return experience;
    }

    public void setExperience(double experience) {

        this.experience = experience;
    }
    public abstract void startMoving();
    public abstract void stopMoving();
    public abstract void refuel();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Driver)) return false;
        Driver driver = (Driver) o;
        return driveLicense == driver.driveLicense && Double.compare(driver.experience, experience) == 0 && name.equals(driver.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, driveLicense, experience);
    }

    @Override
    public String toString() {
        return "Водитель " +  name ;
    }
}
