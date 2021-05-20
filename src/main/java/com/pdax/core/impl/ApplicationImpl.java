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
 * @date 2021/5/19
 */
public class ApplicationImpl extends Generate {
    /**
     * 创建 ApplicationService
     * @param cl
     * @param templateEntity
     * @throws IOException
     * @throws TemplateException
     */
    @Override
    public void createService(Class cl,TemplateEntity templateEntity) throws IOException, TemplateException {


        TemplateAssembler templateAssembler = new TemplateAssembler();
        TemplateEntity template = templateAssembler.createTemplate(cl, templateEntity);

        String p = templateAssembler.outPutPath + StringUtil.packageNameToFilePath(templateEntity.getApplicationPackageName());
        FileUtil.createFilePath(p);

        String fileName = templateEntity.getEntityName() + Constant.APPLICATION_SUFFIX;
        templateAssembler.outPutFilePath(p, fileName, templateEntity, "/application/AppService.ftl");


        System.out.println("生成AppService代码成功！输出路径：" + p);
    }

    @Override
    public void createAll(Class cl, TemplateEntity templateEntity) throws IOException, TemplateException {
        createService(cl, templateEntity);
    }
}
