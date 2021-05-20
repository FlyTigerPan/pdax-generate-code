package com.pdax.pojo;

import com.pdax.Dictionary;
import com.pdax.pojo.TemplateEntity;
import com.pdax.pojo.PojoProperties;
import freemarker.cache.FileTemplateLoader;
import freemarker.cache.TemplateLoader;
import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;
import freemarker.template.TemplateExceptionHandler;

import java.io.*;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Fly Tiger
 * @date 2021/5/19 11:00
 */
public class TemplateAssembler {

    private static Configuration cfg = null;


    public String rootPath;
    public String outPutPath = "/output/";

    public TemplateAssembler() {
        if (cfg == null) {
            cfg = new Configuration(Configuration.VERSION_2_3_22);
            cfg.setDefaultEncoding("UTF-8");
            cfg.setTemplateExceptionHandler(TemplateExceptionHandler.RETHROW_HANDLER);
        }
        this.rootPath = this.getClass().getResource("/template").getPath();
    }

    /**
     * 构建实体
     * @param cl
     * @param t
     * @return
     */

    public TemplateEntity createTemplate(Class cl,TemplateEntity t){
        String poName = cl.getSimpleName() + "PO";
        t.setPoName(poName);
        t.setEntityName(cl.getSimpleName());



        String domainPrefix= t.getBasePackageName()+".domain."+cl.getSimpleName();

        t.setRepositoryPackageName(
                t.getRepositoryPackageName().equals("")?
                        domainPrefix+".repository": t.getRepositoryPackageName());
        t.setPoPackageName(
                t.getPoPackageName().equals("")?
                        domainPrefix+".repository.po": t.getPoPackageName());

        t.setDomainEntityPackageName(t.getDomainEntityPackageName().equals("")?
                domainPrefix+".entity":t.getDomainEntityPackageName());
        t.setDomainServicePackageName(t.getDomainServicePackageName().equals("")?
                domainPrefix+".service":t.getDomainServicePackageName());


        t.setApplicationPackageName(t.getApplicationPackageName().equals("")?
                t.getBasePackageName()+".application":t.getApplicationPackageName());
        t.setInterfacePackageName(t.getInterfacePackageName().equals("")?
                t.getBasePackageName()+".interfaces":t.getInterfacePackageName());

        t.setOutPath(t.getOutPath().equals("")?
        this.outPutPath:t.getOutPath());

        return t;
    }

    public void outPutFilePath(String outPutfilePath,String fileName,Object object,String template) throws IOException, TemplateException {

        TemplateLoader templateLoader = new FileTemplateLoader(new File(this.rootPath));

        cfg.setTemplateLoader(templateLoader);
        Template temp = cfg.getTemplate(template);

        FileOutputStream fos = new FileOutputStream(outPutfilePath+fileName);
        //创建转换流对象，构造方法，绑定字节输出流
        OutputStreamWriter osw = new OutputStreamWriter(fos, "UTF-8");
        temp.process(object, osw);
        osw.close();
    }

}
