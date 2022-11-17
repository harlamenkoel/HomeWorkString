public class HomeWorkString {
    public static void main(String[] args) {
        //Задание 1
        System.out.println("Задание 1");
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("ФИО сотрудника — " + fullName);
        System.out.println();
        //Задание 2
        System.out.println("Задание 2");
        String fullNameUpper = fullName.toUpperCase();
        System.out.println("ФИО сотрудника — " + fullNameUpper);
        System.out.println();
        //Задание 3
        System.out.println("Задание 3");
        firstName = "Семён";
        middleName = "Семёнович";
        lastName = "Иванов";
        fullName = lastName + " " + firstName + " " + middleName;
        fullName = fullName.replace("ё", "е");
        System.out.println("ФИО сотрудника — " + fullName);
    }
}