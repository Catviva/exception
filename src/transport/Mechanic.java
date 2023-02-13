package transport;

public class Mechanic {

    private String name;
    private String company;

    public Mechanic(String name, String company) {
        this.name = name;
        this.company = company;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }
    public <T extends Transport> void carryOutMaintenance (T t) {
        System.out.println(t.toString() + " обслуживет механик " + this);
    }
    public <T extends Transport> void repairTheCar (T t) {
        System.out.println(t.toString() + " обслуживет механик " + this);
    }

    @Override
    public String toString() {
        return " " + name + " из " + company;
    }
}
