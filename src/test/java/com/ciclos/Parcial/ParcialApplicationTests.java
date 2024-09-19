package com.ciclos.Parcial;
import com.ciclos.Parcial.monitor.ob;
import com.ciclos.Parcial.monitor.Service.service;
import com.ciclos.Parcial.Producto.Product;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;


import static org.junit.jupiter.api.Assertions.assertEquals;


@SpringBootTest
class ParcialApplicationTests {
	private service productoService;
	private  ob observer;

	@Test
	void agregarProducto_notificaObserver() {
		Product producto = new Product("Producto1", 10.0, 10, "Categoria1");

		productoService.agregarProducto(producto);

	}
	@Test
	void getProducto_devuelveProductoCorrecto() {
		Product producto = new Product("Producto1", 10.0, 10, "Categoria1");
		productoService.agregarProducto(producto);

		Product result = productoService.getProducto("Producto1");

		assertEquals(producto, result);
	}

}
