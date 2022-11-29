package com.example.zxcpractice.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.zxcpractice.commin.PO.UserPO;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper extends BaseMapper<UserPO> {
}

