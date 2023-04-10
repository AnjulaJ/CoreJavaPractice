package Practice;

import Lists.Gender;
import Lists.GetLists;
import Lists.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Predicates {

    public static void main(String[] args) {
        GetLists listGet=new GetLists();
        List<Person> people= listGet.getPeopleList();

        // ------------Imperative Approach ----------
        List<Person> females1 =new ArrayList<>();

        System.out.println("------------Imperative Approach ----------");
        for (Person person: people){
            if (Gender.FEMALE==person.getGender()){
                females1.add(person);
            }
        }

        for (Person female:females1){
            System.out.println(female);
        }

        // ------------Declarative Approach----------

        System.out.println("------------Declarative Approach---------- ");

        List<Person> females2= people.stream().filter(person -> person.getGender().equals(Gender.FEMALE))
                .collect(Collectors.toList());

        females2.forEach(System.out::println);


        // Without Using Predicate
        System.out.println(phoneNumberValidate("0717263829"));

        // Using Predicate
        System.out.println(phoneNumberValidateByPredicate.test("0714234124"));

    }

    static boolean phoneNumberValidate(String number){
        return number.startsWith("071") && number.length()==10;
    }

    static Predicate<String> phoneNumberValidateByPredicate =number -> number.startsWith("071") && number.length()==10;
}
