package com.thinkxfactor.zomatoplus.models;
	

    import java.io.Serializable;
	

	import javax.persistence.Column;
	import javax.persistence.Entity;
	import javax.persistence.GeneratedValue;
	import javax.persistence.Id;
	import javax.persistence.Table;
	

	

	@Entity
	@Table(name="tbl_item")
	public class Item implements Serializable {
		
		@Id
		@GeneratedValue
		@Column(name="item_id")
		private long id;
		
		@Column(name="restaurant_id")
		private long restaurantId;
		
		@Column(name="name")
		private String name;
		
		@Column(name="price")
		private Double price;
		
		@Column(name="description")
		private String description;
	

		public long getId() {
			return id;
		}
	

		public void setId(long id) {
			this.id = id;
		}
	

		public long getRestaurantId() {
			return restaurantId;
		}
	

		public void setRestaurantId(long restaurantId) {
			this.restaurantId=restaurantId;
		}
	

		public String getName() {
			return name;
		}
	

		public void setName(String name) {
			this.name = name;
		}
	

		public Double getPrice() {
			return price;
		}
	

		public void setPrice(Double price) {
			this.price= price;
		}
	

		public String getDescription() {
			return description;
		}
	

		public void setDescription(String description) {
			this.description= description;
		}
		
		
		
	}



