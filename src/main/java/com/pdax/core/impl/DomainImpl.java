package com.pdax.core.impl;

import com.pdax.constant.Constant;
import com.pdax.core.Generate;
import com.pdax.pojo.PojoProperties;
import com.pdax.pojo.TemplateEntity;
import com.pdax.utils.FileUtil;
import com.pdax.pojo.TemplateAssembler;
import com.pdax.utils.StringUtil;
import freemarker.template.TemplateException;

import java.io.IOException;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Fly Tiger
 * @date 2021/5/20
 */
public class DomainImpl extends Generate {


    @Override
    public void createAll(Class cl, TemplateEntity templateEntity) throws IOException, TemplateException, ClassNotFoundException {
        createService(cl,templateEntity);
        createFactory(cl,templateEntity);
        createPO(cl,templateEntity);
        createQuery(cl,templateEntity);
        createRepository(cl,templateEntity);
    }

    /**
     * 创建DomainService
     * @param cl
     * @param templateEntity
     * @throws IOException
     * @throws TemplateException
     */
    @Override
    public void createService(Class cl, TemplateEntity templateEntity) throws IOException, TemplateException {

        TemplateAssembler templateAssembler = new TemplateAssembler();
        TemplateEntity template = templateAssembler.createTemplate(cl, templateEntity);


        String p = templateAssembler.outPutPath + StringUtil.packageNameToFilePath(templateEntity.getDomainServicePackageName());
        FileUtil.createFilePath(p);
        String fileName= templateEntity.getEntityName()+Constant.DOMAINSERVICE_SUFFIX;

        templateAssembler.outPutFilePath(p,fileName, templateEntity,"/domain/DomainService.ftl");


        System.out.println("生成DomainService代码成功,输出路径："+ p);
    }


    /**
     * 创建query
     * @param cl
     * @param templateEntity
     * @throws IOException
     * @throws TemplateException
     */
    public void createQuery(Class cl,TemplateEntity templateEntity) throws IOException, TemplateException {
        TemplateAssembler templateAssembler = new TemplateAssembler();
        TemplateEntity template = templateAssembler.createTemplate(cl, templateEntity);


        String p = templateAssembler.outPutPath + StringUtil.packageNameToFilePath(templateEntity.getDomainEntityPackageName());
        FileUtil.createFilePath(p);

        String fileName= templateEntity.getEntityName()+Constant.QUERY_SUFFIX;
        templateAssembler.outPutFilePath(p,fileName, templateEntity,"/domain/Query.ftl");
        System.out.println("生成Query代码成功,输出路径："+ p);
    }

    /**
     * 创建工厂层
     * @param cl
     * @param templateEntity
     * @throws IOException
     * @throws TemplateException
     */
    public void createFactory(Class cl,TemplateEntity templateEntity) throws IOException, TemplateException {
        TemplateAssembler templateAssembler = new TemplateAssembler();
        TemplateEntity template = templateAssembler.createTemplate(cl, templateEntity);


        String p = templateAssembler.outPutPath + StringUtil.packageNameToFilePath(templateEntity.getDomainServicePackageName());
        FileUtil.createFilePath(p);

        String fileName= templateEntity.getEntityName()+Constant.FACTORY_SUFFIX;
        templateAssembler.outPutFilePath(p,fileName, templateEntity,"/domain/Factory.ftl");

        System.out.println("生成Factory代码成功,输出路径："+ p);
    }
    /**
     * 生成domain service
     * @param cl
     * @throws IOException
     */

    public void createDomainService(Class cl,TemplateEntity templateEntity) throws IOException, TemplateException {
        TemplateAssembler templateAssembler = new TemplateAssembler();
        TemplateEntity template = templateAssembler.createTemplate(cl, templateEntity);


        String p = templateAssembler.outPutPath + StringUtil.packageNameToFilePath(templateEntity.getDomainServicePackageName());
        FileUtil.createFilePath(p);
        String fileName= templateEntity.getEntityName()+Constant.DOMAINSERVICE_SUFFIX;

        templateAssembler.outPutFilePath(p,fileName, templateEntity,"/domain/DomainService.ftl");


        System.out.println("生成DomainService代码成功,输出路径："+ p);
    }

    /**
     * 创建仓储层
     * @param cl
     * @param templateEntity
     * @throws IOException
     * @throws TemplateException
     */

    public void createRepository(Class cl, TemplateEntity templateEntity) throws IOException, TemplateException {
        TemplateAssembler templateAssembler = new TemplateAssembler();
        TemplateEntity template = templateAssembler.createTemplate(cl, templateEntity);


        String p = templateAssembler.outPutPath +
                StringUtil.packageNameToFilePath(templateEntity.getRepositoryPackageName());
        FileUtil.createFilePath(p);

        String fileName= templateEntity.getEntityName()+ Constant.REPOSITORY_SUFFIX;

        templateAssembler.outPutFilePath(p,fileName, templateEntity,"/domain/Repository.ftl");

        System.out.println("生成Repository代码成功,,输出路径："+ p);

    }

    /**
     * 创建 持久化对象 TemplateEntity
     *
     * @param cl
     * @throws IOException
     * @throws TemplateException
     * @throws ClassNotFoundException
     */
    public void createPO(Class cl, TemplateEntity templateEntity) throws IOException, TemplateException, ClassNotFoundException {
        TemplateAssembler templateAssembler = new TemplateAssembler();
        TemplateEntity template = templateAssembler.createTemplate(cl, templateEntity);
        templateEntity.setDocumentName(cl.getSimpleName().toLowerCase());
        List<PojoProperties> listProperties = new ArrayList<>();

        PojoProperties pojoProperties;
        for (Field fl : cl.getDeclaredFields()) {
            pojoProperties = new PojoProperties();
            pojoProperties.setPropertiesFieldName(StringUtil.camelToUnderline(fl.getName(), 1));
            pojoProperties.setPropertiesDataType(fl.getType().getSimpleName().toString());
            pojoProperties.setPropertiesName(fl.getName());
            listProperties.add(pojoProperties);
        }

        templateEntity.setPojoProperties(listProperties);

        String p = templateAssembler.outPutPath + StringUtil.packageNameToFilePath(templateEntity.getPoPackageName());
        FileUtil.createFilePath(p);
        String fileName= templateEntity.getEntityName()+Constant.PO_SUFFIX;

        templateAssembler.outPutFilePath(p,fileName, templateEntity,"/domain/PO.ftl");


        System.out.println("生成PO代码成功,输出路径："+ p);
    }

}
