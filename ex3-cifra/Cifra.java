import java.util.Scanner;

public class Cifra {
  public static Scanner sc = new Scanner(System.in);
  public static boolean compareStrings(String str1, String str2) {
    if(str1.length() != str2.length()) {
      return false;
    }

    for (int i = 0; i < str1.length(); i++) {
      if(str1.charAt(i) != str2.charAt(i)) {
        return false;
      }
    }

    return true;
  }

  public static String encrypt(String str) {
    String newStr = "";
    for (int i = 0; i < str.length(); i++) {
      if((int)str.charAt(i) > 0 && (int)str.charAt(i) < 256) {
        newStr += (char)(str.charAt(i) + 3);
      } else {
        newStr += str.charAt(i);
      }
    }

    return newStr;
  }
  public static void main(String[] args) {
    String word;
    word = sc.nextLine();
    while (!compareStrings(word, "FIM")) {
      System.out.println(encrypt(word));
      word = sc.nextLine();
    }
  }  
}
