import java.util.Scanner;

public class IffyLoopy {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        boolean redEyes = false;

        String fiveValues = "", proceed = "";

        while (!fiveValues.equalsIgnoreCase("don't")) {
            System.out.println("Are your eyes red? Y/N");
            fiveValues = keyboard.next();
            if (fiveValues.equalsIgnoreCase("Y")) {

                System.out.println("Get some sleep!");
                System.out.println("Do you want to continue? continue/don't");
                proceed = keyboard.next();
                if (proceed.equalsIgnoreCase("continue")) {
                    continue;
                }
                break;
            }
            else if (fiveValues.equalsIgnoreCase("N")){
                System.out.println("You look great!");
                System.out.println("Do you want to continue? continue/don't");
                proceed = keyboard.next();
                if (proceed.equalsIgnoreCase("continue")) {
                    continue;
                }
                break;
            }

        }
    }
}