package com.gdj.gmallpublisher.mapper;

import java.util.List;
import java.util.Map;

/**
 * @author gdj
 * @create 2020-02-20-23:26
 */
public interface DauMapper {

    //获取总数
    public int getTotal(String date);

    //获取分时统计
    public List<Map> selectDauTotalHourMap(String date);
}
