package za.co.ahmedtikiwa.apps.spree.data;

import java.util.List;

public class ProductPics {

    private String small;
    private String hover;
    private List<String> gallery = null;

    public String getSmall() {
        return small;
    }

    public void setSmall(String small) {
        this.small = small;
    }

    public String getHover() {
        return hover;
    }

    public void setHover(String hover) {
        this.hover = hover;
    }

    public List<String> getGallery() {
        return gallery;
    }

    public void setGallery(List<String> gallery) {
        this.gallery = gallery;
    }

}