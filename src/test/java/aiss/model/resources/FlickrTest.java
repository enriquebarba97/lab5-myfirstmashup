package aiss.model.resources;

import static org.junit.Assert.*;

import java.io.UnsupportedEncodingException;

import org.junit.Test;

import aiss.model.flickr.PhotoSearch;

public class FlickrTest {

	@Test
	public void getPhotosTest() throws UnsupportedEncodingException {
		String title = "Star Wars";
		FlickrResource photo = new FlickrResource();
		PhotoSearch flickrResults = photo.getFlickrPhotos(title);
		
		assertNotNull("The search returned null", flickrResults);
		assertNotNull("The search returned null", flickrResults.getPhotos());
		assertFalse("The number of albums of " + title + " is zero", flickrResults.getPhotos().getPhoto().size()==0);
		
		System.out.println("The search for " + title + "'s albums returned " + flickrResults.getPhotos().getPhoto().size() + " photos.");
		
	
	}

}
