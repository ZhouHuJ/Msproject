package com.itdr.pojo;

import java.util.Date;

public class Products {
    private Integer id;

    private Integer productid;

    private String producttitle;

    private String productpicture;

    private Integer miaoshaprice;

    private Integer originalprice;

    private Integer merchantid;

    private Date applydate;

    private Date auditdate;

    private Integer auditstatus;//1代表为审核，2代表审核通过，3代表审核失败

    private Date starttime;

    private Date endtime;

    private String starttimestring;

    private String endtimestring;

    private Integer productcount;

    private Integer stockcount;

    private String description;

    public String getStarttimestring() {
        return starttimestring;
    }

    public void setStarttimestring(String starttimestring) {
        this.starttimestring = starttimestring;
    }

    public String getEndtimestring() {
        return endtimestring;
    }

    public void setEndtimestring(String endtimestring) {
        this.endtimestring = endtimestring;
    }
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

    public String getProducttitle() {
        return producttitle;
    }

    public void setProducttitle(String producttitle) {
        this.producttitle = producttitle == null ? null : producttitle.trim();
    }

    public String getProductpicture() {
        return productpicture;
    }

    public void setProductpicture(String productpicture) {
        this.productpicture = productpicture == null ? null : productpicture.trim();
    }

    public Integer getMiaoshaprice() {
        return miaoshaprice;
    }

    public void setMiaoshaprice(Integer miaoshaprice) {
        this.miaoshaprice = miaoshaprice;
    }

    public Integer getOriginalprice() {
        return originalprice;
    }

    public void setOriginalprice(Integer originalprice) {
        this.originalprice = originalprice;
    }

    public Integer getMerchantid() {
        return merchantid;
    }

    public void setMerchantid(Integer merchantid) {
        this.merchantid = merchantid;
    }

    public Date getApplydate() {
        return applydate;
    }

    public void setApplydate(Date applydate) {
        this.applydate = applydate;
    }

    public Date getAuditdate() {
        return auditdate;
    }

    public void setAuditdate(Date auditdate) {
        this.auditdate = auditdate;
    }

    public Integer getAuditstatus() {
        return auditstatus;
    }

    public void setAuditstatus(Integer auditstatus) {
        this.auditstatus = auditstatus;
    }

    public Date getStarttime() {
        return starttime;
    }

    public void setStarttime(Date starttime) {
        this.starttime = starttime;
    }

    public Date getEndtime() {
        return endtime;
    }

    public void setEndtime(Date endtime) {
        this.endtime = endtime;
    }

    public Integer getProductcount() {
        return productcount;
    }

    public void setProductcount(Integer productcount) {
        this.productcount = productcount;
    }

    public Integer getStockcount() {
        return stockcount;
    }

    public void setStockcount(Integer stockcount) {
        this.stockcount = stockcount;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }
}