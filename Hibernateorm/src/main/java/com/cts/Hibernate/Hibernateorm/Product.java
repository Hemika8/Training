package com.cts.Hibernate.Hibernateorm;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Product {
	@Id
private int pid;
private String productname;
private double price;
public int getPid() {
	return pid;
}
public void setPid(int pid) {
	this.pid = pid;
}
public String getProductname() {
	return productname;
}
public void setProductname(String productname) {
	this.productname = productname;
}
public double getPrice() {
	return price;
}
public void setPrice(float price) {
	this.price = price;
}
public Product()
{
	
}
public Product(int pid, String productname, double d) {
	this.pid = pid;
	this.productname = productname;
	this.price = d;
}
@Override
public String toString() {
	return "Product [pid=" + pid + ", productname=" + productname + ", price=" + price + "]";
}

}
