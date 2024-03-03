import java.util.Random;

public class Alternar {
  public static boolean compareStrings(String str1, String str2) {
    if (str1.length() != str1.length()) {
      return false;
    }

    for(int i = 0; i < str1.length(); i++) {
      if(str1.charAt(i) != str2.charAt(i)) {
        return false;
      }
    }

    return true;
  }

  public static String trocarLetras(String str, char letra1, char letra2) {
    String strTrocada = "";
    for (int i = 0; i < str.length(); i++) {
      if(str.charAt(i) == letra1) {
        strTrocada += letra2;
      } else {
        strTrocada += str.charAt(i);
      }
    }
    
    return strTrocada;
  }

  public static void main(String[] args) {
    MyIO.setCharset("UTF-8");
    Random gerador = new Random();
    gerador.setSeed(4);

    String str;
    str = MyIO.readLine();

    while (!compareStrings(str, "FIM")) {
      char rand1 = (char)('a' + (Math.abs(gerador.nextInt()) % 26));
      char rand2 = (char)('a' + (Math.abs(gerador.nextInt()) % 26));

      str = trocarLetras(str, rand1, rand2);

      System.out.println(str);
      str = MyIO.readLine();
    }
  }
}
