package com.testDataops.AwsTest;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.UUID;

import com.amazonaws.AmazonClientException;
import com.amazonaws.AmazonServiceException;
import com.amazonaws.regions.Region;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3Client;
import com.amazonaws.services.s3.model.Bucket;
import com.amazonaws.services.s3.model.GetObjectRequest;
import com.amazonaws.services.s3.model.ListObjectsRequest;
import com.amazonaws.services.s3.model.ObjectListing;
import com.amazonaws.services.s3.model.PutObjectRequest;
import com.amazonaws.services.s3.model.S3Object;
import com.amazonaws.services.s3.model.S3ObjectSummary;

import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSCredentialsProvider;
import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.services.ec2.AmazonEC2;
import com.amazonaws.services.ec2.AmazonEC2Client;
import com.amazonaws.services.ec2.AmazonEC2ClientBuilder;
import com.amazonaws.services.ec2.model.RunInstancesRequest;
import com.amazonaws.services.ec2.model.RunInstancesResult;
import com.amazonaws.services.rds.AmazonRDSClient;

public class App 
{
	
	public static String accessKey = "AKIAJ3RZCPTAN3JMOJEA";
	public static String secretKey = "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";
//	public static String groupName = "sg-d4a84da2";
//	public static String keyName = "helloTest";
//	public static String imageID = "ami-1853ac65";
//	public static String instanceType = "t2.micro";
//	public static AWSCredentials credentials;
//	public static Region region;
//	public static AmazonEC2Client ec2client;
//	public static AmazonRDSClient rdsclient;
	
	static BasicAWSCredentials credentials = new BasicAWSCredentials(accessKey, secretKey);

	
    public static void main( String[] args ) throws Exception
    {
    		App m = new App();
    		m.listingBuckets();
    		m.createEC2Instances();
        
   }
    public void createEC2Instances() {
    	
    	final AmazonEC2 ec2 = AmazonEC2ClientBuilder
    			.standard()
    			.withCredentials(new AWSStaticCredentialsProvider(credentials))
    			.withRegion("us-east-1")
    			.build();
    
    	RunInstancesRequest runInstancesRequest = new RunInstancesRequest();

    	runInstancesRequest.withImageId("ami-4b814f22")
    			           .withInstanceType("m1.small")
    			           .withMinCount(1)
    			           .withMaxCount(1);
    	
    	RunInstancesResult result = ec2.runInstances(runInstancesRequest);
    	System.out.println("---------///////////--------------");
    	System.out.println(result);
    	System.out.println("successfully dne dne dne .............");
    	
    }
    
    public void listingBuckets() {
    	
        AmazonS3 s3 = new AmazonS3Client(credentials);
        System.out.println("===========================================");
        System.out.println("Getting Started with Amazon S3");
        System.out.println("===========================================\n");

        /*
         * List the buckets in your account
         */
        System.out.println("Listing buckets");
        for (Bucket bucket : s3.listBuckets()) {
            System.out.println(" - " + bucket.getName());
        }
        System.out.println();
    	
    }
}