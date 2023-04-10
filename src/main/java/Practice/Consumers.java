package Practice;

import Lists.Gender;
import Lists.Person;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class Consumers {
    public static void main(String[] args) {

        Person p1=new Person("John",24, Gender.MALE);

        // Normal Java Function
        registerPerson(p1);
        registerPerson2(p1,p1.getAge());

        // Consumer functional Interface
        registerPersonConsumer.accept(p1);
        registerPersonByConsumer.accept(p1,p1.getAge());
    }

    static void registerPerson(Person person){
        System.out.println("thanks for Registering "+ person.getName());
    }

    static Consumer<Person> registerPersonConsumer=person -> System.out.println("thanks for Registering "+ person.getName());

    static void registerPerson2(Person person,Integer age){
        System.out.println("thanks for Registering "+ person.getName()+". Welcome to "+ (age>18 ? "Youth Club." :"Children Club."));
    }

    static BiConsumer<Person,Integer> registerPersonByConsumer=(person,age) -> System.out.println("thanks for Registering "+ person.getName()+". Welcome to "+ (age>18 ? "Youth Club." :"Children Club."));

}
