package ${domainServicePackageName};

import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author  ${author}
 * @date  ${dateTime}
 * 
 */
@Service
public class ${entityName}Service {

    @Autowired
    ${entityName}Repository ${entityName?lower_case}Repository;


    /**
    * 无分页查询
    * @param ${entityName?lower_case}Query
    * @return
    */
    public List<${entityName}> list${entityName}(${entityName}Query ${entityName?lower_case}Query) {
        return ${entityName}Factory.${entityName?lower_case}ListPOToDO( ${entityName?lower_case}Repository.findAll());
    }


    /**
    * 分页查询
    * @param ${entityName?lower_case}Query
    * @return
    */
    public Pager<${entityName}> list${entityName}ByPage(${entityName}Query ${entityName?lower_case}Query) {

        Page<${entityName}Query> page ;
        Pageable pageable= PageRequest.of(${entityName?lower_case}Query.getPageNum()-1,${entityName?lower_case}Query.getPageSize(),Sort.DEFAULT_DIRECTION,"id");




        ExampleMatcher matcher = ExampleMatcher.matching()
        //.withMatcher("dictTypeCode",ExampleMatcher.GenericPropertyMatchers.exact())
        .withIgnorePaths("createUserId","updateUserId","_id","_class");


        ${entityName}PO ${entityName?lower_case}PO = new ${entityName}PO();
        //${entityName?lower_case}PO.setDictTypeCode(${entityName?lower_case}Query.getDictTypeCode());

        Example<${entityName}PO> example= Example.of(${entityName?lower_case}PO,matcher);


        Page<${entityName}PO> pagePO = ${entityName?lower_case}Repository.findAll(example,pageable);
        pagePO.stream().forEach(System.out::println);
            return  ${entityName}Factory.${entityName?lower_case}PagerPOToDO(pagePO);
     }

    /**
    * 获取单条记录
    * @param id
    * @return
    */
    public ${entityName} get${entityName}(long id){
        return ${entityName}Factory.${entityName?lower_case}POToDO(${entityName?lower_case}Repository.findById(id).get());
    }

    /**
    * 新增
     * @param ${entityName?lower_case}
    */
    public void insert${entityName}(${entityName} ${entityName?lower_case}){
        ${entityName}PO ${entityName?lower_case}PO = ${entityName}Factory.${entityName?lower_case}DOToPO(${entityName?lower_case});
        ${entityName?lower_case}PO.setId(new IdGenerateUtil().nextId());
        ${entityName?lower_case}Repository.insert(${entityName?lower_case}PO);
    }

    /**
    * 更新
    * @param ${entityName?lower_case}
    */

    public void update${entityName}(${entityName} ${entityName?lower_case}){
        Optional<${entityName}PO> ${entityName?lower_case}PO= ${entityName?lower_case}Repository.findById(${entityName?lower_case}.getId());
        ${entityName} ${entityName?lower_case}1 = new ${entityName}();

        BeanCopyUtil.copyProperties(${entityName?lower_case}PO.get(),${entityName?lower_case}1);
        //${entityName?lower_case}1.setDictCode(${entityName?lower_case}.getDictCode());
        //${entityName?lower_case}1.setDictText(${entityName?lower_case}.getDictText());


        ${entityName?lower_case}Repository.save(${entityName}Factory.${entityName?lower_case}DOToPO(${entityName?lower_case}));
    }

    /**
    * 删除
    * @param id
    */
    public void del${entityName}(long id){
        ${entityName?lower_case}Repository.deleteById(id);
    }
}
