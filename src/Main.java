public class Main {
    public static void main(String[] args) {
        //task1
        int total = 0;
        int forMonth = 15000;
        int month = 0;
        while (total < 2_459_000) {
            month++;
            total = total + (total / 100) + forMonth;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + total);
        }

        //task2
        int number = 1;
        while (number < 11) {
            System.out.print(number + " ");
            number++;
        }
        System.out.println();
        for (; number > 1;) {
            number--;
            System.out.print(number + " ");
        }
        System.out.println();

        //task3
        int population = 12_000_000;
        int birthRate = population / 1000 * 17;
        int deathRate = population / 1000 * 8;
        for (int i = 1; i < 11; i++) {
            population = population + birthRate - deathRate;
            System.out.println("Год " + i + ", численность населения составляет " + population);
        }

        //task4
        total = 0;
        forMonth = 15000;
        month = 0;
        while (total < 12_000_000) {
            month++;
            total = total + (total / 100 * 7) + forMonth;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + total);
        }
        System.out.println(month + " месяцев");

        //task5
        total = 0;
        forMonth = 15000;
        month = 0;
        while (total < 12_000_000) {
            month++;
            total = total + (total / 100 * 7) + forMonth;
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + ", сумма накоплений равна " + total);
            }
        }
        System.out.println(month + " месяцев");

        //task6
        total = 0;
        forMonth = 15000;
        month = 0;
        while (month < (12 * 9)) {
            month++;
            total = total + (total / 100 * 7) + forMonth;
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + ", сумма накоплений равна " + total);
                System.out.println(month + " месяцев");
            }
        }

        //task7
        int friday = 1;
        while (friday < 31) {
            System.out.println("Сегодня пятница, " + friday + "-е число");
            friday = friday + 7;
        }

        //task8
        int start = 2024 - 200;
        int finish = 2024 + 100;
        while (start < finish) {
            start++;
            if (start % 79 == 0) {
                System.out.println(start);
            }
        }
    }
}