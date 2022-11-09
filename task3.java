// Реализовать простой калькулятор
// Сделал для типа Int
import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        String start = "0";
        Scanner in = new Scanner(System.in);
        int result   = 0;
        int oldValue = 0;
        System.out.printf("Введите первое число (min - %d, max - %d): ", Integer.MIN_VALUE, Integer.MAX_VALUE);
        int first  = in.nextInt();
        while (start.charAt(0) != 'q') {
            if (start.charAt(0) == 'c') {
                first = oldValue;
            }
            oldValue = first;
            System.out.printf("Введите второе число (min - %d, max - %d): ", Integer.MIN_VALUE, Integer.MAX_VALUE);
            int second = in.nextInt();
            System.out.printf("Введите знак операции +,-,*,/: ");
            String  control = in.next();
            oldValue = first;
                switch (control) {
                    case ("+"):
                    result = add(first, second);
                        break;
                    case ("-"):
                    result = sub(first, second);
                        break;
                    case ("*"):
                    result = mult(first, second);
                        break;
                    case ("/"):
                    result = div(first, second);
                        break;
                    default:
                        break;   
                }
            System.out.printf("%d %s %d = %d \n", first, control, second, result);
            first = result; 
           
            System.out.println("Для выхода напишите 'q'");
            System.out.println("Для отмены последнего действия напишите 'с'");
            System.out.println("Для продолжения введите любой символ");
            start = in.next();
        }
       
    }   
    public static int add(int a, int b) {
        return a + b;    
    }
    public static int sub(int a, int b) {
        return a - b;            
    }
    public static int mult(int a, int b) {
        return a * b;            
    }
    public static int div(int a, int b) {
        return a / b;            
    }

    public static int getIntMinMax(int min, int max)
    {
        int result = 0;
        Scanner sc = new Scanner(System.in); // создаём объект класса Scanner
        boolean condition = false;
        boolean done      = false;
        while (!done) 
        {
            System.out.printf("Введите целое число (min - %d, max - %d): ", min, max);
            condition = sc.hasNextInt();
            if(condition) 
            { 
                result = sc.nextInt(); 
                if ((result >= min) & (result <= max)) 
                {
                    done = true;
                }
                else
                {
                    condition = false;
                }
            } 
            if(!condition) 
            {
                 System.out.println("Вы ввели не целое число");
                 condition = false;
                 sc.nextLine();
            }
        }
        sc.close();
        return result;
    }
}
