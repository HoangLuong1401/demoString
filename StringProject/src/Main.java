import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a sentence and press Enter:");
        String textinput = scanner.nextLine();

        System.out.println();
        System.out.println("The words entered are:");
        String text[] = textinput.split(" ");
        for (String txt : text){
            System.out.println(txt);
        }

        System.out.println();
        System.out.println("The uppercase words are:");
        for (String txt : text){
           if(txt.charAt(0) >= 65 && txt.charAt(0) <= 90){
               System.out.println(txt);
           }
        }
    }
}
