import java.util.Scanner;

public class bai11 {
    public static void main(String[] args) {
        int m = NhapSo("nhap so hang: ");
        int n = NhapSo("nhap so cot: ");
        int[][] arr = NhapMang(m, n);
        int[][] arrChuyenVi = ChuyenVi(arr, n, m);
        System.out.println("-------- mang ban dau-----------");
        XuatMang(arr, m, n);
        System.out.println("-------- mang chuyen vi-----------");
        XuatMang(arrChuyenVi, n, m);
    }

    public static int[][] NhapMang(int m, int n) {
        int[][] arr = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = NhapSo("nhap arr[" + i + "][" + j + "] = ");
            }
        }
        return arr;
    }

    public static void XuatMang(int[][] arr, int m, int n) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("%6d", arr[i][j]);
            }
            System.out.println();
        }
    }

    public static int NhapSo(String ThongDiep) {
        System.out.print(ThongDiep);
        return new Scanner(System.in).nextInt();
    }

    public static int[][] ChuyenVi(int[][] arr, int n, int m) {
        int[][] arrChuyenVi = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arrChuyenVi[i][j] = arr[j][i];
            }
        }
        return arrChuyenVi;
    }
}
