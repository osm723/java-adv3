package methodref.start;

import methodref.Person;

import java.util.function.Function;
import java.util.function.Supplier;

public class MethodRefEx2 {

    public static void main(String[] args) {
        Function<String ,String> staticMethod1 = name -> Person.greetingWithName(name);
        System.out.println("staticMethod1 = " + staticMethod1.apply("oh"));

        Function<String, String> staticMethod2 = Person::greetingWithName;
        System.out.println("staticMethod2 = " + staticMethod2.apply("oh"));

        Person person = new Person("Oh");
        Function<Integer, String> instanceWithNumber1 = number -> person.introduceWithNumber(number);
        System.out.println("instanceWithNumber1 = " + instanceWithNumber1.apply(112));

        Function<Integer, String> instanceWithNumber2 = person::introduceWithNumber;
        System.out.println("instanceWithNumber2 = " + instanceWithNumber2.apply(112));

        Function<String, Person> newPerson1 = name -> new Person(name);
        System.out.println("newPerson1 = " + newPerson1.apply("oh"));

        Function<String, Person> newPerson2 = Person::new;
        System.out.println("newPerson2 = " + newPerson2.apply("oh"));
    }
}
