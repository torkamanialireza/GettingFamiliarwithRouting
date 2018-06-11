package com.alireza.secondproject;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DojoController {
	@RequestMapping("/{city}")
    public String index(@PathVariable String city) {
			if ( city.equals("burbank-dojo")) {
				return "Burbank Dojo is located in Souther California";
			}
			else if ( city.equals("san-jose")) {
				return "SJ dojo is the headquarters";
			}
		return  "the " + city + " is awesome.";		
        
    }

}
