package pl.klasy;

import java.util.ArrayList;
import java.util.Scanner;

public class MainKlasy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Person> personList = new ArrayList<Person>();

//        Person person = new Person("Marek", "Foltyn", 29);

        personList.add(new Person("Marek", "Foltyn", 29));
/*        Person person = new Person();
        person.setFirstName(scanner.next());
        person.setLastName(scanner.next());
        person.setAge(scanner.nextInt());*/
//        personList.add(person);

    }

}
