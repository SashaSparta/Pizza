package ex1.services;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ex1.models.Photo;
import ex1.repositories.PhotoRepositories;




@Service
public class PhotoService 
{
	@Autowired
	private PhotoRepositories photoRep;
	 private static final List<Photo> INITIAL_PHOTOS = Arrays.asList(
	            new Photo("картінка1", "images/3.jpg",true,"Ккатінка"),
	            new Photo("картінка2", "images/10.jpg",false, "Сотка"),
	            new Photo("картінка3", "images/10.jpg",false,"Ккатінка"),
	            new Photo("картінка4", "images/3.jpg",false,"Ккатінка"),
	            new Photo("картінка5", "images/9.jpg",true,"Ккатінка"),
	            new Photo("картінка6", "images/9.jpg",false,"Сотка"),
	            new Photo("картінка7", "images/9.jpg",false,"Ккатінка"),
	            new Photo("картінка8", "images/9.jpg",false,"Сотка")
	        ); 
	 
	 
	
	    //    private List<Photo> photos = new ArrayList<Photo>(INITIAL_PHOTOS);

			//Photo test =   new Photo("картінка1", "images/3.jpg",true,"Ккатінка");
		
			@Transactional
			public void repsave()
			{
				//Photo test =   new Photo("картінка1", "images/3.jpg",true,"Ккатінка");
				photoRep.save(INITIAL_PHOTOS);
			}
			List<Photo> photos = new ArrayList<Photo>();
	        public List<Photo> getRecentPhotos() {
	        	repsave();
	        	return (List<Photo>) photoRep.findAll(); 
	      //      return photos;
	        }
	        
	        
}
