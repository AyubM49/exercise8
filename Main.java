import java.util.Scanner;
public class Main {


    public static void main(String[] args) {


        Contact contact1 = new Contact("Ayub", "ayub@email.com");
        Business business1 = new Business("Ayub", "Ayub@email.com", "1234567890");


        Scanner input = new Scanner(System.in);

        System.out.println("whats your name? ");
        String name = input.nextLine();

        System.out.println("Can you type in your email? ");
        String email = input.nextLine();

        System.out.println("What is your Phone Number? ");
        String phoneNumber = input.nextLine();

        Business user = new Business(name,email,phoneNumber);

        user.display();
        business1.display();
        contact1.display();




    }
}