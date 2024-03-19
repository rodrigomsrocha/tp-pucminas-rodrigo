public class Is {
  public static boolean compararStr(String str1, String str2) {
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

  public static boolean contVogal(char i) {
    char[] vogais = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};

    for (char c : vogais) {
      if(c == i) {
        return true;
      }
    }

    return false;
  }

  public static boolean contNum(char i) {
    char[] nums = {'0','1','2','3','4','5','6','7','8','9'};

    for (char c : nums) {
      if(c == i) {
        return true;
      }
    }

    return false;
  }

  public static boolean somenteVogal(String str) {
    for (int i = 0; i < str.length(); i++) {
      if (!contVogal(str.charAt(i))) {
        return false;
      }
    }
    return true;
  }

  public static boolean somenteConsoante(String str) {
    for (int i = 0; i < str.length(); i++) {
      if (contVogal(str.charAt(i)) || contNum(str.charAt(i))) {
        return false;
      }
    }
    return true;
  }

  public static boolean eInteiro(String str) {
    for (int i = 0; i < str.length(); i++) {
      if (!contNum(str.charAt(i))) {
        return false;
      }
    }
    return true;
  }

  public static boolean eReal(String str) {
    int ponto = 0;

    for (int i = 0; i < str.length(); i++) {
      if(str.charAt(i) == '.' || str.charAt(i) == ',') {
        ponto++;
      }
      if (!contNum(str.charAt(i)) && ponto != 1) {
        return false;
      }
    }
    return true;
  }

  public static void main(String[] args) {
    String str;
    str = MyIO.readLine();
    while (!compararStr(str, "FIM")) {
      if (somenteVogal(str)) {
        System.out.print("SIM ");
      } else {
        System.out.print("NAO ");
      }

      if (somenteConsoante(str)) {
        System.out.print("SIM ");
      } else {
        System.out.print("NAO ");
      }

      if (eInteiro(str)) {
        System.out.print("SIM ");
      } else {
        System.out.print("NAO ");
      }

      if (eReal(str)) {
        System.out.print("SIM");
      } else {
        System.out.print("NAO");
      }
      
      System.out.print("\n");

      str = MyIO.readLine();
    }
  }
}
