package Practice;

import java.util.function.Supplier;

public class Suppliers {
    public static void main(String[] args) {
        System.out.println(getDBConnectionURL());
        System.out.println(getDBConnectionURLBySupplier.get());
    }

    static String getDBConnectionURL(){
        return "jdbc://localhost:4433/users";
    }

    static Supplier<String> getDBConnectionURLBySupplier =() -> "jdbc://localhost:4433/users";
}
