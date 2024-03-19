#include <stdio.h>
#include <string.h>
#include <stdlib.h>

int ePalindromo(char palavra[]) {
  int conta = 0, i = 0;
  while(palavra[i] != '\0') {
    conta++;
    i++;
  }

  i = 0;

  for(int i = 0; i < conta / 2; i++) {
    if (palavra[i] != palavra[conta - i - 1]) {
      return 0;
    }
  }

  return 1;
}

int main(void) {
  char palavra[300];
  scanf(" %[^\n]", palavra);

  while(strcmp(palavra, "FIM") != 0) {
    if(ePalindromo(palavra)) {
      printf("SIM\n");
    } else {
      printf("NAO\n");
    }
    getchar();
    scanf(" %[^\n]", palavra);
  }
  return 0;
}
