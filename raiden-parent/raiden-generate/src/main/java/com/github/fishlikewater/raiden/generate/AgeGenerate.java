/*
 * Copyright (c) 2024 zhangxiang (fishlikewater@126.com)
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
package com.github.fishlikewater.raiden.generate;

import com.github.fishlikewater.raiden.core.RandomUtils;

/**
 * {@code AgeGenerate}
 * 年龄生成器
 *
 * @author zhangxiang
 * @version 1.0.0
 * @since 2024/05/31
 */
public class AgeGenerate extends AbstractGenerate<Integer> {

    @Override
    public Integer generate() {
        return RandomUtils.randomInt(18, 60);
    }
}