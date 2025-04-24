package methodref.start;

import methodref.Person;

import java.util.function.BiFunction;


public class MethodRef6 {

    public static void main(String[] args) {
        Person person = new Person("Oh");

        BiFunction<Person, Integer, String> fun1 =
                (Person p, Integer number) -> p.introduceWithNumber(number);

        System.out.println("fun1.apply(person, 112) = " + fun1.apply(person, 112));

        BiFunction<Person, Integer, String> fun2 =
                Person::introduceWithNumber;
        System.out.println("fun2.apply(person, 112) = " + fun2.apply(person, 112));

    }


}
