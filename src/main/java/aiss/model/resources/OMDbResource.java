package aiss.model.resources;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.restlet.resource.ClientResource;

import aiss.model.omdb.MovieSearch;

public class OMDbResource {

	private static final String OMDB_API_KEY = "f427c6c1";  // TODO: Change this API KEY for your personal Key
	private static final Logger log = Logger.getLogger(OMDbResource.class.getName());
	
	public MovieSearch getMovies(String query) throws UnsupportedEncodingException {

		// TODO: Perform search in OMDb
		
		// Poner parametro de entrada en el formato correcto
		String title =  URLEncoder.encode(query, "UTF-8");
		
		// Introducir URL de la consulta
		String uri = "http://www.omdbapi.com/?apikey=" + OMDB_API_KEY + "&s=" + title;
		log.log(Level.FINE, "OMDb URI: " + uri);
		
		// Hacer peticion al servicio REST (devuelve un objeto JSON)
		ClientResource cr = new ClientResource(uri);
		
		// Convertir el objeto JSON en un objeto tipo Java
		MovieSearch omdbSearch = cr.get(MovieSearch.class);
		
		// Devolver objeto Java
	    return omdbSearch;
	}
}
