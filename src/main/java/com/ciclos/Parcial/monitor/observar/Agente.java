package com.ciclos.Parcial.monitor.observar;

import com.ciclos.Parcial.Producto.Product;
import com.ciclos.Parcial.monitor.ob;
import org.slf4j.ILoggerFactory.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class Agente implements ob {
    private static final Logger logger = LoggerFactory.getLooger(Agente.class);
    @Override
    public void update(Product producto) {
        if (producto.getCantidad() < 5) {
            logger.warning("ALERTA!!! El stock del Producto: {} es muy bajo, solo quedan {} unidades");
        }
    }


}
