package com.ciclos.Parcial.monitor.observar;

import com.ciclos.Parcial.Producto.Product;
import com.ciclos.Parcial.monitor.ob;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class Agenteadv implements ob {
    private static final Logger logger = LoggerFactory.getLogger(Agenteadv.class);

    @Override
    public void update(Product product) {
        if (product.getCantidad() < 5) {
            logger.info("ALERTA!!! El stock del Producto: {} es muy bajo, solo quedan {} unidades", product.getNombre(), product.getCantidad());
        }
    }
}
