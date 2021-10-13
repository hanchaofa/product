package com.kgc.controller;

import com.alibaba.fastjson.JSON;
import com.kgc.pojo.Products;
import com.kgc.pojo.Qualities;
import com.kgc.service.ProductsService;
import com.kgc.service.impl.ProductsServiceImpl;
import com.kgc.service.impl.QualitiesServiceImpl;
import com.kgc.util.PageUtil;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
public class ProductsController {
    @Resource
    ProductsServiceImpl productsService;
    @Resource
    QualitiesServiceImpl qualitiesService;
    @RequestMapping(value = "/show",produces = "application/json;charset=utf-8")
    public String getSHow(@RequestParam(value = "pageIndex",defaultValue = "1",required = false)Integer pageIndex,
                          String productName, Model model){
        PageUtil<Products> page = productsService.getFoPage(productName, pageIndex, 3);
        model.addAttribute("page",page);
        return "index";
    }
    @RequestMapping("/doadd")
    public String getDoAdd(Products products,Model model){
        int i = productsService.addProducts(products);
        int max = productsService.getMax();
        Qualities qualities=new Qualities();
        qualities.setProductId(max);
        int i1 = qualitiesService.addQualities(qualities);
        if(i>0){
            return "redirect:/show";
        }else{
            return "add";
        }
    }
    @RequestMapping("/toupdate")
    public String toUpdate(Integer id,Model model){
        Qualities id1 = qualitiesService.getById(id);
        model.addAttribute("qu",id1);
        return "update";
    }
    @RequestMapping("/doupdate")
    public String doUpdate(Qualities qualities){
        int i = qualitiesService.updateQualities(qualities);
        if(i>0){
            return "redirect:/show";
        }else{
            return "redirect:";
        }
    }
    @RequestMapping("/toselect")
    public String toSelect(Integer id,Model model){
        Products pro = productsService.selectFor(id);
        model.addAttribute("qu",pro);
        return "select";
    }

    @RequestMapping("/doselect")
    public String doselect(Products products){
        int i = productsService.getToUpdate(products);
        if(i>0){
            return "redirect:/show";
        }else{
            return "redirect:/toselect?id="+products.getId();
        }
    }
}
