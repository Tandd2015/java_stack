package com.codingdojo.productsandcategories.Controllers;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;

import com.codingdojo.productsandcategories.Models.CPConnectionModel;
import com.codingdojo.productsandcategories.Services.CPConnectionService;
import com.codingdojo.productsandcategories.Services.CategoryService;
import com.codingdojo.productsandcategories.Services.ProductService;

@Controller
public class CPConnectionController {
	private final CPConnectionService cpconnectionService;
	private final CategoryService categoryService;
	private final ProductService productService;
	
	public CPConnectionController(CPConnectionService cpconnectionService,
									CategoryService categoryService,
									ProductService productService) {
		this.cpconnectionService = cpconnectionService;
		this.categoryService = categoryService;
		this.productService = productService;
	}
	
	@PostMapping("/categories/connection")
	public String CreateConnection(@Valid CPConnectionModel cpconnectionModel, BindingResult result) {
		if(result.hasErrors()) {
			return "/Categories"+ cpconnectionModel.getProductModel().getId();
		} else {
			cpconnectionService.createCPConnectionModel(cpconnectionModel);
			return "redirect:/";
		}
	}
	
	@PostMapping("/products/connection")
	public String CreateAnewConnection(@Valid CPConnectionModel cpconnectionModel, BindingResult result) {
		if(result.hasErrors()) {
			return "/Products" + cpconnectionModel.getCategoryModel().getId();
		} else {
			cpconnectionService.createCPConnectionModel(cpconnectionModel);
			return "redirect:/";
		}
	}
}



//@PostMapping("/associations/{kind}")
//public String Create(@Valid @ModelAttribute("association") Association association,
//		BindingResult result,
//		@PathVariable("kind") String kind) {
//	if(result.hasErrors())
//		return String.format("/%s/show.jsp", kind);
//	appService.createAssociation(association);
//	return "redirect:/";
//}