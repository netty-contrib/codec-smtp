/*
 * Copyright 2016 The Netty Project
 *
 * The Netty Project licenses this file to you under the Apache License,
 * version 2.0 (the "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at:
 *
 *   https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */
package io.netty.contrib.handler.codec.smtp;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.ByteBufHolder;
import io.netty.util.internal.UnstableApi;

/**
 * Content that is sent after the {@code DATA} request.
 * Be aware that a {@link SmtpContent} / {@link LastSmtpContent} sequence must always use CRLF as line delimiter
 * and the lines that start with a DOT must be escaped with an extra DOT as
 * specified by <a href="https://www.ietf.org/rfc/rfc2821.txt">RFC2821</a>.
 */
@UnstableApi
public interface SmtpContent extends ByteBufHolder {
    @Override
    SmtpContent copy();

    @Override
    SmtpContent duplicate();

    @Override
    SmtpContent retainedDuplicate();

    @Override
    SmtpContent replace(ByteBuf content);

    @Override
    SmtpContent retain();

    @Override
    SmtpContent retain(int increment);

    @Override
    SmtpContent touch();

    @Override
    SmtpContent touch(Object hint);
}
