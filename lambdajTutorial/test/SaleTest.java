import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class SaleTest {
    List<Sale> sales;
    List<Sale> result;
    private PersonTest persons;


    @Before
    public void before(){
        sales=new ArrayList<Sale>();
        result=new ArrayList<Sale>();
        persons = new PersonTest();
        persons.createPersons();
    }


//    @Test
//    public void shouldGetSalesOfAFerrari(){
//
//
//    }
//
//
//    private void createSales(){
//        Car car1 = new Car("Dodge Dart","Dodge",2000,1000.00);
//        Car car2 = new Car("Ferrari","Ferrari California",2001,1100.00);
//        Car car3 = new Car();
//        Car car4 = new Car();
//        Car car5 = new Car();
//
//        sales.add()
//    }

    public void createSales(){
        Person person = new Person("Ravi", "Sharma", 22, true);
        Person person1 = new Person("Katrina", "Kaif", 28, false);
        Car ferrari = new Car("Ferrari", "Ferrari California", 2001, 1100.00);
        int i = 1000;
        Sale sale = new Sale(person, person1, ferrari,new Double(1000));
        sales.add( sale);

//        sales.add(new Person("Ajit","Singh",20,true));
//        sales.add(new Person("Katrina","Kaif",28,false));
//        sales.add(new Person("Amir","khan",44,true));
//        sales.add(new Person("Salman","khan",45,true));
//        sales.add(new Person("Mohamad","kaif",33,true));
    }

}
