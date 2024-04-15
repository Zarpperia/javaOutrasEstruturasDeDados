import java.util.HashSet;

public class App {
    public static void main(String[] args) throws Exception {
        HashSetExemplo1();
    }

    public static void HashSetExemplo1() {
        HashSet<String> cars = new HashSet<String>();
        System.out.println(cars.add("Volvo"));
        System.out.println(cars.add("BMW"));
        System.out.println(cars.add("Ford"));
        System.out.println(cars.add("BMW"));
        System.out.println(cars.add("Mazda"));
        System.out.println(cars);
    }
    public static void HashSetExemplo2() {
        
    }
}