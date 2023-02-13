import java.util.Scanner;

public class bai01{
    public static void main(String[] args) {
        for (int i = 6000000; i < 1000000000; i++) {
            if (SoThuanNghich(i) && SoChiChua068(i) && TongCSChiaHetCho10(i)) {
                System.out.println(i);
            }
        }
    }

    public static boolean SoThuanNghich(int n) {
        int temp = n, nNghich = 0;
        while (temp != 0) {
            nNghich = nNghich * 10 + temp % 10;
            temp /= 10;
        }
        if (n == nNghich) {
            return true;
        }
        return false;
    }

    public static boolean SoChiChua068(int n) {
        while (n != 0) {
            int du = n % 10;
            if ((du != 0) && (du != 6) && (du != 8)) {
                return false;
            }
            n /= 10;
        }
        return true;
    }

    public static boolean TongCSChiaHetCho10(int n) {
        int sum = 0;
        while (n != 0) {
            sum += n % 10;
            n /= 10;
        }
        if (sum % 10 == 0) {
            return true;
        }
        return false;
    }
}

