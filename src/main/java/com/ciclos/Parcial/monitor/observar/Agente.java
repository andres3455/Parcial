package com.ciclos.Parcial.monitor.observar;

import com.ciclos.Parcial.Producto.Product;
import com.ciclos.Parcial.monitor.ob;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class Agente implements ob {
    private static final Logger logger = LoggerFactory.getLogger(Agente.class);

    @Override
    public void update(Product producto) {
            logger.info("Producto: {} -> {} unidades disponibles", producto.getNombre(), producto.getCantidad());
        }
    }
