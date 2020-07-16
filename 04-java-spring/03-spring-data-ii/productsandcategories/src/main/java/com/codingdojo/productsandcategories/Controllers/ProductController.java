package com.codingdojo.productsandcategories.Controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.codingdojo.productsandcategories.Models.CPConnectionModel;
import com.codingdojo.productsandcategories.Models.CategoryModel;
import com.codingdojo.productsandcategories.Models.ProductModel;
import com.codingdojo.productsandcategories.Services.CategoryService;
import com.codingdojo.productsandcategories.Services.ProductService;

@Controller
@RequestMapping("/products")
public class ProductController {
	
	private final ProductService productService;
	private final CategoryService categoryService;
	
	public ProductController(ProductService productService, CategoryService categoryService) {
		this.productService = productService;
		this.categoryService = categoryService;
	}
	
	@GetMapping("/new")
	public String displayNewProductFormPage(@ModelAttribute("product") ProductModel productModel) {
		return "Product/NewProduct.jsp";
	}
	
	@PostMapping("/new")
	public String submitNewProductFormPage(@Valid @ModelAttribute("product") ProductModel productModel, BindingResult result) {
		if(result.hasErrors()) {
			return "Product/NewProduct.jsp";
		}
		productService.createOneProduct(productModel);
		return "redirect:/";
	}
	
	@GetMapping("/{id}")
	public String displayProductCategoryAdd(@PathVariable("id") Long id, @ModelAttribute("product") ProductModel productModel, @ModelAttribute("connection") CPConnectionModel cpconnectionModel,Model model) {
		ProductModel selectedProduct = productService.getOneProduct(id);
		model.addAttribute("product", selectedProduct);
		List<CategoryModel> unSelectedCategories = categoryService.findCategoriesNotInProduct(selectedProduct);
		model.addAttribute("choiceCategories", unSelectedCategories);
		return "Product/ShowProduct.jsp";
	}
}
