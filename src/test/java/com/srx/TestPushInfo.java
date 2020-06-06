package com.srx;

import java.sql.SQLException;
import java.util.HashSet;
import java.util.Set;

import javax.sql.DataSource;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.srx.bean.Employee;
import com.srx.mapper.EmployeeMapper;

public class TestPushInfo {

	@Test
	public void testInsertEmployee() {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		EmployeeMapper bean = context.getBean(EmployeeMapper.class);
		HashSet<String> hobbys = new HashSet<>();
		hobbys.add("羽毛球");
		hobbys.add("乒乓球");
		hobbys.add("足球");
//		hobbys.add("蓝球");

		Employee employee = new Employee(null, "王小二", "888888@qq.com", 0, hobbys);

		bean.insertByEmployee(employee);
	}
	
	@Test
	public void test() {

		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		EmployeeMapper mapper = context.getBean(EmployeeMapper.class);

		Employee employee = mapper.selectById(2);
		
		System.out.println(employee);
//		System.out.println(employee.getHobby());
	}
	
	@Test
	public void testConnection() throws SQLException {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		DataSource dataSource = context.getBean(DataSource.class);
		System.out.println(dataSource.getConnection());
	}

}
