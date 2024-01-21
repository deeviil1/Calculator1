import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Integer res = null;
        boolean isRoman = false;
        Integer num = null;
        Integer num2 = null;




            Scanner sc = new Scanner(System.in);

            while (true) {
                String string = sc.nextLine();
                if (string.equalsIgnoreCase("End")) {
                    System.out.println("Приложение закончило работу");
                    break;
                }

                try {

                    String[] str = string.split(" ");


                    check(str);


                    if (Roman.isRoman(str[0]) && Roman.isRoman(str[2])) {
                        isRoman = true;
                       num = Roman.RomToArabian(str[0]);
                       num2 = Roman.RomToArabian(str[2]);

                    }

                   else if (!Roman.isRoman(str[0]) && !Roman.isRoman(str[2])) {
                        isRoman = false;
                        num = Integer.parseInt(str[0]);
                        num2 = Integer.parseInt(str[2]);

                    }
                    if (num>10 || num2>10){
                        throw new Exception("Число должно быть от 1 до 10");
                    }



                        if (str[1].equals("+")) {
                            res = num + num2;


                        }

                        if (str[1].equals("-")) {
                            res = num - num2;


                        }
                        if (str[1].equals("*")) {
                            res = num * num2;
                        }
                        if (str[1].equals("/")) {
                            res = num / num2;


                        }
                    System.out.println(isRoman ? Roman.ArabianToRoman(res) : res);




                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }


            }
        }



         static void check (String[]strings) throws Exception {

            if (strings.length != 3) {
                throw new Exception("Неверное количество символов");
            }

            if (!"+-*/".contains(strings[1])) {
                throw new Exception("не является арифметическим действием");
            }
            if (strings[2].equals("0")) {
                throw new Exception("Делить на 0 нельзя");

             }
             else{
                 throw new Exception("Числа должны быть в одном формате");
             }





         }

    public class Roman {


        static String[] roman = new String[]{"0", "I", "II", "III", "IV", "V", "VI", "VII", "VII", "IX", "X", "XI",
                "XII", "XIII", "XIV", "XV", "XVI", "XVII", "XVIII", "XIX", "XX", "XXI", "XXII", "XXIII", "XXIV",
                "XXV", "XXVI", "XXVII", "XXVIII", "XXIX", "XXX", "XXXI", "XXXII", "XXXIII", "XXXIV", "XXXV", "XXXVI", "XXXVII",
                "XXXVIII", "XIX", "XL", "XLI", "XLII", "XLIII", "XLIV", "XLV", "XLVI", "XLVII", "XLVIII", "XLVIX", "L", "LI","LII",
                "LIII", "LIV", " LV", "LVI", "LVII", "LVIII", "LIX", "LX", "LXI", "LXII", "LXIII", "LXIV", "LXV", "LXVI", "LXVII",
                "LXVIII", "LXIX", "LXX", "LXXI","LXXII", "LXXIII", "LXXIV", "LXXV", "LXXVI", "LXXVII", "lXXVIII", "LXXIX", "LXXX",
                 "LXXXI", "LXXXII", "LXXXIII", "LXXXIV", "LXXXV", "LXXXVI", "LXXXVII", "LXXXVIII", "LXXXIX", "XC", "XCI", "XCII",
                 "XCIII", "XCIV", "XCV", "XCVI", "XCVII", "XCVIII", "XCVIX", "C"};


         static boolean isRoman(String romans) {
            for (int i = 0; i < roman.length; i++) {
                if (romans.equals(roman[i])) {
                    return true;

                }
            }
            return false;
        }

         static int RomToArabian(String toarabian) {
            for (int i = 0; i < roman.length; i++) {
                if (toarabian.equals(roman[i])) {






                    return i;



                }
            }
            return -1;

        }

        static String ArabianToRoman(int toroman) throws Exception {
             if (toroman<roman.length){
             }
             if (toroman<= 0 ) {
                 throw new Exception("Римское число должно быть больше нуля");
             }

            return roman[toroman];


             }


    }


    }





















