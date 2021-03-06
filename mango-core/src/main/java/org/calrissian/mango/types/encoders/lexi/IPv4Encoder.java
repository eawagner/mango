/*
 * Copyright (C) 2013 The Calrissian Authors
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
package org.calrissian.mango.types.encoders.lexi;


import org.calrissian.mango.domain.IPv4;
import org.calrissian.mango.types.encoders.AbstractIPv4Encoder;

import static com.google.common.base.Preconditions.checkNotNull;
import static org.calrissian.mango.types.encoders.lexi.EncodingUtils.encodeUInt;
import static org.calrissian.mango.types.encoders.lexi.EncodingUtils.fromHex;

public class IPv4Encoder extends AbstractIPv4Encoder<String> {
    @Override
    public String encode(IPv4 value) {
        checkNotNull(value, "Null values are not allowed");
        return encodeUInt((int)value.getValue());
    }

    @Override
    public IPv4 decode(String value) {
        checkNotNull(value, "Null values are not allowed");
        return new IPv4(fromHex(value));
    }
}