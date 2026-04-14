package factory;
public class Main {
    public static void main(String[] args) {
        vehicle v1=vehiclefactory.getVehicle("car");
        v1.drive();
        vehicle v2=vehiclefactory.getVehicle("bike");
        v2.drive();
        vehicle v3=vehiclefactory.getVehicle("truck");
        v3.drive();    
    }
}