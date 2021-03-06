/**
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.component.smbj;

import org.apache.camel.component.file.GenericFileProducer;

import java.util.Objects;

/**
 * This class is the smb consumer implementation.
 *
 * @author Thomas Herzog <herzog.thomas81@gmail.com>
 * @since 10/26/2018
 */
public class SmbProducer extends GenericFileProducer<SmbFile> {

    public SmbProducer(final SmbEndpoint endpoint,
                       final SmbFileOperations operations) {
        super(Objects.requireNonNull(endpoint, "Cannot create producer with null endpoint"),
              Objects.requireNonNull(operations, "Cannot create producer with null operations"));
    }

    @Override
    public String getFileSeparator() {
        return "\\";
    }
}
