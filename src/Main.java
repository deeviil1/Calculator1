import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Integer res = null;

        Scanner sc = new Scanner(System.in);

        while (true) {
        String string = sc.nextLine();
            if (string.equals("End")) {
                System.out.println("Приложение закончило работу");
                break;
            }

            try{

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
            }
         catch (Exception e) {
             System.out.println(e.getMessage());
         }


    }

    }

    public static void check(String[] strings) throws Exception {

        if (strings.length!=3){
            throw new Exception("Неверное количество символов");
        }

        if (!"12345678910".contains(strings[0])){
            throw new Exception("символ не является числом");
        }
        if (!"12345678910".contains(strings[2])) {
            throw new Exception("введен неверный символ");
        }
        if (!"+-*/".contains(strings[1])){
            throw new Exception("не является арифметическим действием");
        }
        if ("0".contains(strings[2])){
            throw new Exception("Делить на 0 нельзя");
        }



    }
}

















