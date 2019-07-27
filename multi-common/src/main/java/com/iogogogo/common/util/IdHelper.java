package com.iogogogo.common.util;

import java.util.UUID;

/**
 * Created by tao.zeng on 2019-07-27.
 */
public class IdHelper {

    public static String uuid() {
        return UUID.randomUUID().toString().replace("-", "").toLowerCase();
    }
}
