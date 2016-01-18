package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcTemplate;
import org.springframework.stereotype.Component;

import Model.Apple;

@Component
public class JdbcDaoImpl
{
	private DataSource dataSource;
	private JdbcTemplate jdbcTemplate = new JdbcTemplate();
	private NamedParameterJdbcTemplate namedParameterJdbcTemplate;
	
	
	
	
	//without using spring library
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
	//that is the reason of using this
	public int getAppleCount()
	{
		String sql = "SELECT COUNT(*) FROM APPLE";
		
		//see the setter method for dataSource no need to write below code
		//now jdbc knows which data source
//		jdbcTemplate.setDataSource(dataSource);

		int result =jdbcTemplate.queryForObject(sql, Integer.class);
		
		return result;
	}
	
	
	//get string 
	public String getAppleName(int circleId)
	{
		String sql = "SELECT name FROM APPLE WHERE id = ?";
		return jdbcTemplate.queryForObject(sql, new Object[] {circleId }, String.class);
	}
	
	
	
	//get the object
	public Apple getAppleObject(int circleId)
	{
		String sql = "SELECT * FROM apple WHERE id = ?";
		return jdbcTemplate.queryForObject(sql,  new Object[] {2} ,new AppleMapper());
		
	}
	
	
	//get list of objects
	public List<Apple> getListOfApple()
	{
		String sql = "SELECT * FROM apple";
		return jdbcTemplate.query(sql , new AppleMapper());
	}
	
	//mapper class
	private static final class AppleMapper implements org.springframework.jdbc.core.RowMapper<Apple>
	{

		@Override
		public Apple mapRow(ResultSet resultSet	, int numberOfRow) throws SQLException 
		{
			Apple apple = new Apple();
			apple.setId(resultSet.getInt("id"));
			apple.setName(resultSet.getString("name"));
			return apple;
		}
		
	}

	
	
	//insert a row in the table
	public void insertRow(Apple apple)
	{
		String sql = "INSERT INTO apple (id , name) VALUES (? , ?)";
		jdbcTemplate.update(sql, new Object[] {apple.getId() ,apple.getName()});
	}
	
	
	//we can not use named parameter in JdbcTemplate
	public void insertRowUsingNamedParameter(Apple apple)
	{
		String sql = "INSERT INTO apple (id , name) VALUES (:id , :name)";
		SqlParameterSource namedParmeters = new  MapSqlParameterSource("id" , apple.getId() )
											.addValue("name", apple.getName());
		namedParameterJdbcTemplate.update(sql, namedParmeters);
		
	}
	
	
	public void createTable()
	{
		String sql = "CREATE TABLE triangle (id int(10) , name varchar(10))";
		jdbcTemplate.execute(sql);
	}
	
	
	
	//Getters and Setters
	
	@Autowired
	public void setDataSource(DataSource dataSource) {
		this.jdbcTemplate.setDataSource(dataSource);
		this.namedParameterJdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
	}
	public DataSource getDataSource() {
		return dataSource;
	}

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

}
