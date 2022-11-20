import java.util.Scanner; // импортировали сканнер
import java.time.LocalDate; // импортировали дату

public class Main {
    public static void main(String[] args) {
        System.out.println("Домашка 11, Методы, задача 3:");
        int deliveryDistance = 120;
        System.out.println(deliveryTerm(deliveryDistance));

    }

    private static String deliveryTerm(int deliveryDistance) {
        String nullString = "";
         int[] deliveryTime = {1, 2, 3}; // в исходнике было через три переменные, здесь взяла массив
        if (deliveryDistance < 20) {
            System.out.println("Потребуется дней: " + deliveryTime[0] + " день");
        } else if (deliveryDistance >= 20 && deliveryDistance < 60) {
            System.out.println("Потребуется дней: " + deliveryTime[1] + " дня");
        } else if (deliveryDistance >= 60 && deliveryDistance < 100) {
            System.out.println("Потребуется дней: " + deliveryTime[2] + " дня");
        } else {
            System.out.println("На указанное расстояние доставка не производится, для получения карты посетите офис банка.");
        }
        return nullString; // опять не знала, что ретёрнуть, при возвращении deliveryDistance печатает два раза ответ.
    }
}
