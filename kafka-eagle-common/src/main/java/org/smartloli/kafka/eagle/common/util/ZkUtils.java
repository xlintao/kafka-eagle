/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.smartloli.kafka.eagle.common.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
* Zookeeper utils.
* 
* @author smartloli.
*
* Created by Jun 1, 2019
*/
public class ZkUtils {

	private final static Logger LOG = LoggerFactory.getLogger(KafkaZKPoolUtils.class);
	
	public static final int ZK_CONNECTION_TIMEOUT_MS = 30_000;
	public static final int ZK_SESSION_TIMEOUT_MS = 30_000;
	
	
}
