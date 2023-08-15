
package ejemplo;


public class Auto extends Vehiculo{

    public Auto(String patente, String marca, double cantCombustible) {
        super(patente, marca, cantCombustible);
    }

    @Override
    public void avanzar(double km) {
        //Por cada 100 km consume 10 lts
        double consumo=km*10/100;
        if(getCantCombustible()>=consumo){
        
            setCantCombustible(getCantCombustible()-consumo);
        }
    }
    
}
