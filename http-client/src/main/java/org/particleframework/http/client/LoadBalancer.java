/*
 * Copyright 2018 original authors
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
package org.particleframework.http.client;

import org.particleframework.core.async.publisher.Publishers;
import org.reactivestreams.Publisher;

import java.net.URL;

/**
 * Interface to abstract server selection. Allows plugging in load balancing strategies.
 *
 * @author Graeme Rocher
 * @since 1.0
 */
@FunctionalInterface
public interface LoadBalancer {
    /**
     *
     * @return The selected server URL
     *
     * @param discriminator An object used to discriminate the server to select. Usually the service ID
     */
    Publisher<URL> select(Object discriminator);

    /**
     * A {@link LoadBalancer} that does no load balancing and always hits the given URL
     *
     * @param url The URL
     * @return The {@link LoadBalancer}
     */
    static LoadBalancer fixed(URL url) {
        return discriminator -> Publishers.just(url);
    }
}