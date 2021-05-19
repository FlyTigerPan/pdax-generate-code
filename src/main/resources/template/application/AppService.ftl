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

    public List<${entityName}> list${entityName}(${entityName}Query ${entityName?lower_case}){

        return ${entityName?lower_case}DomainService.list${entityName}(${entityName?lower_case});
    }

    public Pager<${entityName}> list${entityName}ByPager(${entityName}Query ${entityName?lower_case}){

        return ${entityName?lower_case}DomainService.list${entityName}ByPage(${entityName?lower_case});

    }
    public ${entityName} get${entityName}(long id){

        return ${entityName?lower_case}DomainService.get${entityName}(id);
    }

    public void insert${entityName}(${entityName} ${entityName?lower_case}) {
        ${entityName?lower_case}DomainService.insert${entityName}(${entityName?lower_case});
    }

    public void  update${entityName}(${entityName} ${entityName?lower_case}){

        ${entityName?lower_case}DomainService.update${entityName}(${entityName?lower_case});
    }
    public void del${entityName}(long id){

        ${entityName?lower_case}DomainService.del${entityName}(id);
    }

}

