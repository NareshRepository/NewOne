package com.nt.model;

import lombok.Data;

@Data
public class Student {
	private String sname;
	public Student() {
		super();
	}

	private Double avg;
	private Boolean vaccinated;
	private Integer sno;
	
	public Integer getSno() {
		return sno;
	}
	public void setSno(Integer sno) {
		this.sno = sno;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public Double getAvg() {
		return avg;
	}
	public void setAvg(Double avg) {
		this.avg = avg;
	}
	public Boolean getVaccinated() {
		return vaccinated;
	}
	public void setVaccinated(Boolean vaccinated) {
		this.vaccinated = vaccinated;
	}
	
	@Override
	public String toString() {
		return "Student [sno=" + sno + ", sname=" + sname + ", avg=" + avg + ", vaccinated=" + vaccinated + "]";
	}
	
	
	

}
