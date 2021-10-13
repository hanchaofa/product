package com.kgc.mapper;

import com.kgc.pojo.Products;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ProductsMapper {
    List<Products> getAll(@Param("productName")String productName,@Param("pageIndex")Integer pageIndex,@Param("pageSize")Integer pageSize);
    Integer getCount(@Param("productName")String productName);
    int addProducts(Products products);
    int getMax();
    Products selectFor(int id);
    Integer getToUpdate(Products products);
}
