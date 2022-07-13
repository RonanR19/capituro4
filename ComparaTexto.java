package capitulo4;
import java.util.Scanner;
import java.io.PrintStream;

public class ComparaTexto {
  public static void main(String[] args) {
    PrintStream saida = System.out;
    Scanner scan = new Scanner(System.in);
    
    saida.print("\nInforme um texto:\t");
    String t1 = scan.nextLine();
    
    saida.print("Informe outro texto:\t");
    String t2 = scan.nextLine();
    
    saida.println("\nComparações:");
    saida.println("Igualdade (C.S.):\t" + (t1.equals(t2)));
    saida.println("Igualdade:\t\t" + (t1.equalsIgnoreCase(t2)));
    saida.println("Ordem (C.S.):\t\t" + (t1.compareTo(t2)));
    saida.println("Ordem:\t\t\t" + (t1.compareToIgnoreCase(t2)));
    saida.println();
  }
}