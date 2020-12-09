package Ejemplo;
import java.util.HashMap;
// La clase encargada de generar objetos a partir de los prototipos
public class FactoriaPrototipo {
    private HashMap mapaObjetos;
    private String nombrePorDefecto;

    public FactoriaPrototipo() {
        mapaObjetos = new HashMap();
        // Se incluyen en el mapa todos los productos prototipo
        mapaObjetos.put("producto 1", new UnProducto(1));
    }

    public Object create() {
        return create(nombrePorDefecto);
    }

    public Object create(String nombre) {
        nombrePorDefecto = nombre;
        Producto objeto = (Producto)mapaObjetos.get(nombre);
        return objeto != null ? objeto.clone() : null;
    }
}

