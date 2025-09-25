package com.jslhrd.board.model;

import java.sql.*;
import java.util.*;

import com.jslhrd.util.DBManager;

public class BoardDAO {
	//싱글톤
	private BoardDAO() {}
	private static BoardDAO instance = new BoardDAO();
	public static BoardDAO getInstance() {
		return instance;
	}
	
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	
	
	//board 정보 출력
	public List<BoardDTO> printBoards() {
		String sql = "select * from tbl_board order by idx desc";
		List<BoardDTO> list = new ArrayList<BoardDTO>();
		try {
			conn = DBManager.getConnection();
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				BoardDTO dto = new BoardDTO();
				dto.setIdx(rs.getInt("idx"));
				dto.setSubject(rs.getString("subject"));
				dto.setContents(rs.getString("contents"));
				dto.setRegdate(rs.getString("regdate"));
				dto.setName(rs.getString("name"));
				dto.setReadcnt(rs.getInt("readcnt"));
				
				list.add(dto);
			}
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			DBManager.close(conn, pstmt, rs);
		}
		return list;
	}
	//board 정보 출력
	public List<BoardDTO> boardList(String search, String key) {
//		String sql = "select * from tbl_board order by idx desc";
		String sql = "select * from tbl_board where "+search+
				" like ? order by idx desc";
		List<BoardDTO> list = new ArrayList<BoardDTO>();
		try {
			conn = DBManager.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, "%" + key + "%");
			rs = pstmt.executeQuery();
			while(rs.next()) {
				BoardDTO dto = new BoardDTO();
				dto.setIdx(rs.getInt("idx"));
				dto.setSubject(rs.getString("subject"));
				dto.setContents(rs.getString("contents"));
				dto.setRegdate(rs.getString("regdate"));
				dto.setName(rs.getString("name"));
				dto.setReadcnt(rs.getInt("readcnt"));
				
				list.add(dto);
			}
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			DBManager.close(conn, pstmt, rs);
		}
		return list;
	}
	
	// 전체 boards 갯수 카운트
	public int countBoards() {
		String sql = "select count(*) from tbl_board";
		int cnt=0;
		try {
			conn = DBManager.getConnection();
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				cnt = rs.getInt(1);
			}
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			DBManager.close(conn, pstmt, rs);
		}
		return cnt;
	}
	// 전체 boards 갯수 카운트(검색 기능 추가)
	public int boardCount(String search, String key) {
//		String sql = "select count(*) from tbl_board";
		String sql = "select count(*) count from tbl_board where " + search + " like ?";
		int cnt=0;
		try {
			conn = DBManager.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, "%"+key+"%");
			rs = pstmt.executeQuery();
			if(rs.next()) {
				cnt = rs.getInt("count");
			}
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			DBManager.close(conn, pstmt, rs);
		}
		return cnt;
	}
	
	// 새로운 board 입력
	public int writeBoard(BoardDTO dto) {
		int row = 0;
		String sql = "INSERT INTO TBL_BOARD (IDX, NAME, EMAIL, SUBJECT, CONTENTS, PASS) \n"
				+ "    VALUES (TBL_BOARD_SEQ_IDX.NEXTVAL, ?, ?, ?, ?, ?)";
		try {
			conn = DBManager.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, dto.getName());
			pstmt.setString(2, dto.getEmail());
			pstmt.setString(3, dto.getSubject());
			pstmt.setString(4, dto.getContents());
			pstmt.setString(5, dto.getPass());
			
			row = pstmt.executeUpdate();
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			DBManager.close(conn, pstmt);
		}
		return row;
	}
	
	// board 세부정부 검색
	public BoardDTO boardSelect(int idx) {
		String sql = "SELECT * FROM TBL_BOARD WHERE IDX=?";
		BoardDTO dto = new BoardDTO();
		try {
			conn = DBManager.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, idx);
			
			rs = pstmt.executeQuery();
			if(rs.next()) {
				dto.setIdx(idx);
				dto.setName(rs.getString("name"));
				dto.setEmail(rs.getString("email"));
				dto.setRegdate(rs.getString("regdate"));
				dto.setSubject(rs.getString("subject"));
				dto.setContents(rs.getString("contents"));
				dto.setReadcnt(rs.getInt("readcnt"));
			}
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			DBManager.close(conn, pstmt, rs);
		}
		return dto;
	}
	
	// 조회수 증가
	public void boardHits(int idx) {
		String sql = "UPDATE TBL_BOARD SET READCNT = READCNT + 1 WHERE IDX=?";
		int cnt=0;
		try {
			conn = DBManager.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, idx);

			rs = pstmt.executeQuery();
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			DBManager.close(conn, pstmt, rs);
		}
	}
	// 게시글 수정 
	public int boardModify(BoardDTO dto) {
		int row = 0;
		String sql = "UPDATE TBL_BOARD SET EMAIL=?, SUBJECT=?, CONTENTS=? WHERE IDX=? AND PASS=?";
		try {
			conn = DBManager.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, dto.getEmail());
			pstmt.setString(2, dto.getSubject());
			pstmt.setString(3, dto.getContents());
			pstmt.setInt(4, dto.getIdx());
			pstmt.setString(5, dto.getPass());
			
			row = pstmt.executeUpdate();
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			DBManager.close(conn, pstmt);
		}
		return row;
	}
	
	// board 삭제
	public int boardDelete(int idx, String pass) {
		int row = 0;
		String sql = "DELETE TBL_BOARD WHERE IDX=? AND PASS=?";
		try {
			conn = DBManager.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, idx);
			pstmt.setString(2, pass);
			
			row = pstmt.executeUpdate();
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			DBManager.close(conn, pstmt);
		}
		return row;
	}
}
