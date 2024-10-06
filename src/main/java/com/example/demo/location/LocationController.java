package com.example.demo.location;

import java.net.URISyntaxException;
import java.util.LinkedList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.terytapi.TerytApiClient;
import com.example.demo.wsdl.Miejscowosc;
import com.example.demo.wsdl.WyszukajMiejscowoscResponse;

@RestController
@RequestMapping("/location")
public class LocationController {
	private final int MAX_RESULT_SIZE = 400;
	
	@Autowired
	private TerytApiClient terytApiClient;
	 
	@CrossOrigin
	@GetMapping("/{city}")
	public List<LocationDTO> search(@PathVariable String city) {
		System.out.println(city);
		
		if (city.isBlank() || city.length() < 2) {
			return new LinkedList<LocationDTO>();
		}
		WyszukajMiejscowoscResponse miejscowoscResponse = null;
		try {
			miejscowoscResponse = terytApiClient.search(city);
		} catch (URISyntaxException e) {
			e.printStackTrace();
		}
		
		List<LocationDTO> locations = new LinkedList<>();
		
		if (miejscowoscResponse != null) {
			for (Miejscowosc miejscowosc : miejscowoscResponse.getWyszukajMiejscowoscResult().getValue().getMiejscowosc()) {
				if (locations.size() < MAX_RESULT_SIZE) {
				locations.add(
						new LocationDTO(
								miejscowosc.getSymbol().getValue(),
								miejscowosc.getNazwa().getValue(),
								miejscowosc.getGmina().getValue(),
								miejscowosc.getPowiat().getValue(),
								miejscowosc.getWojewodztwo().getValue())
						);
				}
			}
		}
		return locations;
	}

}
