package com.pdax.pojo;


import java.io.Serializable;
import java.util.List;
import java.util.Optional;

/**
 * @author Fly Tiger
 * @date 2021/5/19 11:13
 */
public class TemplateEntity extends BaseEntity{

    /**
     * 实体名称
     */
    private String entityName;
    /**
     * 基础类包名
     */
    private String basePackageName;
    /**
     * 应用层包名
     */
    private String applicationPackageName;

    /**
     * 接口层包名
     */
    private String interfacePackageName;

    /**
     * 实体包名
     */
    private String domainEntityPackageName;

    /**
     * 领域服务service 包名
     */
    private String domainServicePackageName;

    /**
     * 仓储层包名
     */
    private String repositoryPackageName;
    /**
     * 持久化对象名称
     */
    private String poName;

    /**
     * 表名
     */
    private String documentName;
    /**
     * po 包名
     */
    public String poPackageName;
    /**
     * 父类PO的包名
     */
    private String basePOPackageName;
    /**
     * 输出路径
     */
    private String outPath;

    List<PojoProperties> pojoProperties;

    public String getEntityName() {
        return entityName;
    }

    public void setEntityName(String entityName) {
        this.entityName = entityName;
    }

    public String getBasePackageName() {
        return Optional.ofNullable(basePackageName).orElse("com.pdax") ;
    }

    public void setBasePackageName(String basePackageName) {
        this.basePackageName = basePackageName;
    }

    public String getApplicationPackageName() {
        return  Optional.ofNullable(applicationPackageName).orElse("") ;
    }

    public void setApplicationPackageName(String applicationPackageName) {
        this.applicationPackageName = applicationPackageName;
    }

    public String getInterfacePackageName() {
        return Optional.ofNullable(interfacePackageName).orElse("") ;
    }

    public void setInterfacePackageName(String interfacePackageName) {
        this.interfacePackageName = interfacePackageName;
    }

    public String getDomainEntityPackageName() {
        return Optional.ofNullable(domainEntityPackageName).orElse("") ;
    }

    public void setDomainEntityPackageName(String domainEntityPackageName) {
        this.domainEntityPackageName = domainEntityPackageName;
    }

    public String getDomainServicePackageName() {
        return Optional.ofNullable(domainServicePackageName).orElse("") ;
    }

    public void setDomainServicePackageName(String domainServicePackageName) {
        this.domainServicePackageName = domainServicePackageName;
    }

    public String getRepositoryPackageName() {
        return Optional.ofNullable(repositoryPackageName).orElse("") ;
    }

    public void setRepositoryPackageName(String repositoryPackageName) {
        this.repositoryPackageName = repositoryPackageName;
    }

    public String getPoName() {
        return poName;
    }

    public void setPoName(String poName) {
        this.poName = poName;
    }

    public String getDocumentName() {
        return documentName;
    }

    public void setDocumentName(String documentName) {
        this.documentName = documentName;
    }

    public String getPoPackageName() {
        return  Optional.ofNullable(poPackageName).orElse("") ;
    }

    public void setPoPackageName(String poPackageName) {
        this.poPackageName = poPackageName;
    }

    public String getBasePOPackageName() {

        return Optional.ofNullable(basePOPackageName).orElse("") ;
    }

    public void setBasePOPackageName(String basePOPackageName) {

        this.basePOPackageName = basePOPackageName;
    }

    public String getOutPath() {
        return  Optional.ofNullable(outPath).orElse("") ;
    }

    public void setOutPath(String outPath) {
        this.outPath = outPath;
    }

    public List<PojoProperties> getPojoProperties() {
        return pojoProperties;
    }

    public void setPojoProperties(List<PojoProperties> pojoProperties) {
        this.pojoProperties = pojoProperties;
    }
}
