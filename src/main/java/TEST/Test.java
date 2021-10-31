package TEST;
import BEAN.*;
import DAO.VHojaPedidos;
import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        Ubigeo ubigeo1 = new Ubigeo(10001, "Selva", "Amazonas", "Chachapoyas", "Distrito 1");
        Ubigeo ubigeo2 = new Ubigeo(10002, "Sierra", "Apurimac", "Apurimac", "Distrito 2");
        Ubigeo ubigeo3 = new Ubigeo(10003, "Costa", "Callao", "Callao", "Distrito 3");
        
        Cliente c1 = new Cliente(1, "Ramos", "German", "75960925", "M", ubigeo1, "La molina 123");
        Cliente c2 = new Cliente(2, "Lopez", "Porky", "255460925", "M", ubigeo2, "La paz 54");
        Cliente c3 = new Cliente(3, "Fujimori", "Keiko", "14960925", "F", ubigeo3, "Av Larco 464");
        Cliente c4 = new Cliente(4, "Santos", "Veronica", "55960925", "F", ubigeo1, "La villa 123");
        Cliente c5 = new Cliente(5, "Cerron", "Pedro", "26546095", "M", ubigeo2, "Av republica ");
        Cliente c6 = new Cliente(6, "Castillo", "Peter", "16320925", "M", ubigeo3, "Av Canada");
        
        
        Empleado e1 = new Empleado(101,"Gómez","Brenda","24567481");
        Empleado e2 = new Empleado(102,"Santiago","Enzo","94567211");
        Empleado e3 = new Empleado(103,"Quiñonez","Ariana","66567411");
        
        Producto p1 = new Producto(1, "Leche gloria", "Bebidas");
        Producto p2 = new Producto(2, "Gaseosa Inka Cola", "Bebidas");
        Producto p3 = new Producto(3, "Agua Cielo", "Bebidas");
        
        Producto p4 = new Producto(4, "Pollo", "Comida");
        Producto p5 = new Producto(5, "Pescado", "Comida");
        Producto p6 = new Producto(6, "Pizza", "Comida");
        
        HojaPedido hp1 = new HojaPedido(1, e1, c1, p1, 5);
        HojaPedido hp2 = new HojaPedido(2, e2, c2, p2, 7);
        HojaPedido hp3 = new HojaPedido(3, e3, c3, p3, 50);
        HojaPedido hp4 = new HojaPedido(4, e3, c4, p4, 20); 
        HojaPedido hp5 = new HojaPedido(5, e2, c5, p5, 3);
        HojaPedido hp6 = new HojaPedido(6, e1, c6, p6, 2);

        VHojaPedidos vhp = new VHojaPedidos();
        vhp.regPed(hp1);
        vhp.regPed(hp2);
        vhp.regPed(hp3);
        vhp.regPed(hp4);
        vhp.regPed(hp5);
        vhp.regPed(hp6);
        
        vhp.reprelClieUbi("Distrito 3");
        int cantMax = vhp.maxVentaInt("Comida");
        System.out.println("Cantidad Maxima Comida : " + cantMax);
       
        cantMax = vhp.maxVentaInt("Bebidas");
        System.out.println("Cantidad Maxima Bebidas : " + cantMax);
        
        
        vhp.repProdCat("Comida");
        
        vhp.maxVenta("Bebidas");
        vhp.maxVenta("Comida");

    }
}
