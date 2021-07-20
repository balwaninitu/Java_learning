package car_dealership;

public class Dealership {

    public static void main(String[] args) {

        Customer cust1 = new Customer("Tom", "123 Anything st. ", 25000);

        Vehicle vehicle = new Vehicle("Honda", "Accord", 15000);


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
