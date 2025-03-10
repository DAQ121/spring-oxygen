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
package com.ispong.oxygen.wechatgo.handler;

import com.ispong.oxygen.wechatgo.pojo.entity.WeChatEventBody;

/**
 * provide method
 *
 * @author ispong
 * @since 0.0.1
 */
public interface WechatgoEventHandler {

    /**
     * subscribe Event
     *
     * @param weChatEventBody weChatEventBody
     * @since 0.0.1
     */
    default void subscribeEvent(WeChatEventBody weChatEventBody) {

    }

    /**
     * unsubscribe Event
     *
     * @param weChatEventBody weChatEventBody
     * @since 0.0.1
     */
    default void unsubscribeEvent(WeChatEventBody weChatEventBody) {

    }

    /**
     * send Msg Template Response
     *
     * @param weChatEventBody weChatEventBody
     * @since 0.0.1
     */
    default void sendMsgTemplateResponse(WeChatEventBody weChatEventBody) {

    }

}
