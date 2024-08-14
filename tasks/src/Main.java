import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.getInfo();
        Person[] person = new Person[5];
        person[0] = new Person("Ivan", "Smirnov", "nikolaevich", "sadasd@mail.ru", "+78192121212", 2000, 21);
        person[1] = new Person("Petya", "Nemal", "inokentyi", "vrazam@mail.ru", "+78191181512", 100, 30);
        person[2] = new Person("Liza", "Voloda", "petrovna", "lizzza@mail.ru", "+722222222", 500, 31);
        person[3] = new Person("Grisha", "Zava", "vasylyevich", "sdevca@mail.ru", "+71911111111", 11000, 26);
        person[4] = new Person("Vasya", "Ivanov", "mikolaevich", "vasyzd@mail.ru", "+78192329233", 1000, 28);
        for (int i = 0; i <= person.length - 1; i++) {
            person[i].getInfo();
        }

    }
}
