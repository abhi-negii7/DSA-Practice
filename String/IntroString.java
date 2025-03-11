import java.util.Scanner;

class IntroString {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // String are immutable
        // ie String cannot be changed its copy of changes string is created
        String name = "Abhi";
        String city;
        // The String value cannot be surrounded by single quotes only by double quotes
        // String branch='CSE';
        // System.out.println(branch);
        // System.out.print("Enter the city : ");

        // Takes only single word
        // city = sc.next();
        //Also takes the word after the space 
        // city=sc.nextLine();

        System.out.println(name.length()); // Length of String
        // System.out.println(city);

        printLetters(name);
    }

    // Method to print characters of String
    public static void printLetters(String name) {

        for (int i = 0; i < name.length(); i++) {
            System.out.print(name.charAt(i) + " ");
        }
        System.out.println();
    }
}