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
package org.smartloli.kafka.eagle.core.metrics;

import org.smartloli.kafka.eagle.common.protocol.PropertyInfo;

/**
 * KafkaMetricsService to collect kafka performance kpi.
 * 
 * @author smartloli.
 *
 *         Created by Oct 26, 2018
 */
public interface KafkaMetricsService {

	/** Get topic size by jmx. */
	public String topicSize(String clusterAlias, String topic);

	/** Change topic config property. */
	public String changeTopicConfig(String clusterAlias, String topic, PropertyInfo property);

	/** Get topic config property. */
	public String getTopicConfig(String clusterAlias, String topic);

	/** Get topic config property by specified. */
	public String getTopicConfig(String clusterAlias, String topic, PropertyInfo property);

}
