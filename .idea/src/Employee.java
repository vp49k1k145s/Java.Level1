/**
 * Java.Level1.Lesson5
 *
 * @version DATE 13,06,2019
 * @autor Вадим, Дзюбенко
 */

public class Employee {


    private String fullName;
    private String position;
    private String email;
    private String phone;
    private int salary;
    private int age;

    Employee(String fullName, String position, String email, String phone, int salary, int age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "ФИО='" + this.fullName + '\'' +
                ", Должность='" + this.position + '\'' +
                ", email='" + this.email + '\'' +
                ", телефон=" + this.phone +
                ", зарплата=" + this.salary +
                ", возраст=" + this.age +
                '}';
    }

    public void print() {
        System.out.println(toString());
    }

}
class Lesson5{
    public static void main(String[] args) {
        Employee[] persArray = new Employee[5];
        persArray[0] = new Employee("Петров Роман Рованыч", "Генеральный директор", "vp@mail.ru", "89067958412", 250000, 55);
        persArray[1] = new Employee("Иванов Иван Иваныч", "Директор по развитию", "iii@mail.ru", "89068545443", 127000, 42);
        persArray[2] = new Employee("Зайцева Ирина Петровна", "Охранник", "dip@mail.ru", "89068545443", 19000, 21);
        persArray[3] = new Employee("Кузнецов Сергей Сергеевич", "Ведущий разработчик", "kcc@mail.ru", "89068545443", 120000, 28);
        persArray[4] = new Employee("Волкова Кристина Романовна", "Директор по работе с клиентами", "kvr@mail.ru", "89068545443", 138000, 48);


        for (int i = 0; i < persArray.length; i++) {
            if (persArray[i].getAge() > 40) persArray[i].print();

        }
    }
}
