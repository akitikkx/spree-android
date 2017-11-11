package za.co.ahmedtikiwa.apps.spree.data;


public class ProductPrice {

    private Integer regular;
    private Integer selling;
    private Integer special_price;
    private Integer mobicred_price;
    private String special_from_date;
    private String special_to_date;

    public Integer getRegular() {
        return regular;
    }

    public void setRegular(Integer regular) {
        this.regular = regular;
    }

    public Integer getSelling() {
        return selling;
    }

    public void setSelling(Integer selling) {
        this.selling = selling;
    }

    public Integer getSpecialPrice() {
        return special_price;
    }

    public void setSpecialPrice(Integer specialPrice) {
        this.special_price = specialPrice;
    }

    public Integer getMobicredPrice() {
        return mobicred_price;
    }

    public void setMobicredPrice(Integer mobicredPrice) {
        this.mobicred_price = mobicredPrice;
    }

    public String getSpecialFromDate() {
        return special_from_date;
    }

    public void setSpecialFromDate(String specialFromDate) {
        this.special_from_date = specialFromDate;
    }

    public String getSpecialToDate() {
        return special_to_date;
    }

    public void setSpecialToDate(String specialToDate) {
        this.special_to_date = specialToDate;
    }

}
