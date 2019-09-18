package pl.klasy;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class MainKlasy {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
        ArrayList<Person> personList = new ArrayList<Person>();

//        Person person = new Person("Marek", "Foltyn", 29);
//        personList.add(new Person("Marek", "Foltyn", 29));


        String[] names = {"Anna", "Piotr", "Maria", "Krzysztof", "Katarzyna", "Andrzej", "Małgorzata", "Jan", "Agnieszka", "Stanisław", "Barbara", "Tomasz", "Krystyna", "Paweł", "Ewa", "Marcin", "Elżbieta", "Michał", "Zofia", "Marek", "Teresa", "Grzegorz", "Magdalena", "Józef", "Joanna", "Łukasz", "Janina", "Adam", "Monika", "Zbigniew", "Danuta", "Jerzy", "Jadwiga", "Tadeusz", "Aleksandra", "Mateusz", "Halina", "Dariusz", "Irena", "Mariusz", "Beata", "Wojciech", "Marta", "Ryszard", "Dorota", "Jakub", "Helena", "Henryk", "Karolina", "Robert", "Grażyna", "Rafał", "Jolanta", "Kazimierz", "Iwona", "Jacek", "Marianna", "Maciej", "Natalia", "Kamil", "Bożena", "Janusz", "Stanisława", "Marian", "Justyna", "Mirosław", "Paulina", "Jarosław", "Urszula", "Sławomir", "Alicja", "Dawid", "Renata", "Wiesław", "Sylwia", "Artur", "Agata", "Roman", "Aneta", "Damian", "Patrycja", "Przemysław", "Izabela", "Sebastian", "Ewelina", "Daniel", "Julia", "Władysław", "Wanda", "Zdzisław", "Marzena", "Patryk", "Wiesława", "Bartosz", "Weronika", "Edward", "Wiktoria", "Mieczysław", "Klaudia", "Leszek", "Edyta", "Karol", "Emilia", "Arkadiusz", "Genowefa", "Czesław", "Dominika", "Waldemar", "Kazimiera", "Szymon", "Hanna", "Adrian", "Kamila", "Kacper", "Martyna", "Bogdan", "Kinga", "Eugeniusz", "Lucyna", "Bartłomiej", "Stefania", "Antoni", "Józefa", "Franciszek", "Alina", "Stefan", "Zuzanna", "Radosław", "Gabriela", "Zygmunt", "Władysława", "Dominik", "Mariola", "Krystian", "Lidia", "Konrad", "Mirosława", "Aleksander", "Henryka", "Bogusław", "Wioletta", "Ireneusz", "Czesława", "Włodzimierz", "Oliwia", "Zenon", "Regina", "Witold", "Bogumiła", "Sylwester", "Angelika", "Hubert", "Sabina", "Mikołaj", "Daria", "Filip", "Aniela", "Wiktor", "Bogusława", "Bronisław", "Leokadia", "Wacław", "Bronisława", "Bolesław", "Ilona", "Cezary", "Cecylia", "Norbert", "Marlena", "Lech", "Olga", "Oskar", "Sandra", "Edmund", "Łucja", "Igor", "Anita", "Miłosz", "Eugenia", "Emil", "Maja", "Maksymilian", "Milena", "Leon", "Zdzisława", "Julian", "Wioleta", "Bernard", "Daniela", "Lucjan", "Michalina", "Błażej", "Amelia", "Romuald", "Antonina", "Eryk", "Dagmara", "Ludwik", "Żaneta", "Alfred", "Nikola", "Remigiusz", "Adrianna", "Szczepan", "Bernadeta", "Feliks", "Karina", "Gabriel", "Gertruda", "Marcel", "Rozalia", "Alojzy", "Roksana", "Bogumił", "Aldona", "Lesław", "Franciszka", "Ignacy", "Malwina", "Gerard", "Mieczysława", "Albert", "Honorata", "Seweryn", "Celina","Alan", "Kornelia", "Oliwier", "Róża", "Nikodem", "Violetta", "Joachim", "Julita", "Ernest", "Eliza", "Benedykt", "Jagoda", "Fabian", "Magda", "Wincenty", "Nina", "Gracjan", "Bożenna", "Hieronim", "Sara", "Leonard", "Alfreda", "Rajmund", "Adela", "Jędrzej", "Laura", "Tobiasz", "Brygida", "Rudolf", "Adriana", "Adolf", "Marcelina", "Teodor", "Wacława", "Klaudiusz", "Ludwika", "Tymoteusz", "Izabella", "Walenty", "Paula", "Zygfryd", "Marzanna", "Juliusz", "Elwira", "Olaf", "Anastazja", "Alfons", "Eleonora", "Kajetan", "Pelagia", "Augustyn", "Arleta", "Florian", "Apolonia", "Konstanty", "Diana", "Leopold","Andżelika" ,"Albin","Iga" ,"Kornel","Aurelia" ,"Erwin","Julianna" ,"Bohdan","Zenona" ,"Fryderyk","Romana" ,"Marceli","Felicja" ,"Aleksy","Waleria" ,"Brunon","Zenobia" ,"Ariel","Walentyna" ,"Denis","Sonia" ,"Kuba","Klara" ,"Teofil","Liliana" ,"Gustaw", "Feliksa", "Cyprian", "Hildegarda", "Sergiusz", "Romualda", "Borys", "Marzenna", "Walerian", "Judyta", "Roland", "Teodozja", "Emilian", "Lena", "Herbert", "Marika", "Dorian", "Luiza", "Martin", "Kaja", "Wilhelm", "Lilianna", "Anatol", "Teodora", "Amadeusz", "Bernadetta", "Edwin", "Donata", "Beniamin", "Ludmiła", "Ferdynand", "Matylda", "Arnold", "Jowita", "Lechosław", "Longina", "Longin", "Otylia", "Klemens", "Anetta", "Olgierd", "Nadia", "Kewin"};
        String[] lastNames = {"NOWAK", "OWALSKA", "IŚNIEWSKA", "ÓJCIK", "OWALCZYK", "AMIŃSKA", "EWANDOWSKA", "IELIŃSKA", "ZYMAŃSKA", "WOŹNIAK", "DĄBROWSKA", "KOZŁOWSKA", "JANKOWSKA", "WOJCIECHOWSKA", "KWIATKOWSKA", "MAZUR", "KRAWCZYK", "KACZMAREK", "PIOTROWSKA", "GRABOWSKA", "PAWŁOWSKA", "MICHALSKA", "ZAJĄC", "KRÓL", "JABŁOŃSKA", "WIECZOREK", "NOWAKOWSKA", "WRÓBEL", "MAJEWSKA", "STĘPIEŃ", "OLSZEWSKA", "JAWORSKA", "MALINOWSKA", "ADAMCZYK", "GÓRSKA", "NOWICKA", "PAWLAK", "DUDEK", "WITKOWSKA", "WALCZAK", "RUTKOWSKA", "SIKORA", "MICHALAK", "SZEWCZYK", "OSTROWSKA", "BARAN", "TOMASZEWSKA", "PIETRZAK", "WRÓBLEWSKA", "MARCINIAK", "OWAK", "OWALSKI", "IŚNIEWSKI", "ÓJCIK", "OWALCZYK", "AMIŃSKI", "EWANDOWSKI", "IELIŃSKI", "OŹNIAK", "SZYMAŃSKI", "DĄBROWSKI", "KOZŁOWSKI", "JANKOWSKI", "MAZUR", "WOJCIECHOWSKI", "KWIATKOWSKI", "KRAWCZYK", "KACZMAREK", "PIOTROWSKI", "GRABOWSKI", "ZAJĄC", "KRÓL", "PAWŁOWSKI", "MICHALSKI", "WRÓBEL", "JABŁOŃSKI", "WIECZOREK", "NOWAKOWSKI", "MAJEWSKI", "OLSZEWSKI", "STĘPIEŃ", "JAWORSKI", "DUDEK", "ADAMCZYK", "MALINOWSKI", "PAWLAK", "GÓRSKI", "SIKORA", "NOWICKI", "WITKOWSKI", "WALCZAK", "BARAN", "RUTKOWSKI", "MICHALAK", "SZEWCZYK", "OSTROWSKI", "TOMASZEWSKI", "ZALEWSKI", "WRÓBLEWSKI", "PIETRZAK"};

        Random randomName = new Random();
        Random randomLastName = new Random();

        for (int i = 0; i < 10000; i++) {
            personList.add(new Person(
                    names[randomName.nextInt(names.length)],
                    lastNames[randomLastName.nextInt(lastNames.length)],
                    randomName.nextInt(110)));
        }

        System.out.println(personList.stream().filter(name -> name.getFirstName().endsWith("a")).count());
        long a = personList.stream().filter(name -> name.getFirstName().endsWith("a")).count();

        System.out.println();
        /*        Person person = new Person();
        person.setFirstName(scanner.next());
        person.setLastName(scanner.next());
        person.setAge(scanner.nextInt());*/
//        personList.add(person);


        //mozna pętlą forach ale stream szybszy (napisz tą pętlę w domu)
        int count;
    }

    //ZAD.DOM
    //Napisać metodą która sprawdza ile osób jest pełnoletnich


}
