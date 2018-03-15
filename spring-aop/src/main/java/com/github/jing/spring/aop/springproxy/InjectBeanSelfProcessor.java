package com.github.jing.spring.aop.springproxy;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

/**
 * Created by chenjing28 on 18/3/15.
 */
@Component
public class InjectBeanSelfProcessor implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        if (bean instanceof BeanSelfAware) {
            ((BeanSelfAware)bean).setSelf(bean);
        }
        return bean;
    }
}
