package ss2_loop_in_java.exercise2;

public class ShowPrimesLessThan100 {
    public static void main(String[] args) {
        boolean check = true;
        for (int N=2;N<100;N++) {
            for (int i=2;i<=Math.sqrt(N);i++) {
                if (N % i == 0) {
                    check = false;
                    break;
                }
            }
            if (check) {
                System.out.print(N + "\t");
            } else {
                check = true;
            }
        }
    }
}
