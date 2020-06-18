import java.util.Scanner;

public class ElizaChat {
    public static void main(String[] args) {
//        Starts with a greeting message
//        Asks the user for their name, intakes the user name using Scanner class.
//        Prompts the user to tell Eliza how their day has been
//        Lastly prints all of the user's input at the end of the conversation.
         String name, yourday, answer;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to ElizaChats! My name is Eliza, What's your name?");
        name= scanner.nextLine();
        System.out.println("Nice to meet you,"+ name + " , How has your day been?");
        yourday= scanner.nextLine();
        System.out.println("Okay, Anything in particular that makes you feel that It has been a " +yourday + " day! ?");
   answer=scanner.nextLine();
        System.out.println("Okay, Well it has been my pleasure to speak with you. Have a nice day!\n");

        System.out.println("Here are your responses: "+ name +" "+ yourday+ " "+ answer);
    }
}
