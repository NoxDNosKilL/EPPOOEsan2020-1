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
public class Ubigeo {
    private int idUbigeo;
    private String region;
    private String depto;
    private String prov;
    private String dist;  

    public Ubigeo() {
    }

    public Ubigeo(int idUbigeo, String region, String depto, String prov, String dist) {
        this.idUbigeo = idUbigeo;
        this.region = region;
        this.depto = depto;
        this.prov = prov;
        this.dist = dist;
    }

    public int getIdUbigeo() {
        return idUbigeo;
    }

    public void setIdUbigeo(int idUbigeo) {
        this.idUbigeo = idUbigeo;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getDepto() {
        return depto;
    }

    public void setDepto(String depto) {
        this.depto = depto;
    }

    public String getProv() {
        return prov;
    }

    public void setProv(String prov) {
        this.prov = prov;
    }

    public String getDist() {
        return dist;
    }

    public void setDist(String dist) {
        this.dist = dist;
    }

    @Override
    public String toString() {
        return "Ubigeo{" + "idUbigeo=" + idUbigeo + ", region=" + region + ", depto=" + depto + ", prov=" + prov + ", dist=" + dist + '}';
    }
    
    
    
}
