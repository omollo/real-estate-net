package com.vertexnet.realestatenet.model.bean;

// Generated Jun 16, 2012 6:32:09 PM by Hibernate Tools 3.4.0.CR1

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

/**
 * Payment generated by hbm2java
 */
@Entity
@Table(name = "payment", catalog = "real_estate_net")
public class Payment implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	private Integer paymentId;
	private Agent agent;
	private Installment installment;
	private Site site;
	private Date paymentDate;

	public Payment() {
	}

	public Payment(Installment installment, Site site, Date paymentDate) {
		this.installment = installment;
		this.site = site;
		this.paymentDate = paymentDate;
	}

	public Payment(Agent agent, Installment installment, Site site, Date paymentDate) {
		this.agent = agent;
		this.installment = installment;
		this.site = site;
		this.paymentDate = paymentDate;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "payment_id", unique = true, nullable = false)
	public Integer getPaymentId() {
		return this.paymentId;
	}

	public void setPaymentId(Integer paymentId) {
		this.paymentId = paymentId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "agent_id")
	public Agent getAgent() {
		return this.agent;
	}

	public void setAgent(Agent agent) {
		this.agent = agent;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "installment_id", nullable = false)
	public Installment getInstallment() {
		return this.installment;
	}

	public void setInstallment(Installment installment) {
		this.installment = installment;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "site_id", nullable = false)
	public Site getSite() {
		return this.site;
	}

	public void setSite(Site site) {
		this.site = site;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "payment_date", nullable = false, length = 10)
	public Date getPaymentDate() {
		return this.paymentDate;
	}

	public void setPaymentDate(Date paymentDate) {
		this.paymentDate = paymentDate;
	}

	@Override
	public boolean equals(Object obj) {
		return EqualsBuilder.reflectionEquals(this, obj);
	}

	@Override
	public int hashCode() {
		return HashCodeBuilder.reflectionHashCode(this);
	}
}
