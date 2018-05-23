package view;

import controller.ClienteJpaDAO;
import model.Cliente;

public class App
{
    public static void main( String[] args )
    {
    	 Cliente cliente = new Cliente();
         cliente.setCpf("100.100.100-10");
         cliente.setId(1);
         cliente.setNome("Rafael Lopes");
         cliente.setRg("50.100.300-0");
         ClienteJpaDAO.getInstance().merge(cliente);
         System.out.println("Cadastro Realizado");
    }
}