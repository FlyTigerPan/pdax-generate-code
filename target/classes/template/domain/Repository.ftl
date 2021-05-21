package ${repositoryPackageName};

${poPackageName}
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * @author ${author}
 * @date  ${dateTime}
 * 
 */
@Repository
public interface ${entityName}Repository extends MongoRepository<${poName},Long>{


}
