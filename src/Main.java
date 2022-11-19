import java.util.Scanner; // импортировали сканнер
public class Main {
    public static void main(String[] args) { // хотелось, но не получилось Scanner вынести в метод, путаница с переменой year получается
        System.out.println("Домашка 11, Методы, задача 1:");
        Scanner scanner = new Scanner(System.in);// объявили переменную scanner с типом
        System.out.println("Введите год:");
        int year = scanner.nextInt(); // считываем запрос
        System.out.println(leapOrNoLeapYear(year));
        main(args); // вызываем программу заново2
    }

    private static String leapOrNoLeapYear(int year2) {
        int leapYear1 = year2 % 4;
        int leapYear2 = year2 % 400;
        int noLeapYear = year2 % 100;
        if (noLeapYear != 0 && leapYear1 == 0 || leapYear2 == 0) {
            return "Этот год високосный.";
        }
        return "Этот год не високосный."; // я так и не поняла до конца, как у меня это получилось
    }

}
