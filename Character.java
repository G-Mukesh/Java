import java.util.Scanner;

 class Character {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char ch;
        int upper = 0;
        int lower = 0;
        int number = 0;

        System.out.println("Enter characters (type '*' to stop):");

        while (true) {
            ch = s.nextLine();

            if (ch == '*') {
                break; 
            }

            if (Character.isUpperCase(ch)) {
                upper++;
            } else if (Character.isLowerCase(ch)) {
                lower++;
            } else if (Character.isDigit(ch)) {
                number++;
            }
        }

        System.out.println("Uppercase letters: " + upper);
        System.out.println("Lowercase letters: " + lower);
        System.out.println("Numbers: " + number);

        
    }
}