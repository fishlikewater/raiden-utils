/*
 * Copyright © 2024 zhangxiang (fishlikewater@126.com)
 *
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
package com.github.fishlikewater;

import cn.hutool.core.util.StrUtil;
import com.github.fishlikewater.raiden.core.Assert;
import com.github.fishlikewater.raiden.core.func.LambdaMeta;
import org.junit.Test;

/**
 * {@code LambdaTest}
 *
 * @author zhangxiang
 * @version 1.0.0
 * @since 2024/04/30
 */
public class LambdaTest {

    @Test
    public void testLambda() {
        String resolve = LambdaMeta.resolve(TestBean::name);
        Assert.isTrue(StrUtil.isNotBlank(resolve), "");
        Assert.isTrue(resolve.equals("name"), "");
    }
}