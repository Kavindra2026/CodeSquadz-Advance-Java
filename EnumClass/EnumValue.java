
enum Week {
    Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, sunday
}

public class EnumValue {

    public static void main(String[] args) {
        System.out.println("Here are all Week constants ");

        //use values()
        Week allWeek[] = Week.values();
        for (Week aday : allWeek) {
            System.out.println(aday);
        }
        for (int i = 0; i < allWeek.length; i++) {
            System.out.println(allWeek[i]);
        }
    }
}


/*
Here are all Week constants 
Monday
Tuesday
Wednesday
Thursday
Friday
Saturday
sunday
Monday
Tuesday
Wednesday
Thursday
Friday
Saturday
sunday

 */