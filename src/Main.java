public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Ivanov Ivan Ivanovich", "director", "ivanov@gmail.com", "2537755", 300000, 52);
        person1.getInfo();

        Person[] persArray = new Person[5];

        persArray[0] = new Person ("Ivanov Ivan Ivanovich", "director", "ivanov@gmail.com", "2537755", 300000, 52);
        persArray[1] = new Person ("Petrov Petr Petrovich", "lawyer", "petrov@gmail.com", "3848985", 200000, 48);
        persArray[2] = new Person ("Sidorov Sidor Sidorovich", "driver", "sidr@gmail.com", "1114565", 80000, 35);
        persArray[3] = new Person ("Pechkin Igor Ivanovich", "postman", "pechkin@gmail.com", "4586363", 60000, 42);
        persArray[4] = new Person ("Viktorov Viktor Viktorovich", "engineer", "viktor@gmail.com", "7845633", 250000, 30);
    }
}