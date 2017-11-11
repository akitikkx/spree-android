package za.co.ahmedtikiwa.apps.spree.data;

public class ProductPrice {

    private int regular;
    private int selling;
    private int special_price;
    private int mobicred_price;
    private String special_from_date;
    private String special_to_date;

    public int getRegular() {
        return regular;
    }

    public void setRegular(int regular) {
        this.regular = regular;
    }

    public int getSelling() {
        return selling;
    }

    public void setSelling(int selling) {
        this.selling = selling;
    }

    public int getSpecialPrice() {
        return special_price;
    }

    public void setSpecialPrice(int specialPrice) {
        this.special_price = specialPrice;
    }

    public int getMobicredPrice() {
        return mobicred_price;
    }

    public void setMobicredPrice(int mobicredPrice) {
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
