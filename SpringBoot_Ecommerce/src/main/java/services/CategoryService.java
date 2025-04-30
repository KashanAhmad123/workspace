package services;

import java.util.List;

import model.category;

public interface CategoryService {

	String createCategory(category itemCategory);
	
	 List<category> getAllCategories();

	String deleteCategory(long categoryId);
	 
	 String updateCategory(category Category,Long categoryId);

}
