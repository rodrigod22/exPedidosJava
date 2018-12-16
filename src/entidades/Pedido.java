package entidades;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Pedido {
    
    private Date momento;
    private List <OrdemStatus> status = new ArrayList<>() ;

    public Pedido() {
    }
    
    public Pedido(Date momento) {
        this.momento = momento;
    }

    public Date getMomento() {
        return momento;
    }

    public void setMomento(Date momento) {
        this.momento = momento;
    }

    public List<OrdemStatus> getStatus() {
        return status;
    }
    
    public void addItem(OrdemStatus status){
        this.status.add(status);
    }
     public void removeItem(OrdemStatus status){
        this.status.remove(status);
    }
    
    public Double total(){
        return 0.0;
    }
      
}
