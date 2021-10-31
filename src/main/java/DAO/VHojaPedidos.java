package DAO;

import BEAN.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class VHojaPedidos {
    private List<HojaPedido> pedidos;

    public VHojaPedidos() {
        pedidos = new ArrayList();
    }

    public List<HojaPedido> getPedidos() {
        return pedidos;
    }

    public void setPedidos(List<HojaPedido> pedidos) {
        this.pedidos = pedidos;
    }
    
    public void regPed(HojaPedido hp){
        pedidos.add(hp);
    }
    
    public void reprelClieUbi(String dist){
        System.out.println("Listar Clientes por distrito");
        for(HojaPedido hp : pedidos ){
            if(hp.getClie().getUbigeo().getDist().equals(dist)){
                System.out.println(hp.getClie().toString());
                System.out.println("==================================");
            }
        }
    }
        
    public int maxVentaInt(String cate){
        Vector cantidades;
        cantidades = new Vector();
        int cantidad=0;
        
        for (HojaPedido hp : pedidos) {
            if(hp.getProd().getCate().equals(cate)){
                cantidad = hp.getCant();
                cantidades.add(cantidad);
            }
        }
        
        //cantidades.forEach(System.out::println);
       
        int cantMax= (int)cantidades.get(0);    
        
        for (int i = 1; i < cantidades.size(); i++) {
            if ((int) cantidades.get(i) > cantMax) {
                cantMax = (int) cantidades.get(i);
            }
        }
        
        //System.out.println("Cant Max  " + cate + " : = " +cantMax ); 
       return cantMax;
   
    }  
    
    public void maxVenta(String cate){
        System.out.println("########################");
        System.out.println("Requerimiento: Nombre y apellido del cliente con la mayor venta");
        int cantMax = 0;
        var cliente = new Cliente();
        for (HojaPedido hp : pedidos){
            if(hp.getProd().getCate().equals(cate)){
                if(hp.getCant()>cantMax){
                    cantMax = hp.getCant();
                    cliente = hp.getClie();
                }
            }
        }
        System.out.println("Cliente con más pedidos : " + cliente.getNomb()+" "+ cliente.getApell()+"\n Cant pedidos: " + cantMax );
        System.out.println("########################");
    }
    
    public void repProdCat(String cate){
        System.out.println("########################");
        System.out.println("POR repProdCat");
        for(HojaPedido hp : pedidos){
            if(hp.getProd().getCate().equals(cate)){
                System.out.println("Codigo :" +hp.getProd().getCodProd()+" , nombre = " +hp.getProd().getDescrib());
            }
        }
        System.out.println("########################");
    } 
    
        
    
    
    
}
