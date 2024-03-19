import java.util.*;

class Cifra {
    public static Scanner sc = new Scanner(System.in);
    public static boolean compareStrings(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }

        for (int i = 0; i < str1.length(); i++) {
            if(str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }

        return true;
    }

    public static String encrypt(String s, int i) {
        String resp = "";
        if (i == s.length()) {
            resp += "";
        } else {
            if((int)s.charAt(i) > 0 && (int)s.charAt(i) < 256) {
                resp += (char)(s.charAt(i) + 3) + encrypt(s, i + 1);
            } else {
                resp += s.charAt(i) + encrypt(s, i+1);
            }
        }
        return resp;
    }

    public static void main(String[] args) {
        String word, encryptWord;

        word = sc.nextLine();

        while (!compareStrings(word, "FIM")) {
            encryptWord = encrypt(word, 0);
            System.out.println(encryptWord);
            word = sc.nextLine();
        }
    }
}

