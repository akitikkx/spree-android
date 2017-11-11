package za.co.ahmedtikiwa.apps.spree.data;

public class ProductDepartments {

    private Integer category_id;
    private String category_name;
    private String exclusive_department;

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

    public String getExclusiveDepartment() {
        return exclusive_department;
    }

    public void setExclusiveDepartment(String exclusiveDepartment) {
        this.exclusive_department = exclusiveDepartment;
    }

}