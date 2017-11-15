/*
 * Copyright 2017 original authors
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License. 
 */
package org.particleframework.context;

import org.particleframework.inject.BeanDefinition;
import org.particleframework.inject.BeanIdentifier;

/**
 * <p>A bean registration is an association between a {@link BeanDefinition} and a created bean, typically a {@link javax.inject.Singleton}</p>
 *
 * @author Graeme Rocher
 * @since 1.0
 */
public class BeanRegistration<T> {
    final BeanIdentifier identifier;
    final BeanDefinition<T> beanDefinition;
    final T bean;

    public BeanRegistration(BeanIdentifier identifier, BeanDefinition<T> beanDefinition, T bean) {
        this.identifier = identifier;
        this.beanDefinition = beanDefinition;
        this.bean = bean;
    }

    public BeanIdentifier getIdentifier() {
        return identifier;
    }

    public BeanDefinition<T> getBeanDefinition() {
        return beanDefinition;
    }

    public T getBean() {
        return bean;
    }

    @Override
    public String toString() {
        return "BeanRegistration: " + bean;
    }
}