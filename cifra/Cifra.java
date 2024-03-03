import java.util.*;

class Cifra {
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
            resp += (char)(s.charAt(i) + 3) + encrypt(s, i + 1);
        }
        return resp;
    }

    public static void main(String[] args) {
        MyIO.setCharset("UTF-8");
        String word, encryptWord;

        word = MyIO.readLine();

        while (!compareStrings(word, "FIM")) {
            encryptWord = encrypt(word, 0);
            System.out.println(encryptWord);
            word = MyIO.readLine();
        }
    }
}

