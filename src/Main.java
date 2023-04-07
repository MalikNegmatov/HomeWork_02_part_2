public class Main {

    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
    }

    public static void task1 () {
        System.out.println("Задача 1");
         // Пишем код для задачи 1
        byte childrenAge = 2;
        short carSpeed = 283;
        int distanceBetweenEarth_Moon_metres = 38241411;
        long distanceBetweenEarth_Sun_metres = 149597870717L;
        float carFromEarth2Moon = (float) (distanceBetweenEarth_Moon_metres/283.0);
        double carFromEarth2Sun = distanceBetweenEarth_Sun_metres/283.0;

        System.out.println("Значение переменной childrenAge с типом byte равно = " + childrenAge);
        System.out.println("Значение переменной carSpeed с типом short равно = " + carSpeed);
        System.out.println("Значение переменной distanceBetweenEarth_Moon_metres с типом int равно = " + distanceBetweenEarth_Moon_metres);
        System.out.println("Значение переменной distanceBetweenEarth_Sun_metres с типом long равно = " + distanceBetweenEarth_Sun_metres);
        System.out.print("Значение переменной carFromEarth2Moon с типом float равно = ");
        System.out.printf("%.8f", carFromEarth2Moon);
        System.out.print("\nЗначение переменной carFromEarth2Sun с типом double равно = ");
        System.out.printf("%.16f", carFromEarth2Sun);
    }

    public static void task2 () {
        System.out.println("\n\nЗадача 2");
         // Пишем код для задачи 2
        float outsideTemp = 27.12f;
        long numberOfGrains = 987678965549L;
        double ross = 2.786;
        short count = 569;
        short diff = -159;
        int local = 27897;
        byte howMuchTheFish = 67;
        System.out.println("Значение переменной outsideTemp с типом float = " + outsideTemp);
        System.out.println("Значение переменной numberOfGrains с типом long = " + numberOfGrains);
        System.out.println("Значение переменной ross с типом double = " + ross);
        System.out.println("Значение переменной count с типом short = " + count);
        System.out.println("Значение переменной diff с типом short = " + diff);
        System.out.println("Значение переменной local с типом int = " + local);
        System.out.println("Значение переменной howMuchTheFish с типом byte = " + howMuchTheFish);
    }

    public static void task3 () {
        System.out.println("\nЗадача 3");
        // Пишем код для задачи 3
        short ludmilaPavlovna = 23;
        short annaSergeevna = 27;
        short ekaterinaAndreevna = 30;
        short allPapers = 480;
        int oneStudentPaperNorm;

        oneStudentPaperNorm = allPapers/(ludmilaPavlovna+annaSergeevna+ekaterinaAndreevna);
        System.out.println("На каждого ученика рассчитано " + oneStudentPaperNorm + " листов бумаги");
    }

    public static void task4 () {
        System.out.println("\nЗадача 4");
        // Пишем код для задачи 4

        int bottlesPerMinute = 16/2;
        int firstPeriod = 20;
        int secondPeriod = 24*60;
        int thirdPeriod = 3*secondPeriod;
        int fourthPeriod = 30*secondPeriod;

        System.out.println("За " + firstPeriod + " минут машина произвела " + bottlesPerMinute*firstPeriod +" штук бутылок");
        System.out.println("За сутки машина произвела " + bottlesPerMinute*secondPeriod +" штук бутылок");
        System.out.println("За " + thirdPeriod/secondPeriod + " дня машина произвела " + bottlesPerMinute*thirdPeriod +" штук бутылок");
        System.out.println("За " + fourthPeriod/secondPeriod + " дней машина произвела " + bottlesPerMinute*fourthPeriod +" штук бутылок");
    }

    public static void task5 () {
        System.out.println("\nЗадача 5");
        // Пишем код для задачи 5
        int brownPaintPerOneClass = 4;
        int whitePaintPerOneClass = 2;
        int totalPaintCans = 120;
        int totalClass = totalPaintCans / (brownPaintPerOneClass+whitePaintPerOneClass);
        int totalBrownPaintCans = 4*totalClass;
        int totalWhitePaintCans = 2*totalClass;
        System.out.println("В школе, где " + totalClass + " классов, нужно " + totalWhitePaintCans + " банок белой краски и " + totalBrownPaintCans + " банок коричневой краски.");
    }
    public static void task6 () {
        System.out.println("\nЗадача 6");
        // Пишем код для задачи 6
        int oneBananaWeight = 80;
        int totalBananas = 5;

        int oneMilkPortionWeight = 105;
        int oneMilkPortionVolume = 100;
        int totalMilkPortions = 200/oneMilkPortionVolume;

        int oneIceCreamPortionWeight = 100;
        int totalIceCreamPortions = 2 ;

        int oneEggsWeight = 70;
        int totalEggs = 4;

        double grams2Kg = 1000.0;

        int totalCocktailWeightGrams = totalBananas*oneBananaWeight
                    + totalMilkPortions*oneMilkPortionWeight
                 + totalIceCreamPortions*oneIceCreamPortionWeight
                 + totalEggs*oneEggsWeight;

        double totalCocktailWeightKg = totalCocktailWeightGrams / grams2Kg;

        System.out.println("Общий вес коктейля у спортсмена = " + totalCocktailWeightGrams + " в граммах, или " + totalCocktailWeightKg + " кг.");

    }
}


