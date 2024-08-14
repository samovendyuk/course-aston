public class Person {
    public String name;
    public String secondName;
    public String surname;
    public String email;
    public String phoneNumber;
    public int salary;
    public int age;

    public Person(String name, String secondName, String surname, String email, String phoneNumber, int salary, int age) {
        this.name = name;
        this.secondName = secondName;
        this.surname = surname;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

    public void getInfo() {
        System.out.println("Name: " + this.name + "\n" + "Second name: " + this.secondName + "\n" + "Surname: " + this.surname + "\n"
                + "Email: " + this.email + "\n" + "Phone number: " + this.phoneNumber + "\n" + "Salary: " + this.salary + "\n" + "Age: " + this.age);
    }
}