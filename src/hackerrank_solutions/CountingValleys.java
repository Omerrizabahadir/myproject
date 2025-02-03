package hackerrank_solutions;

public class CountingValleys {
    public static int countingValleys(int steps, String path) {
        int level = 0;  // Deniz seviyesindeyiz
        int valley = 0; // Vadi sayacı

        for (int i = 0; i < steps; i++) {
            char ch = path.charAt(i);

            if (ch == 'U') {
                level++; // Yukarı çıkış

                // Eğer deniz seviyesine geri döndüysek (vadiden çıkmışız demektir)
                if (level == 0) {
                    valley++;
                }
            } else {
                level--; // Aşağı iniş
            }
        }
        return valley; // Döngü bittikten sonra sonucu döndürmeliyiz!
    }

    public static void main(String[] args) {
        int step = 8;
        String path = "UDDDUDUU"; // 1 vadi var
        int result = countingValleys(step, path);
        System.out.println(result); // Çıktı: 1
    }
}
