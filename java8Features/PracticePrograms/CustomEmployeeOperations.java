package java8Features.PracticePrograms;

import java.util.*;
import java.util.stream.Collectors;

class Employee {
    int id;
    String name;
    int age;
    String gender;
    String department;
    int yearOfJoining;
    Double salary;

    public Employee(int id, String name, int age, String gender, String department, int yearOfJoining, double salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.department = department;
        this.yearOfJoining = yearOfJoining;
        this.salary = salary;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {return gender;}

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getYearOfJoining() {
        return yearOfJoining;
    }

    public void setYearOfJoining(int yearOfJoining) {
        this.yearOfJoining = yearOfJoining;
    }

    public Double getSalary() {return salary;}

    public void setSalary(Double salary) {this.salary = salary;}

    @Override
    public String toString() {
        return "Employee{" + "id=" + id + ", name='" + name + '\'' + ", age=" + age + ", gender='" + gender + '\'' + ", department='" + department + '\'' + ", yearOfJoining=" + yearOfJoining + ", salary=" + salary + '}';
    }


}

public class CustomEmployeeOperations {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<Employee>();

        employeeList.add(new Employee(111, "Jiya Brein", 32, "Female", "HR", 2011, 25000.0));
        employeeList.add(new Employee(122, "Paul Niksui", 25, "Male", "Sales And Marketing", 2015, 13500.0));
        employeeList.add(new Employee(133, "Martin Theron", 29, "Male", "Infrastructure", 2012, 18000.0));
        employeeList.add(new Employee(144, "Murali Gowda", 28, "Male", "Product Development", 2014, 32500.0));
        employeeList.add(new Employee(155, "Nima Roy", 27, "Female", "HR", 2013, 22700.0));
        employeeList.add(new Employee(166, "Iqbal Hussain", 43, "Male", "Security And Transport", 2016, 10500.0));
        employeeList.add(new Employee(177, "Manu Sharma", 35, "Male", "Account And Finance", 2010, 27000.0));
        employeeList.add(new Employee(188, "Wang Liu", 31, "Male", "Product Development", 2015, 34500.0));
        employeeList.add(new Employee(199, "Amelia Zoe", 24, "Female", "Sales And Marketing", 2016, 11500.0));
        employeeList.add(new Employee(200, "Jaden Dough", 38, "Male", "Security And Transport", 2015, 11000.5));
        employeeList.add(new Employee(211, "Jasna Kaur", 27, "Female", "Infrastructure", 2014, 15700.0));
        employeeList.add(new Employee(222, "Nitin Joshi", 25, "Male", "Product Development", 2016, 28200.0));
        employeeList.add(new Employee(233, "Jyothi Reddy", 27, "Female", "Account And Finance", 2013, 21300.0));
        employeeList.add(new Employee(244, "Nicolus Den", 24, "Male", "Sales And Marketing", 2017, 10700.5));
        employeeList.add(new Employee(255, "Ali Baig", 23, "Male", "Infrastructure", 2018, 12700.0));
        employeeList.add(new Employee(266, "Sanvi Pandey", 26, "Female", "Product Development", 2015, 28900.0));
        employeeList.add(new Employee(277, "Anuj Chettiar", 31, "Male", "Product Development", 2012, 35700.0));


        // Q.1 ) How many male and female employees are there in the organization?


        Map<String, Long> noOfMaleAndFemaleEmployees = employeeList.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
        noOfMaleAndFemaleEmployees.forEach((k, v) -> {
            System.out.println(k + " " + v);
        });


        //Q.2 ) Print the name of all departments in the organization?
        employeeList.parallelStream().forEach(e -> System.out.println(e.getDepartment()));

        // Q.3 )  What is the average age of male and female employees?
        Map<String, Double> res = employeeList.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingInt(Employee::getAge)));
        res.forEach((e, v) -> {
            System.out.println(e + " Average Age : " + v);
        });

        //Q.4 )Get the details of highest paid employee in the organization?
        Employee highestPaidEmp = employeeList.stream().max((e1, e2) -> e1.getSalary().compareTo(e2.getSalary())).get();
        System.out.println("Highest paid Employee detais...");
        System.out.println(highestPaidEmp);

        // Q.5) Get the names of all employees who have joined after 2015?
        employeeList.stream().filter(e -> e.getYearOfJoining() > 2015).collect(Collectors.toList()).forEach(System.out::println);


        // Q.6 )  Count the number of employees in each department?
        employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting())).forEach((k, v) -> System.out.println(k + " " + v));

        // Q.7 ) What is the average salary of each department?
        Map<String, Double> res1 = employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.averagingDouble(Employee::getSalary)));
        res1.forEach((k, v) -> System.out.println(k + "=> Average Salery : " + v));

        //Q.8) Get the details of youngest male employee in the product development department?
        Employee youngestEmp = employeeList.stream().filter(e -> e.getDepartment().equals("Product Development") && e.gender == "Male").min((e1, e2) -> e1.getAge() - e2.getAge()).get();
        System.out.println("Yungest Employee...");
        System.out.println(youngestEmp);

        // Q.9 ) Who has the most working experience in the organization?
        Employee oldestEmp = employeeList.stream().min((e1, e2) -> e1.getYearOfJoining() - e2.getYearOfJoining()).get();
        System.out.println(oldestEmp);

        // Q.10 ) How many male and female employees are there in the sales and marketing team?
        Map<String, Long> result = employeeList.stream().filter(e -> e.getDepartment().equalsIgnoreCase("Sales And Marketing")).collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
        result.forEach((k, v) -> System.out.println(k + " " + v));

        // Q.11 ) What is the average salary of male and female employees?
        Map<String, Double> result1 = employeeList.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingDouble(Employee::getSalary)));
        result1.forEach((k, v) -> System.out.println(k + " Average salery is " + v + " rupees"));

        // Q.12) List down the names of all employees in each department?
        Map<String, List<Employee>> result2 = employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.toList()));
        result2.forEach((k, v) -> {
            System.out.println("__________________________");
            System.out.println(k);
            System.out.println("__________________________");
            v.stream().forEach(e -> System.out.println(e.getName()));

        });

        // Q.13 )  What is the average salary and total salary of the whole organization?
        DoubleSummaryStatistics collect = employeeList.stream().collect(Collectors.summarizingDouble(Employee::getSalary));
        double average = Math.round(collect.getAverage());
        double sum = collect.getSum();
        System.out.println("Total Salary :" + sum);
        System.out.println("Average Salary :" + average);


        //Q. 14 ) Separate the employees who are younger or equal to 25 years from those employees who are older than 25 years
        Map<Boolean, List<Employee>> result3 = employeeList.stream().collect(Collectors.partitioningBy(e -> e.getAge() > 25));
        Set<Map.Entry<Boolean, List<Employee>>> entries = result3.entrySet();
        for (Map.Entry<Boolean, List<Employee>> entry : entries) {
            if (entry.getKey()) {
                System.out.println("\nEmployee above then 25 years\n");
                System.out.println("======================================");
            } else {
                System.out.println("\nEmployee younger than or same as 25\n");
                System.out.println("======================================");
            }

            for (Employee e : entry.getValue()) {
                System.out.println(e.getName() + " age is " + e.getAge());
            }

        }


        // Q.15 )  Who is the oldest employee in the organization? What is his age and which department he belongs to?
        Employee e = employeeList.stream().max((e1, e2) -> e1.getAge() - e2.getAge()).get();
        System.out.println("Oldest employee is " + e.getName() + " and his age is " + e.getAge());


    }
}
