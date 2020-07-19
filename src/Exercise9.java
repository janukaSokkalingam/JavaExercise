
import java.util.Arrays;

public class Exercise9{
    public static void main(String[] args) {

        String[] str= {"WelCome","Uki"};
        int i=0;
        int j=str.length - 1;

        while(i <= j){
            String temp= str[i];
            str[i] = str[j];
            str[j] = temp;
            i++;
            j--;
            System.out.print(Arrays.toString(str));
        }
    }
}


