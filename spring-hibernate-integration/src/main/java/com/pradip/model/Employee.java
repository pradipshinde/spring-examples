package com.pradip.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Pradip
 *
 */
@Entity
@Table(name="employee")
public class Employee {

@Id
@Column(name="eid", nullable=false)
private int eid;

@Column(name="ename" , nullable=false,length=45)
private String ename;

@Column(name="salary",nullable=false)
private long salary;

public int getEid() {
	return eid;
}

public void setEid(int eid) {
	this.eid = eid;
}

public String getEname() {
	return ename;
}

public void setEname(String ename) {
	this.ename = ename;
}

public long getSalary() {
	return salary;
}

public void setSalary(long salary) {
	this.salary = salary;
}


}
