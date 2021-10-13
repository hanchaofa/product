package com.kgc.pojo;

public class Qualities {
    private Integer id;
    private Integer score;
    private String qualityDesc;
    private Integer productId;
    private String bname;

    public String getBname() {
        return bname;
    }

    public void setBname(String bname) {
        this.bname = bname;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public String getQualityDesc() {
        return qualityDesc;
    }

    public void setQualityDesc(String qualityDesc) {
        this.qualityDesc = qualityDesc;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }
}
