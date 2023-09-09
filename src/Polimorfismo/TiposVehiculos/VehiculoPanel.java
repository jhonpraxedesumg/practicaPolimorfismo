package Polimorfismo.TiposVehiculos;

public class VehiculoPanel extends Vehiculo{
    private String carga;

    public VehiculoPanel(String placa, String marca, String modelo, String carga) {
        super(placa, marca, modelo);
        this.carga = carga;
    }

    public String getCarga() {
        return carga;
    }
    @Override
    public String mostrarDatos(){
        return "\n PLACA  :"+ placa +" \n MARCA :"+marca+"\n MODELO  :"+ modelo+ " \n CARGA  :"+carga;
    }
}
