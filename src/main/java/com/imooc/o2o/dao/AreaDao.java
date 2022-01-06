package com.imooc.o2o.dao;

import java.util.List;
import com.imooc.o2o.entity.Area;

/**
 * This interface is created to test SSM configuration.
 * Note that MyBatis does not need an implementation class to test.
 */
public interface AreaDao {
    /**
     * Returns the list that represents tb_area in the database.
     * @return areaList.
     */
    List<Area> queryArea();
}
