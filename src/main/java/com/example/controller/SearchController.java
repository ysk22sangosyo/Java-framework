package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.controller.form.ProductService;
import com.example.controller.form.SearchForm;
import com.example.demo.entity.Product;

@Controller
public class SearchController {

	@Autowired
	ProductService productService;

	@RequestMapping("/top")
	public String index(@ModelAttribute("product") SearchForm form, Model model) {
		
		return "top";
	}

	@RequestMapping(value = "search", method = RequestMethod.POST)
	public String search(@ModelAttribute("product") SearchForm form, Model model) {
		Product product = productService.findByProductId(form.getProductId());
		    
		if (product == null) {
			model.addAttribute("error", "対象のデータはありません");
			return "top";
		} else {
			model.addAttribute("product", product);
			return "searchResult";
		}
	}
}
