import java.util.HashSet;

public class App {
    public static void main(String[] args) throws Exception {
        HashSetExemplo2();
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
        HashSet<Produto> catalogo = new HashSet<Produto>();
        
        //Criei um objeto do tipo Produto com dados do Nintendo Switch
        Produto oProdSwitch = new Produto("Nintendo", "Switch", 1899);
        System.out.println(catalogo.add(oProdSwitch));

        //Criei um objeto do tipo Produto com dados do Master
        Produto oProdMaster = new Produto("Tectoy", "Master System", 360.05f);
        System.out.println(catalogo.add(oProdMaster));

        //Tentando colocar o objeto do Switch DE NOVO!
        System.out.println(catalogo.add(oProdSwitch));
    }  
}