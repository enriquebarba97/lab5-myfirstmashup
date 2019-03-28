package aiss.model.resources;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.restlet.resource.ClientResource;

import aiss.controller.SearchController;
import aiss.model.flickr.PhotoSearch;

public class FlickrResource {

	private static final String FLICKR_API_KEY = "4ff381cffcc11efdca885627b97e4c49";		// TODO: Change this API KEY for your personal Key
	private static final Logger log = Logger.getLogger(FlickrResource.class.getName());

	
	public PhotoSearch getFlickrPhotos(String artist) throws UnsupportedEncodingException{
		
		// TODO: Perform search in Flickr
		
		String tag = URLEncoder.encode(artist, "UTF-8");
		
		String uri = "https://api.flickr.com/services/rest/?method=flickr.photos.search&api_key="
		+FLICKR_API_KEY+"&tags=" + tag + "&format=json&nojsoncallback=1";
		
		ClientResource cr = new ClientResource(uri);
		
		PhotoSearch flickrSearch = cr.get(PhotoSearch.class);
		return flickrSearch;
	}
	
}
