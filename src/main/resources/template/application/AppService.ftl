package ${applicationPackageName}

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author  ${author}
 * @date  ${dateTime}
 *
 */
@Service
public class ${entityName}AppService {


    @Autowired
    private ${entityName}DomainService ${entityName?lower_case}DomainService;
    /**
    *  查询无分页
    *
    * @param ${entityName?lower_case}Query
    * @return
    */
    public List<${entityName}> list${entityName}(${entityName}Query ${entityName?lower_case}){

        return ${entityName?lower_case}DomainService.list${entityName}(${entityName?lower_case});
    }
    /**
    *  查询带分页
    *
    * @param ${entityName?lower_case}Query
    * @return
    */
    public Pager<${entityName}> list${entityName}ByPager(${entityName}Query ${entityName?lower_case}){

        return ${entityName?lower_case}DomainService.list${entityName}ByPage(${entityName?lower_case});

    }
    /**
    *  获取单条记录
    *
    * @param id
    * @return
    */
    public ${entityName} get${entityName}(long id){

        return ${entityName?lower_case}DomainService.get${entityName}(id);
    }
    /**
    *  新增
    *
    * @param ${entityName?lower_case}
    * @return
    */
    public void insert${entityName}(${entityName} ${entityName?lower_case}) {
        ${entityName?lower_case}DomainService.insert${entityName}(${entityName?lower_case});
    }

    /**
    *  更新
    *
    * @param ${entityName?lower_case}
    * @return
    */
    public void  update${entityName}(${entityName} ${entityName?lower_case}){
        ${entityName?lower_case}DomainService.update${entityName}(${entityName?lower_case});
    }
    /**
    *  删除一条记录
    *
    * @param ${entityName?lower_case}
    * @return
    */
    public void del${entityName}(long id){

        ${entityName?lower_case}DomainService.del${entityName}(id);
    }

}

