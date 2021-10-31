/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BEAN;

/**
 *
 * @author leo59
 */
public class HojaPedido {
    private int idPedido;
    private Empleado emp;
    private Cliente clie;
    private Producto prod;
    private int cant;

    public HojaPedido() {
    }

    public HojaPedido(int idPedido, Empleado emp, Cliente clie, Producto prod, int cant) {
        this.idPedido = idPedido;
        this.emp = emp;
        this.clie = clie;
        this.prod = prod;
        this.cant = cant;
    }

    public int getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

    public Empleado getEmp() {
        return emp;
    }

    public void setEmp(Empleado emp) {
        this.emp = emp;
    }

    public Cliente getClie() {
        return clie;
    }

    public void setClie(Cliente clie) {
        this.clie = clie;
    }

    public Producto getProd() {
        return prod;
    }

    public void setProd(Producto prod) {
        this.prod = prod;
    }

    public int getCant() {
        return cant;
    }

    public void setCant(int cant) {
        this.cant = cant;
    }

    @Override
    public String toString() {
        return "HojaPedido{" + "idPedido=" + idPedido + ", emp=" + emp + ", clie=" + clie + ", prod=" + prod + ", cant=" + cant + '}';
    }
    
    
    
}
