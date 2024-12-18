package java8Features.methodRef;

@FunctionalInterface
interface MobileFactory {
    public Mobile AddMobileDetails(String mob, Double price);
}

class Mobile {
    private String mobileName;
    private Double price;

    public void showDetails() {
        System.out.println(this.mobileName + " " + this.price);
    }

    public Mobile(String name, Double price) {
        this.mobileName = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Mobile{" + "mobileName='" + mobileName + '\'' + ", price=" + price + '}';
    }
}

public class Customer {
    public static void main(String[] args) {
        MobileFactory factory = Mobile::new;
        Mobile m = factory.AddMobileDetails("SAMSUNG", 25000.0);
        m.showDetails();


    }
}
