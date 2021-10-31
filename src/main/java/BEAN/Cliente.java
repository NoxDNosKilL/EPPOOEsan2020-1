package BEAN;

public class Cliente {
    private int idClie;
    private String apell;
    private String nomb;
    private String dni;
    private String genero;
    private Ubigeo ubigeo;
    private String direccion;

    public Cliente() {
    }

    public Cliente(int idClie, String apell, String nomb, String dni, String genero, Ubigeo ubigeo, String direccion) {
        this.idClie = idClie;
        this.apell = apell;
        this.nomb = nomb;
        this.dni = dni;
        this.genero = genero;
        this.ubigeo = ubigeo;
        this.direccion = direccion;
    }

    public int getIdClie() {
        return idClie;
    }

    public void setIdClie(int idClie) {
        this.idClie = idClie;
    }

    public String getApell() {
        return apell;
    }

    public void setApell(String apell) {
        this.apell = apell;
    }

    public String getNomb() {
        return nomb;
    }

    public void setNomb(String nomb) {
        this.nomb = nomb;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Ubigeo getUbigeo() {
        return ubigeo;
    }

    public void setUbigeo(Ubigeo ubigeo) {
        this.ubigeo = ubigeo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Cliente{" + "idClie=" + idClie + ", apell=" + apell + ", nomb=" + nomb + ", dni=" + dni + ", genero=" + genero + ", ubigeo=" + ubigeo + ", direccion=" + direccion + '}';
    }
    
    
}
