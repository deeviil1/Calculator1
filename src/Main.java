import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Integer res = null;

        Scanner sc = new Scanner(System.in);

        while (true) {
            String string = sc.nextLine();
            if (string.equals("End")) {

                System.out.println("ПРиложение закончило свою работу");
                break;
            }


            String[] str = string.split(" ");


            if (str[1].equals("+")) {
                res = Integer.parseInt(str[0]) + Integer.parseInt(str[2]);
            }
            if (str[1].equals("-")) {
                res = Integer.parseInt(str[0]) - Integer.parseInt(str[2]);
            }
            if (str[1].equals("*")) {
                res = Integer.parseInt(str[0]) * Integer.parseInt(str[2]);
            }
            if (str[1].equals("/")) {
                res = Integer.parseInt(str[0]) / Integer.parseInt(str[2]);
            }

            System.out.println(res);


        }






        }



    }







