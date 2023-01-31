import transport.*;

public class Main {
        public static void main(String[] args) {
            LicenseCategoryB driverB = new LicenseCategoryB("Вася", true, 15);
            LicenseCategoryC driverC = new LicenseCategoryC("Федя", true, 20);
            LicenseCategoryD driverD = new LicenseCategoryD("Петя", true, 30);

            Car car1 = new Car("Lada", "Granta", 1.7, driverB, CarBody.SEDAN);
            Car car2 = new Car("Audi", "A8 50 L TDI quattro",  3.0, driverB, CarBody.SEDAN);
            Car car3 = new Car("BMW", "", 3.0, driverB, CarBody.COUPE);
            Car car4 = new Car(null, "Sportage 4-го поколения", 2.4, driverB, CarBody.CROSSOVER);
            Bus bus1 = new Bus("Mercedes", "Sprinter", 3.0, driverD, Capacity.EXTRA_SMALL);
            Bus bus2 = new Bus("ПАЗ", "672", 4.75, driverD, Capacity.BIG);
            Bus bus3 = new Bus("Setra", "S217", 11.94, driverD, Capacity.SMALL);
            Bus bus4 = new Bus("Neoplan", "N1216", 11.94, driverD, Capacity.EXTRA_BIG);
            Truck truck1 = new Truck("MAN", "TGM", 6.9, driverC, CapacityType.N2);
            Truck truck2 = new Truck("Volvo", "FL", 7.2, driverC, CapacityType.N2);
            Truck truck3 = new Truck("КамАЗ", "65115", 11.8, driverC, CapacityType.N3);
            Truck truck4 = new Truck("DAF", "LF 45", 6.7, driverC, CapacityType.N1);



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
            bus3.passDiagnostic();





        }
        private static void printInfo(Transport transport) {
            System.out.println("Водитель " + transport.getDriver().getName()+
                    " управляет " + transport.getBrand() +
                    " и будет участвовать в заезде.");
        }

    }
