package officeWork;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PersonInReverseOrder implements Comparable<PersonInReverseOrder>
{
    String name;
    int age;

    public PersonInReverseOrder(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    public String getName()
    {
        return name;
    }

    public int getAge()
    {
        return age;
    }

    public String toString()
    {
        return name + " : " + age;
    }

    /*
    **  Implement the natural order for this class
    */
    public int compareTo(PersonInReverseOrder p)
    {
        return getName().compareTo(p.getName());
    }

    static class AgeComparator implements Comparator<PersonInReverseOrder>
    {
        public int compare(PersonInReverseOrder p1, PersonInReverseOrder p2)
        {
            int age1 = p1.getAge();
            int age2 = p2.getAge();

            if (age1 == age2)
                return 0;
            else if (age1 > age2)
                return 1;
            else
                return -1;
        }
    }

    public static void main(String[] args)
    {
        List<PersonInReverseOrder> people = new ArrayList<PersonInReverseOrder>();
        people.add( new PersonInReverseOrder("Homer", 38) );
        people.add( new PersonInReverseOrder("Marge", 35) );
        people.add( new PersonInReverseOrder("Bart", 15) );
        people.add( new PersonInReverseOrder("Lisa", 13) );

        // Sort by natural order

        Collections.sort(people);
        System.out.println("Sort by Natural order");
        System.out.println("\t" + people);

        // Sort by reverse natural order

        Collections.sort(people, Collections.reverseOrder());
        System.out.println("Sort by reverse natural order");
        System.out.println("\t" + people);

        //  Use a Comparator to sort by age

        Collections.sort(people, new PersonInReverseOrder.AgeComparator());
        System.out.println("Sort using Age Comparator");
        System.out.println("\t" + people);

        //  Use a Comparator to sort by descending age

        Collections.sort(people,
            Collections.reverseOrder(new PersonInReverseOrder.AgeComparator()));
        System.out.println("Sort using Reverse Age Comparator");
        System.out.println("\t" + people);
    }
}