/*
 * Copyright 2017-2018 original authors
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

package io.micronaut.aop;

import io.micronaut.context.Qualifier;
import io.micronaut.core.annotation.Internal;

/**
 * A {@link Intercepted} that proxies another instance.
 *
 * @param <T> The declaring type
 *
 * @author Graeme Rocher
 * @since 1.0
 */
public interface InterceptedProxy<T> extends Intercepted {

    /**
     * This method will return the target object being proxied.
     *
     * @return The proxy target
     */
    T interceptedTarget();

    /**
     * Override the bean qualifier.
     *
     * @param qualifier The bean qualifier to use
     */
    @Internal
    @SuppressWarnings("MethodName")
    void $withBeanQualifier(Qualifier<T> qualifier);
}
