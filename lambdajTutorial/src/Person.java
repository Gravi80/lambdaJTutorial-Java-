public class Person {
    String firstName;
    String lastName;
    int age;
    boolean male;

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setMale(boolean male) {
        this.male = male;
    }

    public Person(String firstName, String lastName, int age, boolean male) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.male = male;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public boolean isMale() {
        return male;
    }
}
