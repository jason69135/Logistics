package services.impl;

import services.SiteSiteService;
import dao.RouteDAO;
import dao.SitetositeDAO;
import dao.SubsiteDAO;

public class SiteSiteServiceImpl implements SiteSiteService {
	private SitetositeDAO sitetositeDao;
	private RouteDAO routeDao;
	private SubsiteDAO subsiteDao;

	public RouteDAO getRouteDao() {
		return routeDao;
	}

	public void setRouteDao(RouteDAO routeDao) {
		this.routeDao = routeDao;
	}

	public SubsiteDAO getSubsiteDao() {
		return subsiteDao;
	}

	public void setSubsiteDao(SubsiteDAO subsiteDao) {
		this.subsiteDao = subsiteDao;
	}

	public SitetositeDAO getSitetositeDao() {
		return sitetositeDao;
	}

	public void setSitetositeDao(SitetositeDAO sitetositeDao) {
		this.sitetositeDao = sitetositeDao;
	}

	public float CheckFee(String subsitenamea, String subsitenameb) {
		// 查起始一 级站点 id和一级站点结束id
		int startid = this.subsiteDao.findByname(subsitenamea).get(0)
				.getSiteid();
		System.out.println("startid" + startid);
		int finishid = this.subsiteDao.findByname(subsitenameb).get(0)
				.getSiteid();
		String pass = this.routeDao.findBysiteid(startid, finishid).getPass();
		String passsite[] = pass.split(",");
		// 算运费
		float topfee = this.sitetositeDao.findBysite(
				this.subsiteDao.findByname(subsitenamea).get(0).getSiteid(),
				Integer.parseInt(passsite[0])).get(0).getFee();// 起始点
		float middlefee = 0;
		for (int i = 0; i < passsite.length - 1; i++) {
			middlefee += this.sitetositeDao.findBysite(
					Integer.parseInt(passsite[i]),
					Integer.parseInt(passsite[i + 1])).get(0).getFee();
		}
		float bottomfee = this.sitetositeDao.findBysite(
				Integer.parseInt(passsite[passsite.length - 1]),
				this.subsiteDao.findByname(subsitenameb).get(0).getSiteid())
				.get(0).getFee();// 结束点
		float feetotal = middlefee + bottomfee + topfee;
		return feetotal;
	}
}
