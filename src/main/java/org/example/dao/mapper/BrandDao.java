package org.example.dao.mapper;

import org.apache.ibatis.annotations.Select;
import org.example.domain.Brand;

import java.util.List;


public interface BrandDao {
  @Select("select * from tb_brand")
  List<Brand> selectAll();

}
