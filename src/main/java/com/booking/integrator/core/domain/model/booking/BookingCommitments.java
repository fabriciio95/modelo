package com.booking.integrator.core.domain.model.booking;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.booking.integrator.core.domain.model.Booking;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@Entity
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class BookingCommitments implements Serializable {
	private static final long serialVersionUID = -6204852316057546993L;

	@Id
	@EqualsAndHashCode.Include
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idBookingCommitments;
	
	private String commitmentRequestNumber;

	@ManyToOne
	private Booking booking;

}
