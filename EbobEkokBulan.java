import java.util.Scanner;
public class EbobEkokBulan {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("n1 sayısını giriniz: ");
        int n1 = input.nextInt();

        System.out.print("n2 sayısını giriniz: ");
        int n2 = input.nextInt();
        int k = n1;
        int ebob = 1;
        while (k >= 1){
            if(n1 % k == 0 && n2 % k == 0){
                ebob=k;
                break;
            }
            k--;
        }
        int i=1;
            while (i <= (n1 * n2)) {
                if (i % n1 == 0 && i % n2 == 0) {
                    System.out.println(i);
                    break;
                }
                i++;

            }
            System.out.println((n1 * n2)/ ebob);

        /*
        int ebob=1;

        if(n1 <= n2){
            int a=1;
            int k=n1;
            while(a <= n1){
                if(n1%a==0 && n2%a==0){
                    System.out.println(a);
                    ebob = a;

                }
                a++;
            }
            System.out.println("------------------");
            while (k >= 1){
                if(n1 % k == 0 && n2 % k == 0){
                    ebob=k;
                    System.out.println(ebob);
                    break;
                }
                k--;
            }
        }else {
        int a=1;
            int k=n2;
            while(a <= n2){
                if(n1%a==0 && n2%a==0){
                    System.out.println(a);
                    ebob = a;

                }
                a++;
            }
            System.out.println("------------------");
            while (k >= 1){
                if(n1 % k == 0 && n2 % k == 0){
                    ebob=k;
                    System.out.println(ebob);
                    break;
                }
                k--;

        }

         */


    }
}
