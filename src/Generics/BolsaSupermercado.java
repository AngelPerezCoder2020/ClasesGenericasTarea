package Generics;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BolsaSupermercado<T> implements Iterable<T> {
    private List<T> productos;

    public BolsaSupermercado(){
        this.productos = new ArrayList<>();
    }
    public BolsaSupermercado<T> AddProducto(T t){
        if(productos.size()<5){
            this.productos.add(t);
        }else {
            System.out.println("La bolsa se encuentra llena, usted no puede meter mas elementos acá");
        }
        return this;
    }
    public List<T> getProductos(){
        return this.productos;
    }

    @Override
    public Iterator<T> iterator() {
        return productos.iterator();
    }
}