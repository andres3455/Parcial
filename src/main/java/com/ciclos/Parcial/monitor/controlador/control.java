package com.ciclos.Parcial.monitor.controlador;


import com.ciclos.Parcial.monitor.Service.service;
import com.ciclos.Parcial.Producto.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
public class control {
    @RestController
    @RequestMapping("/productos")
    public class ProductoController {

        @Autowired
        private service productoService;

        @PostMapping
        public ResponseEntity<String> agregarProducto(@RequestBody Product producto) {
            productoService.agregarProducto(producto);
            return new ResponseEntity<>("Producto agregado exitosamente.", HttpStatus.CREATED);
        }

        @PutMapping("/{nombre}")
        public ResponseEntity<String> modificarStock(@PathVariable String nombre, @RequestParam int cantidad) {
            productoService.modificarStock(nombre, cantidad);
            return new ResponseEntity<>("Stock actualizado exitosamente.", HttpStatus.OK);
        }
    }
}
