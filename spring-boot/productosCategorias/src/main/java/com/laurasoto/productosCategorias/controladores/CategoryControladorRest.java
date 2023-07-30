package com.laurasoto.productosCategorias.controladores;

import org.springframework.data.geo.Point;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.laurasoto.productosCategorias.servicios.CategoryServicio;
import com.laurasoto.productosCategorias.servicios.ProductServicio;

@RestController
@RequestMapping(value="/api")
public class CategoryControladorRest {
    private final CategoryServicio categoryServicio;
    private final ProductServicio productServicio;
	
	public CategoryControladorRest(CategoryServicio categoryServicio, ProductServicio productServicio){
		this.categoryServicio = categoryServicio;
        this.productServicio = productServicio;
	}

    @GetMapping("/new")
    //que es lo que retorna si estoy creando una persona?
    public void creaCategoryRest(){
        
    } 
}
