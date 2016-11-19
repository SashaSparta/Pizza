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
	            new Photo("картінка1", ""),
	            new Photo("картінка2", ""),
	            new Photo("картінка3", ""),
	            new Photo("картінка4", ""),
	            new Photo("картінка5", ""),
	            new Photo("картінка6", ""),
	            new Photo("картінка7", "")
	        ); 

	        private List<Photo> photos = new ArrayList<Photo>(INITIAL_PHOTOS);

	        public List<Photo> getRecentPhotos() {
	            return photos;
	        }
	        
	        
}
