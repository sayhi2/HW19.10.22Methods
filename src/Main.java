

        //HW 16.10.22

        import java.time.LocalDate;
        public class Main {



            // Task 1
        public static void printIsLeapYear (int year) {
        boolean yearIsLeap = isLeap(year);

        printIsLeapYearResult(year, yearIsLeap);
        }
        private static boolean isLeap(int year)
        {
            return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
        }
        private static void printIsLeapYearResult ( int year, boolean yearIsLeap) {
            if (yearIsLeap) {
                System.out.println(year + " является високосным ");
            } else {
                System.out.println(year + " не является високосным ");
            }
        }
            //Task 2

            public static void figureOsVersionOut (int oS, int yearOs){
        int currentYear = LocalDate.now().getYear();
        if (oS == 0 && yearOs < currentYear) {
            System.out.println("Установить версию приложения IOS по ссылке ");
        } else if (oS == 0 && yearOs >= currentYear) {
                    System.out.println("Установить облегченную версию приложения IOS по ссылке ");
        } else if (oS == 1 && yearOs < currentYear) {
            System.out.println("Установить версию приложения Android по ссылке ");
        } else if (oS == 1 && yearOs >= currentYear) {
            System.out.println("Установить облегченную версию приложения Android по ссылке ");
        }}
            int year = 2010;

            public static void main(String[] args) {
                System.out.println();
                int year = 1972;
                printIsLeapYear(year);
                figureOsVersionOut(1, 2012);
                calculateDeliveryTime(90);

            }

            // Task 3
            public static void calculateDeliveryTime(int deliveryDistance) {

                int delivery = 1;

                if (deliveryDistance > 20) {
                    delivery ++;
                    {
                        if (deliveryDistance > 60 && deliveryDistance <= 100) {
                            delivery++;
                        } else {
                            System.out.println(" Доставка не продуктивна ");
                        }
                        System.out.println(" Потребуется " + delivery + " дней ");
                    }}
                    }
            }




