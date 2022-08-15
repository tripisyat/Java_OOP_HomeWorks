package HW3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import static HW3.Research.printAllChildren;

public class App {
    public static void main (String[] args) {
        Person person = new Man("Vasiliy", "Kochkin", Sex.MALE,42);
        Person person1= new Man("Dmitry", "Kochkin", Sex.MALE,20);
        Person person2 = new Man("Petr", "Kochkin",Sex.MALE,14);
        Person person3 = new Women("Olga", "Kochkina",Sex.FEMALE,40);
        Person person4 = new Women("Nadya", "Kochkina", Sex.FEMALE,18);
        Person person5 = new Man("Dmitriy", "Ivanov",Sex.MALE,32);
        Person person6 = new Women("Vera", "Sidorova",Sex.FEMALE,30);
        Person person7 = new Women("Elena", "Ivanova",Sex.MALE,54);

        Tree tree = new Tree();

        tree.addLink(person1, person, Relation.CHILD, Relation.PARENT);
        tree.addLink(person2, person, Relation.CHILD, Relation.PARENT);
        tree.addLink(person, person3, Relation.HUSBAND, Relation.WIFE);
        tree.addLink(person2, person1, Relation.BROTHER, Relation.BROTHER);
        tree.addLink(person6, person5, Relation.SISTER, Relation.BROTHER);
        tree.addLink(person4, person, Relation.CHILD, Relation.PARENT);


//        Research.printAllChildren("Vasiliy", "Kochkin", tree);
//        Research.printWifeOrHusband("Olga", "Kochkina", tree);
//        Research.findBrothersAndSisters("Dmitriy", "Ivanov", tree);

        List<Person> personForCompare = new ArrayList<>(printAllChildren("Vasiliy", "Kochkin", tree));// список детей для сортировки

        /*
         * Сортировка созданным компаратором по возрасту
         */
        personForCompare.sort(new AgeCompare());
        System.out.println(personForCompare);

        /*
         * Сортировка анонимным классом по имени
        */
        personForCompare.sort(new Comparator<Person>() {
            @Override
            public int compare(Person p1, Person p2) {
                return p1.getName().compareTo(p2.getName());
            }
        });
        System.out.println(personForCompare);
        /*
         * Сортировка по полу, используя лямбду
         */
        personForCompare.sort((p1, p2)->p1.sex.compareTo(p2.sex));
        System.out.println(personForCompare);
    }
}
