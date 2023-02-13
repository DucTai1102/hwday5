import java.util.Scanner;

public class bai20 {
    public static void main(String[] args) {
        int n = NhapSo("Nhap so luong phan tu cua mang: ");
        int[] arr = NhapMang(n);
        TimMax(arr, n);
    }

    public static int[] NhapMang(int n) {
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = NhapSo("Nhap phan tu thu " + (i + 1) + ": ");
        }
        return arr;
    }

    public static void XuatMang(int[] arr, int n) {
        System.out.print("[");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]);
            if (i != n - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    public static int NhapSo(String ThongDiep) {
        System.out.print(ThongDiep);
        return new Scanner(System.in).nextInt();
    }

    public static void TimMax(int[] arr, int n) {
        int max = arr[0];
        int index = 0;
        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
                index = i;
            }
        }
        System.out.println("phan tu lon nhat la " + max + " vi tri dau tien tai " + (index + 1));
    }
}
