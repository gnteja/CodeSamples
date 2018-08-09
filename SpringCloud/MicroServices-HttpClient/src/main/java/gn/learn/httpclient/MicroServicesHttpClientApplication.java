package gn.learn.httpclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import gn.learn.httpclient.cassandra.CassandraClient;

@SpringBootApplication
public class MicroServicesHttpClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroServicesHttpClientApplication.class, args);
		
		CassandraClient cassandra = new CassandraClient();
		cassandra.test();
	}
}
