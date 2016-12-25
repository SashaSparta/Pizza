package ex1;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import ex1.models.Photo;
import ex1.models.Menu;
import ex1.services.ArticleServices;
import ex1.services.MenuServices;
import ex1.services.PhotoService;


    @Controller
    public class IndexController {
    	
    @Autowired
    private PhotoService photoService;
    
    @Autowired 
    private MenuServices menuService;
    
    @Autowired
    private ArticleServices articleServices;
    	
      @RequestMapping("/")
      public String index(Model model) {
    	  model.addAttribute("articles", articleServices.getRecentArticles());
            return "index";
        }
     
      
      @RequestMapping("/gallery")
      public String gallery(Model model) {
    	//  photoService.repsave();
    	  	model.addAttribute("photos", photoService.getRecentPhotos());
            return "gallery";
        }
    
      
      @RequestMapping("/menu")
      public String menu(Model model) {
    	  model.addAttribute("menus", menuService.getRecentMenus());
            return "menu";
        }
      
      @RequestMapping("/contacts")
      public String contacts() {
            return "contacts";
        }
      
    }