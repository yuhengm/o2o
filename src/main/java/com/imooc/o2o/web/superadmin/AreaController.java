package com.imooc.o2o.web.superadmin;

import com.imooc.o2o.entity.Area;
import com.imooc.o2o.service.AreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *  This class is created to test SSM configuration.
 */
@Controller
// define url with which this class can be accessed
//@RequestMapping("/superadmin")
public class AreaController {
    @Autowired
    private AreaService areaService;

    /**
     * Retrieve information in the area table.
     * @return a HashMap object that contains the information in the area table.
     *
     */
    // naming convention: frontend visited url is lowercase
    @RequestMapping(value = "superadmin/listarea", method = RequestMethod.GET)
    // returned values need to be turned into json format
    @ResponseBody
    private Map<String, Object> listArea() {
        Map<String, Object> modelMap = new HashMap<String, Object>();
        List<Area> list = new ArrayList<Area>();
        try {
            list = areaService.getAreaList();
            modelMap.put("rows", list);
            modelMap.put("total", list.size());
        } catch (Exception e) {
            e.printStackTrace();
            modelMap.put("success", false);
            modelMap.put("errMsg", e.getMessage());
        }
        return modelMap;
    }
}