package com.kgc.service.impl;

import com.kgc.mapper.ProductsMapper;
import com.kgc.pojo.Products;
import com.kgc.service.ProductsService;
import com.kgc.util.PageUtil;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class ProductsServiceImpl implements ProductsService {
    @Resource
    ProductsMapper productsMapper;
    @Override
    public PageUtil<Products> getFoPage(String productName, Integer pageIndex, Integer pageSize) {
        PageUtil<Products> pageUtil=new PageUtil<>();
        pageUtil.setPageSize(pageSize);
        pageUtil.setTotalCount(productsMapper.getCount(productName));
        pageUtil.setPageIndex(pageIndex);
        pageUtil.setList(productsMapper.getAll(productName,(pageIndex-1)*pageSize,pageSize));
        return pageUtil;
    }

    @Override
    public int addProducts(Products products) {
        return productsMapper.addProducts(products);
    }

    @Override
    public int getMax() {
        return productsMapper.getMax();
    }

    @Override
    public Products selectFor(int id) {
        return productsMapper.selectFor(id);
    }

    @Override
    public Integer getToUpdate(Products products) {
        return productsMapper.getToUpdate(products);
    }
}
