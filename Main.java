// Clase principal
public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Juan");
        Tienda tienda = new Tienda("Tienda Online");
        Producto producto = new Producto("Laptop", 1500.0);

        cliente.comprarProducto(tienda, producto);
    }
}

// Clase Cliente
class Cliente {
    private String nombre;

    public Cliente(String nombre) {
        this.nombre = nombre;
    }

    public void comprarProducto(Tienda tienda, Producto producto) {
        System.out.println(nombre + " quiere comprar " + producto.getNombre());
        tienda.venderProducto(producto);
    }
}

// Clase Tienda
class Tienda {
    private String nombre;

    public Tienda(String nombre) {
        this.nombre = nombre;
    }

    public void venderProducto(Producto producto) {
        System.out.println("La " + nombre + " está vendiendo el producto " + producto.getNombre());
    }
}

// Clase Producto
class Producto {
    private String nombre;
    private double precio;

    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }
}
