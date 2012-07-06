package services;

import java.util.List;

import beans.Site;
import beans.Subsite;

public interface SiteService {
	public List<Site> SearchAllSite();
	public List<Subsite> SearchSite(int siteid);

}
