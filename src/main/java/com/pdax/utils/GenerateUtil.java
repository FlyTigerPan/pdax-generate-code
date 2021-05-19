package com.pdax.utils;

import com.pdax.Dictionary;
import com.pdax.pojo.PO;
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
public class GenerateUtil {

    private static Configuration cfg = null;


    private String rootPath;
    private String outPutPath = "/output/";

    public GenerateUtil() {
        if (cfg == null) {
            cfg = new Configuration(Configuration.VERSION_2_3_22);
            cfg.setDefaultEncoding("UTF-8");
            cfg.setTemplateExceptionHandler(TemplateExceptionHandler.RETHROW_HANDLER);
        }
        this.rootPath = this.getClass().getResource("/template").getPath();
    }

    public void createResponseDTO(Class cl,PO po) throws IOException, TemplateException {

        String poName = cl.getSimpleName() + "PO";
        po.setPoName(poName);
        po.setEntityName(cl.getSimpleName());

        String p = outPutPath + StringUtil.packageNameToFilePath(po.getInterfacePackageName());
        FileUtil.createFilePath(p+po.getEntityName());
        String fileName=po.getEntityName()+"ResponseDTO.java";

        outPutFilePath(p,fileName,po,"/interface/ResponseDTO.ftl");
        System.out.println("生成Response代码成功！");
    }

    public void createRequestDTO(Class cl,PO po) throws IOException, TemplateException {

        String poName = cl.getSimpleName() + "PO";
        po.setPoName(poName);
        po.setEntityName(cl.getSimpleName());

        String p = outPutPath + StringUtil.packageNameToFilePath(po.getInterfacePackageName());
        FileUtil.createFilePath(p+po.getEntityName());

        String fileName=po.getEntityName()+"RequestDTO.java";
        outPutFilePath(p,fileName,po,"/interface/RequestDTO.ftl");
        System.out.println("生成RequestDTO代码成功！");
    }

    public void createQueryDTO(Class cl,PO po) throws IOException, TemplateException {

        String poName = cl.getSimpleName() + "PO";
        po.setPoName(poName);
        po.setEntityName(cl.getSimpleName());

        String p = outPutPath + StringUtil.packageNameToFilePath(po.getInterfacePackageName());
        FileUtil.createFilePath(p+po.getEntityName());

        String fileName=po.getEntityName()+"QueryDTO.java";
        outPutFilePath(p,fileName,po,"/interface/QueryDTO.ftl");
        System.out.println("生成QueryDTO代码成功！");
    }

    public void createAssembler(Class cl,PO po) throws IOException, TemplateException {

        String poName = cl.getSimpleName() + "PO";
        po.setPoName(poName);
        po.setEntityName(cl.getSimpleName());

        String p = outPutPath + StringUtil.packageNameToFilePath(po.getInterfacePackageName());
        FileUtil.createFilePath(p+po.getEntityName());

        String fileName=po.getEntityName()+"Assembler.java";
        outPutFilePath(p,fileName,po,"/interface/Assembler.ftl");
        System.out.println("生成Assembler代码成功！");
    }

    public void createController(Class cl,PO po) throws IOException, TemplateException {

        String poName = cl.getSimpleName() + "PO";
        po.setPoName(poName);
        po.setEntityName(cl.getSimpleName());

        String p = outPutPath + StringUtil.packageNameToFilePath(po.getInterfacePackageName());
        FileUtil.createFilePath(p+po.getEntityName());

        String fileName=po.getEntityName()+"Controller.java";
        outPutFilePath(p,fileName,po,"/interface/Controller.ftl");
        System.out.println("生成Controller代码成功！");
    }


    public void createApplicaitonService(Class cl,PO po) throws IOException, TemplateException {

        String poName = cl.getSimpleName() + "PO";
        po.setPoName(poName);
        po.setEntityName(cl.getSimpleName());

        String p = outPutPath + StringUtil.packageNameToFilePath(po.getApplicationPackageName());
        FileUtil.createFilePath(p+po.getEntityName());

        String fileName=po.getEntityName()+"AppService.java";
        outPutFilePath(p,fileName,po,"/application/AppService.ftl");
        System.out.println("生成AppService代码成功！");
    }

    /**
     * 创建query
     * @param cl
     * @param po
     * @throws IOException
     * @throws TemplateException
     */
    public void createQuery(Class cl,PO po) throws IOException, TemplateException {

        String poName = cl.getSimpleName() + "PO";
        po.setPoName(poName);
        po.setEntityName(cl.getSimpleName());

        String p = outPutPath + StringUtil.packageNameToFilePath(po.getDomainEntityPackageName());
        FileUtil.createFilePath(p+po.getEntityName());

        String fileName=po.getEntityName()+".java";
        outPutFilePath(p,fileName,po,"/domain/Query.ftl");
        System.out.println("生成Query代码成功！");
    }

    public void createFactory(Class cl,PO po) throws IOException, TemplateException {

        String poName = cl.getSimpleName() + "PO";
        po.setPoName(poName);
        po.setEntityName(cl.getSimpleName());

        String p = outPutPath + StringUtil.packageNameToFilePath(po.getDomainServicePackageName());
        FileUtil.createFilePath(p+po.getEntityName());

        String fileName=po.getEntityName()+"Factory.java";
        outPutFilePath(p,fileName,po,"/domain/Factory.ftl");

        System.out.println("生成Factory代码成功！");
    }
    /**
     * 生成domain service
     * @param cl
     * @throws IOException
     */

    public void createDomainService(Class cl,PO po) throws IOException, TemplateException {

        String poName = cl.getSimpleName() + "PO";
        po.setPoName(poName);
        po.setEntityName(cl.getSimpleName());

        String p = outPutPath + StringUtil.packageNameToFilePath(po.getDomainServicePackageName());
        FileUtil.createFilePath(p+po.getEntityName());
        String fileName=po.getEntityName()+"DomainService.java";
        outPutFilePath(p,fileName,po,"/domain/DomainService.ftl");


        System.out.println("生成DomainService代码成功！");
    }


    public void createReposiory(Class cl, PO po) throws IOException, TemplateException {


        String poName = cl.getSimpleName() + "PO";
        po.setPoName(poName);
        po.setEntityName(cl.getSimpleName());

        String p = outPutPath + StringUtil.packageNameToFilePath(po.getRepositoryPackageName());
        FileUtil.createFilePath(p+po.getEntityName());
        String fileName=po.getEntityName()+"Reposiory.java";

        outPutFilePath(p,fileName,po,"/domain/Repository.ftl");

        System.out.println("生成Repository代码成功！");

    }

    /**
     * 创建 持久化对象 PO
     *
     * @param cl
     * @throws IOException
     * @throws TemplateException
     * @throws ClassNotFoundException
     */
    public void createPO(Class cl, PO po) throws IOException, TemplateException, ClassNotFoundException {

        String poName = cl.getSimpleName() + "PO";
        po.setDocumentName(cl.getSimpleName().toLowerCase());
        po.setPoName(poName);

        List<PojoProperties> listProperties = new ArrayList<>();

        PojoProperties pojoProperties;
        for (Field fl : cl.getDeclaredFields()) {
            pojoProperties = new PojoProperties();
            pojoProperties.setPropertiesFieldName(StringUtil.camelToUnderline(fl.getName(), 1));
            pojoProperties.setPropertiesDataType(fl.getType().getSimpleName().toString());
            pojoProperties.setPropertiesName(fl.getName());
            listProperties.add(pojoProperties);
        }

        po.setPojoProperties(listProperties);

        String p = outPutPath + StringUtil.packageNameToFilePath(po.getPoPackageName());
        FileUtil.createFilePath(p);
        String fileName=po.getEntityName()+".java";

        outPutFilePath(p,fileName,po,"/domain/PO.ftl");


        System.out.println("生成PO代码成功！");
    }


    private void outPutFilePath(String outPutfilePath,String fileName,Object object,String template) throws IOException, TemplateException {


        System.out.println(this.rootPath);
        TemplateLoader templateLoader = new FileTemplateLoader(new File(this.rootPath));

        cfg.setTemplateLoader(templateLoader);
        Template temp = cfg.getTemplate(template);

        FileOutputStream fos = new FileOutputStream(outPutfilePath+fileName);
        //创建转换流对象，构造方法，绑定字节输出流
        OutputStreamWriter osw = new OutputStreamWriter(fos, "UTF-8");
        temp.process(object, osw);
        osw.close();
    }

    public static void main(String[] args) throws IOException, TemplateException, ClassNotFoundException {
        Dictionary dictionary = new Dictionary();


        PO po = new PO();


        String poPackageName = "com.pdax.domain.dictionary.repository.po";
        String basePOPackageName = "com.pdax.domain.base.po";

        String repositoryPackageName = "com.pdax.domain.dictionary.repository";
        String domainEntityPackageName = "com.pdax.domain.dictionary.enitity";
        String domainServicePackageName="com.pdax.domain.dictionary.service";

        String applicationServicePackageName="com.pdax.application.service";

        String interfacePackageName="com.pdax.interfaces";

        po.setBasePOPackageName(basePOPackageName);
        po.setPoPackageName(poPackageName);
        po.setAuthor("Fly Tiger");
        po.setDateTime(DateUtil.getCurrentDateTime());
        po.setRepositoryPackageName(repositoryPackageName);
        po.setDomainEntityPackageName(domainEntityPackageName);
        po.setDomainServicePackageName(domainServicePackageName);
        po.setApplicationPackageName(applicationServicePackageName);
        po.setInterfacePackageName(interfacePackageName);

        GenerateUtil generateUtil = new GenerateUtil();

        generateUtil.createPO(Dictionary.class, po);
        generateUtil.createReposiory(Dictionary.class, po);
        generateUtil.createDomainService(Dictionary.class,po);
        generateUtil.createFactory(Dictionary.class,po);
        generateUtil.createQuery(Dictionary.class,po);
        generateUtil.createApplicaitonService(Dictionary.class,po);


        generateUtil.createAssembler(Dictionary.class,po);
        generateUtil.createController(Dictionary.class,po);
        generateUtil.createQueryDTO(Dictionary.class,po);
        generateUtil.createRequestDTO(Dictionary.class,po);
        generateUtil.createResponseDTO(Dictionary.class,po);
    }
}
