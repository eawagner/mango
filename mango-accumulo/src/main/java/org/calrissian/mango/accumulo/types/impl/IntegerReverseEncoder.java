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


import org.calrissian.mango.types.encoders.AbstractIntegerEncoder;

import static com.google.common.base.Preconditions.checkNotNull;

public class IntegerReverseEncoder extends AbstractIntegerEncoder<String> {

    private static final IntegerEncoder intEncoder = new IntegerEncoder();

    @Override
    public String encode(Integer value) {
        checkNotNull(value, "Null values are not allowed");
        return intEncoder.encode(~value);
    }

    @Override
    public Integer decode(String value) {
        checkNotNull(value, "Null values are not allowed");
        return ~intEncoder.decode(value);
    }
}
