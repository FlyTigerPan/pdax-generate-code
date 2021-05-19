package com.pdax.utils;

import java.io.File;

/**
 * @author Fly Tiger
 * @date 2021/5/19 15:06
 */
public class FileUtil {

    public static void createFilePath(String path) {
        File file = new File(path);
        if (!file.exists()) {
            file.mkdirs();
        }
    }
}
