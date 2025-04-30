package model;

public class category {
	
	private long categoryId;
	private String categoryName;
	public long getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(long categoryId) {
		this.categoryId = categoryId;
	}
	public String getCategoryName() {
		return categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	@Override
	public String toString() {
		return "category [categoryId=" + categoryId + ", categoryName=" + categoryName + ", getCategoryId()="
				+ getCategoryId() + ", getCategoryName()=" + getCategoryName() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	

}
