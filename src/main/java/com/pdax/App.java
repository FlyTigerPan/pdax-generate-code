package com.pdax;

import com.pdax.utils.GenerateUtil;
import freemarker.cache.FileTemplateLoader;
import freemarker.cache.TemplateLoader;
import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;
import freemarker.template.TemplateExceptionHandler;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/**
 * Hello world!
 *
 */
@SpringBootApplication
public class App 
{
    public static void main( String[] args ) throws IOException, TemplateException, ClassNotFoundException {
        System.out.println( "Hello World!" );

         //new GenerateUtil().createPO(Dictionary.class);
    }




    public static void createPO() throws IOException, TemplateException {



        Configuration cfg = new Configuration(Configuration.VERSION_2_3_22);
        //cfg.setDirectoryForTemplateLoading(new File(""));


        String rootPath="E:\\person\\project\\dazhong\\trunk\\code\\pdax-generate-code\\src\\main\\resources\\";
        TemplateLoader templateLoader=new FileTemplateLoader(
                new File(rootPath));
        //path="/WEB-INF/classes/com/xxx/tag/templates/page/xxx.ftl";
        cfg.setTemplateLoader(templateLoader);


        Template temp = cfg.getTemplate("/template/domain/PO.ftl");
        cfg.setDefaultEncoding("UTF-8");
        cfg.setTemplateExceptionHandler(TemplateExceptionHandler.RETHROW_HANDLER);



        // Create the root hash
        Map<String, Object> root = new HashMap<>();
        root.put("poPackagerName","com.pdax.domain.base.po.Dictionary");
        root.put("basePOPackageName", "com.pdax.domain.base.po.BasePO");
        root.put("entityName","Dictionary");

//        Map<String, Object> latest = new HashMap<>();
//        root.put("latestProduct", latest);
//        latest.put("url", "products/greenmouse.html");
//        latest.put("name", "green mouse");

        String  outPutPath="E:\\person\\project\\dazhong\\trunk\\code\\pdax-generate-code\\src\\main\\java\\com\\pdax\\";

        FileOutputStream fos=new FileOutputStream("Dictionary.java");
        //创建转换流对象，构造方法，绑定字节输出流
        OutputStreamWriter osw=new OutputStreamWriter(fos,"UTF-8");



//        Writer out = new OutputStreamWriter(System.out);

        Writer out = new OutputStreamWriter(fos,"UTF-8");
        temp.process(root, out);

        out.close();
    }
}
