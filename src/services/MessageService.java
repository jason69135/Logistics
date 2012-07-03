package services;

import java.util.List;

import beans.Letters;

public interface MessageService {
	public List<Letters> ShowMessage(String username);
	public int GetunreadMessage(String username);
	public Letters ShowDetailMessage(int messageid);
	public boolean DeleteMessage(int messageid);	
}
