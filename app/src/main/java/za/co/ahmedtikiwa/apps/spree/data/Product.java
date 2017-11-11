package za.co.ahmedtikiwa.apps.spree.data;

import android.util.AttributeSet;

import java.util.List;

public class Product {

    private Integer entity_id;
    private String sku;
    private Object gtin;
    private String mpn;
    private String title;
    private String detail;
    private String why_buy;
    private String why_buy_plain;
    private String go_live;
    private ProductBrand brand;
    private String exclusive_product;
    private ProductColour colour;
    private ProductPrice price;
    private ProductPaymentInfo payment_info;
    private ProductPics pics;
    private ProductMeasurementImage measurement_image;
    private AttributeSet attribute_set;
    private ProductFilters filters;
    private Integer status;
    private Integer visibility;
    private Integer coming_soon;
    private Integer editors_pick;
    private Integer must_have;
    private Integer is_new;
    private Integer show_size_chart;
    private String detail_url;
    private List<ProductSimple> simples = null;
    private List<Object> up_sells = null;
    private List<Object> wear_withs = null;
    private String gender;
    private List<String> genders = null;
    private ProductDepartment department;
    private List<ProductDepartments> departments = null;
    private List<String> demographic = null;
    private Object ribbon;

    public Integer getEntityId() {
        return entity_id;
    }

    public void setEntityId(Integer entityId) {
        this.entity_id = entityId;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public Object getGtin() {
        return gtin;
    }

    public void setGtin(Object gtin) {
        this.gtin = gtin;
    }

    public String getMpn() {
        return mpn;
    }

    public void setMpn(String mpn) {
        this.mpn = mpn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String getWhyBuy() {
        return why_buy;
    }

    public void setWhyBuy(String whyBuy) {
        this.why_buy = whyBuy;
    }

    public String getWhyBuyPlain() {
        return why_buy_plain;
    }

    public void setWhyBuyPlain(String whyBuyPlain) {
        this.why_buy_plain = whyBuyPlain;
    }

    public String getGoLive() {
        return go_live;
    }

    public void setGoLive(String goLive) {
        this.go_live = goLive;
    }

    public ProductBrand getBrand() {
        return brand;
    }

    public void setBrand(ProductBrand brand) {
        this.brand = brand;
    }

    public String getExclusiveProduct() {
        return exclusive_product;
    }

    public void setExclusiveProduct(String exclusiveProduct) {
        this.exclusive_product = exclusiveProduct;
    }

    public ProductColour getColour() {
        return colour;
    }

    public void setColour(ProductColour colour) {
        this.colour = colour;
    }

    public ProductPrice getPrice() {
        return price;
    }

    public void setPrice(ProductPrice price) {
        this.price = price;
    }

    public ProductPaymentInfo getPaymentInfo() {
        return payment_info;
    }

    public void setPaymentInfo(ProductPaymentInfo paymentInfo) {
        this.payment_info = paymentInfo;
    }

    public ProductPics getPics() {
        return pics;
    }

    public void setPics(ProductPics pics) {
        this.pics = pics;
    }

    public ProductMeasurementImage getMeasurementImage() {
        return measurement_image;
    }

    public void setMeasurementImage(ProductMeasurementImage measurementImage) {
        this.measurement_image = measurementImage;
    }

    public AttributeSet getAttributeSet() {
        return attribute_set;
    }

    public void setAttributeSet(AttributeSet attributeSet) {
        this.attribute_set = attributeSet;
    }

    public ProductFilters getFilters() {
        return filters;
    }

    public void setFilters(ProductFilters filters) {
        this.filters = filters;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getVisibility() {
        return visibility;
    }

    public void setVisibility(Integer visibility) {
        this.visibility = visibility;
    }

    public Integer getComingSoon() {
        return coming_soon;
    }

    public void setComingSoon(Integer comingSoon) {
        this.coming_soon = comingSoon;
    }

    public Integer getEditorsPick() {
        return editors_pick;
    }

    public void setEditorsPick(Integer editorsPick) {
        this.editors_pick = editorsPick;
    }

    public Integer getMustHave() {
        return must_have;
    }

    public void setMustHave(Integer mustHave) {
        this.must_have = mustHave;
    }

    public Integer getIsNew() {
        return is_new;
    }

    public void setIsNew(Integer isNew) {
        this.is_new = isNew;
    }

    public Integer getShowSizeChart() {
        return show_size_chart;
    }

    public void setShowSizeChart(Integer showSizeChart) {
        this.show_size_chart = showSizeChart;
    }

    public String getDetailUrl() {
        return detail_url;
    }

    public void setDetailUrl(String detailUrl) {
        this.detail_url = detailUrl;
    }

    public List<ProductSimple> getSimples() {
        return simples;
    }

    public void setSimples(List<ProductSimple> simples) {
        this.simples = simples;
    }

    public List<Object> getUpSells() {
        return up_sells;
    }

    public void setUpSells(List<Object> upSells) {
        this.up_sells = upSells;
    }

    public List<Object> getWearWiths() {
        return wear_withs;
    }

    public void setWearWiths(List<Object> wearWiths) {
        this.wear_withs = wearWiths;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public List<String> getGenders() {
        return genders;
    }

    public void setGenders(List<String> genders) {
        this.genders = genders;
    }

    public ProductDepartment getDepartment() {
        return department;
    }

    public void setDepartment(ProductDepartment department) {
        this.department = department;
    }

    public List<ProductDepartments> getDepartments() {
        return departments;
    }

    public void setDepartments(List<ProductDepartments> departments) {
        this.departments = departments;
    }

    public List<String> getDemographic() {
        return demographic;
    }

    public void setDemographic(List<String> demographic) {
        this.demographic = demographic;
    }

    public Object getRibbon() {
        return ribbon;
    }

    public void setRibbon(Object ribbon) {
        this.ribbon = ribbon;
    }

}
