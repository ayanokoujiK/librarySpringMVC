package spring.models;

public class Person {
    private int person_id; //будет инкрементироваться автоматически
    private String name;
    private String surname;
    private int age;
    private String phone_number;

    public Person() {
    }

    public Person(int id, String name, String surname, int age, String phone_number) {
        this.person_id = id;
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.phone_number = phone_number;
    }

    public int getPerson_id() {
        return person_id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPerson_id(int person_id) {
        this.person_id = person_id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }
}
