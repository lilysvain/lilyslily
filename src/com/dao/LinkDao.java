package com.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.toolsBean.DB;
import com.valueBean.LinkSingle;

public class LinkDao {
	@SuppressWarnings("rawtypes")
	public List getDefaultLink() throws SQLException{
		String sql="select * from link where l_tag=1";
		Object[] params=null;
		List linklist=getList(sql,params);
		return linklist;
	}
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	private List getList(String sql,Object[] params) throws SQLException{
		List list=null;
		DB mydb=new DB();
		mydb.doPstm(sql,params);
		ResultSet rs=mydb.getRs();
		if(rs!=null){
			list=new ArrayList();
			while(rs.next()){
				LinkSingle single=new LinkSingle();
				single.setId(rs.getInt(1));
				single.setLinkTitle(rs.getString(2));
				single.setLinkSrc(rs.getString(3));
				single.setLinkDesc(rs.getString(4));
				single.setLinkCata(rs.getString(5));
				single.setLinkTag(rs.getInt(6));
				list.add(single);
			}
		}
		return list;
	}
}
