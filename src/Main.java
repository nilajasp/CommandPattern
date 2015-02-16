import java.util.Scanner;

/**
 * Created by nilajapatankar on 2/13/15.
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number1:");
        double number1 = Double.parseDouble(sc.nextLine());
        System.out.println("Enter number2:");
        double number2 = Double.parseDouble(sc.nextLine());
        Receiver receiver = new Receiver(number1, number2);
        ICommand command = new AddCommand(receiver);
        command.Execute();
        command = new SubtractCommand(receiver);
        command.Execute();
        command = new MultiplyCommand(receiver);
        command.Execute();
        command = new DivideCommand(receiver);
        command.Execute();
    }
}