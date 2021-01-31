import java.util.Scanner;
public class px {
    public static void bublle(int[] a) {
        int t;
        for (int i = 0; i <= a.length - 1; i++) {
            for (int j = 0; j <= a.length - 2 - i; j++) {
                if (a[j] > a[j + 1]) {
                    t = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = t;
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入需排序的数字个数：");
        int n = scan.nextInt();
        int[] num = new int[100];
        for (int i = 0; i < 100; i++) {
            num[i] = -10000;
        }
        System.out.println("请输入数字：");
        for (int i = 0; i <= n - 1; i++) {
            num[i] = scan.nextInt();
        }
        bublle(num);
        System.out.println("排序后的结果：");
        for (int i = 0; i <= num.length - 1; i++) {
            if (num[i] > -10000) {
                System.out.print(num[i] + " ");
            }
        }
            System.out.println("\n请输入需要添加元素的个数:");
            int m = scan.nextInt();
            System.out.println("请输入数字：");
            for (int i = 0; i <= m - 1; i++) {
                num[i] = scan.nextInt();
            }
            bublle(num);
            System.out.println("合并后的结果：");
            for (int i = 0; i <= num.length - 1; i++) {
                if(num[i] > -10000)
                System.out.print(num[i] + " ");
            }
        }
    }