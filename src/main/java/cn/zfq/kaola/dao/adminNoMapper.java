package cn.zfq.kaola.dao;

import cn.zfq.kaola.entity.adminNo;

public interface adminNoMapper {
    int insert(adminNo record);

    int insertSelective(adminNo record);
}