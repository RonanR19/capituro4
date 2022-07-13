package capitulo4;
import java.util.Scanner;

public class ClasseScaner {
  public static void main(String[] args) {
    int i = 0;
    Scanner sc = new Scanner(System.in);
    System.out.print("Digite um texto:");
    while(sc.hasNext()){
      i++;
      System.out.println(sc.next());
    }
    sc.close(); //Encerra o programa
  }
}