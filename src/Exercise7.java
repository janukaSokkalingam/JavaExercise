public class Exercise7 {
    public static void main(String[] args) {


        String someString = "elephant";

        int count = 0;

        for (int i = 0; i < someString.length(); i++) {
            if (someString.charAt(i) =='e') {
                count++;
            }
        }
        System.out.println("Char 'e' occurred "+count+" times in the string");
    }
}
