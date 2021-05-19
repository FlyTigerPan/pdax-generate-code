package com.pdax.pojo;

import java.util.List;

/**
 * @author Fly Tiger
 * @date 2021/5/19 11:13
 */
public class PO  extends BaseEntity{




    /**
     * 实体名称
     */
    private String entityName;
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
     * 全部包名
     */
    private String repositoryPackageName;
    /**
     * 持久化对象名称
     */
    private String poName;

    /**
     * 表明
     */
    private String documentName;
    /**
     * po 包名
     */
    public String poPackageName;
    /**
     * 基础类的包名
     */
    private String basePOPackageName;
    /**
     * 输出路径
     */
    private String outPath;

    public String getApplicationPackageName() {
        return applicationPackageName;
    }

    public void setApplicationPackageName(String applicationPackageName) {
        this.applicationPackageName = applicationPackageName;
    }

    public String getInterfacePackageName() {
        return interfacePackageName;
    }

    public void setInterfacePackageName(String interfacePackageName) {
        this.interfacePackageName = interfacePackageName;
    }

    public String getDomainEntityPackageName() {
        return domainEntityPackageName;
    }

    public void setDomainEntityPackageName(String domainEntityPackageName) {
        this.domainEntityPackageName = domainEntityPackageName;
    }

    public String getDomainServicePackageName() {
        return domainServicePackageName;
    }

    public void setDomainServicePackageName(String domainServicePackageName) {
        this.domainServicePackageName = domainServicePackageName;
    }

    public String getRepositoryPackageName() {
        return repositoryPackageName;
    }

    public void setRepositoryPackageName(String repositoryPackageName) {
        this.repositoryPackageName = repositoryPackageName;
    }

    public String getEntityName() {
        return entityName;
    }

    public void setEntityName(String entityName) {
        this.entityName = entityName;
    }

    private List<PojoProperties>  pojoProperties;

    public List<PojoProperties> getPojoProperties() {
        return pojoProperties;
    }

    public void setPojoProperties(List<PojoProperties> pojoProperties) {
        this.pojoProperties = pojoProperties;
    }

    public String getDocumentName() {
        return documentName;
    }

    public void setDocumentName(String documentName) {
        this.documentName = documentName;
    }


    public String getPoPackageName() {
        return poPackageName;
    }

    public void setPoPackageName(String poPackageName) {
        this.poPackageName = poPackageName;
    }

    public String getBasePOPackageName() {
        return basePOPackageName;
    }

    public void setBasePOPackageName(String basePOPackageName) {
        this.basePOPackageName = basePOPackageName;
    }

    public String getPoName() {
        return poName;
    }

    public void setPoName(String poName) {
        this.poName = poName;
    }


    public String getOutPath() {
        return outPath;
    }

    public void setOutPath(String outPath) {
        this.outPath = outPath;
    }

}
