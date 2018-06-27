package com.thinkxfactor.zomatoplus.controller;

	

	import java.util.ArrayList;
	import java.util.List;
	

	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.web.bind.annotation.GetMapping;
	import org.springframework.web.bind.annotation.PostMapping;
	import org.springframework.web.bind.annotation.RequestBody;
	import org.springframework.web.bind.annotation.RequestMapping;
	import org.springframework.web.bind.annotation.RestController;
	

	import com.thinkxfactor.zomatoplus.models.Item;
	import com.thinkxfactor.zomatoplus.models.Restaurant;
	import com.thinkxfactor.zomatoplus.repository.ItemRepository;
	import com.thinkxfactor.zomatoplus.repository.RestaurantRepository;
	

	@RestController
	@RequestMapping("/restaurant")
	public class RestaurentController {
		
	//	public Restaurant tempRes;
	//	
	//	@PostMapping("/create")
	//	public Restaurant createRes(@RequestBody Restaurant res) {
	//		Restaurant newRes = new Restaurant();
	//		newRes.setResName(res.getResName());
	//		newRes.setResNumber(res.getResNumber());
	//		newRes.setLocation(res.getLocation());
	//		newRes.setRating(res.getRating());
	//		tempRes = newRes;
	//		return newRes;
	//	}
	//	
	//	@GetMapping("/getall")
	//	public List<Restaurant>getAllRes() {
	//		
	//		List allRes = new ArrayList<>();
	//		Restaurant res1 = new Restaurant("BarBQ", 1234567890, 4, "kolkata");
	//		allRes.add(tempRes);
	//		allRes.add(res1);
	//		
	//		return allRes;
	//	}
	//	
	//	@PostMapping("/additem")
	//	public Item addItem(@RequestBody Item item) {
	//		Item food = new Item();
	//		food.setFoodName(item.getFoodName());
	//		food.setFoodPrice(item.getFoodPrice());
	//		return food;
	//	}
		@Autowired
		private RestaurantRepository restaurantRepository;
		
		@Autowired
		private ItemRepository itemRepository;
		
		@PostMapping("/add")
		public Restaurant createRes(@RequestBody Restaurant res) {
			Restaurant res1 =restaurantRepository.save(res);
			return res1;
		}
		
		@GetMapping("/getAll")
		public List<Restaurant>getAll() {
			List<Restaurant>allRes=restaurantRepository.findAll();
			return allRes;
		}
		
		@PostMapping("/addItem")
		public Item addItem(@RequestBody Item item) {
			Item food =itemRepository.save(item);
			return food;
		}

}

