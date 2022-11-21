public class Main {
    public static void main(String[] args) {

        // =====Task 1=====

        System.out.println("=====Task 1=====");
        // iOs = 0, Android = 1
        byte clientOS = 1;
        if (clientOS == 1) {
            System.out.println("Install Android App via link");
        } else
            System.out.println("Install iOs app via link");

        // =====Task 2=====

        System.out.println("=====Task 2=====");
        short clientDeviceYear = 2015;
        if (clientOS == 1) {
            if (clientDeviceYear >= 2015) {
                System.out.println("Install Android App via link");
            } else {
                System.out.println("Install light Android App via link");
            }
        } else if (clientDeviceYear >= 2015) {
            System.out.println("Install iOs app via link");
        } else System.out.println("Install light iOs App via link");

        // =====Task 3=====

        System.out.println("=====Task 3=====");
        short year = 1300;
        if (year % 400 >= year % 100 && year % 4 == 0) {
            System.out.println(year + " is a leap year");
        } else {
            System.out.println(year + " is a non-leap year");
        }

        //=====Task 4=====

        System.out.println("=====Task 4=====");
        int deliveryDistance = 95;
        int daysAmount = 1 + (deliveryDistance + 19) / 40;
        System.out.println("Delivery days: " + daysAmount);

        //=====Task 5=====

        System.out.println("=====Task 5=====");
        byte monthNumber = 12;
        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("Winter");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Spring");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Summer");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Autumn");
                break;
            default:
                System.out.println("This month doesn't exist");
        }
        //=====Task 6=====
        System.out.println("=====Task 6=====");
        int age = 18;
        int salary = 35000;
        double salaryIndex = 1;
        int ageIndex = 0;
        if (salary >= 50000) {
            salaryIndex = salary >= 80000 ? 3 : 2;
        }
        if (age >= 18) {
            ageIndex = age < 23 ? 2 : 3;
        }
        double credit = salary * salaryIndex * ageIndex;
        System.out.println("Мы готовы выдать вам кредитную карту с лимитом " + credit + " рублей");

    }

}