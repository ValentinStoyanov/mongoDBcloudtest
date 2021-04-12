package com.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "loads")
public class Load {

	

	public Load(int code, String type, int load, String idorigin, String iddestiny) {
		super();
		this.code = code;
		this.type = type;
		this.load = load;
		this.idorigin = idorigin;
		this.iddestiny = iddestiny;
	}
	private String id;
	private int code;
	private String type;
	private int load;
	private String idorigin;
	private String iddestiny;
	
	
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getLoad() {
		return load;
	}
	public void setLoad(int load) {
		this.load = load;
	}
	public String getIdorigin() {
		return idorigin;
	}
	public void setIdorigin(String idorigin) {
		this.idorigin = idorigin;
	}
	public String getIddestiny() {
		return iddestiny;
	}
	public void setIddestiny(String iddestiny) {
		this.iddestiny = iddestiny;
	}
	

	
	
}
