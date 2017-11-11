package za.co.ahmedtikiwa.apps.spree.data;

import java.util.List;

public class ProductBrand {

    private Integer id;
    private String name;
    private List<String> keywords = null;
    private String type_code;
    private String type_value;
    private String exclusive_brand;
    private String url;
    private String vanity_uri;
    private String description;
    private String desktop_image;
    private String mobile_image;
    private String app_image;
    private String app_logo;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getKeywords() {
        return keywords;
    }

    public void setKeywords(List<String> keywords) {
        this.keywords = keywords;
    }

    public String getTypeCode() {
        return type_code;
    }

    public void setTypeCode(String typeCode) {
        this.type_code = typeCode;
    }

    public String getTypeValue() {
        return type_value;
    }

    public void setTypeValue(String typeValue) {
        this.type_value = typeValue;
    }

    public String getExclusiveBrand() {
        return exclusive_brand;
    }

    public void setExclusiveBrand(String exclusiveBrand) {
        this.exclusive_brand = exclusiveBrand;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getVanityUri() {
        return vanity_uri;
    }

    public void setVanityUri(String vanityUri) {
        this.vanity_uri = vanityUri;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDesktopImage() {
        return desktop_image;
    }

    public void setDesktopImage(String desktopImage) {
        this.desktop_image = desktopImage;
    }

    public String getMobileImage() {
        return mobile_image;
    }

    public void setMobileImage(String mobileImage) {
        this.mobile_image = mobileImage;
    }

    public String getAppImage() {
        return app_image;
    }

    public void setAppImage(String appImage) {
        this.app_image = appImage;
    }

    public String getAppLogo() {
        return app_logo;
    }

    public void setAppLogo(String appLogo) {
        this.app_logo = appLogo;
    }
}