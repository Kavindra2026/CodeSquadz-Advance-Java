
enum Week {
    Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, sunday
}

public class DefaultValue {

    public static void main(String[] args) {
        //Obtain all ordinal values using ordinal().
        System.out.println("Here are all Week constants " + "and their ordinal values :");

        //use values()
        Week day1[] = Week.values();
        for (int i = 0; i < day1.length; i++) {
            System.out.println(day1[i] + "=");
            System.out.println(day1[i].ordinal());
        }
        for (Week day : Week.values()) {
            System.out.println(day + " " + day.ordinal());

        }
    }
}


/*
Here are all Week constants and their ordinal values :
Monday=
0
Tuesday=
1
Wednesday=
2
Thursday=
3
Friday=
4
Saturday=
5
sunday=
6
Monday 0
Tuesday 1
Wednesday 2
Thursday 3
Friday 4
Saturday 5
sunday 6
 */