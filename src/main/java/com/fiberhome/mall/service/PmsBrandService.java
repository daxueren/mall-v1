package com.fiberhome.mall.service;

import com.fiberhome.mall.mbg.model.PmsBrand;

import java.util.List;

/**
 * @author: YHCHENG X6811
 * @date: 2022/8/24 20:21
 * @description: PmsBrandService
 **/
public interface PmsBrandService {
    List<PmsBrand> listAllBrand();

    int createBrand(PmsBrand brand);

    int updateBrand(Long id, PmsBrand brand);

    int deleteBrand(Long id);

    List<PmsBrand> listBrand(int pageNum, int pageSize);

    PmsBrand getBrand(Long id);
}
