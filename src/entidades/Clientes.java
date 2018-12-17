
package entidades;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Clientes {

private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    
    private String nome ;
    private String email;
    private Date data_nas;

    public Clientes() {
    }

    
    public Clientes(String nome, String email, Date data_nas) {
        this.nome = nome;
        this.email = email;
        this.data_nas = data_nas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getData_nas() {
        return data_nas;
    }

    public void setData_nas(Date data_nas) {
        this.data_nas = data_nas;
    }

    @Override
    public String toString() {
        return  
                nome 
                + " ("+ sdf.format(data_nas) +")"
                + " - " + email;
                }
    }   
    

