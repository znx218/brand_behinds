package com.fh.brand_behind.dao;

import com.fh.brand_behind.entity.po.Brand;
import com.fh.brand_behind.entity.vo.BrandParams;

import java.util.List;

public interface BrandDao {
    Long queryCount(BrandParams vo);

    List<Brand> queryBrand(BrandParams vo);

    void addBrand(Brand br);


    void updateBrand(Brand br);
}
