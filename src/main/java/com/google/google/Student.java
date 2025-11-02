package com.google.google;
public class Student {
String name;
String email;
long phone;
String Gender;
String select;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public long getPhone() {
	return phone;
}
public void setPhone(long phone) {
	this.phone = phone;
}
public String getGender() {
	return Gender;
}
public void setGender(String gender) {
	Gender = gender;
}
public String getSelect() {
	return select;
}
public void setSelect(String select) {
	this.select = select;
	
}
@Override
public String toString() {
	return "Student [name=" + name + ", email=" + email + ", phone=" + phone + ", Gender=" + Gender + ", select="
			+ select + "]";
}
}