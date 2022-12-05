import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       int n;
       Scanner scan = new Scanner(System.in);
        System.out.print("Basamak sayısını giriniz:");
        n = scan.nextInt();

        for(int i=1;i<=n;i++){
            for(int k=1;k<=(n-i);k++){
                System.out.print(" ");
            }
            for(int j=1;j<=(2*i)-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int b=(n-1);b>=1;b--){
            for(int c=1;c<=(n-b);c++){
                System.out.print(" ");
            }
            for(int h=(2*b)-1;h>=1;h--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
