package com.codingdojo.productsandcategories.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.codingdojo.productsandcategories.Services.CategoryService;
import com.codingdojo.productsandcategories.Services.ProductService;

@Controller
public class DashboardController {
	private CategoryService categoryService;
	private ProductService productService;
	
	public DashboardController(CategoryService categoryService, ProductService productService) {
		this.categoryService = categoryService;
		this.productService = productService;
	}
	@GetMapping("/")
	public String displayDashboardPage(Model model) {
		model.addAttribute("categories", categoryService.findAllCategories());
		model.addAttribute("products", productService.findAllProducts());
		return "Dashboard/ShowDashboard.jsp";
	}
}
