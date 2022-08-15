package HW3;

import java.util.Comparator;

public class AgeCompare implements Comparator<Person> {
    @Override
    public int compare(Person p1, Person p2) {
        if (p1.age-p2.age >0) {
            return 1;
        }
        if (p1.age-p2.age<0){
            return -1;
        }
        else{
            return 0;
        }
    }
}
