import java.util.Scanner;

public class Main {
     static int num;

     static int num2;

     static int result;

     static char oper;

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        String string = sc.next();
        String[] str = string.split("/, *, -, +");
        if (string.contains("*")) {
            oper = '*';
        } else if (string.contains("/")) {
            oper = '/';

        } else if (string.contains("-")) {
            oper = '-';
        } else if (string.contains("+")) {
            oper = '+';

        }


        num = Integer.parseInt(string);
        num2 = Integer.parseInt(string);
    }


        public static void action ( int num, int num2, int result, char oper){

            switch (oper) {
                case '+':
                    result = num + num2;
                    break;
                case '-':
                    result = num - num2;
                    break;
                case '*':
                    result = num * num2;
                    break;
                case '/':
                    result = num / num2;
                    break;

            }
        }


    }

