public class calc extends View {

     public static float calculator(int num1, int num2, char operation) throws Exception{

        float result = 0;
        switch (operation){
            case '+':
                result = num1 + num2;
                logger.info("Calculator result: " + num1 + " " + operation + " " + num2 + "=" + result);
                break;
            case '-':
                result = num1 - num2;
                logger.info("Calculator result: " + num1 + " " + operation + " " + num2 + "=" + result);
                break;
            case '*':
                result = num1 * num2;
                logger.info("Calculator result: " + num1 + " " + operation + " " + num2 + "=" + result);
                break;
            case '/':
                try {
                    result = num1/num2;
                    logger.info("Calculator result: " + num1 + " " + operation + " " + num2 + "=" + result);
                }
                catch (ArithmeticException e){
                    System.out.println("Error. Divizion by zero: ");
                    logger.info("Error. Divizion by zero: ");
                }
                break;
            default:
                System.out.println("Error. Wrong operation, try again: ");
                logger.info("Error: {" + operation + "} Wrong operation, try again. ");
                result = calculator(num1, num2, getOperation());
        }
        return result;
     }
}
