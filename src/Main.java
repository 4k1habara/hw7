public class Main {
    public static void main(String[] args) {
        //task1
        int total = 0;
        int forMonth = 15000;
        int month = 0;
        int goal = 2_459_000;
        while (total < goal) {
            month++;
            total = total + forMonth;
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
        int birthRate = 17;
        int deathRate = 8;
        int years = 10;
        for (int i = 1; i < years + 1; i++) {
            population = population +  birthRate*population/1000 - deathRate*population/1000;
            System.out.println("Год " + i + ", численность населения составляет " + population);
        }

        //task4
        total = 0;
        forMonth = 15000;
        month = 0;
        int bankRate = 7;
        goal = 12_000_000;
        while (total < goal) {
            month++;
            total = total + (total / 100 * bankRate) + forMonth;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + total);
        }
        System.out.println(month + " месяцев");

        //task5
        total = 0;
        forMonth = 15000;
        month = 0;
        goal = 12_000_000;
        bankRate = 7;
        while (total < goal) {
            month++;
            total = total + (total / 100 * bankRate) + forMonth;
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + ", сумма накоплений равна " + total);
            }
        }
        System.out.println(month + " месяцев");

        //task6
        total = 0;
        forMonth = 15000;
        month = 0;
        bankRate = 7;
        years = 9;
        while (month < (12 * years)) {
            month++;
            total = total + (total / 100 * bankRate) + forMonth;
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