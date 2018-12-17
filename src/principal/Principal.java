package principal;

import entidades.Clientes;
import entidades.ItemPedido;
import entidades.OrdemStatus;
import entidades.Pedido;
import entidades.Produto;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) throws ParseException {
        
        Scanner sc;
        sc = new Scanner(System.in);
        
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        
        System.out.println("Entre com os dados do cliente");
        System.out.print("Nome: ");
        String nome = sc.nextLine();
        System.out.print("Email: ");
        String email = sc.nextLine();
        System.out.println("Data de aniversario: (DD/MM/YYYY)");
        Date data_nas = sdf.parse(sc.next());
        
        Clientes cliente = new Clientes(nome, email, data_nas);
        
        System.out.println("Entre com os dados do pedido: ");
        System.out.println("Status: ");       
        OrdemStatus status =  OrdemStatus.valueOf(sc.next());
        
        Pedido pedido = new Pedido(new Date(), status, cliente);
              
        System.out.println("Quantos itens para este pedido? ");
        Integer qtd = sc.nextInt();
                    
        for (int i=1; i<= qtd;i++){
            System.out.println("Digite os dados do pedido #" + i);
            sc.nextLine();
            System.out.print("Nome: ");
            String nome_prod = sc.nextLine();
            System.out.println("Preço do produto: ");
            Double preco = sc.nextDouble();
            Produto produto = new Produto(nome_prod, preco);
            System.out.println("Quantidade: ");
            Integer qtd_prod = sc.nextInt();
            ItemPedido itemPedido = new ItemPedido(qtd_prod, preco, produto);
            pedido.addItem(itemPedido);
        }
        
        System.out.println();
		System.out.println("ORDER SUMMARY: ");
                System.out.println(pedido);                
		sc.close();
    }    
}
