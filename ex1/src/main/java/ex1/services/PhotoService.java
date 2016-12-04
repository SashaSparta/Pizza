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
	            new Photo("картінка1", "",true),
	            new Photo("картінка2", "",false),
	            new Photo("картінка3", "",false),
	            new Photo("картінка4", "",false),
	            new Photo("картінка5", "",true),
	            new Photo("картінка6", "",false),
	            new Photo("картінка7", "",false),
	            new Photo("картінка8", "",false)
	        ); 

	        private List<Photo> photos = new ArrayList<Photo>(INITIAL_PHOTOS);

	        public List<Photo> getRecentPhotos() {
	            return photos;
	        }
	        
	        
}
