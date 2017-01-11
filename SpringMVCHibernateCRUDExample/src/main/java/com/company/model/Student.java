package com.company.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Student {
	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int id;
	//personal details
	String studentName,fatherName,medium,classObtained,classSection,dob,address1,email,guardianName,guardianRelation,gender,
	caste,religion,nationality,motherTongue,address2,casteCat;
	int primaryContactNo,secondContactNo,pin;
	//Previous school Details
	String preSchoolName,passMonYr,passingClass,passingClassPercent;
	
	
	
	public Student() {
		super();
	}
	public Student(int i, int pCNo, int sCNo, int pin, String sName, String cObtained,
			String fName, String cSection, String dob, String addr1, String email, String medium, String guardianName,
			String guardianRelation, String preSchoolName, String passMonYr, String passingClass,
			String passingClassPercent,String gender,String caste,String religion,String nationality,
			String motherTongue,String address2,String casteCat) {
		super();
		this.id = i;
		this.primaryContactNo = pCNo;
		this.secondContactNo=sCNo;
		this.pin = pin;
		this.studentName = sName;
				this.fatherName = fName;
				this.medium = medium;
				this.classObtained = cObtained;
				this.classSection = cSection;
				this.dob = dob;
				this.address1 = addr1;
				this.email = email;
				this.guardianName = guardianName;
				this.guardianRelation = guardianRelation;
				this.preSchoolName = preSchoolName;
				this.passMonYr = passMonYr;
				this.passingClass = passingClass;
				this.passingClassPercent = passingClassPercent;
				this.gender = gender;
				this.caste = caste;
				this.religion = religion;
				this.nationality = nationality;
				this.motherTongue = motherTongue;
				this.address2 = address2;
				this.casteCat = casteCat;
				
				
				
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getFatherName() {
		return fatherName;
	}
	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}
	public String getMedium() {
		return medium;
	}
	public void setMedium(String medium) {
		this.medium = medium;
	}
	public String getClassObtained() {
		return classObtained;
	}
	public void setClassObtained(String classObtained) {
		this.classObtained = classObtained;
	}
	public String getClassSection() {
		return classSection;
	}
	public void setClassSection(String classSection) {
		this.classSection = classSection;
	}
	

	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getPrimaryContactNo() {
		return primaryContactNo;
	}
	public void setPrimaryContactNo(int primaryContactNo) {
		this.primaryContactNo = primaryContactNo;
	}
	public int getSecondContactNo() {
		return secondContactNo;
	}
	public void setSecondContactNo(int secondContactNo) {
		this.secondContactNo = secondContactNo;
	}
	public int getPin() {
		return pin;
	}
	public void setPin(int pin) {
		this.pin = pin;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getGuardianName() {
		return guardianName;
	}
	public void setGuardianName(String guardianName) {
		this.guardianName = guardianName;
	}
	public String getGuardianRelation() {
		return guardianRelation;
	}
	public void setGuardianRelation(String guardianRelation) {
		this.guardianRelation = guardianRelation;
	}
	public String getPreSchoolName() {
		return preSchoolName;
	}
	public void setPreSchoolName(String preSchoolName) {
		this.preSchoolName = preSchoolName;
	}
	
	public String getPassMonYr() {
		return passMonYr;
	}
	public void setPassMonYr(String passMonYr) {
		this.passMonYr = passMonYr;
	}
	public String getPassingClass() {
		return passingClass;
	}
	public void setPassingClass(String passingClass) {
		this.passingClass = passingClass;
	}
	public String getPassingClassPercent() {
		return passingClassPercent;
	}
	public void setPassingClassPercent(String passingClassPercent) {
		this.passingClassPercent = passingClassPercent;
	}
	public String getAddress1() {
		return address1;
	}
	public void setAddress1(String address1) {
		this.address1 = address1;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getCaste() {
		return caste;
	}
	public void setCaste(String caste) {
		this.caste = caste;
	}
	public String getReligion() {
		return religion;
	}
	public void setReligion(String religion) {
		this.religion = religion;
	}
	public String getNationality() {
		return nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	public String getMotherTongue() {
		return motherTongue;
	}
	public void setMotherTongue(String motherTongue) {
		this.motherTongue = motherTongue;
	}
	public String getAddress2() {
		return address2;
	}
	public void setAddress2(String address2) {
		this.address2 = address2;
	}
	public String getCasteCat() {
		return casteCat;
	}
	public void setCasteCat(String casteCat) {
		this.casteCat = casteCat;
	}
	
}
