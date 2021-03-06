/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.qualitycheck.model.v20190115;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.qualitycheck.transform.v20190115.ValidateRoleSetResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ValidateRoleSetResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String code;

	private String message;

	private List<SentenceResult> data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public List<SentenceResult> getData() {
		return this.data;
	}

	public void setData(List<SentenceResult> data) {
		this.data = data;
	}

	public static class SentenceResult {

		private Long beginTime;

		private Integer channelId;

		private Long endTime;

		private String text;

		private Integer emotionValue;

		private Integer silenceDuration;

		private Integer speechRate;

		public Long getBeginTime() {
			return this.beginTime;
		}

		public void setBeginTime(Long beginTime) {
			this.beginTime = beginTime;
		}

		public Integer getChannelId() {
			return this.channelId;
		}

		public void setChannelId(Integer channelId) {
			this.channelId = channelId;
		}

		public Long getEndTime() {
			return this.endTime;
		}

		public void setEndTime(Long endTime) {
			this.endTime = endTime;
		}

		public String getText() {
			return this.text;
		}

		public void setText(String text) {
			this.text = text;
		}

		public Integer getEmotionValue() {
			return this.emotionValue;
		}

		public void setEmotionValue(Integer emotionValue) {
			this.emotionValue = emotionValue;
		}

		public Integer getSilenceDuration() {
			return this.silenceDuration;
		}

		public void setSilenceDuration(Integer silenceDuration) {
			this.silenceDuration = silenceDuration;
		}

		public Integer getSpeechRate() {
			return this.speechRate;
		}

		public void setSpeechRate(Integer speechRate) {
			this.speechRate = speechRate;
		}
	}

	@Override
	public ValidateRoleSetResponse getInstance(UnmarshallerContext context) {
		return	ValidateRoleSetResponseUnmarshaller.unmarshall(this, context);
	}
}
