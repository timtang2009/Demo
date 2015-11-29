package dao;

import java.util.List;

import domain.Information;

public interface IInfoDAO {
	public void addInfo(Information information);
	
	public List<Information> getAllInfo();
}
