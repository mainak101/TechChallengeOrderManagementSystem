package com.oms;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.ui.ModelMap;


@Controller
public class OrderDeliveryController {
	
	@RequestMapping(value = "/orderdelivery", method = RequestMethod.GET)
	   public ModelAndView student() {
	      return new ModelAndView("orderdelivery", "command", new OrderDelivery());

}
	
	@RequestMapping(value = "/orderdeliverylocation", method = RequestMethod.POST)
    public String addStudent(@ModelAttribute("SpringWeb")OrderDelivery od, 
 
 ModelMap model) {
    model.addAttribute("location", od.getLocation());
    model.addAttribute("destination", od.getDestination());
    model.addAttribute("sku", od.getSku());
    model.addAttribute("amount", od.getAmount());
    
    return "result";
 }
}
