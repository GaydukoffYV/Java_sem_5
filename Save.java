import java.util.Scanner;
import java.util.Stack;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Logger;

public class Save {
    static Scanner scanner = new Scanner(System.in);
    private static final Logger logger = Logger. getLogger(calc.class.getName());
    public static void main(String[] args) throws Exception {
        Handler fileHandler = new FileHandler("log main1.xml", true);
        logger.setUseParentHandlers(false);
        logger.addHandler(fileHandler);
        int choice = 0;
        Stack<Integer> savebook = new Stack<>();
        for (; choice != 1; ) {
            int num1 = getInt();
            int num2 = getInt();
            System.out.println("Enter operation: " + System.lineSeparator());
            char operation = getOperation();
            float result = calculator(num1, num2, operation);
            System.out.println("Result of operation: " + result);
            int x = (int) result;
            System.out.println("Stec: " + savebook);
            choice_operation(savebook, x);
            System.out.println("Выйти из программы?: 1) Да, 2) Нет");
            choice = getInt();
        }

    }

    static void choice_operation(Stack<Integer> savebook, Integer x) throws Exception {
        System.out.println("Сохранить или удалить информацию об операции?: 1) Сохранить 2) Удалить");
        int choice = getInt();
        if (choice == 1) {
            save_operation(savebook, x);
        }
        if (choice == 2) {
            del_operation(savebook, x);
        }
    }

    static void del_operation(Stack<Integer> savebook, Integer x) {
        System.out.print("В очередь");
        x = (Integer) savebook.pop();
        System.out.println(x);
        System.out.println("Stek: " + savebook);
    }

    static void save_operation(Stack<Integer> savebook, Integer x) {
        savebook.push(x);
        System.out.println("Поместить (" + x + ")");
        System.out.println("Stek: " + savebook);
    }
}



