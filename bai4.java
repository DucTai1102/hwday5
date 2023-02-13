import java.util.Scanner;

    public class bai4 {
        public static void main(String[] args) {
            int[] arrs = NhapMang();
            System.out.println("so cap phan tu lien tiep bang nhau la " + DemCapPT(arrs));
        }

        public static int[] NhapMang() {
            System.out.print("nhap so phan tu cua mang: ");
            int n = new Scanner(System.in).nextInt();
            int[] arrs = new int[n];
            for (int i = 0; i < n; i++) {
                System.out.print("nhap phan tu thu " + (i + 1) + ": ");
                arrs[i] = new Scanner(System.in).nextInt();
            }
            return arrs;
        }

        public static int DemCapPT(int[] arrs) {
            int count = 0;
            int n = arrs.length;
            for (int i = 0; i < n - 1; i++) {
                if (arrs[i] == arrs[i + 1]) {
                    count++;
                }
            }
            return count;
        }
}
