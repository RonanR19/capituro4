package capitulo4;
import javax.swing.JOptionPane ;
import javax.swing.JOptionPane;
import java.io.PrintStream;
 

public class ChamaUsuario {

	public static void main(String[] args) {
		
		PrintStream imprime = System.out;
			Usuario u1 = new Usuario();
			u1.nome ="Ronan";
			u1.sobrenome =new String("Rodrigues");
			u1.telefone = new Fones();
			u1.telefone.residencial = "333333333";
			u1.telefone.comercial = "44444444";
			u1.telefone.celular = "5555555";
			
			String st = "Nome: "+u1.nome+ " "+ u1.sobrenome + " tel residencial : "+ u1.telefone.residencial+ " tel comercial : " 
			+u1.telefone.comercial + " tel residencial : "+ u1.telefone.celular ;
			imprime.println(st);
			JOptionPane.showMessageDialog(null,st,"teste",1);
			System.exit(0);
					
	}

}
