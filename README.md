

# DDD领域模型代码生成器

pdax-generate-code

## 背景

​		近几年新技术不断的推陈出新，每一种类型的新技术的出现，都代表着市场上有着迫切的需求。传统的技术架构由三层组成：Controller  控制器层、Service 服务层、数据访问 Dao 层，市场已经有很成熟的代码生成器，像mybaits plus，mybatis-genterate.可以到mybaits 官网自行下载使用。

​		微服务是在2014年被提出，它的思想主要是，它是将原来的单体应用按照业务领域进行拆分，并形成一个独立的，可部署的向外部提供服务。微服务为什么要使用DDD架构模式？这个建议大家去读一下 Eric Evans的《实现领域驱动设计》。

## DDD架构

​		DDD架构分为四层：Domain领域层、Application 应用层、Interfaces 接口层、Infrastructure基础层

Domain：entity,event,repository,po,service

Applicaiton: service

Interfaces：assembler，dto，controller,

## pdax代码生成器

​		pdax代码生成器根据标准化的DDD分层架构，根据实体生成增、删、改、查的代码，目前只支持mongodb的一种，后续会不断升级来适配mysql,sqlserver 数据库等。

### 领域层

​	领域层代码文件名：xxPO，xxRepository、xxDomainService、xxFactory、xxQuery、xxEntity(自行创建)

### 应用层

​	应用层代码文件名：xxAppService

### 接口层

​	接口层代码文件名：xxController、xxQueryDTO、xxRequestDTO、xxReponseDTO、xxAssembler

## 如何使用

代码下载到本地，自行创建实体

```java
		String basePOPackageName = "com.pdax.domain.base.po";
        TemplateEntity t = new TemplateEntity();
        t.setBasePackageName("com.pdax");//不添加则 默认
        t.setBasePOPackageName(basePOPackageName);
        t.setAuthor("Fly Tiger");//不添加则默认


        GenerateCodeFactory generateCodeFactory=new ApplicationGenerateFactory();
		//生成应用层代码
        generateCodeFactory.createFactory().createAll(Dictionary.class,t);

        GenerateCodeFactory domainGenerateFactory = new DomainGenerateFactory();
        Generate factory = domainGenerateFactory.createFactory();
       //生成领域层代码
		factory.createAll(Dictionary.class,t);

        GenerateCodeFactory interfacesGenerateFactory =new InterfacesGenerateFactory();
        //生成接口层代码
		interfacesGenerateFactory.createFactory().createAll(Dictionary.class,t);

```



