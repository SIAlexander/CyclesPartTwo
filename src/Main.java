public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }
    public static void task1(){
        System.out.println("Задача 1");
        int contribution = 15000;
        int sumAccumulation = 0;
        int counterMonth = 0;
        while (sumAccumulation <= 2_459_000){
            System.out.println("Месяц " + counterMonth + " сумма накоплений равна " + sumAccumulation + " рублей");
            sumAccumulation += contribution;
            counterMonth++;
        }
    }
    public static void task2(){
        System.out.println("Задача 2");
        int counter = 1;
        while(counter <= 10){
            System.out.print(counter + " ");
            counter++;
        }
        System.out.println();
        for (int i = 10; i > 0 ; i--){
            System.out.print(i + " ");
        }
        System.out.println();
    }
    public static void task3(){
        System.out.println("Задача 3");
        int populationSize = 12_000_000;
        int birthRate = 17;
        int mortalityRate = 8;
        for (int i = 1; i <= 12; i++){
            populationSize += ((populationSize / 1000) * (birthRate - mortalityRate));
            System.out.println("Год " + i + ", численность населения составляет " + populationSize);
        }
    }
    public static void task4(){
        System.out.println("Задача 4");
        int contributionSum = 15000;
        int counterMonth = 0;
        while (contributionSum <= 12_000_000){
            contributionSum += ((contributionSum / 100) * 7);
            counterMonth++;
            System.out.println("Месяц " + counterMonth + ", сумма накоплений " + contributionSum);
        }
    }
    public static void task5(){
        System.out.println("Задача 5");
        int contributionSum = 15000;
        int counterMonth = 0;
        while (contributionSum <= 12_000_000){
            contributionSum += ((contributionSum / 100) * 7);
            counterMonth++;
            if (counterMonth % 6 == 0){
                System.out.println("Месяц " + counterMonth + ", сумма накоплений " + contributionSum);
            }
        }
    }
    public static void task6(){
        System.out.println("Задача 6");
        int contributionSum = 15000;
        int numberOfYear = 9;
        int numberOfMonths = numberOfYear * 12;
        for (int i = 1; i <= numberOfMonths; i++){
            contributionSum += ((contributionSum / 100) * 7);
            if (i % 6 == 0){
                System.out.println("Месяц " + i + ", сумма накоплений " + contributionSum);
            }
        }
    }
    public static void task7(){
        System.out.println("Задача 7");
        int firstFridayOfTheMonth = 3;
        for (int i = 1; i <= 31; i++) {
            for(int j = 0; j <= 31; j += 7){
                if ( i == (firstFridayOfTheMonth + j)){
                    System.out.println("Сегодня пятница, " + i + "-е число. Необходимо подготовить отчет");
                }
            }
        }
    }
    public static void task8(){
        System.out.println("Задача 8");
        int currentYear = 2023;
        int yearsBeforeTheCurrent = 200;
        int yearsAfterTheCurrent = 100;
        for (int i = 0; i <= (currentYear + yearsAfterTheCurrent); i += 79){
            if (i >= currentYear - yearsBeforeTheCurrent) {
                System.out.println(i);
            }
        }
    }

}