package com.threeb.house.vo;

public class ImageVO {
	
	private int img_id; //이미지번호
	private String filename; //파일이름
	private int house_id; //숙소게시물번호
	
	public ImageVO() {
		super();
	}

	public ImageVO(String filename, int house_id) {
		super();
		this.filename = filename;
		this.house_id = house_id;
	}

	public int getImg_id() {
		return img_id;
	}

	public void setImg_id(int img_id) {
		this.img_id = img_id;
	}

	public String getFilename() {
		return filename;
	}

	public void setFilename(String filename) {
		this.filename = filename;
	}

	public int getHouse_id() {
		return house_id;
	}

	public void setHouse_id(int house_id) {
		this.house_id = house_id;
	}
	
}
