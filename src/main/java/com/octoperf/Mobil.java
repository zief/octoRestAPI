package com.octoperf;

import lombok.Data;

@Data
public class Mobil {
	String mobil, harga;

	public String getMobil() {
		return mobil;
	}

	public void setMobil(String mobil) {
		this.mobil = mobil;
	}

	public String getHarga() {
		return harga;
	}

	public void setHarga(String harga) {
		this.harga = harga;
	}
	
	
}
