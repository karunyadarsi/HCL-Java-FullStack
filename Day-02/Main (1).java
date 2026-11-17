import java.util.*;
import java.util.function.*;

public class Main {
    public static void main(String[] args) {
     
     String coustname = "Karss";
     double price = 9000;
     int age = 21;

     Predicate<Integer> eligible = a-> a>=18;
  
    Function<Double,Double> discount = p-> p -(p*0.10);

        // Generate order ID
        Supplier<Integer> orderId = () -> new Random().nextInt(9000) + 1000;

        // Confirm order with customer name and order ID
        Consumer<String> confirm = name ->
            System.out.println("Order placed by " + name);

        if (eligible.test(age)) {

            double finalprice = discount.apply(price);

            confirm.accept(coustname + "\nOrder ID: " + orderId.get());

            System.out.println("Original Price: " + price);
            System.out.println("Final Price: " + finalprice);

            Consumer<String> print = System.out::println;
            print.accept("Thank you for shopping!");
        }
    }
}