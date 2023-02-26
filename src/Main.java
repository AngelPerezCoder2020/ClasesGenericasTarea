import Clases.*;
import Generics.BolsaSupermercado;
public class Main {
    public static void main(String[] args) {
        BolsaSupermercado<Lacteo> lacteos = new BolsaSupermercado<>();
        BolsaSupermercado<Limpieza> limpieza = new BolsaSupermercado<>();
        BolsaSupermercado<NoPerecible> noperecible = new BolsaSupermercado<>();
        BolsaSupermercado<Fruta> fruta = new BolsaSupermercado<>();

        lacteos.AddProducto(new Lacteo("lacteo1",12.0,12,1))
                .AddProducto(new Lacteo("lacteo2",12.0,12,1))
                .AddProducto(new Lacteo("lacteo3",12.0,12,1))
                .AddProducto(new Lacteo("lacteo4",12.0,12,1))
                .AddProducto(new Lacteo("lacteo5",12.0,12,1));

        limpieza.AddProducto(new Limpieza("limpieza1",12.0,12,"ci"))
                .AddProducto(new Limpieza("limpieza2",12.0,12,"ci"))
                .AddProducto(new Limpieza("limpieza3",12.0,12,"ci"))
                .AddProducto(new Limpieza("limpieza4",12.0,12,"ci"))
                .AddProducto(new Limpieza("limpieza5",12.0,12,"ci"));

        noperecible.AddProducto(new NoPerecible("NoPerecible1",12.0,12,1))
                .AddProducto(new NoPerecible("NoPerecible2",12.0,12,1))
                .AddProducto(new NoPerecible("NoPerecible3",12.0,12,1))
                .AddProducto(new NoPerecible("NoPerecible4",12.0,12,1))
                .AddProducto(new NoPerecible("NoPerecible5",12.0,12,1));

        fruta.AddProducto(new Fruta("Fruta1",12.0,12,"verde"))
                .AddProducto(new Fruta("Fruta2",12.0,12,"verde"))
                .AddProducto(new Fruta("Fruta3",12.0,12,"verde"))
                .AddProducto(new Fruta("Fruta4",12.0,12,"verde"))
                .AddProducto(new Fruta("Fruta5",12.0,12,"verde"));

        for(Lacteo l:lacteos){
            System.out.println(
                    "Nombre: " + l.getNombre() +
                            " Precio: " + l.getPrecio() +
                            " Cantidad: " + l.getCantidad() +
                            " Proteinas: " + l.getProteinas() + " \n"
            );
        }
        for(Fruta l:fruta){
            System.out.println(
                    "Nombre: " + l.getNombre() +
                            " Precio: " + l.getPrecio() +
                            " Color: " + l.getColor() +
                            " Peso: " + l.getPeso() + " \n"
            );
        }
        for(Limpieza l:limpieza){
            System.out.println(
                    "Nombre: " + l.getNombre() +
                            " Precio: " + l.getPrecio() +
                            " Litros: " + l.getLitros() +
                            " Componentes: " + l.getComponentes() + " \n"
            );
        }
        for(NoPerecible l:noperecible){
            System.out.println(
                    "Nombre: " + l.getNombre() +
                            " Precio: " + l.getPrecio() +
                            " Calorias: " + l.getCalorias() +
                            " Contenido: " + l.getContenido() + " \n"
            );
        }
    }
}