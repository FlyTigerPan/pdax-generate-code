package com.pdax;

import com.pdax.core.Generate;
import com.pdax.core.GenerateCodeFactory;
import com.pdax.core.factory.ApplicationGenerateFactory;
import com.pdax.core.factory.DomainGenerateFactory;
import com.pdax.core.factory.InterfacesGenerateFactory;
import com.pdax.core.impl.ApplicationImpl;
import com.pdax.pojo.TemplateEntity;
import freemarker.template.TemplateException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.*;

/**
 * Hello world!
 *
 */
@SpringBootApplication
public class App {

    @Autowired
    public static void main(String[] args) throws IOException, TemplateException, ClassNotFoundException {
        System.out.println("Hello World!");


        String poPackageName = "com.pdax.domain.dictionary.repository.po";
        String basePOPackageName = "com.pdax.domain.base.po";

        String repositoryPackageName = "com.pdax.domain.dictionary.repository";
        String domainEntityPackageName = "com.pdax.domain.dictionary.enitity";
        String domainServicePackageName="com.pdax.domain.dictionary.service";
        String applicationServicePackageName="com.pdax.application.service";
        String interfacePackageName="com.pdax.interfaces";

        TemplateEntity t = new TemplateEntity();
        t.setBasePackageName("com.pdax");
        t.setBasePOPackageName(basePOPackageName);
        t.setPoPackageName(poPackageName);
        t.setAuthor("Fly Tiger");


        GenerateCodeFactory generateCodeFactory=new ApplicationGenerateFactory();


        generateCodeFactory.createFactory().createAll(Dictionary.class,t);

        GenerateCodeFactory domainGenerateFactory = new DomainGenerateFactory();
        Generate factory = domainGenerateFactory.createFactory();
        factory.createAll(Dictionary.class,t);

        GenerateCodeFactory interfacesGenerateFactory =new InterfacesGenerateFactory();
        interfacesGenerateFactory.createFactory().createAll(Dictionary.class,t);


    }

}
