package services;
import java.util.List;
import beans.Subsiteadmin;

public interface No2AdminService {
	public boolean No2adminLogin(String username,String password);
	public boolean AddNo2admin(String username,String password,String sitename,int right);
	public boolean DeleteNo2admin(String username);
	public List<Subsiteadmin> ShowNo2admin();
}
