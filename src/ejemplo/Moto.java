/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplo;

/**
 *
 * @author Familia
 */
public class Moto extends Vehiculo{

    public Moto(String patente, String marca, double cantCombustible) {
        super(patente, marca, cantCombustible);
    }

    @Override
    public void avanzar(double km) {
        //Por cada 100 km consume 5 lts
        double consumo=km*5/100;
        if(getCantCombustible()>=consumo){
        
            setCantCombustible(getCantCombustible()-consumo);
        }
    
    }}
