package com.vedisoft.pojos;

import java.util.Date;

public class Student {
	protected int registrationId;
	protected Date registrationDate;
	protected String name;
	protected String course;
	protected String sem;
	protected String laddress;
	protected String paddress;
	protected String flag;
	protected Date dob;
	protected String mno;
	protected String pno;
	protected String email;
	protected String campus;
	protected Date doj;
	protected String package1;
	protected int enquiryId;
	protected String branch;
	protected int collegeId;
	protected String password;
	protected int branchId;
	protected int cardNo;
	protected String createdBy;
	protected Date creationDate;
	protected String lastUpdatedBy;
	protected Date lastUpdationDate;
	protected String regId;
	protected String company;
	protected String extra3;
	/**
	 * 
	 */
	public Student() {
		super();
	}
	/**
	 * @param registrationDate
	 * @param name
	 * @param course
	 * @param sem
	 * @param laddress
	 * @param paddress
	 * @param flag
	 * @param dob
	 * @param mno
	 * @param pno
	 * @param email
	 * @param campus
	 * @param doj
	 * @param package1
	 * @param enquiryId
	 * @param branch
	 * @param collegeId
	 * @param password
	 * @param branchId
	 * @param cardNo
	 * @param createdBy
	 * @param creationDate
	 * @param lastUpdatedBy
	 * @param lastUpdationDate
	 * @param regId
	 * @param company
	 * @param extra3
	 */
	public Student(Date registrationDate, String name, String course, String sem, String laddress, String paddress,
			String flag, Date dob, String mno, String pno, String email, String campus, Date doj, String package1,
			int enquiryId, String branch, int collegeId, String password, int branchId, int cardNo, String createdBy,
			Date creationDate, String lastUpdatedBy, Date lastUpdationDate, String regId, String company,
			String extra3) {
		super();
		this.registrationDate = registrationDate;
		this.name = name;
		this.course = course;
		this.sem = sem;
		this.laddress = laddress;
		this.paddress = paddress;
		this.flag = flag;
		this.dob = dob;
		this.mno = mno;
		this.pno = pno;
		this.email = email;
		this.campus = campus;
		this.doj = doj;
		this.package1 = package1;
		this.enquiryId = enquiryId;
		this.branch = branch;
		this.collegeId = collegeId;
		this.password = password;
		this.branchId = branchId;
		this.cardNo = cardNo;
		this.createdBy = createdBy;
		this.creationDate = creationDate;
		this.lastUpdatedBy = lastUpdatedBy;
		this.lastUpdationDate = lastUpdationDate;
		this.regId = regId;
		this.company = company;
		this.extra3 = extra3;
	}
	/**
	 * @param registrationId
	 * @param registrationDate
	 * @param name
	 * @param course
	 * @param sem
	 * @param laddress
	 * @param paddress
	 * @param flag
	 * @param dob
	 * @param mno
	 * @param pno
	 * @param email
	 * @param campus
	 * @param doj
	 * @param package1
	 * @param enquiryId
	 * @param branch
	 * @param collegeId
	 * @param password
	 * @param branchId
	 * @param cardNo
	 * @param createdBy
	 * @param creationDate
	 * @param lastUpdatedBy
	 * @param lastUpdationDate
	 * @param regId
	 * @param company
	 * @param extra3
	 */
	public Student(int registrationId, Date registrationDate, String name, String course, String sem, String laddress,
			String paddress, String flag, Date dob, String mno, String pno, String email, String campus, Date doj,
			String package1, int enquiryId, String branch, int collegeId, String password, int branchId, int cardNo,
			String createdBy, Date creationDate, String lastUpdatedBy, Date lastUpdationDate, String regId,
			String company, String extra3) {
		super();
		this.registrationId = registrationId;
		this.registrationDate = registrationDate;
		this.name = name;
		this.course = course;
		this.sem = sem;
		this.laddress = laddress;
		this.paddress = paddress;
		this.flag = flag;
		this.dob = dob;
		this.mno = mno;
		this.pno = pno;
		this.email = email;
		this.campus = campus;
		this.doj = doj;
		this.package1 = package1;
		this.enquiryId = enquiryId;
		this.branch = branch;
		this.collegeId = collegeId;
		this.password = password;
		this.branchId = branchId;
		this.cardNo = cardNo;
		this.createdBy = createdBy;
		this.creationDate = creationDate;
		this.lastUpdatedBy = lastUpdatedBy;
		this.lastUpdationDate = lastUpdationDate;
		this.regId = regId;
		this.company = company;
		this.extra3 = extra3;
	}
	/**
	 * @return the registrationId
	 */
	public int getRegistrationId() {
		return registrationId;
	}
	/**
	 * @param registrationId the registrationId to set
	 */
	public void setRegistrationId(int registrationId) {
		this.registrationId = registrationId;
	}
	/**
	 * @return the registrationDate
	 */
	public Date getRegistrationDate() {
		return registrationDate;
	}
	/**
	 * @param registrationDate the registrationDate to set
	 */
	public void setRegistrationDate(Date registrationDate) {
		this.registrationDate = registrationDate;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the course
	 */
	public String getCourse() {
		return course;
	}
	/**
	 * @param course the course to set
	 */
	public void setCourse(String course) {
		this.course = course;
	}
	/**
	 * @return the sem
	 */
	public String getSem() {
		return sem;
	}
	/**
	 * @param sem the sem to set
	 */
	public void setSem(String sem) {
		this.sem = sem;
	}
	/**
	 * @return the laddress
	 */
	public String getLaddress() {
		return laddress;
	}
	/**
	 * @param laddress the laddress to set
	 */
	public void setLaddress(String laddress) {
		this.laddress = laddress;
	}
	/**
	 * @return the paddress
	 */
	public String getPaddress() {
		return paddress;
	}
	/**
	 * @param paddress the paddress to set
	 */
	public void setPaddress(String paddress) {
		this.paddress = paddress;
	}
	/**
	 * @return the flag
	 */
	public String getFlag() {
		return flag;
	}
	/**
	 * @param flag the flag to set
	 */
	public void setFlag(String flag) {
		this.flag = flag;
	}
	/**
	 * @return the dob
	 */
	public Date getDob() {
		return dob;
	}
	/**
	 * @param dob the dob to set
	 */
	public void setDob(Date dob) {
		this.dob = dob;
	}
	/**
	 * @return the mno
	 */
	public String getMno() {
		return mno;
	}
	/**
	 * @param mno the mno to set
	 */
	public void setMno(String mno) {
		this.mno = mno;
	}
	/**
	 * @return the pno
	 */
	public String getPno() {
		return pno;
	}
	/**
	 * @param pno the pno to set
	 */
	public void setPno(String pno) {
		this.pno = pno;
	}
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * @return the campus
	 */
	public String getCampus() {
		return campus;
	}
	/**
	 * @param campus the campus to set
	 */
	public void setCampus(String campus) {
		this.campus = campus;
	}
	/**
	 * @return the doj
	 */
	public Date getDoj() {
		return doj;
	}
	/**
	 * @param doj the doj to set
	 */
	public void setDoj(Date doj) {
		this.doj = doj;
	}
	/**
	 * @return the package1
	 */
	public String getPackage1() {
		return package1;
	}
	/**
	 * @param package1 the package1 to set
	 */
	public void setPackage1(String package1) {
		this.package1 = package1;
	}
	/**
	 * @return the enquiryId
	 */
	public int getEnquiryId() {
		return enquiryId;
	}
	/**
	 * @param enquiryId the enquiryId to set
	 */
	public void setEnquiryId(int enquiryId) {
		this.enquiryId = enquiryId;
	}
	/**
	 * @return the branch
	 */
	public String getBranch() {
		return branch;
	}
	/**
	 * @param branch the branch to set
	 */
	public void setBranch(String branch) {
		this.branch = branch;
	}
	/**
	 * @return the collegeId
	 */
	public int getCollegeId() {
		return collegeId;
	}
	/**
	 * @param collegeId the collegeId to set
	 */
	public void setCollegeId(int collegeId) {
		this.collegeId = collegeId;
	}
	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	/**
	 * @return the branchId
	 */
	public int getBranchId() {
		return branchId;
	}
	/**
	 * @param branchId the branchId to set
	 */
	public void setBranchId(int branchId) {
		this.branchId = branchId;
	}
	/**
	 * @return the cardNo
	 */
	public int getCardNo() {
		return cardNo;
	}
	/**
	 * @param cardNo the cardNo to set
	 */
	public void setCardNo(int cardNo) {
		this.cardNo = cardNo;
	}
	/**
	 * @return the createdBy
	 */
	public String getCreatedBy() {
		return createdBy;
	}
	/**
	 * @param createdBy the createdBy to set
	 */
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	/**
	 * @return the creationDate
	 */
	public Date getCreationDate() {
		return creationDate;
	}
	/**
	 * @param creationDate the creationDate to set
	 */
	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}
	/**
	 * @return the lastUpdatedBy
	 */
	public String getLastUpdatedBy() {
		return lastUpdatedBy;
	}
	/**
	 * @param lastUpdatedBy the lastUpdatedBy to set
	 */
	public void setLastUpdatedBy(String lastUpdatedBy) {
		this.lastUpdatedBy = lastUpdatedBy;
	}
	/**
	 * @return the lastUpdationDate
	 */
	public Date getLastUpdationDate() {
		return lastUpdationDate;
	}
	/**
	 * @param lastUpdationDate the lastUpdationDate to set
	 */
	public void setLastUpdationDate(Date lastUpdationDate) {
		this.lastUpdationDate = lastUpdationDate;
	}
	/**
	 * @return the regId
	 */
	public String getRegId() {
		return regId;
	}
	/**
	 * @param regId the regId to set
	 */
	public void setRegId(String regId) {
		this.regId = regId;
	}
	/**
	 * @return the company
	 */
	public String getCompany() {
		return company;
	}
	/**
	 * @param company the company to set
	 */
	public void setCompany(String company) {
		this.company = company;
	}
	/**
	 * @return the extra3
	 */
	public String getExtra3() {
		return extra3;
	}
	/**
	 * @param extra3 the extra3 to set
	 */
	public void setExtra3(String extra3) {
		this.extra3 = extra3;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((branch == null) ? 0 : branch.hashCode());
		result = prime * result + branchId;
		result = prime * result + ((campus == null) ? 0 : campus.hashCode());
		result = prime * result + cardNo;
		result = prime * result + collegeId;
		result = prime * result + ((company == null) ? 0 : company.hashCode());
		result = prime * result + ((course == null) ? 0 : course.hashCode());
		result = prime * result + ((createdBy == null) ? 0 : createdBy.hashCode());
		result = prime * result + ((creationDate == null) ? 0 : creationDate.hashCode());
		result = prime * result + ((dob == null) ? 0 : dob.hashCode());
		result = prime * result + ((doj == null) ? 0 : doj.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + enquiryId;
		result = prime * result + ((extra3 == null) ? 0 : extra3.hashCode());
		result = prime * result + ((flag == null) ? 0 : flag.hashCode());
		result = prime * result + ((laddress == null) ? 0 : laddress.hashCode());
		result = prime * result + ((lastUpdatedBy == null) ? 0 : lastUpdatedBy.hashCode());
		result = prime * result + ((lastUpdationDate == null) ? 0 : lastUpdationDate.hashCode());
		result = prime * result + ((mno == null) ? 0 : mno.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((package1 == null) ? 0 : package1.hashCode());
		result = prime * result + ((paddress == null) ? 0 : paddress.hashCode());
		result = prime * result + ((password == null) ? 0 : password.hashCode());
		result = prime * result + ((pno == null) ? 0 : pno.hashCode());
		result = prime * result + ((regId == null) ? 0 : regId.hashCode());
		result = prime * result + ((registrationDate == null) ? 0 : registrationDate.hashCode());
		result = prime * result + registrationId;
		result = prime * result + ((sem == null) ? 0 : sem.hashCode());
		return result;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (branch == null) {
			if (other.branch != null)
				return false;
		} else if (!branch.equals(other.branch))
			return false;
		if (branchId != other.branchId)
			return false;
		if (campus == null) {
			if (other.campus != null)
				return false;
		} else if (!campus.equals(other.campus))
			return false;
		if (cardNo != other.cardNo)
			return false;
		if (collegeId != other.collegeId)
			return false;
		if (company == null) {
			if (other.company != null)
				return false;
		} else if (!company.equals(other.company))
			return false;
		if (course == null) {
			if (other.course != null)
				return false;
		} else if (!course.equals(other.course))
			return false;
		if (createdBy == null) {
			if (other.createdBy != null)
				return false;
		} else if (!createdBy.equals(other.createdBy))
			return false;
		if (creationDate == null) {
			if (other.creationDate != null)
				return false;
		} else if (!creationDate.equals(other.creationDate))
			return false;
		if (dob == null) {
			if (other.dob != null)
				return false;
		} else if (!dob.equals(other.dob))
			return false;
		if (doj == null) {
			if (other.doj != null)
				return false;
		} else if (!doj.equals(other.doj))
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (enquiryId != other.enquiryId)
			return false;
		if (extra3 == null) {
			if (other.extra3 != null)
				return false;
		} else if (!extra3.equals(other.extra3))
			return false;
		if (flag == null) {
			if (other.flag != null)
				return false;
		} else if (!flag.equals(other.flag))
			return false;
		if (laddress == null) {
			if (other.laddress != null)
				return false;
		} else if (!laddress.equals(other.laddress))
			return false;
		if (lastUpdatedBy == null) {
			if (other.lastUpdatedBy != null)
				return false;
		} else if (!lastUpdatedBy.equals(other.lastUpdatedBy))
			return false;
		if (lastUpdationDate == null) {
			if (other.lastUpdationDate != null)
				return false;
		} else if (!lastUpdationDate.equals(other.lastUpdationDate))
			return false;
		if (mno == null) {
			if (other.mno != null)
				return false;
		} else if (!mno.equals(other.mno))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (package1 == null) {
			if (other.package1 != null)
				return false;
		} else if (!package1.equals(other.package1))
			return false;
		if (paddress == null) {
			if (other.paddress != null)
				return false;
		} else if (!paddress.equals(other.paddress))
			return false;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		if (pno == null) {
			if (other.pno != null)
				return false;
		} else if (!pno.equals(other.pno))
			return false;
		if (regId == null) {
			if (other.regId != null)
				return false;
		} else if (!regId.equals(other.regId))
			return false;
		if (registrationDate == null) {
			if (other.registrationDate != null)
				return false;
		} else if (!registrationDate.equals(other.registrationDate))
			return false;
		if (registrationId != other.registrationId)
			return false;
		if (sem == null) {
			if (other.sem != null)
				return false;
		} else if (!sem.equals(other.sem))
			return false;
		return true;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Student [registrationId=" + registrationId + ", registrationDate=" + registrationDate + ", name=" + name
				+ ", course=" + course + ", sem=" + sem + ", laddress=" + laddress + ", paddress=" + paddress
				+ ", flag=" + flag + ", dob=" + dob + ", mno=" + mno + ", pno=" + pno + ", email=" + email + ", campus="
				+ campus + ", doj=" + doj + ", package1=" + package1 + ", enquiryId=" + enquiryId + ", branch=" + branch
				+ ", collegeId=" + collegeId + ", password=" + password + ", branchId=" + branchId + ", cardNo="
				+ cardNo + ", createdBy=" + createdBy + ", creationDate=" + creationDate + ", lastUpdatedBy="
				+ lastUpdatedBy + ", lastUpdationDate=" + lastUpdationDate + ", regId=" + regId + ", company=" + company
				+ ", extra3=" + extra3 + "]";
	}
}
