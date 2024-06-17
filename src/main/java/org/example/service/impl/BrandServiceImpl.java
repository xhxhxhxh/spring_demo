package org.example.service.impl;

import org.example.dao.mapper.BrandDao;
import org.example.domain.Brand;
import org.example.service.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BrandServiceImpl implements BrandService {
  @Autowired
  private BrandDao brandDao;

  public List<Brand> selectAll() {
    return brandDao.selectAll();
  }
}
