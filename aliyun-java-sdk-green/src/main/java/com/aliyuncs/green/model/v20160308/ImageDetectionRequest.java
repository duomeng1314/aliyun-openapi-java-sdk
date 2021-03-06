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
package com.aliyuncs.green.model.v20160308;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class ImageDetectionRequest extends RpcAcsRequest<ImageDetectionResponse> {
	
	public ImageDetectionRequest() {
		super("Green", "2016-03-08", "ImageDetection");
		setMethod(MethodType.POST);
	}

	private Boolean async;

	private List<String> imageUrls;

	private List<String> scenes;

	public Boolean getAsync() {
		return this.async;
	}

	public void setAsync(Boolean async) {
		this.async = async;
		putQueryParameter("Async", async);
	}

	public List<String> getImageUrls() {
		return this.imageUrls;
	}

	public void setImageUrls(List<String> imageUrls) {
		this.imageUrls = imageUrls;	
		for (int i = 0; i < imageUrls.size(); i++) {
			putQueryParameter("ImageUrl." + (i + 1) , imageUrls.get(i));
		}	
	}

	public List<String> getScenes() {
		return this.scenes;
	}

	public void setScenes(List<String> scenes) {
		this.scenes = scenes;	
		for (int i = 0; i < scenes.size(); i++) {
			putQueryParameter("Scene." + (i + 1) , scenes.get(i));
		}	
	}

	@Override
	public Class<ImageDetectionResponse> getResponseClass() {
		return ImageDetectionResponse.class;
	}

}
