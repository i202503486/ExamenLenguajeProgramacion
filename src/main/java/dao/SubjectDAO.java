package dao;

import java.util.List;

import model.Subject;

public interface SubjectDAO {
	
    public void create(Subject subject);
	
	public void update(Subject subject);
	
	public void delete(int id);
	
	public Subject find(int id);
	
	public List<Subject> findAll();

}
