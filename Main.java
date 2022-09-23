import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    //receber 4 numeros e fazer a som//
    Scanner ler = new Scanner (System.in);
    int num, som=0, i=1;
    System.out.print("Esse é um sistama que soma 4 numeros inteiros.\n\n");
      do{
        System.out.print("Informe o "+i+"º numero inteiro: ");
        num=ler.nextInt();
        som+=num;
        i++ ;    
      }
      while(i!=5);
    System.out.print("\n\nA soma dos numeros digitados é: "+som);    
  }
}
