package ${poPackageName};

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
<#if basePOPackageName!="">
import ${basePOPackageName}
</#if>

/**
 * @author  ${author}
 * @date  ${dateTime}
 *
 */
@Data
@Document("${documentName}")
<#if basePOPackageName!="">
public class ${poName} extend BasePO {
<#else>
public class ${poName} {
</#if>
   <#list pojoProperties as s>
   /**
    *
    */
   @Field("${s.propertiesFieldName}")
   private ${s.propertiesDataType} ${s.propertiesName};

   </#list>
}
