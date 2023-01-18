import java.util.Scanner;
import java.util.Stack;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Logger;

public class View extends Save {
    public static int getInt() throws Exception{
    System.out.println("Enter the number: ");
    int num;
    if(scanner.hasNextInt()){
        num = scanner.nextInt();
    }
    else {
        System.out.println("Wrong number, try again. ");
        logger.info("Error.Wrong number, try again.  ");
        scanner.next();
        num = getInt();
    }
    return num;
}
    public static char getOperation(){
        System.out.println("Choose operation + - / * ");
        char operation;
        if (scanner.hasNext()){
            operation = scanner.next().charAt(0);
        }
        else {
            System.out.println("Wrong operation, try again + - / * ");
            scanner.next();
            operation = getOperation();
        }
        return operation;
    }}


