package Ejemplo;

// Un ejemplo básico de producto
public class UnProducto implements Producto {
    private int atributo;

    public UnProducto(int atributo) {
        this.atributo = atributo;
    }

    public Object clone() {
        return new UnProducto(this.atributo);
    }

    public String toString() {
        return ((Integer)atributo).toString();
    }
}
