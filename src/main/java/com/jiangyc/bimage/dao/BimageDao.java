/*
 * Bimage
 * Copyright (C) 2018 姜永春
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see [http://www.gnu.org/licenses/].
 */

package com.jiangyc.bimage.dao;

import com.jiangyc.bimage.bean.Bimage;
import com.jiangyc.bimage.bean.BimageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface BimageDao {
    long countByExample(BimageExample example);

    int deleteByExample(BimageExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Bimage record);

    int insertSelective(Bimage record);

    List<Bimage> selectByExample(BimageExample example);

    Bimage selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Bimage record, @Param("example") BimageExample example);

    int updateByExample(@Param("record") Bimage record, @Param("example") BimageExample example);

    int updateByPrimaryKeySelective(Bimage record);

    int updateByPrimaryKey(Bimage record);
}