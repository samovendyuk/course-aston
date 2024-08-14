public class Employee {
    private String name = "Ivan";
    private String secondName = "Petrenko";
    private String surname = "Grigorevich";
    private String email = "Kuzma@mail.ru";
    private String phoneNumber = "+79181931122";
    private int salary = 2000;
    private int age = 23;

    public void getInfo() {
        System.out.println("Name: " + name + "\n" + "Second name: " + secondName + "\n" + "Surname: " + surname + "\n"
                + "Email: " + email + "\n" + "Phone number: " + phoneNumber + "\n" + "Salary: " + salary + "\n" + "Age: " + age);
    }
}
