package ex1.services;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import ex1.models.Photo;

@Service
public class PhotoService 
{
	 private static final List<Photo> INITIAL_PHOTOS = Arrays.asList(
	            new Photo("картінка1", "images/3.jpg",true),
	            new Photo("картінка2", "images/10.jpg",false),
	            new Photo("картінка3", "images/10.jpg",false),
	            new Photo("картінка4", "images/3.jpg",false),
	            new Photo("картінка5", "images/9.jpg",true),
	            new Photo("картінка6", "images/9.jpg",false),
	            new Photo("картінка7", "images/9.jpg",false),
	            new Photo("картінка8", "images/9.jpg",false)
	        ); 

	        private List<Photo> photos = new ArrayList<Photo>(INITIAL_PHOTOS);

	        public List<Photo> getRecentPhotos() {
	            return photos;
	        }
	        
	        
}
