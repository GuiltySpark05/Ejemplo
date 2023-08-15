package ejemplo;
    
    public class Camion extends Vehiculo{

    public Camion(String patente, String marca, double cantCombustible) {
        super(patente, marca, cantCombustible);
    }

    @Override
    public void avanzar(double km) {
        //Por cada 100 km consume 15 lts
        double consumo=km*15/100;
        if(getCantCombustible()>=consumo){
        
            setCantCombustible(getCantCombustible()-consumo);
        }
    }
    
}

