package ${domainServicePackageName};

/**
 * @author  ${author}
 * @date  ${dateTime}
 * 
 */
public class ${entityName}Factory {

    /**
     * DO to PO
     * 一般增，删，改 用
     *
     * @param ${entityName?lower_case}
     * @return
     */
    public static ${entityName}PO ${entityName?lower_case}DOToPO(${entityName} ${entityName?lower_case}) {
        ${entityName}PO ${entityName?lower_case}PO = new ${entityName}PO();
        BeanCopyUtil.copyProperties(${entityName?lower_case}, ${entityName?lower_case}PO);
        return ${entityName?lower_case}PO;
    }

    /**
     * PO TO DO
     * 一般 数据库获取实体 转换成PO
     *
     * @param ${entityName?lower_case}PO
     * @return
     */
    public static ${entityName} ${entityName?lower_case}POToDO(${entityName}PO ${entityName?lower_case}PO) {
        ${entityName} ${entityName?lower_case} = new ${entityName}();
        BeanCopyUtil.copyProperties(${entityName?lower_case}PO, ${entityName?lower_case});
        return ${entityName?lower_case};
    }

    /**
     * 分页列表转换
     *
     * @param ${entityName?lower_case}POPager
     * @return
     */
    public static Pager<${entityName}> ${entityName?lower_case}PagerPOToDO(Page<${entityName}PO> ${entityName?lower_case}POPager) {

        Pager<${entityName}> ${entityName?lower_case}Pager = new Pager<>();
        ${entityName?lower_case}Pager = Pager.getPager(${entityName?lower_case}POPager);
        ${entityName?lower_case}Pager.setRecord(${entityName?lower_case}ListPOToDO(${entityName?lower_case}POPager.getContent()));
        return ${entityName?lower_case}Pager;

    }

    /**
     * 无分页列表转换
     *
     * @param list${entityName}PO
     * @return
     */
    public static List<${entityName}> ${entityName?lower_case}ListPOToDO(List<${entityName}PO> list${entityName}PO) {

        List<${entityName}> dictionaries = new ArrayList<>();
        dictionaries = BeanCopyUtil.copyListProperties(list${entityName}PO, ${entityName}::new);
        return dictionaries;
    }
}