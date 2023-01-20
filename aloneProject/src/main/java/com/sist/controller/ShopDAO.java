package com.sist.controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;

import com.sist.main.Gconnection;
/*
 	 	이름                널?       유형             
----------------- -------- -------------- 
NO                NOT NULL NUMBER         
GOODS_NAME        NOT NULL VARCHAR2(1000) 
GOODS_SUB                  VARCHAR2(1000) 
GOODS_PRICE       NOT NULL VARCHAR2(50)  
GOODS_POSTER               VARCHAR2(260) 
 */
public class ShopDAO {
	private Connection conn;
	private PreparedStatement ps;

	public ArrayList<ShopVO> goodsListData(){
		ArrayList<ShopVO> list = new ArrayList<ShopVO>();
		try {
			conn = Gconnection.getConnection();
			String sql = "SELECT no, goods_name, goods_sub, goods_price, goods_poster "
					+ "FROM goods_all";
			ps = conn.prepareStatement(sql);
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			Gconnection.disConnection(conn, ps);
		}
		return list;
		
	}
	
	public static void main(String[] args) {
		System.out.println(ps);
	}
	
}
