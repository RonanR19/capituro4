package capitulo4;

import javax.swing.JOptionPane;
public class teseMensagem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nome = null;
		nome = JOptionPane.showInputDialog("Qual é o seu nome?");
		JOptionPane.showConfirmDialog(null, "O seu nome é " + nome + "?");
	}

}