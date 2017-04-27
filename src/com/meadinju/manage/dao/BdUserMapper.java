package com.meadinju.manage.dao;

import com.meadinju.manage.entity.BdUser;
import com.meadinju.manage.entity.BdUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BdUserMapper {
    int countByExample(BdUserExample example);

    int deleteByExample(BdUserExample example);

    int deleteByPrimaryKey(Long id);

    int insert(BdUser record);

    int insertSelective(BdUser record);

    List<BdUser> selectByExample(BdUserExample example);

    BdUser selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") BdUser record, @Param("example") BdUserExample example);

    int updateByExample(@Param("record") BdUser record, @Param("example") BdUserExample example);

    int updateByPrimaryKeySelective(BdUser record);

    int updateByPrimaryKey(BdUser record);
}