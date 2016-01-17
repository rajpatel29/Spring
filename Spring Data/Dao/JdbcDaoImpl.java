package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import Model.Apple;

@Component
public class JdbcDaoImpl
{
	private DataSource dataSource;
	private JdbcTemplate jdbcTemplate = new JdbcTemplate();
	
	
	public Apple getApple(int id)
	{
		Apple apple = null;
		
		String host = "jdbc:mysql://localhost:3306/test";
		String userName = "root";
		String passward = "root";
		
		Connection connection = null;
		
		try 
		{
			
			connection = dataSource.getConnection();
			PreparedStatement ps = connection.prepareStatement("SELECT * from apple WHERE id = ? ");
			ps.setInt(1, 5);
			
			
			ResultSet rs = ps.executeQuery();
			if(rs.next())
			{
				apple = new Apple (id , rs.getString("name"));
			}
			
			rs.close();
			ps.close();
			
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		finally
		{
			try 
			{
				connection.close();
			}
			catch (SQLException e) 
			{
				e.printStackTrace();
			}
		}
		
		return apple;
	}
	
	
	//compare this method with the above we are doing lots of things in above method
	public int getAppleCount()
	{
		String sql = "SELECT COUNT(*) FROM APPLE";
		
		//see the setter method for dataSource no need to write below code
		//now jdbc knows which data source
//		jdbcTemplate.setDataSource(dataSource);

		int result =jdbcTemplate.queryForObject(sql, Integer.class);
		
		return result;
	}
	
	

	public DataSource getDataSource() {
		return dataSource;
	}

	@Autowired
	public void setDataSource(DataSource dataSource) {
		this.jdbcTemplate.setDataSource(dataSource);
	}
	
	
	
	


	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}



	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

}
