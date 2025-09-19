package com.example.demo.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.model.Cart;
import com.example.demo.model.Order;
import com.example.demo.model.OrderDetails;
import com.example.demo.model.Product;
import com.example.demo.model.User;
import com.example.demo.service.CartService;
import com.example.demo.service.CategoryService;
import com.example.demo.service.ProductService;
import com.example.demo.service.UserService;
import com.example.demo.serviceimpl.OrderDetailsServiceImpl;
import com.google.gson.Gson;
import com.razorpay.RazorpayClient;
import com.razorpay.RazorpayException;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Controller
public class HomeController {

	@Autowired
	CategoryService categoryService;

	@Autowired
	ProductService productService;

	@Autowired
	UserService userService;

	@Autowired
	CartService cartService;

//	@GetMapping("/getproducts")
//	public void loadProducts(HttpServletResponse resp) throws IOException
//	{
//		PrintWriter pw = resp.getWriter();
//		List<Product> allproducts = productService.viewAllProducts();
//		Gson json = new Gson();
//		System.out.println(allproducts);
//		pw.append(json.toJson(allproducts));
//	}

	@GetMapping("/")
	public String index(Model model, @RequestParam(value = "catid", required = false, defaultValue = "0") int cid) {

		if (cid == 0) {
			model.addAttribute("products", productService.viewAllProducts());
		} else {
			model.addAttribute("products", productService.productsByCategory(cid));
		}
		model.addAttribute("categories", categoryService.allCategories());

		return "index";
	}

	@GetMapping("/accounts")
	public String accounts() {
		return "accounts";
	}

	// ********************cart*******************
	@GetMapping("cart")
	public String cart(Model model) {
		model.addAttribute("carts", cartService.cartByUser(userService.userById(1)));
		return "cart";
	}

	@GetMapping("/addtocart")
	public void addtocart(@RequestParam("id") int pid, HttpServletResponse resp) throws IOException {
		PrintWriter pw = resp.getWriter();

		Product p = productService.productById(pid);
		User u = userService.userById(1);

		Cart cart = new Cart();
		cart.setProduct(p);
		cart.setUser(u);
		cart.setQty(1);

		Cart ct = cartService.existByUserAndProduct(u, p);
		if (ct != null) {
			ct.setQty(ct.getQty() + 1);
			cartService.addorUpdateCart(ct);
		} else {
			cartService.addorUpdateCart(cart);
		}

		pw.append("Product addded into cart !!!!");
	}

	@GetMapping("/changeqty")
	public void changeQty(HttpServletRequest req, HttpServletResponse resp) throws IOException
	{
		int cid = Integer.parseInt(req.getParameter("cid"));
		int qty = Integer.parseInt(req.getParameter("qty"));
		PrintWriter pw = resp.getWriter();
		
		Cart c = cartService.cartById(cid);
		c.setQty(qty);
		
		cartService.addorUpdateCart(c);
		pw.append("updated !!!");

	}
	
	@GetMapping("/payment")
	@ResponseBody
	public void makePayment(@RequestParam("total") int total,HttpServletResponse resp) {
		
		
			
		

		try {
			PrintWriter pw  =resp.getWriter();
			RazorpayClient razorpay = new RazorpayClient("rzp_test_R8LF6p6eS7swQn", "WsLBNmXfF7C4e9T4vWgZaLeN");

			JSONObject orderRequest = new JSONObject();
			orderRequest.put("amount",total*100); // Amount is in currency subunits. 
			orderRequest.put("currency","INR");
			orderRequest.put("receipt", "receipt#1");
			JSONObject notes = new JSONObject();
			notes.put("notes_key_1","Tea, Earl Grey, Hot");
			orderRequest.put("notes",notes);
			com.razorpay.Order order = razorpay.orders.create(orderRequest);
			
			pw.append(order.toString());
		} catch (RazorpayException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	
	

	// ********cart end****************

	@GetMapping("checkout")
	public String checkout() {
		return "checkout";
	}

	@GetMapping("/compare")
	public String compare() {
		return "compare";
	}

	@GetMapping("details")
	public String details() {
		return "details";
	}

	// *********************user******************

	@GetMapping("loginregister")
	public String loginregister(Model model) {
		model.addAttribute("user", new User());
		return "login-register";
	}

	@PostMapping("/adduser")
	public String adduser(@ModelAttribute("user") User u, Model model) {
		userService.addorUpdateUser(u);
		model.addAttribute("msg", "Registration success !!!");
		model.addAttribute("user", new User());
		return "login-register";
	}

	// ****************user end*************

	@GetMapping("shop")
	public String shop() {
		return "shop";
	}

	@GetMapping("wishlist")
	public String wishlist() {
		return "wishlist";
	}

}
