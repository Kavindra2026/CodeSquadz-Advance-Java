import java.util.*;

class Dayofweek {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.println("Give me a special date !!!");
        System.out.print("Month: ");
        int month = console.nextInt();

        System.out.print("Day: ");
        int day = console.nextInt();

        System.out.print("Year: ");
        int year = console.nextInt();

        String date = dayFinder(month, day, year);

        System.out.println("It is the date " + month + "/" + date + "/" + year);

        console.close();
    }

    public static String dayFinder(int month, int day, int year) {
        // handle invalid input
        if (month > 12 || month < 1 || day > 31 || day < 1) {
            throw new IllegalArgumentException("Month must be between 1 and 12 and day must be between 1 and 31");
        } else {
            // convert to "absolute" day, covering day and month
            int absoluteDay = monthToDay(month, day, year);

            // convert year to days and add to "absolute" day
            absoluteDay += yearToDay(year);

            if (absoluteDay % 7 == 2) {
                return "Monday";
            } else if (absoluteDay % 7 == 3) {
                return "Tuesday";
            } else if (absoluteDay % 7 == 4) {
                return "Wednesday";
            } else if (absoluteDay % 7 == 5) {
                return "Thursday";
            } else if (absoluteDay % 7 == 6) {
                return "Friday";
            } else if (absoluteDay % 7 == 0) {
                return "Saturday";
            } else { // absoluteDay % 7 == 1
                return "Sunday";
            }
        }
    }

    // calculates the number of days between
    // (the beginning of) the given year
    // (the beginning of) the reference year 1601;
    public static int yearToDay(int years) {
        // convert to "absolute" day;
        int absoluteDay = 0;
        int leapYears = 0;

        // iterate through years:
        for (int i = 0; i < years; i++) {
            if (((i % 4) == 0) && ((i % 100) != 0)) {
                leapYears += 1;
            } else if (i % 400 == 0) {
                leapYears++;
            }
        }

        absoluteDay = (leapYears * 366) + (((years - 1) - leapYears) * 365);
        return absoluteDay;
    }

    // Calculates the numbers of days present in a given
    // date since the beginning of the year;
    public static int monthToDay(int month, int day, int year) {
        // convert to absolute day;
        int absoluteDay = 0;

        // iterate through months
        for (int i = 1; i < month; i++) {
            if ((i == 4) || (i == 6) || (i == 9) || (i == 11)) { // 30 day months
                absoluteDay += 30;
            } else if (i == 2) { // February
                if ((year % 4 == 0) && (year % 100 != 0)) {
                    absoluteDay += 29;
                } else if (year % 400 == 0) {
                    absoluteDay += 29;
                } else {
                    absoluteDay += 28;
                }
            } else {
                absoluteDay += 31; // 1,3,5,7,8,10,12 months
            }
        }
        return absoluteDay + day;
    }
}