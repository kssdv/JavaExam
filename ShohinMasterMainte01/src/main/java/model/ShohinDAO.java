package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import jakarta.servlet.http.HttpServletRequest;

import dto.ShohinDTO;

/**
 DB接続定義 DAO(Data Access Object)
*/
public class ShohinDAO {
	private static final String user = "testuser"; // PostgreSQL user
	private static final String password = "testpass"; // PostgreSQL pass
	private static final String dbserver = "jdbc:postgresql://localhost:5432/"; // Postgres Server
	private static final String dbname = "testdb"; // DataBase name
	private static final String driverName = "org.postgresql.Driver"; // PostgreSQL Driver name

	private static final String sqlInsertShohin = "insert into M_Shohin (ID,SHOHIN_NAME,TANKA,CREATEDATE,UPDATEDATE) values (?, ?, ?,CURRENT_TIMESTAMP, CURRENT_TIMESTAMP)";
	private static final String sqlSelectAllShohin = "select * from M_Shohin order by ID asc";
	private static final String sqlSelectShohin = "select * from M_Shohin where ID = ?";
	private static final String sqlUpdateShohin = "update M_Shohin set SHOHIN_NAME = ?, TANKA = ?,  UPDATEDATE = CURRENT_TIMESTAMP where ID = ?";
	private static final String sqlDeleteShohin = "delete from M_Shohin where ID = ?";

	private static PreparedStatement pstmtInsert;
	private static PreparedStatement pstmtSelect;
	private static PreparedStatement pstmtSelectFlag;
	private static PreparedStatement pstmtSelectAll;
	private static PreparedStatement pstmtUpdate;
	private static PreparedStatement pstmtDelete;
	private static Connection con = null;

	/**
	 * クラス名：connect
	 * 機能：データベースに接続する
	 */
	public static void connect() throws Exception {
		try {
			Class.forName(driverName);
			System.out.println("DB接続開始");
			con = DriverManager.getConnection(dbserver + dbname, user, password);
			System.out.println(con);

			pstmtInsert = con.prepareStatement(sqlInsertShohin);
			pstmtSelectAll = con.prepareStatement(sqlSelectAllShohin);
			pstmtSelect = con.prepareStatement(sqlSelectShohin);
			pstmtUpdate = con.prepareStatement(sqlUpdateShohin);
			pstmtDelete = con.prepareStatement(sqlDeleteShohin);
			System.out.println("接続成功！");

		} catch (Exception e) {
			System.out.println("error");
		}
	}

	/**
	 * クラス名：disConnect
	 * 機能：データベースを切断する
	 */
	public static void disConnect() {
		try {
			pstmtInsert.close();
			pstmtSelectAll.close();
			pstmtSelect.close();
			pstmtUpdate.close();
			pstmtDelete.close();
			con.close();
		} catch (Exception e) {

		}

	}

	/**
	 * クラス名：getAllShohin
	 * 機能：商品マスタの全てのデータを取得する
	 * @param request  リクエスト情報の取得
	 */
	public static void getAllShohin(HttpServletRequest request) {
		ResultSet rs = null;
		ArrayList<ShohinDTO> shohins = new ArrayList<ShohinDTO>();
		ShohinDTO shohin = null;
		try {
			connect();
			rs = pstmtSelectAll.executeQuery();
			while (rs.next()) {
				shohin = new ShohinDTO(0, null, 0, null, null);
				shohin.setId(rs.getInt("id"));
				shohin.setShohin_name(rs.getString("shohin_name"));
				shohin.setTanka(rs.getDouble("tanka"));
				shohin.setCreatedate(rs.getTimestamp("createdate"));
				shohin.setUpdatedate(rs.getTimestamp("updatedate"));
				shohins.add(shohin);

			}
			request.setAttribute("Shohins", shohins);
			System.out.println(shohins);
		} catch (Exception e) {
			System.out.println("エラーが発生しました。");
			e.printStackTrace();
		} finally {
			disConnect();
		}
	}

	/**
	 * クラス名：getShohin
	 * 機能：商品マスタの該当するデータを取得する
	 * @param request リクエスト情報の取得
	 */
	public static void getShohin(HttpServletRequest request) {
		ResultSet rs = null;
		ShohinDTO shohin = null;
		try {
			connect();
			pstmtSelect.setInt(1, Integer.parseInt(request.getParameter("search")));
			rs = pstmtSelect.executeQuery();
			while (rs.next()) {
				shohin = new ShohinDTO(0, null, 0, null, null);
				shohin.setId(rs.getInt("id"));
				shohin.setShohin_name(rs.getString("shohin_name"));
				shohin.setTanka(rs.getDouble("tanka"));
				shohin.setCreatedate(rs.getDate("createdate"));
				shohin.setUpdatedate(rs.getDate("updatedate"));
			}
			request.setAttribute("shohin", shohin);
			System.out.println(shohin);
		} catch (Exception e) {
			System.out.println("エラーが発生しました。");
			e.printStackTrace();
		} finally {
			disConnect();
		}
	}

	/**
	 * クラス名：InsertShohin
	 * 機能：商品マスタ新規登録画面で入力されたデータを商品マスタに登録する
	 * @param request リクエスト情報の取得
	 */
	public static void InsertShohin(HttpServletRequest request) {
		try {
			connect();
			pstmtInsert.setInt(1, Integer.parseInt(request.getParameter("ID")));
			pstmtInsert.setString(2, request.getParameter("name"));
			pstmtInsert.setDouble(3, Double.parseDouble(request.getParameter("tanka")));
			if (pstmtInsert.executeUpdate() == 1) {
				System.out.println("登録成功！");
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disConnect();
		}
	}

	/**
	 * クラス名：UpadteShohin
	 * 機能：商品マスタ詳細画面で入力されたデータを商品マスタに更新する
	 * @param request リクエスト情報の取得
	 */
	public static void UpadteShohin(HttpServletRequest request) {
		try {
			connect();
			pstmtUpdate.setString(1, request.getParameter("name"));
			pstmtUpdate.setDouble(2, Double.parseDouble(request.getParameter("tanka")));
			pstmtUpdate.setInt(3, Integer.parseInt(request.getParameter("ID")));
			if (pstmtUpdate.executeUpdate() == 1) {
				System.out.println("修正成功！");
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(request.getParameter("name"));
			System.out.println(request.getParameter("tanka"));
			System.out.println(request.getParameter("ID"));

		} finally {
			disConnect();
		}

	}

	/**
	 * クラス名：deleteShohin
	 * 機能：商品マスタ詳細画面に表示されたデータを商品マスタから物理削除する
	 * @param request リクエスト情報の取得
	 */
	public static void deleteShohin(HttpServletRequest request) {
		try {
			connect();
			pstmtDelete.setInt(1, Integer.parseInt(request.getParameter("ID")));
			if (pstmtDelete.executeUpdate() == 1) {
				System.out.println("削除成功！");
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(request.getParameter("ID"));
		} finally {
			disConnect();
		}

	}

	/**
	 * クラス名：checkID
	 * 機能：商品マスタに商品マスタ一覧画面で選択されたIDが存在するかどうか？
	 * @param request リクエスト情報の取得
	 */
	public static boolean checkID(HttpServletRequest request) {
		ResultSet rs = null;
		try {
			connect();
			pstmtSelect.setInt(1, Integer.parseInt(request.getParameter("ID")));
			rs = pstmtSelect.executeQuery();
			if (rs.next()) {
				int count = rs.getInt(1);
				return count > 0;
			}
		} catch (Exception e) {
			System.out.println("エラーが発生しました。");
			e.printStackTrace();
		} finally {
			disConnect();
		}
		return false;
	}

}