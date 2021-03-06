/**
 * Copyright 2016 Emmanuel Bourg
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

package net.jsign.pe;

import junit.framework.TestCase;

public class MachineTypeTest extends TestCase {
    
    public void testValueOf() {
        assertEquals(MachineType.ARM64, MachineType.valueOf(0xaa64));
        assertNull(MachineType.valueOf(0xbb8));
    }
}
