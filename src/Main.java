import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        while (true) {
            try {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Введите два римских или арабских числа");
                System.out.println("Для завершения работы программы введите End");
                String string = scanner.nextLine();
                String[] str = string.split(" ");
                if (string.equalsIgnoreCase("End")){
                    System.out.println("Программа завершила работу");
                    break;
                }

                if (str.length !=3 ){
                    throw new Exception("Неверное выражение");

                }
                if (!"+-*/".contains(str[1])){
                    throw new Exception("Неверная операция");
                }



                System.out.println(Calc.calc(str));

            } catch (Exception e) {
                System.out.println(e.getMessage());
                break;
            }
        }
    }

    class Calc {
        static Integer res = null;
        static Integer num = null;
        static Integer num2 = null;
        static boolean isRoman = false;


        public static String calc(String[] strings) throws Exception {
            if (Roman.isRoman(strings[0]) && Roman.isRoman(strings[2])) {
                isRoman = true;
                num = Roman.RomToArabian(strings[0]);
                num2 = Roman.RomToArabian(strings[2]);
                if (num >= 11 || num2 >= 11){
                    throw new Exception("Число должно быть от 1 до 10");
                }

            }

            if (!Roman.isRoman(strings[0]) && !Roman.isRoman(strings[2])) {
                isRoman = false;
                num = Integer.parseInt(strings[0]);
                num2 = Integer.parseInt(strings[2]);
                if (num >= 11 || num2 >= 11){
                    throw new Exception("Число должно быть от 1 до 10");
                }
            }
            if (Roman.isRoman(strings[0]) && !Roman.isRoman(strings[2])) {
                throw new Exception("Числа должно быть в одном формате");
            } else if (!Roman.isRoman(strings[0]) && Roman.isRoman(strings[2])) {
                throw new Exception("Числа должны быть в одном формате");

            }
            if (strings[1].equals("+")) {
                res = num + num2;

            }

            if (strings[1].equals("-")) {
                res = num - num2;

            }
            if (strings[1].equals("*")) {
                res = num * num2;
            }
            if (strings[1].equals("/")) {
                if (num2 == 0){
                    throw new Exception("лдллл");
                }
                if (num % num2 !=0){
                    throw new Exception("1");
                }
                res =num / num2;
            }

            return isRoman ? Roman.ArabianToRoman(res) : String.valueOf(res);
        }

    }



    class Roman {

        static String[] roman = new String[]{"O", "I", "II", "III", "IV", "V", "VI", "VII", "VII", "IX", "X", "XI",
                "XII", "XIII", "XIV", "XV", "XVI", "XVII", "XVIII", "XIX", "XX", "XXI", "XXII", "XXIII", "XXIV",
                "XXV", "XXVI", "XXVII", "XXVIII", "XXIX", "XXX", "XXXI", "XXXII", "XXXIII", "XXXIV", "XXXV", "XXXVI", "XXXVII",
                "XXXVIII", "XIX", "XL", "XLI", "XLII", "XLIII", "XLIV", "XLV", "XLVI", "XLVII", "XLVIII", "XLVIX", "L", "LI", "LII",
                "LIII", "LIV", " LV", "LVI", "LVII", "LVIII", "LIX", "LX", "LXI", "LXII", "LXIII", "LXIV", "LXV", "LXVI", "LXVII",
                "LXVIII", "LXIX", "LXX", "LXXI", "LXXII", "LXXIII", "LXXIV", "LXXV", "LXXVI", "LXXVII", "lXXVIII", "LXXIX", "LXXX",
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
            if (toroman < roman.length) {
            }
            if (toroman <= 0) {
                throw new Exception("Римское число должно быть больше нуля");
            }

            return roman[toroman];

        }


    }


}