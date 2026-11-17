import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;
public class Main {
    public static void main(String[] args) {
      List<Integer> employee = Arrays.asList(95,45,80,30,100);

      Predicate<Integer> eligible = a-> a >= 75;
      Consumer<Integer> print = a-> System.out.println(a);

      employee.forEach(a -> {
            if (eligible.test(a)) {
                print.accept(a);
            }
        });
    }
}