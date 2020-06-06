package com.srx.typeHandlers;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashSet;
import java.util.Set;

import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.TypeHandler;

public class SetHandler implements TypeHandler<Set<String>> {

	@Override
	public void setParameter(PreparedStatement ps, int i, Set<String> parameter, JdbcType jdbcType)
			throws SQLException {
		String str = "";
		StringBuffer sb = new StringBuffer();
		for (String string : parameter) {
			sb.append(string + ","); 
		}
		if (sb.substring(sb.length()-1).equals(",")) {
			str = sb.substring(0, sb.length()-1);
//			System.out.println(str);//其实可以不用这个if ，直接截取就好了
		}
		ps.setString(i, str);
	}

	@Override
	public Set<String> getResult(ResultSet rs, String columnName) throws SQLException {
		HashSet<String> set = new HashSet<>();
		String columnstring = rs.getString(columnName);
		String[] strings = columnstring.split(",");
		for (String string : strings) {
			set.add(string);
		}
		return set;
	}

	@Override
	public Set<String> getResult(ResultSet rs, int columnIndex) throws SQLException {
		HashSet<String> set = new HashSet<>();
		String columnstring = rs.getString(columnIndex);
		String[] strings = columnstring.split(",");
		for (String string : strings) {
			set.add(string);
		}
		return set;
	}

	@Override
	public Set<String> getResult(CallableStatement cs, int columnIndex) throws SQLException {
		HashSet<String> set = new HashSet<>();
		String columnstring = cs.getString(columnIndex);
		String[] strings = columnstring.split(",");
		for (String string : strings) {
			set.add(string);
		}
		return set;
	}

}
