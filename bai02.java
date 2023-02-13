public class bai02 {
    public static void main(String[] args) {
        for (int i = 6000000; i < 1000000000; i++) {
            if (KtSNT(i) && ChuSoSNT(i) && NghicDaoSNT(i)) {
                System.out.println(i);
            }
        }
    }
    public static boolean KtSNT(int n) {
        if (n <= 1) {
            return false;
        }
        int x = (int) Math.sqrt(n);
        for (int i = 2; i <= x; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static boolean ChuSoSNT(int n) {
        while (n != 0) {
            int du = n % 10;
            if ((du != 2) && (du != 3) && (du != 5) && (du != 7)) {
                return false;
            }
            n /= 10;
        }
        return true;
    }
    public static boolean NghicDaoSNT(int n) {
        int nNghich = 0;
        while (n != 0) {
            nNghich = nNghich * 10 + n % 10;
            n /= 10;
        }
        if (KtSNT(nNghich)) {
            return true;
        }
        return false;
    }
}
