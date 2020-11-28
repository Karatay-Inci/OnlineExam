package CODINGBATwarmup1;

public class A1SleepIn {
    /*
        The parameter weekday is true if it is a weekday,
    and the parameter vacation is true if we are on vacation.
    We sleep in if it is not a weekday or we're on vacation.
    Return true if we sleep in.*/
    public static void main(String[] args) {
        System.out.println(sleepIn(false, false));
        System.out.println(sleepIn1(false, true));
        System.out.println(sleepIn2(true, false));
        System.out.println(sleepIn3(true, true));
        System.out.println(sleepIn4(true, true));
        System.out.println(sleepIn5(true, true));
        System.out.println(sleepIn6(true, true));
        System.out.println(sleepIn7(true, true));
        System.out.println(sleepIn8(true, true));

    }

    public static boolean sleepIn(boolean weekday, boolean vacation) {
        if (!weekday == true) ;

        else if (vacation == true) ;
        return false;
    }

    public static boolean sleepIn1(boolean weekday, boolean vacation) {
        if (weekday == false) ;

        else if (!vacation == false) ;
        return false;
    }


    public static boolean sleepIn2(boolean weekday, boolean vacation) {
        if (weekday == false && vacation == false) {
            return true;
        }
        if (weekday == false && vacation == true) {
            return true;
        }
        if (weekday == true && vacation == false) {
            return false;
        }
        if (weekday == true && vacation == true) {
            return true;
        }
        return true;
    }

    public static boolean sleepIn3(boolean weekday, boolean vacation) {
        if (weekday == false && vacation == false) {
            return true;
        } else if (weekday == false && vacation == true) {
            return true;
        } else if (weekday == true && vacation == false) {
            return false;
        } else {
            return true;
        }
    }

    public static boolean sleepIn4(boolean weekday, boolean vacation) {
        if (weekday == true && vacation == false) {
            return false;
        } else {
            return true;
        }
    }

    public static boolean sleepIn5(boolean weekday, boolean vacation) {
        if (weekday && !vacation) {
            return false;
        } else {
            return true;
        }
    }

    public static boolean sleepIn6(boolean weekday, boolean vacation) {
        if (weekday && !vacation)
            return false;

        return true;

    }

    public static boolean sleepIn7(boolean weekday, boolean vacation) {
        return !(weekday && !vacation);

    }


    public static boolean sleepIn8(boolean weekday, boolean vacation) {
        if (!weekday == true || vacation == true) ;
        return true;

    }

}









