package com.kkk.kakaku.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;

import util.DBManager;

import java.sql.ResultSet;

public class ProductDAO {
	private ProductDAO() {}
		
	private static ProductDAO instance = new ProductDAO();
	
	public static ProductDAO getInstance() {
		return instance;
	}
	
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	
	// すべての商品を読み込む(ichiran page)
	public List<ProductDTO> productList() {
		List<ProductDTO> list = new ArrayList<ProductDTO>();
		String sql="SELECT p.id AS product_id, p.name AS product_name, pc.price AS price, pc.store_id AS store_id, s.name AS store_name, pc.created_at AS created_at, pc.updated_at AS updated_at FROM product AS p INNER JOIN product_price AS pc ON p.id = pc.product_id INNER JOIN store AS s ON pc.store_id = s.id ORDER BY pc.updated_at, p.name";
		
		try {
			conn = DBManager.getConnection();
			pstmt = conn.prepareStatement(sql);
			
			rs = pstmt.executeQuery();
			while(rs.next()) {
				ProductDTO product = new ProductDTO();
				product.setId(rs.getInt("product_id"));
				product.setName(rs.getString("product_name"));
				product.setPrice(rs.getDouble("price"));
				product.setStore_id(rs.getInt("store_id"));
				product.setStore_name(rs.getString("store_name"));
				
				list.add(product);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			DBManager.close(conn, pstmt, rs);
		}
		
		return list;
	}
	
	// 商品を商品名で検索、名前がかぶる商品リストを出力
	public List<ProductDTO> searchProducts(String key) {
		List<ProductDTO> list = new ArrayList<ProductDTO>();
		String sql="SELECT p.id AS product_id, p.name AS product_name, pc.price AS price, pc.store_id AS store_id, s.name AS store_name, pc.created_at AS created_at, pc.updated_at AS updated_at FROM product AS p INNER JOIN product_price AS pc ON p.id = pc.product_id INNER JOIN store AS s ON pc.store_id = s.id WHERE p.name LIKE ? ORDER BY updated_at";
		
		try {
			conn = DBManager.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, "%"+key+"%");
			rs = pstmt.executeQuery();
			while(rs.next()) {
				ProductDTO product = new ProductDTO();
				product.setId(rs.getInt("product_id"));
				product.setName(rs.getString("product_name"));
				product.setPrice(rs.getDouble("price"));
				product.setStore_id(rs.getInt("store_id"));
				product.setStore_name(rs.getString("store_name"));
				
				list.add(product);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			DBManager.close(conn, pstmt, rs);
		}
		
		return list;
	}
}
