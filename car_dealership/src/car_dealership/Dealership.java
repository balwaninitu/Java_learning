package car_dealership;

public class Dealership {

    public static void main(String[] args) {

        Customer cust1 = new Customer();
        cust1.setName("Tom");
        cust1.setAddress("123 Anything St. ");
        cust1.setCashOnHand(12000);

        Vehicle vehicle = new Vehicle();
        vehicle.setMake("Honda");
        vehicle.setModel("Accord");
        vehicle.setPrice(10000);

        Employee emp = new Employee();

        cust1.purchaseCar(vehicle, emp, false);


        /**
         *
         * handleCustomer(Customer cust, boolean finance, Vehicle vehicle)
         * if(finance == true)
         *      runCreditHistory(Customer cust, double doubleAmount)
         *      getters are using for below it allows encapsulation(hides data)
         *      else if(vehicle.getPrice() <= cust.getCashOnHand()):
         *           processTransaction(Customer cust, double Vehicle vehicle)
         *      else:
         *          tell customer to bring more money
         */

    }
}
