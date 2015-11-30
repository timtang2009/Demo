package Service;

import java.util.List;

import domain.Information;

public interface IInfoService {
	
	public void addInfo(Information information);
	
	public List<Information> getAllInfo();
	
}
