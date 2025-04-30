package controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import model.category;
import services.CategoryService;

@RestController
public class CategoryController {
	
	@Autowired
	private CategoryService categoryService;
	
	@GetMapping("/api/public/categories")
	public List<category> getAllCategories(){
		
		
		return categoryService.getAllCategories();
	}
	
	@PostMapping("/api/admin/category")
	public String createCategory(@RequestBody category itemCategory  ) {
		
		return categoryService.createCategory(itemCategory);
		
		
	}
	
	@DeleteMapping("/api/admin/categories/{categoryId}")
	public ResponseEntity<String> deleteCategory(@PathVariable long categoryId ) {
		
		try {
			

		String status=categoryService.deleteCategory(categoryId);
		return new ResponseEntity<>(status,HttpStatus.OK);
		
	}
		catch(ResponseStatusException e) {
			return new ResponseEntity<String>(e.getReason(),e.getStatusCode());
		}
	
	

}
	@PutMapping("/api/admin/categories/{categoriesId}")
	public ResponseEntity<String> updateCategory(category Category,@PathVariable Long categoryId ){
		try {
			String saveCategory= CategoryService.updateCategory(Category, categoryId);
		return new ResponseEntity<String>("Updated the category with category",categoryId,HttpStatus.OK);
		}
catch(ResponseStatusException e) {
	return new ResponseEntity<>(e.getReason(),e.getStatusCode());
}
	}
}
