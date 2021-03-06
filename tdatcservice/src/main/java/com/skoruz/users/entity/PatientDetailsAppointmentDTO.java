package com.skoruz.users.entity;


import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import org.codehaus.jackson.annotate.JsonManagedReference;

@Entity
@Table(name="patient_details")

public class PatientDetailsAppointmentDTO implements  Serializable {


	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
//	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="patient_id")
	private  int  patient_id;
	
	
	@OneToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="user_id")
	private User user;

	public PatientDetailsAppointmentDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
	public PatientDetailsAppointmentDTO(User user, boolean notificationAlert,
			boolean isPrimarySubscriber, boolean assesmentCompletionAlert,
			boolean assesmentNotificationAlert, Integer totalAmountPaid,
			int healthPlanId) {
		super();
		this.user = user;
		this.notificationAlert = notificationAlert;
		this.isPrimarySubscriber = isPrimarySubscriber;
		this.assesmentCompletionAlert = assesmentCompletionAlert;
		this.assesmentNotificationAlert = assesmentNotificationAlert;
		this.totalAmountPaid = totalAmountPaid;
		this.healthPlanId = healthPlanId;
	}





	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Column(name="notification_alert")
	private boolean notificationAlert;

	@Column(name="is_primary_subscriber")
	private boolean isPrimarySubscriber;

	@Column(name="assessment_completion_alert")
	private boolean assesmentCompletionAlert;

	@Column(name="assessment_notification_alert")
	private boolean assesmentNotificationAlert;

	@Column(name="total_amount_paid")
	private Integer totalAmountPaid;

	@Column(name="health_plan_id")
	private int healthPlanId;

	/*@OneToOne(fetch = FetchType.EAGER, mappedBy = "patientDetailsAppointmentDTO", cascade = CascadeType.ALL)
	@JsonManagedReference(value="patient")
	private PatientAppointmentDetails patientAppointmentDetails;
	*/
	

	public boolean isNotificationAlert() {
		return notificationAlert;
	}
	public void setNotificationAlert(boolean notificationAlert) {
		this.notificationAlert = notificationAlert;
	}
	public boolean getIsPrimarySubscriber() {
		return isPrimarySubscriber;
	}
	public void setPrimarySubscriber(boolean isPrimarySubscriber) {
		this.isPrimarySubscriber = isPrimarySubscriber;
	}
	public boolean isAssesmentCompletionAlert() {
		return assesmentCompletionAlert;
	}
	public void setAssesmentCompletionAlert(boolean assesmentCompletionAlert) {
		this.assesmentCompletionAlert = assesmentCompletionAlert;
	}
	public boolean isAssesmentNotificationAlert() {
		return assesmentNotificationAlert;
	}
	public void setAssesmentNotificationAlert(boolean assesmentNotificationAlert) {
		this.assesmentNotificationAlert = assesmentNotificationAlert;
	}
	public Integer getTotalAmountPaid() {
		return totalAmountPaid;
	}
	public void setTotalAmountPaid(Integer totalAmountPaid) {
		this.totalAmountPaid = totalAmountPaid;
	}
	public int getHealthPlanId() {
		return healthPlanId;
	}
	public void setHealthPlanId(int healthPlanId) {
		this.healthPlanId = healthPlanId;
	}
	/*public PatientAppointmentDetails getPatientAppointmentDetails() {
		return patientAppointmentDetails;
	}
	public void setPatientAppointmentDetails(
			PatientAppointmentDetails patientAppointmentDetails) {
		this.patientAppointmentDetails = patientAppointmentDetails;
	}
*/
	
	



}


















