package com.itdr.pojo;

public class ProductDetail {
    private Integer id;

    private Integer productid;

    private Integer merchantid;

    private String productplace;

    private String productname;

    private String brandname;

    private String productweight;

    private String specification;

    private String productdetailpicture;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getProductid() {
        return productid;
    }

    public void setProductid(Integer productid) {
        this.productid = productid;
    }

    public Integer getMerchantid() {
        return merchantid;
    }

    public void setMerchantid(Integer merchantid) {
        this.merchantid = merchantid;
    }

    public String getProductplace() {
        return productplace;
    }

    public void setProductplace(String productplace) {
        this.productplace = productplace == null ? null : productplace.trim();
    }

    public String getProductname() {
        return productname;
    }

    public void setProductname(String productname) {
        this.productname = productname == null ? null : productname.trim();
    }

    public String getBrandname() {
        return brandname;
    }

    public void setBrandname(String brandname) {
        this.brandname = brandname == null ? null : brandname.trim();
    }

    public String getProductweight() {
        return productweight;
    }

    public void setProductweight(String productweight) {
        this.productweight = productweight == null ? null : productweight.trim();
    }

    public String getSpecification() {
        return specification;
    }

    public void setSpecification(String specification) {
        this.specification = specification == null ? null : specification.trim();
    }

    public String getProductdetailpicture() {
        return productdetailpicture;
    }

    public void setProductdetailpicture(String productdetailpicture) {
        this.productdetailpicture = productdetailpicture == null ? null : productdetailpicture.trim();
    }
}