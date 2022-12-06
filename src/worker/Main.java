package worker;


import java.util.Arrays;
import java.util.Calendar;
import java.util.Comparator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Worker[] arrayWorkers = new Worker[3];
        String mySurnameAndInitials;
        String myPosition;
        String myYear;

 /*       arrayWorkers[0] = new Worker("Петренко А.М.", "Директор","1999");
        arrayWorkers[1] = new Worker("Франко В.М.", "Бухгалтер","2000");
        arrayWorkers[2] = new Worker("Плющ А.М.", "Кухар", "2002");
        arrayWorkers[3] = new Worker("Сидоренко А.М.", "Офіціант", "2013");
        arrayWorkers[4] = new Worker("Вітренко А.О.", "Прибиральник", "2012");*/
        for (int i = 0; i < arrayWorkers.length; i++) {
            System.out.println("Введіть фамілію та ініціали " + (i + 1) + " працівника:");
            mySurnameAndInitials = scanner.nextLine();
            System.out.println("Введіть назву займаної посади " + (i + 1) + " працівника:");
            myPosition = scanner.nextLine();
            System.out.println("Введіть рік початку роботи " + (i + 1) + " працівника:");
            myYear = scanner.nextLine();
            try {
                int year = Integer.parseInt(myYear);
                if (myYear.length()!=4)
                throw new WrongFormatYearException();
            } catch (NumberFormatException e) {
                System.err.println("Невірний формат року. Містить не тільки цифри");
            }
            catch (WrongFormatYearException ex) {
                System.err.println("Невірний формат року. Правильний формат YYYY");
            }
            arrayWorkers[i] = new Worker(mySurnameAndInitials,myPosition,myYear);
        }
        // сортування масиву за фаміліями
/*        Arrays.sort(arrayWorkers, Comparator.comparing(Worker::getSurnameAndInitials));
        for (int i = 0; i < arrayWorkers.length; i++) {
            System.out.println(arrayWorkers[i]);
        }*/
        System.out.println("Введіть значення стажу:");
        int experience = scanner.nextInt();
        // визначення сьогоднішнього року
        Calendar cal = Calendar.getInstance();
        int yearNow = cal.get(Calendar.YEAR);
        System.out.println("Працівники, стаж роботи яких більший за " + experience + ":");
        for (int i = 0; i < arrayWorkers.length; i++) {
            String year = arrayWorkers[i].getYearStartWork();
            try {
                int yearInt = Integer.parseInt(year);
                if (year.length()!=4)
                    throw new WrongFormatYearException();
                if ((yearNow - yearInt) > experience)
                    System.out.println(arrayWorkers[i].getSurnameAndInitials());
            }catch (Exception e){
                System.err.println("Невірний формат року " + (i + 1) + " працівника. Неможливо порахувати стаж");
            }


        }


    }
}
