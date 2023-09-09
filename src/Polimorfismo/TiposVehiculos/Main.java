package Polimorfismo.TiposVehiculos;


import Polimorfismo.TiposVehiculos.Vehiculo;
import Polimorfismo.TiposVehiculos.VehiculoPanel;

public class Main {
    public static void main(String[] args) {

        Vehiculo vehiculo[] = new Vehiculo[2];
        vehiculo[0]= new Vehiculo("BLT933","NISSAN","2011");
        vehiculo[1]= new VehiculoPanel("BCP216","TOYOTA","2004","20 quintales");

    for(Vehiculo vehiculos : vehiculo){
        System.out.println(vehiculos.mostrarDatos());
    }

    //Vehiculo vehiculo = new Vehiculo("BLT933","NISSAN","2011");
       // Vehiculo vehiculo = new VehiculoPanel("BLT933","NISSAN","2011","20 quintales");
        //System.out.println(vehiculo.mostrarDatos());

    }
}