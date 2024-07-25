import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("ФИО сотрудника: ");
        String fullName = scanner.nextLine();
        System.out.printf("Должность сотрудника: ");
        String position = scanner.nextLine();
        System.out.printf("Email сотрудника: ");
        String email = scanner.nextLine();
        System.out.printf("Номер телефона сотрудника: ");
        String phoneNumber = scanner.nextLine();
        System.out.printf("Зарплата сотрудника: ");
        double salary = scanner.nextDouble();  scanner.nextLine();
        System.out.printf("Возраст сотрудника: ");
        int age = scanner.nextInt();  scanner.nextLine();

        Employee employee = new Employee(fullName, position, email, phoneNumber, salary, age);

        Employee[] employeesArray = new Employee[5];
        employeesArray[0] = employee;
        employeesArray[1] = new Employee("Kuzmin Nikolay", "QA Team Lead", "gfhd@mail.ru", "893453211536", 200000, 30);
        employeesArray[2] = new Employee("Zemchenov Artem", "Junior programmer", "4dfgacg@gmail.com", "892453263970", 50000, 22);
        employeesArray[3] = new Employee("Mihaylova Irina", "UI/UX Designer", "iopoiybcwer@gmail.com", "89210015454", 70000, 25);
        employeesArray[4] = new Employee("XXX XXXX", "XXXXX", "XXXXXX", "0000000000", 0, 0);

        System.out.println("Выберите сотрудника для вывода информации {используйте ввод 1, 2, 3 и т.д}: ");
        String userEmplChoice = scanner.nextLine();

        switch (userEmplChoice){
            case "1": employeesArray[0].employeeInfo(); break;
            case "2": employeesArray[1].employeeInfo(); break;
            case "3": employeesArray[2].employeeInfo(); break;
            case "4": employeesArray[3].employeeInfo(); break;
            case "5": employeesArray[4].employeeInfo(); break;
            default: System.out.println("Ошибка!"); break;
        }

        System.out.println("\n\nЗадание №3");

        Park park = new Park("Summerville");
        park.attractionAdd("Американские горки", "11:00", "19:00", 3);
        park.attractionAdd("Колесо обозрения", "10:00", "22:00", 5);

        park.parkInfo();

    }

}

