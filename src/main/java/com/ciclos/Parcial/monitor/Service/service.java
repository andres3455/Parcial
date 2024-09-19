package com.ciclos.Parcial.monitor.Service;
import com.ciclos.Parcial.monitor.ob;
import com.ciclos.Parcial.Producto.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
@Service
public class service {
    private final Map<String, Product> productos = new HashMap<>();
    private final List<ob> observers = new ArrayList<>();

    public void addObserver(ob observer) {
        observers.add(observer);
    }

    public void agregarProducto(Product producto) {
        productos.put(producto.getNombre(), producto);
        notifyObservers(producto);
    }

    public void modificarStock(String nombre, int nuevaCantidad) {
        Product producto = productos.get(nombre);
        if (producto != null) {
            producto.setCantidad(nuevaCantidad);
            notifyObservers(producto);
        }
    }

    private void notifyObservers(Product producto) {
        for (ob observer : observers) {
            observer.update(producto);
        }
    }

    public Product getProducto(String nombre) {
        return productos.get(nombre);
    }
}
