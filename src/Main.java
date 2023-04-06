public class Main {

    public static void main(String[] args) {
        task1();
        task2();
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


    }

    public static void task3 () {
        System.out.println("\n\nЗадача 3");
        // Пишем код для задачи 3
    }
}


