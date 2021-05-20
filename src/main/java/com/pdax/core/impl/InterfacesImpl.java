package com.pdax.core.impl;

import com.pdax.constant.Constant;
import com.pdax.core.Generate;
import com.pdax.pojo.TemplateEntity;
import com.pdax.utils.FileUtil;
import com.pdax.pojo.TemplateAssembler;
import com.pdax.utils.StringUtil;
import freemarker.template.TemplateException;

import java.io.IOException;

/**
 * @author Fly Tiger
 * @date 2021/5/20
 */
public class InterfacesImpl extends Generate {


    @Override
    public void createAll(Class cl, TemplateEntity templateEntity) throws IOException, TemplateException, ClassNotFoundException {
        createController(cl,templateEntity);
        createAssembler(cl,templateEntity);
        createRequestDTO(cl,templateEntity);
        createQueryDTO(cl,templateEntity);
        createResponseDTO(cl,templateEntity);
    }

    @Override
    public void createService(Class cl, TemplateEntity templateEntity) throws IOException, TemplateException {
        System.out.println("暂无代码实现");
    }

    /**
     * 创建控制器
     * @param cl
     * @param templateEntity
     * @throws IOException
     * @throws TemplateException
     */
    public void createController(Class cl,TemplateEntity templateEntity) throws IOException, TemplateException {
        TemplateAssembler templateAssembler = new TemplateAssembler();
        TemplateEntity template = templateAssembler.createTemplate(cl, templateEntity);


        String p = templateAssembler.outPutPath + StringUtil.packageNameToFilePath(templateEntity.getInterfacePackageName());
        FileUtil.createFilePath(p);

        String fileName= templateEntity.getEntityName()+ Constant.CONTROLLER_SUFFIX;
        templateAssembler.outPutFilePath(p,fileName, templateEntity,"/interface/Controller.ftl");

        System.out.println("生成Controller代码成功,输出路径："+ p);
    }


    /**
     * 创建ResponseDTO
     * @param cl
     * @param templateEntity
     * @throws IOException
     * @throws TemplateException
     */
    public void createResponseDTO(Class cl,TemplateEntity templateEntity) throws IOException, TemplateException {

        TemplateAssembler templateAssembler = new TemplateAssembler();
        TemplateEntity template = templateAssembler.createTemplate(cl, templateEntity);


        String p = templateAssembler.outPutPath
                + StringUtil.packageNameToFilePath(templateEntity.getInterfacePackageName())
                +"dto/response/";
        FileUtil.createFilePath(p);

        String fileName= templateEntity.getEntityName()+Constant.RESPONSEDTO_SUFFIX;

        templateAssembler.outPutFilePath(p,fileName, template,"/interface/ResponseDTO.ftl");
        System.out.println("生成Response代码成功,输出路径："+ p);
    }

    /**
     * 创建requestDTO
     * @param cl
     * @param templateEntity
     * @throws IOException
     * @throws TemplateException
     */
    public void createRequestDTO(Class cl,TemplateEntity templateEntity) throws IOException, TemplateException {
        TemplateAssembler templateAssembler = new TemplateAssembler();
        TemplateEntity template =  templateAssembler.createTemplate(cl, templateEntity);

        String p =  templateAssembler.outPutPath +
                StringUtil.packageNameToFilePath(templateEntity.getInterfacePackageName())
                +"dto/request/";
        FileUtil.createFilePath(p);

        String fileName= templateEntity.getEntityName()+Constant.REQUESTDTO_SUFFIX;
        templateAssembler.outPutFilePath(p,fileName, template,"/interface/RequestDTO.ftl");
        System.out.println("生成RequestDTO代码成功,输出路径："+ p);
    }

    /**
     * 创建查询dto
     * @param cl
     * @param templateEntity
     * @throws IOException
     * @throws TemplateException
     */
    public void createQueryDTO(Class cl,TemplateEntity templateEntity) throws IOException, TemplateException {
        TemplateAssembler templateAssembler = new TemplateAssembler();
        TemplateEntity template = templateAssembler.createTemplate(cl, templateEntity);


        String p = templateAssembler.outPutPath
                + StringUtil.packageNameToFilePath(templateEntity.getInterfacePackageName())
                +"dto/query/";
        FileUtil.createFilePath(p);

        String fileName= templateEntity.getEntityName()+Constant.QUERYDTO_SUFFIX;
        templateAssembler.outPutFilePath(p,fileName, templateEntity,"/interface/QueryDTO.ftl");
        System.out.println("生成QueryDTO代码成功,输出路径："+ p);
    }

    /**
     * 创建转换器
     * @param cl
     * @param templateEntity
     * @throws IOException
     * @throws TemplateException
     */
    public void createAssembler(Class cl,TemplateEntity templateEntity) throws IOException, TemplateException {
        TemplateAssembler templateAssembler = new TemplateAssembler();
        TemplateEntity template = templateAssembler.createTemplate(cl, templateEntity);


        String p = templateAssembler.outPutPath
                + StringUtil.packageNameToFilePath(templateEntity.getInterfacePackageName())
                +"assembler/";
        FileUtil.createFilePath(p);

        String fileName= templateEntity.getEntityName()+Constant.ASSEMBLER_SUFFIX;
        templateAssembler.outPutFilePath(p,fileName, templateEntity,"/interface/Assembler.ftl");
        System.out.println("生成Assembler代码成功,输出路径："+ p);
    }

}
