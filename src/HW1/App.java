package HW1;

public class App {
    public static void main (String[] args) {
        Person person = new Person("Vasiliy", "Kochkin", "male",42);
        Person person1= new Person("Dmitry", "Kochkin", "male",20);
        Person person2 = new Person("Petr", "Kochkin","male",14);
        Person person3 = new Person("Olga", "Kochkina","female",40);
        Person person4 = new Person("Ivan", "Ivanov", "male",54);
        Person person5 = new Person("Dmitriy", "Ivanov","male",32);
        Person person6 = new Person("Vera", "Sidorova","female",30);
        Person person7 = new Person("Elena", "Ivanova","male",54);

        Tree tree = new Tree();

        tree.addLink(person1, person, Relation.Child, Relation.Parent);
        tree.addLink(person2, person, Relation.Child, Relation.Parent);
        tree.addLink(person, person3, Relation.Husband, Relation.Wife);
        tree.addLink(person2, person1, Relation.Brother, Relation.Brother);
        tree.addLink(person6, person5, Relation.Sister, Relation.Brother);


//        Research.printAllChildren("Vasiliy", "Kochkin", tree);
//        Research.printWifeOrHusband("Olga", "Kochkina", tree);
        Research.findBrothersAndSisters("Dmitriy", "Ivanov", tree);


    }
}
