package com.example.school.service.claseeroom.impl;


import com.example.school.bean.Depart;
import com.example.school.mapper.DepartMapper;
import com.example.school.service.claseeroom.DepartService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class DepartServiceImpl implements DepartService {
  @Resource
  private DepartMapper departMapper;
  
  @Override
  public List<Depart> selectAll() {
    System.out.println(departMapper.selectAll());
    return departMapper.selectAll();
  }
}