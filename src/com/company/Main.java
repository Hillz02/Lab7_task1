//Hilary Tabra 55750

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {

    public static BufferedReader BR = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException, NumberFormatException {
        Staff.StaffInitialize();
        Staff.StaffPrint();
    }

}

class Person {

    public static String name, lastname, street, city, zipCode;
    public static BufferedReader BR = new BufferedReader(new InputStreamReader(System.in));

    public static void Initialize() throws IOException {
        System.out.print("Enter your name: ");
        name = BR.readLine();
        System.out.print("Enter your last name: ");
        lastname = BR.readLine();
        System.out.print("Enter your street: ");
        street = BR.readLine();
        System.out.print("Enter your city: ");
        city = BR.readLine();
        System.out.print("Enter your zipCode: ");
        zipCode = BR.readLine();
    }

    public static void Print() {
        System.out.println(String.format("Name: %s , Lastname: %s , " +
                "Street: %s , City: %s , Zipcode: %s", name, lastname, street, city, zipCode));
    }

}

class Staff extends Person {

    public static String education, position;
    public static BufferedReader BR = new BufferedReader(new InputStreamReader(System.in));

    public static void StaffInitialize() throws IOException {
        Person.Initialize();
        System.out.print("Enter education: ");
        education = BR.readLine();
        System.out.print("Enter position: ");
        position = BR.readLine();
    }

    public static void StaffPrint() {
        Person.Print();
        System.out.println(String.format("Education: %s , Position: %s", education, position));
    }

}