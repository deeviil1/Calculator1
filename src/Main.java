import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        int num ;

        int num2 ;

        int result;

        char oper;

        Scanner sc = new Scanner(System.in);
        String string = sc.next();
        String[] str = string.split("/, *, -, +");
        if (string.contains("*")) {
            oper = '*';
        }
           else if (string.contains("/")){
               oper = '/';

            }
           else if (string.contains("-")) {
               oper ='-';
        } else if (string.contains("+")) {
               oper = '+';

        }


        }

        public void action(int num, int num2, int result, char oper){

        switch(oper){
            case '+':
                result = num + num2;
                break;
            case'-':
                result = num - num2;
                break;
            case '*':
                result = num * num2;
                break;
            case '/':
                result = num/num2;
                break;

        }
        }


    }
