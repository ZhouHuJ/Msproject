package com.itdr.pojo;

import java.util.Date;

public class Orders {
    private Integer id;

    private Integer productid;

    private Integer payamount;

    private Integer userid;

    private Integer merchantid;

    private Date createtime;

    private Date paytime;

    private Integer paystatus;

    private String receivingaddress;

    private Integer receivingphone;

    private String receivingname;

    private String tradeserialnumble;

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

    public Integer getPayamount() {
        return payamount;
    }

    public void setPayamount(Integer payamount) {
        this.payamount = payamount;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Integer getMerchantid() {
        return merchantid;
    }

    public void setMerchantid(Integer merchantid) {
        this.merchantid = merchantid;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Date getPaytime() {
        return paytime;
    }

    public void setPaytime(Date paytime) {
        this.paytime = paytime;
    }

    public Integer getPaystatus() {
        return paystatus;
    }

    public void setPaystatus(Integer paystatus) {
        this.paystatus = paystatus;
    }

    public String getReceivingaddress() {
        return receivingaddress;
    }

    public void setReceivingaddress(String receivingaddress) {
        this.receivingaddress = receivingaddress == null ? null : receivingaddress.trim();
    }

    public Integer getReceivingphone() {
        return receivingphone;
    }

    public void setReceivingphone(Integer receivingphone) {
        this.receivingphone = receivingphone;
    }

    public String getReceivingname() {
        return receivingname;
    }

    public void setReceivingname(String receivingname) {
        this.receivingname = receivingname == null ? null : receivingname.trim();
    }

    public String getTradeserialnumble() {
        return tradeserialnumble;
    }

    public void setTradeserialnumble(String tradeserialnumble) {
        this.tradeserialnumble = tradeserialnumble == null ? null : tradeserialnumble.trim();
    }
}