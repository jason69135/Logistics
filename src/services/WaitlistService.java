package services;

import java.util.List;

import beans.Waitlist;

public interface WaitlistService {
	public List<Waitlist> ShowWaitlist();
	
	public boolean AddWaitlist(int siteid, String orderno, int priority,
			int numberid);

}
