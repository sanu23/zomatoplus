package com.thinkxfactor.zomatoplus.models;
	

	import java.io.Serializable;
	

	import javax.persistence.Column;
	import javax.persistence.Entity;
	import javax.persistence.GeneratedValue;
	import javax.persistence.Id;
	import javax.persistence.Table;
	

	@Entity
	@Table(name="tbl_user")
	public class User implements Serializable {
		
		@Id
		@GeneratedValue
		@Column(name="user_id")
		private long id;
		
		@Column(name="name",unique=true)
		private String name;
		
		@Column(name="password")
		private String password;
		
		@Column(name="mobile")
		private String mobile;
		
		@Column(name="address")
		private String address;
		
		@Column(name="landmark")
		private String landmark;
		
		@Column(name="pincode")
		private String pincode;
		
		@Column(name="type")
		private String type;
		
		public User() {
			super();
		}
	//	public User(String username, String password) {
	//		// TODO Auto-generated constructor stub
	//		super();
	//		this.username = username;
	//		this.password = password;
	//	}
		public long getId() {
			return id;
		}
		public void setId(long id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password= password;
		}
		public String getMobile() {
			return mobile;
		}
		public void setMobile(String mobile) {
			this.mobile= mobile;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address= address;
		}
		public String getLandmark() {
			return landmark;
		}
		public void setLandmark(String landmark) {
			this.landmark= landmark;
		}
		public String getPincode() {
			return pincode;
		}
		public void setPincode(String pincode) {
			this.pincode=pincode;
		}
		public String getType() {
			return type;
		}
		public void setType(String type) {
			this.type= type;
		}
		
	}
