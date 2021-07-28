import java.util.Scanner;

public class Lesson14 {

    public static void main(String[] args) {

        // A*s -- Ananass
        // A.*s -- A12321321dsnfmdsnfs
//         ^StartsWith    -- match StartsWithThisSentence
        // Contains only from alphanumeric a .. z ( lower case only )
        // [a-z]+
        // [a-zA-Z]
        // \d   == [0-9]

        // validate this range: 1900 - 2100

        String validInput = "2020";
        String invalidInput = "99999";


        // GOOD, BUT WE CAN DO BETTER
        // build a pattern to validate a year
        if("2021".matches("\\d\\d\\d\\d")) {
            System.out.println("Valid input is a valid year");
        } else {
            System.out.println("Valid input is not a valid year");
        }

        if("99999".matches("\\d\\d\\d\\d")) {
            System.out.println("InValid input is a valid year");
        } else {
            System.out.println("InValid input is not a valid year");
        }

        // BETTER, but there are still some issues
        if("2020".matches("[1-2][019]\\d\\d")) {
            System.out.println("Valid input is a valid year. Enhanced validation rules");
        } else {
            System.out.println("Valid input is not a valid year");
        }

        if("2920".matches("[1-2][019]\\d\\d")) {
            System.out.println("Valid input is a valid year. Wow... passing values like 29xx");
        } else {
            System.out.println("Valid input is not a valid year");
        }

        // Wow. Almost there. Year 2100 is still not valid
        if("2920".matches("(19|20)\\d\\d")) {
            System.out.println("Valid input is a valid year. Even 29xx");
        } else {
            System.out.println("Valid input is not a valid year");
        }

        if("2100".matches("(19|20)\\d\\d")) {
            System.out.println("Valid input is a valid year. But now 2100");
        } else {
            System.out.println("Valid input is not a valid year");
        }

        if("2020".matches("(19|20)\\d\\d")) {
            System.out.println("Valid input is a valid year. Even 2020");
        } else {
            System.out.println("Valid input is not a valid year");
        }

        if("1986".matches("(19|20)\\d\\d")) {
            System.out.println("Valid input is a valid year. Even 1986");
        } else {
            System.out.println("Valid input is not a valid year");
        }

        //
        if("2100".matches("((19|20)\\d\\d|2100)")) {
            System.out.println("Valid input is a valid year. Even 2100");
        } else {
            System.out.println("Valid input is not a valid year");
        }



        String[] cities = {"Copenhagen", "Paris", "Tokyo", "Bristol", "Mumbai", "Delhi", "Riga", "Vienna", "Warsaw", "Hamburg", "Cesis"};

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a search pattern:");
        String userInput = scanner.next();

        for (String city: cities) {
            if (city.matches(".*" + userInput + ".*") ) {
                System.out.println("This city matches the RegEx: \"" + userInput + "\" | " + city);
            }
        }

        // We can transform original input
        String transformedInput = userInput.toLowerCase();


        // CASE INSENSITIVE METHOD
        // LOWER CASE BOTH USER INPUT AND SEARCH ENTRY ( CITY )
        for (String city: cities) {
            if (city.toLowerCase().matches(".*" + userInput.toLowerCase() + ".*") ) {
                System.out.println("This city matches the RegEx: \"" + userInput + "\" | " + city);
            }
            // If you are not using a regex
            if(city.toLowerCase().charAt(0) == userInput.toLowerCase().charAt(0) ){
                System.out.println("comparing the first char");
            }

        }

    }
}
