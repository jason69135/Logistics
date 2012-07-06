package services;

import java.util.List;

import beans.Number;

public interface NumberService {
	public boolean AddNumber(int routeid, int time, int size);

	public boolean DeleteNumber(int id);

	public boolean SearchNumber(String startsite, String finishsite,
			int starttime);

	public List<Number> ShowNumber(String startsite, String finishsite);
	
	public List<Number> SearchRouteid(int numberid);
	
	public List<Number> findByrouteid(int routeid);
	
	public List<Number> ShowAllNumber();
}
