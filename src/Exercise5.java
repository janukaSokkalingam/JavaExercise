public class Exercise5 {
    public static void main(String[] args) {
        int N=2;
        int P=5;
        int ans=1;
        for (int i=1; i<=P; i++){
            ans*=N;
        }
        System.out.println(ans);
    }

}
