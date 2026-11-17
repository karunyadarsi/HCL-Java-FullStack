import java.util.*;

@FunctionalInterface
interface Operation{
  void execute();   // since no parameters are being passed it can be void
}

@FunctionalInterface
interface Square{
  int calculate(int a); //one parameter
}

@FunctionalInterface
interface Addition{
  int add(int a, int b);
}
public class Main {
    public static void main(String[] args) {
      Operation welcome = ()->System.out.println("cal the pass");

      //single parameter
      Square square = n->n*n;

      //two parameters
      Addition addition = (a, b)->a+b;

      //explicit later

      //multiple parameters
      Addition mul = (a, b)->{
        int result = a*b;
        System.out.println(result);
        return result;
      };

      welcome.execute();

      System.out.println(square.calculate(9));


    }
}