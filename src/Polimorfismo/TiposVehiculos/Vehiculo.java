package Polimorfismo.TiposVehiculos;

public class Vehiculo {
    private String placa;
    private String marca;
    private String modelo;

    public Vehiculo(String placa, String marca, String modelo) {
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String mostrarDatos(){
        return "\n PLACA  :"+ placa +" \n MARCA :"+marca+"\n MODELO  :"+ modelo;
    }
}
