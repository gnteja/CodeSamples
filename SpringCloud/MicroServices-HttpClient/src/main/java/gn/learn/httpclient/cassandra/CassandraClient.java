package gn.learn.httpclient.cassandra;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class CassandraClient {
	
	Logger logger = LoggerFactory.getLogger(getClass());
	
	class TemplateCredentials{
		
		public String hostIp;
		public String hostUsername;
		public String hostPassword;
		public String hostToolType;
		
		public TemplateCredentials(String hostIp, String hostUsername, String hostPassword, String hostToolType) {
			super();
			this.hostIp = hostIp;
			this.hostUsername = hostUsername;
			this.hostPassword = hostPassword;
			this.hostToolType = hostToolType;
		}
	}
	
	public void test() {
		
		TemplateCredentials tempCred = new TemplateCredentials("10.1.53.48", "rdops", "rdops@123", "kafka"); 
		
		RestTemplate restTemplate = new RestTemplate();
		
		Long projectId = 3l;
		final String url = "http://10.1.50.141:42924/installation/{projectId}/kafka";
		ResponseEntity <String> entity = restTemplate.postForEntity(url, tempCred, String.class, projectId);
		if (entity.getStatusCode().is2xxSuccessful()) {
			
			System.out.println("****************************************");
			logger.debug("********************");
			logger.info("***********INFO");
			System.out.println(entity.getStatusCode());
		}
	}
}
