package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 社区物业报事报修单状态更新
 *
 * @author auto create
 * @since 1.0, 2016-10-26 18:05:19
 */
public class AlipayEcoCplifeRepairStatusUpdateModel extends AlipayObject {

	private static final long serialVersionUID = 3851589719121292366L;

	/**
	 * 报修单状态明细
	 */
	@ApiField("biz_details")
	private String bizDetails;

	/**
	 * 当前报修单状态
	 */
	@ApiField("biz_state")
	private String bizState;

	/**
	 * 报修单ID
	 */
	@ApiField("req_id")
	private String reqId;

	public String getBizDetails() {
		return this.bizDetails;
	}
	public void setBizDetails(String bizDetails) {
		this.bizDetails = bizDetails;
	}

	public String getBizState() {
		return this.bizState;
	}
	public void setBizState(String bizState) {
		this.bizState = bizState;
	}

	public String getReqId() {
		return this.reqId;
	}
	public void setReqId(String reqId) {
		this.reqId = reqId;
	}

}
