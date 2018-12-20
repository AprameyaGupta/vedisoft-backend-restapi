package com.vedisoft.pojos;

public class Course {
	protected int id;
	protected String name;
	protected String prefix;
	protected String centiTitle;
	protected int duration;
	/**
	 * 
	 */
	public Course() {
		super();
	}
	/**
	 * @param name
	 * @param prefix
	 * @param centiTitle
	 * @param duration
	 */
	public Course(String name, String prefix, String centiTitle, int duration) {
		super();
		this.name = name;
		this.prefix = prefix;
		this.centiTitle = centiTitle;
		this.duration = duration;
	}
	/**
	 * @param id
	 * @param name
	 * @param prefix
	 * @param centiTitle
	 * @param duration
	 */
	public Course(int id, String name, String prefix, String centiTitle, int duration) {
		super();
		this.id = id;
		this.name = name;
		this.prefix = prefix;
		this.centiTitle = centiTitle;
		this.duration = duration;
	}
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
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
	 * @return the prefix
	 */
	public String getPrefix() {
		return prefix;
	}
	/**
	 * @param prefix the prefix to set
	 */
	public void setPrefix(String prefix) {
		this.prefix = prefix;
	}
	/**
	 * @return the centiTitle
	 */
	public String getCentiTitle() {
		return centiTitle;
	}
	/**
	 * @param centiTitle the centiTitle to set
	 */
	public void setCentiTitle(String centiTitle) {
		this.centiTitle = centiTitle;
	}
	/**
	 * @return the duration
	 */
	public int getDuration() {
		return duration;
	}
	/**
	 * @param duration the duration to set
	 */
	public void setDuration(int duration) {
		this.duration = duration;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((centiTitle == null) ? 0 : centiTitle.hashCode());
		result = prime * result + duration;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((prefix == null) ? 0 : prefix.hashCode());
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
		Course other = (Course) obj;
		if (centiTitle == null) {
			if (other.centiTitle != null)
				return false;
		} else if (!centiTitle.equals(other.centiTitle))
			return false;
		if (duration != other.duration)
			return false;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (prefix == null) {
			if (other.prefix != null)
				return false;
		} else if (!prefix.equals(other.prefix))
			return false;
		return true;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Course [id=" + id + ", name=" + name + ", prefix=" + prefix + ", centiTitle=" + centiTitle
				+ ", duration=" + duration + "]";
	}
	
	
}
