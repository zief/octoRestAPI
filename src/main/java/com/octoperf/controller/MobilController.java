package com.octoperf.controller;

import static lombok.AccessLevel.PACKAGE;
import static lombok.AccessLevel.PRIVATE;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.octoperf.Mobil;


import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;

@RestController
@RequestMapping("/mobil")
@AllArgsConstructor(access = PACKAGE )
@FieldDefaults(level = PRIVATE, makeFinal = true)
public class MobilController {
	
	@GetMapping("/mobil")
	  public Mobil mobil() {
	       Mobil mobil = new Mobil();
	       mobil.setMobil("Alphard");
	       mobil.setHarga("900.000.000");
	       
	       return mobil;
	  }
	
	@PostMapping("/mobil")
	public String postHello(@RequestBody final Mobil mobil) {
	  return "Mobil " + mobil.getMobil() + "dan harga " +mobil.getHarga() + "!";
	}
	
	@PutMapping("/mobil")
	public String postMobil(@RequestBody final Mobil mobil) {
		return "Mobil " + mobil.getMobil() + " dan harga " +mobil.getHarga() + "!";
		
	}
}
