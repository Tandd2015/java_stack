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
@RequestMapping("/categories")
public class CategoryController {
	
	private final CategoryService categoryService;
	private final ProductService productService;
	
	public CategoryController(CategoryService categoryService, ProductService productService) {
		this.categoryService = categoryService;
		this.productService = productService;
	}
	
	@GetMapping("/new")
	public String displayNewCategoryFormPage(@ModelAttribute("category") CategoryModel categoryModel) {
		return "Category/NewCategory.jsp";
	}
	
	@PostMapping("/new")
	public String submitNewCategoryFormPage(@Valid @ModelAttribute("category") CategoryModel categoryModel, BindingResult result) {
		if(result.hasErrors()) {
			return "Category/NewCategory.jsp";
		} else {
			categoryService.createOneCategory(categoryModel);
			return "redirect:/";
		}
	}
	
	@GetMapping("/{id}")
	public String displayCategoryProductAdd(@PathVariable("id") Long id,@ModelAttribute("category") CategoryModel categoryModel, @ModelAttribute("connection") CPConnectionModel cpconnectionModel, Model model) {
		CategoryModel selectedCategory = categoryService.getOneCategory(id);
		model.addAttribute("category", selectedCategory);
		List<ProductModel> unSelectedProducts = productService.findProductsNotInCategory(selectedCategory);
		model.addAttribute("choiceProducts", unSelectedProducts);
		return "Category/ShowCategory.jsp";
	}
	
}
