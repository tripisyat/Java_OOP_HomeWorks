package HW2;

public class App {
    public static void main (String[] args) {
        Person person = new Man("Vasiliy", "Kochkin", Sex.MALE,42);
        Person person1= new Man("Dmitry", "Kochkin", Sex.MALE,20);
        Person person2 = new Man("Petr", "Kochkin",Sex.MALE,14);
        Person person3 = new Women("Olga", "Kochkina",Sex.FEMALE,40);
        Person person4 = new Man("Ivan", "Ivanov", Sex.MALE,54);
        Person person5 = new Man("Dmitriy", "Ivanov",Sex.MALE,32);
        Person person6 = new Women("Vera", "Sidorova",Sex.FEMALE,30);
        Person person7 = new Women("Elena", "Ivanova",Sex.MALE,54);

        Tree tree = new Tree();

        tree.addLink(person1, person, Relation.CHILD, Relation.PARENT);
        tree.addLink(person2, person, Relation.CHILD, Relation.PARENT);
        tree.addLink(person, person3, Relation.HUSBAND, Relation.WIFE);
        tree.addLink(person2, person1, Relation.BROTHER, Relation.BROTHER);
        tree.addLink(person6, person5, Relation.SISTER, Relation.BROTHER);


        Research.printAllChildren("Vasiliy", "Kochkin", tree);
        Research.printWifeOrHusband("Olga", "Kochkina", tree);
        Research.findBrothersAndSisters("Dmitriy", "Ivanov", tree);


    }
}
