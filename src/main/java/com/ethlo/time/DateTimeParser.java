package com.ethlo.time;

/*-
 * #%L
 * Internet Time Utility
 * %%
 * Copyright (C) 2017 - 2024 Morten Haraldsen (ethlo)
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */

import java.text.ParsePosition;
import java.time.DateTimeException;

public interface DateTimeParser
{
    /**
     * Parse the text from the given position of the parsePosition
     *
     * @param text          The text to parse
     * @param parsePosition The position in which to start
     * @return A DateTime holding the parsed data
     * @throws DateTimeException If the data is not according to the format specified
     */
    DateTime parse(String text, ParsePosition parsePosition) throws DateTimeException;

    default DateTime parse(String text) throws DateTimeException
    {
        return parse(text, new ParsePosition(0));
    }
}
