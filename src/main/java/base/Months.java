package base;

public class Months {
    public int numMonth;
    public String strMonth;

    public void setNumMonth(int numMonth) {
        this.numMonth = numMonth;
    }

    //switch case
    public String convert(int month)
    {
        switch (numMonth) {
            case 1: return "The name of the month is January.";
            case 2: return "The name of the month is February.";
            case 3: return "The name of the month is March.";
            case 4: return "The name of the month is April.";
            case 5: return "The name of the month is May.";
            case 6: return "The name of the month is June.";
            case 7: return "The name of the month is July.";
            case 8: return "The name of the month is August.";
            case 9: return "The name of the month is September.";
            case 10: return "The name of the month is October.";
            case 11: return "The name of the month is November.";
            case 12: return "The name of the month is December.";
            default: return "ERROR: please enter value from 1-12..";
        }

    }
}
