package exercise.exercise_0528;

//末尾0的个数
/*
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n>1000){
            n = 999;
        }
        System.out.println(solution(n,3));
    }
    private static int solution(int n,int m){
        if(n <= 0|| m<=0){
            return -1;
        }
        int d = 0;
        for(int i=2;i<=n;i++){
            d = (d+m)%i;
        }
        return d;
    }
}*/

//打印正方形
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String C = sc.next();
        if(n < 1 || C.length() != 1){
            return;
        }
        for(int i=0; i<n; i++){
            System.out.print(C);
        }
        System.out.println();
        for(int j=0; j<n/2-2; j++){
            System.out.print(C);
            for(int k=0; k<n-2; k++){
                System.out.print(" ");
            }
            System.out.print(C);
            System.out.println();
        }
        if(n > 1){
            for(int i=0; i<n; i++){
                System.out.print(C);
            }
        }
    }
}