import transport.*;

import java.util.List;

public class Main {
        public static void main(String[] args) {
            LicenseCategoryB driverB = new LicenseCategoryB("Вася", true, 15);
            LicenseCategoryC driverC = new LicenseCategoryC("Федя", true, 20);
            LicenseCategoryD driverD = new LicenseCategoryD("Петя", true, 30);

            Mechanic mechanic1 = new Mechanic("Иванов", "GRA");
            Mechanic mechanic2 = new Mechanic("Петров", "BS");

            Car car1 = new Car("Lada", "Granta", 1.7,
                                driverB, CarBody.SEDAN, List.of(mechanic1));
            Car car2 = new Car("Audi", "A8 50 L TDI quattro",  3.0,
                                driverB, CarBody.SEDAN, List.of(mechanic1));
            Car car3 = new Car("BMW", "", 3.0,
                                driverB, CarBody.COUPE, List.of(mechanic2));
            Car car4 = new Car(null, "Sportage 4-го поколения", 2.4,
                                driverB, CarBody.CROSSOVER, List.of(mechanic2));
            Bus bus1 = new Bus("Mercedes", "Sprinter", 3.0, driverD,
                                Capacity.EXTRA_SMALL, List.of(mechanic1));
            Bus bus2 = new Bus("ПАЗ", "672", 4.75,
                                driverD, Capacity.BIG, List.of(mechanic2));
            Bus bus3 = new Bus("Setra", "S217", 11.94,
                                driverD, Capacity.SMALL, List.of(mechanic2));
            Bus bus4 = new Bus("Neoplan", "N1216", 11.94,
                                driverD, Capacity.EXTRA_BIG, List.of(mechanic2));
            Truck truck1 = new Truck("MAN", "TGM", 6.9,
                                driverC, CapacityType.N2, List.of(mechanic1));
            Truck truck2 = new Truck("Volvo", "FL", 7.2,
                                driverC, CapacityType.N2, List.of(mechanic1));
            Truck truck3 = new Truck("КамАЗ", "65115", 11.8,
                                driverC, CapacityType.N3, List.of(mechanic2));
            Truck truck4 = new Truck("DAF", "LF 45", 6.7,
                                driverC, CapacityType.N1, List.of(mechanic2));





            truck1.pitStop();
            bus3.bestLapTime();
            car2.maxSpeed();
            printInfo(car3);
            printInfo(bus4);
            printInfo(truck1);
            car2.printType();
            bus3.printType();
            truck4.printType();
            car1.passDiagnostic();
            mechanic1.repairTheCar(car1);






        }
        private static void printInfo(Transport transport) {
            System.out.println("Водитель " + transport.getDriver().getName()+
                    " управляет " + transport.getBrand() +
                    " и будет участвовать в заезде.");
        }

    }
