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
package org.calrissian.mango.accumulo.types.impl;


import org.calrissian.mango.types.encoders.AbstractByteEncoder;

import static com.google.common.base.Preconditions.checkNotNull;
import static org.calrissian.mango.accumulo.types.impl.EncodingUtils.fromHex;

public class ByteEncoder extends AbstractByteEncoder<String> {
    @Override
    public String encode(Byte value) {
        checkNotNull(value, "Null values are not allowed");
        return String.format("%02x", value);
    }

    @Override
    public Byte decode(String value) {
        checkNotNull(value, "Null values are not allowed");
        return (byte) fromHex(value);
    }
}