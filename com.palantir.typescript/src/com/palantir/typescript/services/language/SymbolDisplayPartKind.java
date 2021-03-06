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
 * Corresponds to the class with the same name in TypeScript.
 *
 * @author dcicerone
 */
public enum SymbolDisplayPartKind {

    ALIAS_NAME("aliasName"),
    CLASS_NAME("className"),
    ENUM_NAME("enumName"),
    FIELD_NAME("fieldName"),
    INTERFACE_NAME("interfaceName"),
    KEYWORD("keyword"),
    LABEL_NAME("labelName"),
    LINE_BREAK("lineBreak"),
    NUMERIC_LITERAL("numericLiteral"),
    STRING_LITERAL("stringLiteral"),
    LOCAL_NAME("localName"),
    METHOD_NAME("methodName"),
    MODULE_NAME("moduleName"),
    NAMESPACE_NAME("namespaceName"),
    OPERATOR("operator"),
    PARAMETER_NAME("parameterName"),
    PROPERTY_NAME("propertyName"),
    PUNCTUATION("punctuation"),
    SPACE("space"),
    ANONYMOUS_TYPE_INDICATOR("anonymousTypeIndicator"),
    TEXT("text"),
    TYPE_PARAMETER_NAME("typeParameterName"),
    ENUM_MEMBER_NAME("enumMemberName"),
    FUNCTION_NAME("functionName"),
    REGULAR_EXPRESSION_LITERAL("regularExpressionLiteral");

    private final String value;

    SymbolDisplayPartKind(String value) {
        this.value = value;
    }

    @JsonValue
    public String getValue() {
        return this.value;
    }
}
