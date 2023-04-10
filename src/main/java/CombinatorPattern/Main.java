package CombinatorPattern;

import java.time.LocalDate;
import static CombinatorPattern.CustomerRegistrationValidator.*;

public class Main {
    public static void main(String[] args) {
        Customer customer=new Customer(
                "Alice","alice@gmail.com",
                "+02342434234",
                LocalDate.of(2003,02,01));

        ValidationResult result=isEmailValid()
                .and(isPhoneNumberValid())
                .and(isAdult())
                .apply(customer);

        System.out.println(result);

        if (result != ValidationResult.SUCCESS){
            throw new IllegalStateException(result.name());
        }
    }
}
