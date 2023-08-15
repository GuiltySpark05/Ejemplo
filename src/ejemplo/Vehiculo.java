
package ejemplo;

public abstract class Vehiculo {
    
    private String patente;
    private String marca;
    private double cantCombustible;

    public Vehiculo(String patente, String marca, double cantCombustible) {
        this.patente = patente;
        this.marca = marca;
        this.cantCombustible = cantCombustible;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getCantCombustible() {
        return cantCombustible;
    }

    public void setCantCombustible(double cantCombustible) {
        this.cantCombustible = cantCombustible;
    }
    
    public abstract void avanzar(double km);             
}
