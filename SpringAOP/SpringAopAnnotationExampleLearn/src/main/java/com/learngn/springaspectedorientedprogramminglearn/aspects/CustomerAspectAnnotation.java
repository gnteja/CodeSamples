package com.learngn.springaspectedorientedprogramminglearn.aspects;


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class CustomerAspectAnnotation {
	
	
	
	@Around("@annotation(Loggable)")
	public void annotationLoggableAdvice(ProceedingJoinPoint joinPoint) {
		
		final Class<?> targetClass  = joinPoint.getTarget().getClass();
		final String METHOD_NAME = joinPoint.getSignature().getName();
		final Logger logger =  LoggerFactory.getLogger(targetClass);
		
		try {
			
			logger.info("advice Requested for the method :"+ METHOD_NAME);

			joinPoint.proceed();
			
			logger.info("advice Returning from the Method : "+ METHOD_NAME);
			
		} catch (Throwable exception) {
			logger.error("Advice Catch an exception at Method : "+ METHOD_NAME, exception);
		}
	}
}
