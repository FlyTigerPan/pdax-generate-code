package ${interfacePackageName}.assembler;


import java.util.List;

/**
 * @author  ${author}
 * @date  ${dateTime}
 *
 */
public class ${entityName}Assembler {

 /**
  * 前端ReuquestDTO 转换 DO
  *
  * @param ${entityName?lower_case}RequestDTO
  * @return
  */
 public static ${entityName} ${entityName?lower_case}RequestDTOToDO(${entityName}RequestDTO ${entityName?lower_case}RequestDTO) {
  ${entityName} ${entityName?lower_case} = new ${entityName}();
  BeanCopyUtil.copyProperties(${entityName?lower_case}RequestDTO, ${entityName?lower_case});
  return ${entityName?lower_case};

 }

 /**
  * 前端查询条件 DTO 转换 DO
  *
  * @param ${entityName?lower_case}QueryDTO
  * @return
  */
 public static ${entityName}Query ${entityName?lower_case}QueryDTOToDO(${entityName}QueryDTO ${entityName?lower_case}QueryDTO) {
  ${entityName}Query ${entityName?lower_case}Query = new ${entityName}Query();
  ${entityName?lower_case}Query.setDictTypeCode(${entityName?lower_case}QueryDTO.getTypeCode());
  BeanCopyUtil.copyProperties(${entityName?lower_case}QueryDTO, ${entityName?lower_case}Query);
  return ${entityName?lower_case}Query;
 }

 /**
  * 返回前端 分页转换Pager DO-->DTO
  *
  * @param pager
  * @return
  */
 public static Pager<${entityName}ResponseDTO> ${entityName?lower_case}ResponseDTOPager(Pager<${entityName}> pager) {
  Pager<${entityName}ResponseDTO> ${entityName?lower_case}ResponseDTOPager = new Pager<>();

  BeanCopyUtil.copyProperties(pager, ${entityName?lower_case}ResponseDTOPager);

  ${entityName?lower_case}ResponseDTOPager.setRecord(${entityName?lower_case}ListDOToDTO(pager.getRecord()));

  return ${entityName?lower_case}ResponseDTOPager;

 }

 /**
  * DO  -->  DTO
  *
  * @param ${entityName?lower_case}
  * @return
  */
 public static ${entityName}ResponseDTO ${entityName?lower_case}DOToDTO(${entityName} ${entityName?lower_case}) {
  ${entityName}ResponseDTO ${entityName?lower_case}ResponseDTO = new ${entityName}ResponseDTO();
  BeanCopyUtil.copyProperties(${entityName?lower_case}, ${entityName?lower_case}ResponseDTO);
  return ${entityName?lower_case}ResponseDTO;

 }

 /**
  * list DO-->DTO
  *
  * @param list${entityName}
  * @return
  */
 public static List<${entityName}ResponseDTO> ${entityName?lower_case}ListDOToDTO(List<${entityName}> list${entityName}) {
  List<${entityName}ResponseDTO> list = BeanCopyUtil.copyListProperties(list${entityName}, ${entityName}ResponseDTO::new);
  return list;

 }
}
