package com.gn.learn.springcloud.taskintake;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.cloud.task.launcher.TaskLaunchRequest;
import org.springframework.messaging.support.GenericMessage;
import org.springframework.stereotype.Component;

@Component
@EnableBinding(Source.class)
public class TaskProcessor {
	
	@Autowired
	public Source source;
	
	public void publicRequest(String payload) {
		
		String url= "";	
		
		List <String> input = new ArrayList<String>();
		
		for (String string : payload.split(",")) {
			input.add(string);
		}
		
		TaskLaunchRequest request= new TaskLaunchRequest(url, input, null, null, null);
		
		GenericMessage<TaskLaunchRequest> message = new GenericMessage<>(request);
		
		this.source.output().send(message);
		
	}

}
