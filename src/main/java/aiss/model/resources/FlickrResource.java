package aiss.model.resources;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.restlet.resource.ClientResource;

import aiss.controller.SearchController;

public class FlickrResource {

	private static final String FLICKR_API_KEY = "7094e05fa07e935b81972724619789a0";		// TODO: Change this API KEY for your personal Key
	private static final Logger log = Logger.getLogger(FlickrResource.class.getName());
	
	private static FlickrResource instance=null;
	
	public static FlickrResource getInstance() {
		if (instance==null)
			return new FlickrResource();
		else
			return instance;
	}
	
	/*
	public PhotoSearch getFlickrPhotos(String artist) throws UnsupportedEncodingException{
		
		// TODO: Perform search in Flickr
		
		return null;
	}
	*/
}