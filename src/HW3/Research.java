package HW3;

import java.util.ArrayList;
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



    public static List printAllChildren(String name, String surname, Tree tree) {
        List<Link> links = tree.getLinks();
        List<Person> personForCompare = new ArrayList<>();//создан отдельный список, для хранения детей в нем
        System.out.printf ("Childrens of %s %s are:\n", name, surname);

        for (Link el : links) {
            if (el.getPersonFirst().getName().equals(name) & el.getPersonFirst().getSurname().equals(surname)
                    & el.getLink() == Relation.PARENT) {
                personForCompare.add(el.getPersonSecond());//возвращаем полученный список детей для дальнейшего использования в методах сравнений
                System.out.println(el.getPersonSecond());
            }
        }
        return personForCompare;
    }
}


