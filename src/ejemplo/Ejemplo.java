
package ejemplo;

public class Ejemplo {

   
    public static void main(String[] args) {
        Vehiculo v=new Moto("xx","fiat",10);
        v.avanzar(100);
        System.out.println("quedo "+v.getCantCombustible());
        
    }
    
}
