package lesson4;

public class Employee implements Comparable<Employee> {

    String name;
    int salary;
    String department;

    public Employee(String name, int salary, String department) {
        this.name = name;
        this.salary = salary;
        this.department = department;
    }

    @Override
    public int compareTo(Employee o) {
        //print salary from lower to higher
//        if(this.salary < o.salary){
//            return -1;
//        } else if (this.salary > o.salary){
//            return 1;
//        }
//        return 0;
//    }

        //if need oppopsite result, salary from higher to lower

    if(this.salary > o.salary){
        return -1;
    } else if (this.salary < o.salary){
        return 1;
    }
        return 0;
}

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", department='" + department + '\'' +
                '}';
    }
}
