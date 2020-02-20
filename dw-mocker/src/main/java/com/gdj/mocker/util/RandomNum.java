package com.gdj.mocker.util;

import java.util.Random;

/**
 * @author gdj
 * @create 2020-02-18-19:32
 */
public class RandomNum {
    public static int getRandInt(int fromNum,int toNum){
        return   fromNum+ new Random().nextInt(toNum-fromNum+1);
    }
}

