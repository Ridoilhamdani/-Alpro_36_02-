package ch08;

public class R12_B2_3c{
    void KMPSearch(String pat, String txt){
        int M = pat.length();
        int N = txt.length();

        int[] lps = new int[M];
        int j = 0;
        computeLPSArray(pat, M, lps);

        int i = 0;
        while (i < N) {
            if (pat.charAt(j) == txt.charAt(i)) {
                j++;
                i++;
            }
            if (j == M) {
                System.out.println("Pola "
                        + "di index ke : " + (i - j));
                j = lps[j - 1];
            }
            else if (i < N && pat.charAt(j) != txt.charAt(i)) {
                if (j != 0)
                    j = lps[j - 1];
                else
                    i = i + 1;
            }
        }
    }
    void computeLPSArray(String pat, int M, int[] lps){
        int len = 0;
        int i = 1;
        lps[0] = 0;
        while (i < M) {
            if (pat.charAt(i) == pat.charAt(len)) {
                len++;
                lps[i] = len;
                i++;
            }
            else{
                if (len != 0) {
                    len = lps[len - 1];

                }
                else{
                    lps[i] = len;
                    i++;
                }
            }
        }
    }
    public static void main(String[] args){
        System.out.println(" Program Algoritma Knuth - Morris - Pratt : ");
        System.out.println();
        R12_B2_3c object = new R12_B2_3c();
        String txt = "ABABDABACDABABCABAB";
        String pat = "ABABCABAB";
        object.KMPSearch(pat, txt);
    }
}