package rest_client;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import rest_client.configuration.MyConfig;
import rest_client.entity.Employee;

import java.util.List;

public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);

        Communication communication = context.getBean("communication", Communication.class);

//        Employee emp = new Employee("Sveta", "Sokolova", "HR", 1000);
//
        int id = 11;
//        emp.setId(id);
//
//        communication.saveEmployee(emp);

        System.out.println(communication.getEmployee(id));
        communication.deleteEmployee(id);

//        List<Employee> allEmployees = communication.getAllEmployees();
//        allEmployees.forEach(System.out::println);
    }
}
