/*
 * Copyright 2013 Palantir Technologies, Inc.
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

package com.palantir.typescript.services.language;

import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Corresponds to the enum with the same name in TypeScript.
 *
 * @author tyleradams
 */
public enum ScriptTarget {

    ECMASCRIPT3(0), ECMASCRIPT5(1), ECMASCRIPT6(2);

    private final int value;

    ScriptTarget(int value) {
        this.value = value;
    }

    @JsonValue
    public int getValue() {
        return this.value;
    }

    public static ScriptTarget parse(String itemName) {
        try {
            return valueOf(itemName);
        } catch (Exception e) {
            return ECMASCRIPT3;
        }
    }
}
