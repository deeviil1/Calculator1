import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Integer res = null;


        Scanner sc = new Scanner(System.in);


        while (true) {
            String string = sc.nextLine();
            if (string.equals("End")) {
                System.out.println("Приложение закончило работу");

            }

            try {
                String[] str = string.split(" ");

                check(str);


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


            } catch (Exception e) {
                System.out.println(e.getMessage());


            }
        }
    }


    public static void check(String[] strings) throws Exception {

        if (strings.length != 3) {
            throw new Exception("невнрная длинна выражения");
        }
       if (!"+-*/".equals(strings )){
          throw new Exception("не верный символ");
      }

       if (!"12345678910".equals(strings)) {
          throw new Exception("не являеться числом");
        }


    }
}











