package com.kishoreb.pojo;

import java.util.List;

import org.springframework.web.bind.annotation.RequestParam;

import jakarta.validation.constraints.AssertTrue;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class UuserDTO {
	
	
	int Ro;
	List<UuserDTO>addList;
	
	
	public List<UuserDTO> getAddList() {
		return addList;
	}
	public void setAddList(List<UuserDTO> addList) {
		this.addList = addList;
	}
	@NotBlank(message = "Enter your Name")
	String yourname;
	@NotBlank(message = "Enter your Crush name")
	String crushname;
	
	@AssertTrue(message = "agree to play this game")
	Boolean ok;
	
	String relation;
	
	
	public int getRo() {
		return Ro;
	}
	public void setRo(int ro) {
		Ro = ro;
	}
	public String getRelation() {
		return relation;
	}
	public void setRelation(String relation) {
		this.relation = relation;
	}
	public Boolean getOk() {
		return ok;
	}
	public void setOk(Boolean ok) {
		this.ok = ok;
	}
	public String getYourname() {
		return yourname;
	}
	public void setYourname(String yourname) {
		this.yourname = yourname;
	}
	public String getCrushname() {
		return crushname;
	}
	public void setCrushname(String crushname) {
		this.crushname = crushname;
	}
	@Override
	public String toString() {
		return "UuserDTO [yourname=" + yourname + ", crushname=" + crushname + "]";
	}
	
}
