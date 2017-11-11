package za.co.ahmedtikiwa.apps.spree.data;

import java.util.List;

public class ProductSimple {

    private Integer entity_id;
    private String sku;
    private String size_value;
    private Integer stock_qty;
    private Integer stock_status;
    private String supplier_product_code;
    private String size2_group;
    private Integer size2_order;
    private List<String> size2_id = null;
    private List<String> size2_agg_key = null;

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

    public String getSizeValue() {
        return size_value;
    }

    public void setSizeValue(String sizeValue) {
        this.size_value = sizeValue;
    }

    public Integer getStockQty() {
        return stock_qty;
    }

    public void setStockQty(Integer stockQty) {
        this.stock_qty = stockQty;
    }

    public Integer getStockStatus() {
        return stock_status;
    }

    public void setStockStatus(Integer stockStatus) {
        this.stock_status = stockStatus;
    }

    public String getSupplierProductCode() {
        return supplier_product_code;
    }

    public void setSupplierProductCode(String supplierProductCode) {
        this.supplier_product_code = supplierProductCode;
    }

    public String getSize2Group() {
        return size2_group;
    }

    public void setSize2Group(String size2Group) {
        this.size2_group = size2Group;
    }

    public Integer getSize2Order() {
        return size2_order;
    }

    public void setSize2Order(Integer size2Order) {
        this.size2_order = size2Order;
    }

    public List<String> getSize2Id() {
        return size2_id;
    }

    public void setSize2Id(List<String> size2Id) {
        this.size2_id = size2Id;
    }

    public List<String> getSize2AggKey() {
        return size2_agg_key;
    }

    public void setSize2AggKey(List<String> size2AggKey) {
        this.size2_agg_key = size2AggKey;
    }
}