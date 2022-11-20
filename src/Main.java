import java.util.Scanner; // импортировали сканнер
import java.time.LocalDate; // импортировали дату
public class Main {
    public static void main(String[] args) {
        System.out.println("Домашка 11, Методы, задача 2:");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите год выпуска OS ");
        int clientDeviceYear = scanner.nextInt();
        System.out.println("Введите идентификатор ОС Вашего телефона: 0 - iOS, 1 - Android ");
        int clientOS = scanner.nextInt();
        System.out.println(detectionOSVersion(clientDeviceYear, clientOS));
    }
    private static String detectionOSVersion(int clientDeviceYear, int clientOS){
        String nullString = "";
        int currentYear = LocalDate.now().getYear();
        if (clientDeviceYear == currentYear) {
            switch (clientOS) {
                case 0:
                    System.out.println("Установите версию приложения для iOS по ссылке.");
                    break;
                case 1:
                    System.out.println("Установите версию приложения для Android по ссылке.");
                    break;
            }
        }
        else {
            switch (clientOS) {
                case 0:
                    System.out.println("Установите облегчённую версию приложения для iOS по ссылке.");
                    break;
                case 1:
                    System.out.println("Установите облегчённую версию приложения для Android по ссылке.");
                    break;
            }
        }
        return (nullString); // не придумала другого способа завершить метод. Идея требует return, хоть void, хоть int
    }
}
