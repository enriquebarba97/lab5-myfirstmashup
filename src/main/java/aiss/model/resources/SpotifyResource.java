package aiss.model.resources;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.restlet.resource.ClientResource;

import aiss.model.spotify.AlbumSearch;

public class SpotifyResource {


	private static final Logger log = Logger.getLogger(SpotifyResource.class.getName());
	
	public AlbumSearch getAlbums(String query) throws UnsupportedEncodingException {
		
		// TODO: Perform search in Spotify
		
	    return null;
	}
}
