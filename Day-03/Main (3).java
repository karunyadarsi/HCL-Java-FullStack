import java.util.*;

public class Main {
    public static void main(String[] args) {
      
      List<Integer> salaries = Arrays.asList(20000, 30000, 40000, 50000, 70000);

      salaries.stream()
      .filter(salary-> salary > 30000)  //never put ;, it will end the function
      .forEach(System.out::println);


    }
}