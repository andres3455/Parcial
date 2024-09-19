package com.ciclos.Parcial.monitor;

import com.ciclos.Parcial.monitor.observar.*;
import com.ciclos.Parcial.monitor.Service.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class ParcialApplication {

	@Autowired
	public ParcialApplication(service productoService, Agente agenteLog, Agenteadv agenteAdvertencia) {
		productoService.addObserver(agenteLog);
		productoService.addObserver(agenteAdvertencia);
	}

	public static void main(String[] args) {
		SpringApplication.run(ParcialApplication.class, args);
	}
}
