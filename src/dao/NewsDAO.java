package dao;
import java.util.List;

import beans.News;

public interface NewsDAO{

	public void save(News transientInstance);
		
	public void delete(News persistentInstance);

	public List<News> findAll();

	
}