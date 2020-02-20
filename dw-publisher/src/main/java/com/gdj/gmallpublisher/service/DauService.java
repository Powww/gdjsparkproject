package com.gdj.gmallpublisher.service;

import java.util.Map;

/**
 * @author gdj
 * @create 2020-02-20-23:30
 */
public interface DauService {

    //获取总数
    public int getTotal(String date);

    //获取分时统计的数据
    public Map getRealTimeHours(String date);

}
