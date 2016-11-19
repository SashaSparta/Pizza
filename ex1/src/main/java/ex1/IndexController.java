package ex1;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import ex1.models.Photo;
import ex1.services.PhotoService;


    @Controller
    public class IndexController {
    	
    @Autowired
    private PhotoService photoService;
    	
      @RequestMapping("/")
      public String index() {
            return "index";
        }
     
      
      @RequestMapping("/gallery")
      public String gallery(Model model) {
    	  	model.addAttribute("photos", photoService.getRecentPhotos());
            return "gallery";
        }
    
      
      @RequestMapping("/menu")
      public String menu() {
            return "menu";
        }
      
      @RequestMapping("/contacts")
      public String contacts() {
            return "contacts";
        }
      
    }