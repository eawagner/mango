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


import org.calrissian.mango.types.encoders.AbstractDoubleEncoder;

import static com.google.common.base.Preconditions.checkNotNull;
import static org.calrissian.mango.types.encoders.lexi.EncodingUtils.*;

public class DoubleEncoder extends AbstractDoubleEncoder<String> {
    @Override
    public String encode(Double value) {
        checkNotNull(value, "Null values are not allowed");
        return encodeULong(normalizeDouble(value));
    }

    @Override
    public Double decode(String value) {
        checkNotNull(value, "Null values are not allowed");
        return denormalizeDouble(fromHex(value));
    }
}
