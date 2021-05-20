package com.pdax.core;

import com.pdax.pojo.TemplateEntity;
import freemarker.template.TemplateException;

import java.io.IOException;

/**
 * @author Fly Tiger
 * @date 2021/5/19
 */
public abstract class Generate {
    /**
     * 生成service模板代码
     */
    public abstract void createService(Class cl,TemplateEntity templateEntity) throws IOException, TemplateException;


    /**
     * 生成各层的所有代码
     * @param cl
     * @param templateEntity
     */
    public abstract void createAll(Class cl,TemplateEntity templateEntity) throws IOException, TemplateException, ClassNotFoundException;
    /**
     * 生成mySql数据库脚本
     */
    public  void mySqlScript(){

    };

    /**
     * 生成sqlserver创建脚本
     */
    public  void sqlServerScript(){

    };
}
