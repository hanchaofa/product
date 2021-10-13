package com.kgc.pojo;

public class Products {
    private Integer id;
    private String productDate;
    private String  productName;
    private Integer productSum;
    private String productDesc;
    private float productPrice;
    private int scoreid;

    public int getScoreid() {
        return scoreid;
    }

    public void setScoreid(int scoreid) {
        this.scoreid = scoreid;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProductDate() {
        return productDate;
    }

    public void setProductDate(String productDate) {
        this.productDate = productDate;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Integer getProductSum() {
        return productSum;
    }

    public void setProductSum(Integer productSum) {
        this.productSum = productSum;
    }

    public String getProductDesc() {
        return productDesc;
    }

    public void setProductDesc(String productDesc) {
        this.productDesc = productDesc;
    }

    public float getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(float productPrice) {
        this.productPrice = productPrice;
    }
}
