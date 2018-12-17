package entidades;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Pedido {
    
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    
    private Date momento;
    private OrdemStatus status;
    private Clientes cliente;
    private List<ItemPedido> items = new ArrayList<>();

    public Pedido() {
    }
    
    public Pedido(Date momento, OrdemStatus status, Clientes cliente) {
        this.momento = momento;
        this.status = status;
        this.cliente = cliente;
         
    }

    public Date getMomento() {
        return momento;
    }

    public void setMomento(Date momento) {
        this.momento = momento;
    }

    public OrdemStatus getStatus() {
        return status;
    }
    
    public void addItem(ItemPedido item){
        items.add(item);
    }
     public void removeItem(ItemPedido item){
        items.remove(item);
    }
    
    public Double total(){
        Double soma=0.0;
        for(ItemPedido item : items){
            soma += item.subTotal();
        }        
        return soma;
    }  

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Momento do pedido: ");
        sb.append(sdf.format(momento) + "\n");
        sb.append("Status do pedido: ");
        sb.append(status + "\n");
        sb.append("Cliente: ");
        sb.append(cliente + "\n");
        sb.append("Itens do pedido" + "\n");
        for(ItemPedido item: items){
           sb.append(item + "\n");
        }
        sb.append("Preço Total: ");
        sb.append(String.format("%.2f", total()));
        return sb.toString();        
    }   
}
