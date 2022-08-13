package HW2;

import java.util.List;

public class Research {
    /* Метод вывода списка всех детей человека */


    public static void printWifeOrHusband(String name, String surname, Tree tree) {
        List<Link> links = tree.getLinks();

        for (Link el : links) {
            if (el.getPersonFirst().getName().equals(name) && el.getPersonFirst().getSurname().equals(surname)
                    && el.getLink() == Relation.WIFE | el.getLink() == Relation.HUSBAND)
                System.out.println(el.getPersonSecond());
        }
    }


    public static void findBrothersAndSisters(String name, String surname, Tree tree) {
        List<Link> links = tree.getLinks();
        for (Link el : links) {
            if (el.getPersonFirst().getName().equals(name) && el.getPersonFirst().getSurname().equals(surname)
                    && el.getLink() == Relation.BROTHER | el.getLink() == Relation.SISTER) {
                System.out.println(el.getPersonSecond());
            }
        }
    }



    public static void printAllChildren(String name, String surname, Tree tree) {
        List<Link> links = tree.getLinks();

        for (Link el : links) {
            if (el.getPersonFirst().getName().equals(name) & el.getPersonFirst().getSurname().equals(surname)
                    && el.getLink() == Relation.PARENT) {
                System.out.println(el.getPersonSecond());
            }
        }
    }
}


