package com.xmz.elastic;

import java.text.SimpleDateFormat;

/**
 * @author Xu.MinZhe
 * @version V1.0
 * @Project elastic
 * @Package com.hdkj.elastic
 * @Description
 * @Date 2018/10/23 10:23
 */
public class TimeUtil {
    public static String mill2Time(long mill){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
        return sdf.format(mill);
    }
}
