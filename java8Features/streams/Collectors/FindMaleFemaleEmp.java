package java8Features.streams.Collectors;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Employee{
    int id;
    String name;
    String gender;

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Employee(int id, String name, String gender) {
        this.id = id;
        this.name = name;
        this.gender = gender;
    }
}
public class FindMaleFemaleEmp {
    public static void main(String[] args) {

       List<Employee> list= Arrays.asList(new Employee(01,"GB","male"),
                new Employee(01,"SJ","Female"),
                new Employee(01,"IJ","Female"),
                new Employee(01,"YT","male"),
                new Employee(01,"KL","male"));

        Map<String,List<Employee>> map=list.stream().collect(Collectors.groupingBy(Employee::getGender));
        map.forEach((i,j)->System.out.println(i+" "+j));
    }
}
