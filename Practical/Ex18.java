/*18.Create a class “Vehicle” with instance variable vehicle_type. Inherit the class in a class called “Car” with instance model_type, company name etc. 
display the information of the vehicle by defining the display() in both super and sub class [Method Overriding]*/

class Vehicle {
    String vehicle_type = "Vehicle";
    void display() {
        System.out.println("Vehicle Type: " + vehicle_type);
    }

}
class Ex18 extends Vehicle {
    String model_type = "";
    String company_name = "";
    void display() {
        System.out.println("Vehicle Type: " + vehicle_type);
        System.out.println("Model Type: " + model_type);
        System.out.println("Company Name: " + company_name);
    }

    public static void main(String[] args) {
        Ex18 c = new Ex18();
        c.vehicle_type = "Car";
        c.model_type = "SUV";
        c.company_name = "Toyota";
        c.display();
    }
}