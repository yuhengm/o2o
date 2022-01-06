package com.imooc.o2o.service;

import com.imooc.o2o.entity.Area;
import java.util.List;

/**
 *  This interface is created to test SSM configuration.
 *  Needs to be implemented for testing.
 */
public interface AreaService {
    /**
     * Returns the result from AreaDao.
     * @return areaList.
     */
    List<Area> getAreaList();
}
