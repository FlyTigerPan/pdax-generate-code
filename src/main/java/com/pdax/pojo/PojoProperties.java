package com.pdax.pojo;

import sun.dc.pr.PRError;

/**
 * @author Fly Tiger
 * @date 2021/5/19 11:27
 */
public class PojoProperties {


    /**
     * 属性名称
     */
    private String propertiesName;

    /**
     * 映射到数据库名称
     */
    private String propertiesFieldName;
    /**
     * 属性数据类型
     */
    private String propertiesDataType;

    /**
     * 属性备注
     */

    private String  propertiesMemo;



    public String getPropertiesFieldName() {
        return propertiesFieldName;
    }

    public void setPropertiesFieldName(String propertiesFieldName) {
        this.propertiesFieldName = propertiesFieldName;
    }

    public String getPropertiesName() {
        return propertiesName;
    }

    public void setPropertiesName(String propertiesName) {
        this.propertiesName = propertiesName;
    }

    public String getPropertiesDataType() {
        return propertiesDataType;
    }

    public void setPropertiesDataType(String propertiesDataType) {
        this.propertiesDataType = propertiesDataType;
    }

    public String getPropertiesMemo() {
        return propertiesMemo;
    }

    public void setPropertiesMemo(String propertiesMemo) {
        this.propertiesMemo = propertiesMemo;
    }
}
