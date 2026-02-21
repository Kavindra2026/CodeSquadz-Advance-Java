import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Employee {
    int id;
    int salary;

    Employee(int id, int salary) {
        this.id = id;
        this.salary = salary;
    }

}

public class Q10 {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        list.add(new Employee(1, 5000));
        list.add(new Employee(2, 2000));
        list.add(new Employee(3, 9000));

        Collections.sort(list, (a, b) -> a.salary - b.salary);

        for (Employee e : list) {
            System.out.println(e.id + "=" + e.salary);
        }

    }

}