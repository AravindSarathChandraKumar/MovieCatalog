package com.movie.catalog.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.movie.catalog.models.MovieCatalog;

@RestController
@RequestMapping("/moviecatalog")
public class Controller {

	@RequestMapping("/{userId}")
	public List<MovieCatalog> getMovieCatalog(@PathVariable("userId") String userId){
		
		
		MovieCatalog mC= new MovieCatalog("Movies","description",5);
		List<MovieCatalog> mCList= new ArrayList<>();
		mCList.add(mC);
		return mCList;
		
	}
}
