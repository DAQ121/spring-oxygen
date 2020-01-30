/*
 * Copyright [2020] [ispong]
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
package com.isxcode.oxygen.flysql.common;

import lombok.Data;

/**
 * BaseResponse
 *
 * @author ispong
 * @date 2019/10/17
 * @version v0.1.0
 */
@Data
public class BaseResponse {

    /**
     * 返回的code
     */
    private String code;

    /**
     * 返回的message
     */
    private String message;

    /**
     * 返回体数据
     */
    private Object data;
}
