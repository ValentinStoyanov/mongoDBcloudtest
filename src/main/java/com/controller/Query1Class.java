package com.controller;

import com.model.Truck;
import com.model.Load;
import com.model.Driver;
import com.model.Coordinate;
import com.model.OriginDestiny;
import com.model.Owner;
import com.model.Trailer;
import com.model.Travel;

public class Query1Class {


	
	private  int loadcode;
	private int load;
	private String loadtype;
	private String origin;
	private String destiny;
	private String trailerbrand;
	
	
	public Query1Class() {
		
	}


	public int getLoadcode() {
		return loadcode;
	}


	public void setLoadcode(int loadcode) {
		this.loadcode = loadcode;
	}


	public int getLoad() {
		return load;
	}


	public void setLoad(int load) {
		this.load = load;
	}


	public String getLoadtype() {
		return loadtype;
	}


	public void setLoadtype(String loadtype) {
		this.loadtype = loadtype;
	}


	public String getOrigin() {
		return origin;
	}


	public void setOrigin(String origin) {
		this.origin = origin;
	}


	public String getDestiny() {
		return destiny;
	}


	public void setDestiny(String destiny) {
		this.destiny = destiny;
	}


	public String getTrailerbrand() {
		return trailerbrand;
	}


	public void setTrailerbrand(String trailerbrand) {
		this.trailerbrand = trailerbrand;
	}


	
}
