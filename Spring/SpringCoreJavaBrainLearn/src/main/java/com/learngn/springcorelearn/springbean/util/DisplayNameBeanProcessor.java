package com.learngn.springcorelearn.springbean.util;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class DisplayNameBeanProcessor implements BeanPostProcessor {

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanname) throws BeansException {
		System.out.println("***************************************************************");
		System.out
				.println(bean.getClass().getName() + "---------------" + beanname + "--->This is after bean initialized ");
		return bean;
	}

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanname) throws BeansException {
		System.out.println("***************************************************************");
		System.out.println(
				bean.getClass().getName() + "---------------" + beanname + "----------->This is before bean initialized ");
		return bean;
	}

}
