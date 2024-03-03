import java.util.*;

public class Palindromo {
  public static boolean compareStrings(String palavra1, String palavra2) {
    if(palavra1.length() != palavra2.length()) {
      return false;
    }

    for (int i = 0; i < palavra1.length() - 1; i++) {
      if(palavra1.charAt(i) != palavra2.charAt(i)) {
        return false;
      }
    }

    return true;
  };

  public static boolean checarPalavra(String palavra) {
    for (int i = 0; i < palavra.length() / 2; i++) {
      if(palavra.charAt(i) != palavra.charAt(palavra.length() - i - 1)) {
        return false;
      }
    }

    return true;
  };

  public static void main(String[] args) {
    MyIO.setCharset("UTF-8");
    String palavra;
    boolean ePalindromo;
    palavra = MyIO.readLine();

    while (!compareStrings(palavra, "FIM")) {
      ePalindromo = checarPalavra(palavra);

      if (ePalindromo) {
        System.out.println("SIM");
      } else {
        System.out.println("NAO");
      }

      palavra = MyIO.readLine();
    }
  };
}

