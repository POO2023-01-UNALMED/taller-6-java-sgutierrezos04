package vehiculos;

import java.util.ArrayList;

public class Pais{
    private String nombre;

    public Pais(String nombre){
        this.nombre=nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public static Pais paisMasVendedor() {
        ArrayList<Pais> paisesFabrica = new ArrayList<Pais>();

        for (Fabricante fabricante : Fabricante.listaFabricantes) {
            paisesFabrica.add(fabricante.getPais());
        }

        int mayor = 0;
        Pais paisMayor = null;
        for (Pais pais : paisesFabrica) {
            int cantidadPais = 0;
            for (int i = 0; i < paisesFabrica.size(); i++) {
                if (pais == paisesFabrica.get(i)){
                    cantidadPais++;
                }
            }
            if (cantidadPais > mayor){
                mayor = cantidadPais;
                paisMayor = pais;
            }
        }

        return paisMayor;
    }
}
