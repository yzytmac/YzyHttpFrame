package com.yzy.yzyhttplib;

import java.util.ArrayList;

/**
 * Created by yzy on 2017/12/16.
 */

public class Response<M> {
    public int code;
    public String message;
    public ArrayList<M> result;

}