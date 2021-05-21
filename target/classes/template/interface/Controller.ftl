package ${interfacePackageName}.facade.openapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

/**
 * @author  ${author}
 * @date  ${dateTime}
 *
 */
@RestController
@RequestMapping("api")
public class ${entityName}Controller {

 @Autowired
 ${entityName}AppService ${entityName?lower_case}AppService;

 /**
 *  查询无分页
 * @param ${entityName}RequestDTO
 * @return
 */
 @GetMapping("list${entityName?lower_case}")
 @Security(validate = false)
 public CommonResponseBody list${entityName}(@Valid @RequestBody ${entityName}QueryDTO ${entityName?lower_case}QueryDTO) {

  List<${entityName}ResponseDTO> ${entityName?lower_case}ionaries = ${entityName}Assembler.${entityName?lower_case}ListDOToDTO(${entityName?lower_case}AppService.list${entityName}(
          ${entityName}Assembler.${entityName?lower_case}QueryDTOToDO(${entityName?lower_case}QueryDTO)));
  return CommonResponseBody.create(${entityName?lower_case}ionaries);

 }
 /**
 * 查询并分页
 * @param dictionaryQueryDTO
 * @return
 */
 @GetMapping("list${entityName?lower_case}bypage")
 @Security(validate = false)
 public CommonResponseBody list${entityName}ByPage(@Valid @RequestBody ${entityName}QueryDTO ${entityName?lower_case}QueryDTO) {
  Pager<${entityName}> pager =
          ${entityName?lower_case}AppService.list${entityName}ByPager(${entityName}Assembler.${entityName?lower_case}QueryDTOToDO(${entityName?lower_case}QueryDTO));
  return CommonResponseBody.create(${entityName}Assembler.${entityName?lower_case}ResponseDTOPager(pager));



/**
 * 获取单条记录
 * @param dictionaryQueryDTO
 * @return
 */
 @GetMapping("get${entityName?lower_case}")
 @Security(validate = false)
 public CommonResponseBody get${entityName}(long id) {

  return CommonResponseBody.create(${entityName}Assembler.${entityName?lower_case}DOToDTO(${entityName?lower_case}AppService.get${entityName}(id)));
 }


/**
 * 新增
 * @param ${entityName?lower_case}RequestDTO
 * @return
 */
 @PostMapping("insert${entityName?lower_case}")
 @Security(validate = false)
 public CommonResponseBody insert${entityName}(@Valid @RequestBody ${entityName}RequestDTO ${entityName?lower_case}RequestDTO) {
  ${entityName?lower_case}AppService.insert${entityName}(${entityName}Assembler.${entityName?lower_case}RequestDTOToDO(${entityName?lower_case}RequestDTO));
  return CommonResponseBody.create(CommonConstant.SAVE_SUCCESS);
 }

/**
 * 更新
 * @param ${entityName?lower_case}RequestDTO
 * @return
 */
 @PostMapping("update${entityName?lower_case}")
 @Security(validate = false)
 public CommonResponseBody update${entityName}(@Valid @RequestBody ${entityName}RequestDTO ${entityName?lower_case}RequestDTO) {
  ${entityName?lower_case}AppService.update${entityName}(${entityName}Assembler.${entityName?lower_case}RequestDTOToDO(${entityName?lower_case}RequestDTO));
  return CommonResponseBody.create(CommonConstant.SAVE_SUCCESS);
 }

/**
 * 删除一条记录
 * @param id
 * @return
 */
 @GetMapping("del${entityName?lower_case}")
 @Security(validate = false)
 public CommonResponseBody del${entityName}(long id) {
  ${entityName?lower_case}AppService.del${entityName}(id);
  return CommonResponseBody.create(CommonConstant.DEL_SUCCESS);
 }

}
