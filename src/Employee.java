public class Employee{
    String emplFullName;
    String emplPosition;
    String emplEmail;
    String emplPhone;
    double emplSalary;
    int emplAge;

    Employee(String fullName, String positon, String email, String phoneNumber, double salary, int age){
        emplFullName = fullName;
        emplPosition = positon;
        emplEmail = email;
        emplPhone = phoneNumber;
        emplSalary = salary;
        emplAge = age;
    }

    public void employeeInfo(){
        System.out.printf("ФИО сотрудника: " + emplFullName + "\n" +
                "Должность сотрудника: " + emplPosition + "\n" +
                "Email сотрудника: " + emplEmail + "\n" +
                "Номер телефона сотрудника: " + emplPhone + "\n" +
                "Зарплата сотрудника: " + emplSalary + "\n" +
                "Возраст сотрудника: " + emplAge + "\n");
    }

}
