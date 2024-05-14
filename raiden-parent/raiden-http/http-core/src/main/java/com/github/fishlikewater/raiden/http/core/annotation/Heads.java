/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.github.fishlikewater.raiden.http.core.annotation;

import java.lang.annotation.*;

/**
 *
 * @author fishlikewater@126.com
 * @since 2023年09月28日 20:30
 * @version 1.0.0
 *
 * <pre> {@code
 * @HttpServer(sourceHttpClient = "customer")
 * public interface DemoRemote {
 *      @Heads({
 *      "Content-Type: application/json",
 *       "Origin: https://xxxx.com"
 *       })
 *       String test3(@Body Map<String, String> map);
 * }
 * }</pre>
 **/
@Target({ElementType.METHOD, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Heads {

    String[] value() default {};
}
