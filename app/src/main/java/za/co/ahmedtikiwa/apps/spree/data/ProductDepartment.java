package za.co.ahmedtikiwa.apps.spree.data;

public class ProductDepartment {

    private Integer category_id;
    private String category_name;

    public Integer getCategoryId() {
        return category_id;
    }

    public void setCategoryId(Integer categoryId) {
        this.category_id = categoryId;
    }

    public String getCategoryName() {
        return category_name;
    }

    public void setCategoryName(String categoryName) {
        this.category_name = categoryName;
    }
}