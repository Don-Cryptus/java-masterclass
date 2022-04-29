import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        int value = 1;
        if(value == 1) {
            System.out.println("value is 1");
        } else if(value == 2) {
            System.out.println("value is 2");
        } else {
            System.out.println("value is not 1 or 2");
        }

        int switchValue = 1;
        switch(switchValue) {
            case 1:
                System.out.println("switchValue is 1");
                break;
            case 2:
                System.out.println("switchValue is 2");
                break;
            case 3: case 4: case 5:
                System.out.println("switchValue is 3, 4, or 5");
                System.out.println("Actually it was " + switchValue);
                break;
            default:
                System.out.println("switchValue is not 1 or 2");
        }

        // Create a new switch statement using char instead of int
        // create a new char variable
        // create a switch statement testing for
        // A, B, C, D, or E
        // display a message if any of these are found and then break
        // Add a default which displays a message saying not found

        char charValue = 'A';
        switch(charValue) {
            case 'A':
                System.out.println("charValue is A");
                break;
            case 'B':
                System.out.println("charValue is B");
                break;
            case 'C':
                System.out.println("charValue is C");
                break;
            case 'D':
                System.out.println("charValue is D");
                break;
            case 'E':
                System.out.println("charValue is E");
                break;
            default:
                System.out.println("charValue is not A, B, C, D, or E");
        }

        String month = "January";
        switch(month.toLowerCase()) {
            case "January":
                System.out.println("month is January");
                break;
            case "February":
                System.out.println("month is February");
                break;
            case "March":
                System.out.println("month is March");
                break;
            case "April":
                System.out.println("month is April");
                break;
            case "May":
                System.out.println("month is May");
                break;
            case "June":
                System.out.println("month is June");
                break;
            case "July":
                System.out.println("month is July");
                break;
            case "August":
                System.out.println("month is August");
                break;
            case "September":
                System.out.println("month is September");
                break;
            case "October":
                System.out.println("month is October");
                break;
            case "November":
                System.out.println("month is November");
                break;
            case "December":
                System.out.println("month is December");
                break;
            default:
                System.out.println("month is not January, February, March, April, May, June, July, August, September, October, November, or December");
        }
    }
}