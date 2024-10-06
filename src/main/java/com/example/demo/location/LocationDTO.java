package com.example.demo.location;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
public class LocationDTO {
	private String id;
	private String name; //nazwamiejsc
	private String commune;//gmina
	private String district; //powiat
	private String province;//woj
}
