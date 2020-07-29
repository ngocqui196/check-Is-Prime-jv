import java.util.Scanner;

public class checkIsPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập số cần kiểm tra!");
        int num = sc.nextInt();
        boolean check = true;
        int i = 2;
        if (num >=2){
            while (i <= Math.sqrt(num)){
                if (num % i == 0){
                    check = false;
                    break;
                }
                i++;
            }
        }else {
            check = false;
        }

        if (check){
            System.out.printf("%d Là số nguyên tố",num);
        }else{
            System.out.printf("%d ko phải là số nguyên tố",num);
        }
    }
}
