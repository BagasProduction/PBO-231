package ProgrammerZamanNowOOP;

public class PersonAPP {
    public static void main(String[] args) {
        var Person1 = new Person();
        Person1.name = "Eko Chandra";
        Person1.address = "Jambangan";
        Person Person2 = new Person();
        Person2.name = "Budi Santoso";
        Person Person3;
        Person3 = new Person();
        Person3.name = "Budi Jatmiko";
        System.out.println(Person1.name);
        System.out.println(Person1.address);
        System.out.println(Person1.country);
        System.out.println(Person2.name);
        System.out.println(Person3.name);



    }
}
