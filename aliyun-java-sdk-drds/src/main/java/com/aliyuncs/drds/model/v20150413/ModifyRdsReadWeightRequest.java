/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.aliyuncs.drds.model.v20150413;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class ModifyRdsReadWeightRequest extends RpcAcsRequest<ModifyRdsReadWeightResponse> {
	
	public ModifyRdsReadWeightRequest() {
		super("Drds", "2015-04-13", "ModifyRdsReadWeight");
	}

	private String drdsInstanceId;

	private String dbName;

	private String instanceNames;

	private String weights;

	public String getDrdsInstanceId() {
		return this.drdsInstanceId;
	}

	public void setDrdsInstanceId(String drdsInstanceId) {
		this.drdsInstanceId = drdsInstanceId;
		putQueryParameter("DrdsInstanceId", drdsInstanceId);
	}

	public String getDbName() {
		return this.dbName;
	}

	public void setDbName(String dbName) {
		this.dbName = dbName;
		putQueryParameter("DbName", dbName);
	}

	public String getInstanceNames() {
		return this.instanceNames;
	}

	public void setInstanceNames(String instanceNames) {
		this.instanceNames = instanceNames;
		putQueryParameter("InstanceNames", instanceNames);
	}

	public String getWeights() {
		return this.weights;
	}

	public void setWeights(String weights) {
		this.weights = weights;
		putQueryParameter("Weights", weights);
	}

	@Override
	public Class<ModifyRdsReadWeightResponse> getResponseClass() {
		return ModifyRdsReadWeightResponse.class;
	}

}
