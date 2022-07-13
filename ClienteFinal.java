package capitulo4;


public class ClienteFinal {
 
	
		

	public static void main(String[] args) {
      ClienteFinal2 cliente1 = new ClienteFinal2();
      ClienteFinal2 cliente2 = new ClienteFinal2();
      cliente1.Nome = "Ronan";
      cliente1.Email = "ronan.braga@teste.com"	  ;
      cliente1.CreditoAdicional = 500.23;
	
      
      System.out.println("Nome :\t"+cliente1.Nome );
      System.out.println("Email :\t"+cliente1.Email );
      System.out.println("Credito adicional:\tR$ "+cliente1.CreditoAdicional );
      System.out.println("Credito Total:\t R$ "+(cliente1.CreditoBase +cliente1.CreditoAdicional )+"\n\n");
      cliente2 = cliente1;
      cliente1.Nome ="ronan Rodrigues";
      System.out.println("Nome :\t"+cliente2.Nome );
      System.out.println("Email :\t"+cliente2.Email );
      System.out.println("Credito adicional:\tR$ "+cliente2.CreditoAdicional );
      System.out.println("Credito Total:\t R$ "+(cliente2.CreditoBase +cliente2.CreditoAdicional )+"\n");
      
}
}
