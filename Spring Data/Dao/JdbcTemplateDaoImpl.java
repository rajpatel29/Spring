package Dao;

import org.springframework.jdbc.core.support.JdbcDaoSupport;



public class JdbcTemplateDaoImpl extends JdbcDaoSupport
{

	//rather than using getter and setter you can choose the easier approch
	
	public int getAppleCount()
	{
		String sql = "SELECT COUNT(*) FROM APPLE";

		int result =this.getJdbcTemplate().queryForObject(sql, Integer.class);
		
		return result;
	}
}
