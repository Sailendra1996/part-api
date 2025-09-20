package com.autoadda.apis.part.entity;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "location")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data

public class Location {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Integer id;

	@Column(name = "street_address_1")
	private String streetAddress1;

	@Column(name = "street_address_2")
	private String streetAddress2;

	@Column(name = "city")
	private String city;

	@Column(name = "postal_code")
	private String postalCode;
	@Column(name = "area")
	private String area;
	@Column(name = "state")
	private String state;

	@Column(name = "country")
	private String country;
	@Column(name = "gmap")
	private String gmap;

}
