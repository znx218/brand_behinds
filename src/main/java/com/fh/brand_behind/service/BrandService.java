package com.fh.brand_behind.service;

import com.fh.brand_behind.entity.po.Brand;
import com.fh.brand_behind.entity.vo.BrandParams;

import java.util.Map;

public interface BrandService {
    Map queryBrandByPage(BrandParams vo);

    void addBrand(Brand br);

    void updateBrand(Brand br);
}
