import org.hamcrest.core.IsEqual;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static ch.lambdaj.Lambda.*;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

public class PersonTest {
    List<Person> persons;
    List<Person> result;

    @Before
    public void before(){
        result=new ArrayList<Person>();
        persons=new ArrayList<Person>();
        createPersons();
    }


    @Test
    public void getPersonsWithFirstNameUsingNormalWay(){
        String expectedName="Ravi";

        for (Person person : persons) {
            if(person.firstName.equals(expectedName)) result.add(person);
        }

        assertThat(result.get(0).firstName, equalTo("Ravi"));
    }


    @Test
    public void addStringToFirstNameOfAllPersons(){
        forEach(persons).setFirstName("asas"); ;
    }




    @Test
    public void getPersonsWithFirstNameUsingLambdaj(){
        String expectedName="Ravi";
        result = select(persons, having(on(Person.class).firstName, equalTo(expectedName)));
        assertThat(result.get(0).firstName, equalTo("Ravi"));
    }

    @Test
    public void getPersonsWithFirstNameUsingLambdaj1(){
        String expectedName="Ravi";
        filter(having(on(Person.class).getFirstName(),equalTo(expectedName)), result);

        assertThat(result.get(0).firstName, equalTo("Ravi"));
    }

    @Test
    public void getSumOfAllPeopleAges(){
        int agesSum=0;

        //normally
//        for (Person person : persons) {
//            agesSum+=person.getAge();
//        }

//        with lambdaj
        agesSum=sum(persons, on(Person.class).getAge());
        assertThat(agesSum, equalTo(192));
    }


    @Test
    public void getYoungestPerson(){
        Person youngest = null;

        //normal
//        for (Person person : persons) {
//            if (youngest == null || person.getAge() < youngest.getAge()) youngest = person;
//        }

        youngest=selectMin(persons, on(Person.class).getAge());

        assertThat(youngest.firstName, equalTo("Ajit"));
    }



    public void createPersons(){
        persons.add(new Person("Ravi","Sharma",22,true));
        persons.add(new Person("Ajit","Singh",20,true));
        persons.add(new Person("Katrina","Kaif",28,false));
        persons.add(new Person("Amir","khan",44,true));
        persons.add(new Person("Salman","khan",45,true));
        persons.add(new Person("Mohamad","kaif",33,true));
    }
}
