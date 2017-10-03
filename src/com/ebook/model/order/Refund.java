package com.ebook.model.order;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Refund {
	@Id
	private String refundId;
	private String refundStatus;
	private Double total;
	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn
	private OrderDetail orderDetail;
	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn
	private PaymentMethod paymentMethod;

	public Refund() {

	}

	public Refund(String refundId, String refundStatus, Double total, OrderDetail orderDetail,
			PaymentMethod paymentMethod) {
		this.refundId = refundId;
		this.refundStatus = refundStatus;
		this.total = total;
		this.orderDetail = orderDetail;
		this.paymentMethod = paymentMethod;
	}

	public String getRefundId() {
		return refundId;
	}

	public void setRefundId(String refundId) {
		this.refundId = refundId;
	}

	public String getRefundStatus() {
		return refundStatus;
	}

	public void setRefundStatus(String refundStatus) {
		this.refundStatus = refundStatus;
	}

	public Double getTotal() {
		return total;
	}

	public void setTotal(Double total) {
		this.total = total;
	}

	public OrderDetail getOrderDetail() {
		return orderDetail;
	}

	public void setOrderDetail(OrderDetail orderDetail) {
		this.orderDetail = orderDetail;
	}

	public PaymentMethod getPaymentMethod() {
		return paymentMethod;
	}

	public void setPaymentMethod(PaymentMethod paymentMethod) {
		this.paymentMethod = paymentMethod;
	}

}