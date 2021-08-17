
import java.util.*;

public class MainApp {
    public static void main(String[] args) {

        List<Employee> listOfEmployee = new Vector<>();
        listOfEmployee.add(new Employee("Moses", "Adams", 100));
        listOfEmployee.add(new Employee("Toyin", "Ekundayo", 101));



        listOfEmployee.set(1, new Employee("John", "Locke", 1011));

        listOfEmployee.add(1, new Employee("Toyin", "Ekundayo", 101));
       // listOfEmployee.forEach(employee -> System.out.println(employee));

       // System.out.println(listOfEmployee.size());

        for(Employee employee: listOfEmployee){
            System.out.println(employee);
        }

        System.out.println(listOfEmployee.contains(new Employee("Toyin", "Ekundayo", 101)));
        System.out.println(listOfEmployee.indexOf(new Employee("Toyin", "Ekundayo", 101)));
        System.out.println();
        listOfEmployee.remove(2);
        for(Employee employee: listOfEmployee){
            System.out.println(employee);
        }

    }

}
