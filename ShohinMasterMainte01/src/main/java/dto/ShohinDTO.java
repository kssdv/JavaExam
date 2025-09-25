package dto;

import java.util.Date;

/**
 * クラス名：ShohinDTO
 * 機能：商品マスタのDTO(Data Transfer Object)クラス
 */
public class ShohinDTO {
	private int id;
	private String shohin_name;
	private double tanka;
	private Date createdate;
	private Date updatedate;
	
	/**
	 * 商品マスタの1行分をセット
	 */
	public ShohinDTO(int id, String shohin_name, double tanka,  Date createdate, Date updatedate) {
		super(); 
		this.id = id;
		this.shohin_name = shohin_name;
		this.tanka = tanka;
		this.createdate = createdate;
		this.updatedate = updatedate;
	}

	/**
	 * 商品マスタのID取得
	 */
	public int getId() {
		return id;
	}

	/**
	 * 商品マスタのIDセット
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * 商品マスタの商品名取得
	 */
	public String getShohin_name() {
		return shohin_name;
	}

	/**
	 * 商品マスタの商品名セット
	 */
	public void setShohin_name(String shohin_name) {
		this.shohin_name = shohin_name;
	}

	/**
	 * 商品マスタの単価取得
	 */
	public double getTanka() {
		return tanka;
	}

	/**
	 * 商品マスタの単価セット
	 */
	public void setTanka(double tanka) {
		this.tanka = tanka;
	}

	/**
	 * 商品マスタの登録日時取得
	 */
	public Date getCreatedate() {
		return createdate;
	}

	/**
	 * 商品マスタの登録日時セット
	 */
	public void setCreatedate(Date createdate) {
		this.createdate = createdate;
	}

	/**
	 * 商品マスタの更新日時取得
	 */
	public Date getUpdatedate() {
		return updatedate;
	}

	/**
	 * 商品マスタの更新日時セット
	 */
	public void setUpdatedate(Date updatedate) {
		this.updatedate = updatedate;
	}

	@Override
	/**
	 * 商品マスタのDTOの戻り値
	 */
	public String toString() {
		return "ShohinDTO [id=" + id + ", shohin_name=" + shohin_name + ", tanka=" + tanka
				+ ", createdate=" + createdate + ", updatedate=" + updatedate + "]";
	}
	
	
}