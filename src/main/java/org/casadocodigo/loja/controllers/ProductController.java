package org.casadocodigo.loja.controllers;

import org.casadocodigo.loja.daos.ProductDAO;
import org.casadocodigo.loja.models.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProductController {

	@Autowired
	private ProductDAO productDAO;
	
	@RequestMapping("/produtos")
	public String save(Product product) {
		productDAO.save(product);
		return "products/ok";
	}
	
	@RequestMapping("/produtos/form")
	public String form() {
		return "products/form";
	}
}
