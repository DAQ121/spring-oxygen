package com.isxcode.isxcodespring.utils;

import java.util.UUID;

/**
 * 初始化工具
 *
 * @author ispong
 * @date 2019/10/20
 * @version v0.1.0
 */
public class GeneratorUtils {

    /**
     * 初始化32uuid
     *
     * @return 32位uuid
     * @since 2019/10/20
     */
    public static String generateUuid(){

        return UUID.randomUUID().toString().replace("-", "");
    }

}
