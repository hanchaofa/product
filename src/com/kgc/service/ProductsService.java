package com.kgc.service;

import com.kgc.pojo.Products;
import com.kgc.util.PageUtil;
import org.apache.ibatis.annotations.Param;

public interface ProductsService {
    PageUtil<Products> getFoPage(String productName, Integer pageIndex, Integer pageSize);
    int addProducts(Products products);
    int getMax();
    Products selectFor(int id);
    Integer getToUpdate(Products products);
}
