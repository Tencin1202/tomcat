/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
/* Generated By:JJTree: Do not edit this line. AstDotSuffix.java */
package org.apache.el.parser;

import org.apache.el.lang.EvaluationContext;

public final class AstMethodParameters extends SimpleNode {

    private static final Object[] EMPTY_OBJECT_ARRAY = new Object[0];

    public AstMethodParameters(int id) {
        super(id);
    }


    public Object[] getParameters(EvaluationContext ctx) {
        int numChildren = this.jjtGetNumChildren();
        // Optimise simple case
        if (numChildren == 0) {
            return EMPTY_OBJECT_ARRAY;
        }
        Object[] params = new Object[numChildren];
        for (int i = 0; i < numChildren; i++) {
            params[i] = this.jjtGetChild(i).getValue(ctx);
        }
        return params;
    }


    @Override
    public String toString() {
        // Purely for debug purposes. May not be complete or correct. Certainly
        // is not efficient. Be sure not to call this from 'real' code.
        StringBuilder result = new StringBuilder();
        result.append('(');
        if (children != null) {
            for (Node n : children) {
                result.append(n.toString());
                result.append(',');
            }
        }
        result.append(')');
        return result.toString();
    }
}
