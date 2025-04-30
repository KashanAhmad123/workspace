package services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import model.category;

@Service
public class CategoryServiceImpl implements CategoryService {

	private List<category> categories = new ArrayList<>();
	private Long nextId=(long) 1;
	
	@Override
	public String createCategory(category itemCategory) {
		category category = new category();
		category.setCategoryId(nextId++);
		categories.add(itemCategory);
		return "Category Created successfully";
	}

	@Override
	public List<category> getAllCategories() {
		
		return categories;
	}

	@Override
	public String deleteCategory(long categoryId) {
		
		category Category=categories.stream().filter(c->c.getCategoryId()==categoryId).findFirst().orElseThrow(()-> new ResponseStatusException(HttpStatus.NOT_FOUND,"Resource Not Found"+categoryId));
		if(Category==null) {
			return "Category NotFound";
		}
		
		categories.remove(Category);
		return "Category Deleted" +categoryId;
	}

	@Override
	public category updateCategory(category Category, Long categoryId) {
		Optional<category> optionalCategory=categories.stream().filter(c->c.getCategoryId()==categoryId).findFirst();
		if(optionalCategory.isPresent()) {
			category existingCategory= optionalCategory.get();
			existingCategory.setCategoryName(Category.getCategoryName());
		return existingCategory;
		}
		else{
			
		}
		throw new ResponseStatusException(HttpStatus.NOT_FOUND,"Category Not Found");
	}
	
	
	
	

}
