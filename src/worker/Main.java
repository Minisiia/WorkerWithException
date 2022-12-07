package worker;


import java.util.Arrays;
import java.util.Calendar;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Worker[] arrayWorkers = new Worker[5];
        String mySurnameAndInitials;
        String myPosition;
        int myYear;
        // визначення сьогоднішнього року
        Calendar cal = Calendar.getInstance();
        int yearNow = cal.get(Calendar.YEAR);
        for (int i = 0; i < arrayWorkers.length; i++) {
            System.out.println("Введіть фамілію та ініціали " + (i + 1) + " працівника:");
            mySurnameAndInitials = scanner.nextLine();
            System.out.println("Введіть назву займаної посади " + (i + 1) + " працівника:");
            myPosition = scanner.nextLine();
            System.out.println("Введіть рік початку роботи " + (i + 1) + " працівника:");
            myYear = scanner.nextInt();
            try {
                if (myYear>9999 || myYear<1000) {
                    throw new WrongFormatYearException("Невірний формат року. Правильний формат YYYY");
                }
                if (myYear > yearNow) {
                    throw new YearOverCurrentException("Рік не може бути більшим за сьогоднішній");
                }
            }
            catch (WrongFormatYearException | YearOverCurrentException ex) {
                System.err.println(ex.getMessage());
                myYear = 0;
            }
            scanner.nextLine();
            arrayWorkers[i] = new Worker(mySurnameAndInitials,myPosition,myYear);
        }
        // сортування масиву за фаміліями
        System.out.println("Сортування масиву по фамілії:");
        Arrays.sort(arrayWorkers, Comparator.comparing(Worker::getSurnameAndInitials));
        for (Worker arrayWorker : arrayWorkers) {
            System.out.println(arrayWorker);
        }
        System.out.println("Введіть значення стажу:");
        int experience = scanner.nextInt();
        System.out.println("Працівники, стаж роботи яких більший за " + experience + ":");
        for (int i = 0; i < arrayWorkers.length; i++) {
            int year = arrayWorkers[i].getYearStartWork();
            if (year == 0)
                System.err.println("Невірний формат року " + (i + 1) + " працівника. Неможливо порахувати стаж");
            if (((yearNow - year) > experience) && year != 0)
                System.out.println(arrayWorkers[i].getSurnameAndInitials());
        }
    }
}
