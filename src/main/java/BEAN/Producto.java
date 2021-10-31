package BEAN;

public class Producto {
      private int codProd;
      private String describ;
      private String cate;

    public Producto() {
    }

    public Producto(int codProd, String describ, String cate) {
        this.codProd = codProd;
        this.describ = describ;
        this.cate = cate;
    }

    public int getCodProd() {
        return codProd;
    }

    public void setCodProd(int codProd) {
        this.codProd = codProd;
    }

    public String getDescrib() {
        return describ;
    }

    public void setDescrib(String describ) {
        this.describ = describ;
    }

    public String getCate() {
        return cate;
    }

    public void setCate(String cate) {
        this.cate = cate;
    }

    @Override
    public String toString() {
        return "Producto{" + "codProd=" + codProd + ", describ=" + describ + ", cate=" + cate + '}';
    }
      
}
