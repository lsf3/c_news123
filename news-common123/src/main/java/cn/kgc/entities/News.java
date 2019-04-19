package cn.kgc.entities;

import java.io.Serializable;

// 新闻
@SuppressWarnings("serial")
public class News implements Serializable{
	private Integer id;
	private Integer categoryId;
	private String title;
	private String summary;
	private String author;
	private String createDate;
	private String updateDate;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getSummary() {
		return summary;
	}
	public void setSummary(String summary) {
		this.summary = summary;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getCreateDate() {
		return createDate;
	}
	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}
	public String getUpdateDate() {
		return updateDate;
	}
	public void setUpdateDate(String updateDate) {
		this.updateDate = updateDate;
	}
	@Override
	public String toString() {
		return "News [id=" + id + ", categoryId=" + categoryId + ", title=" + title + ", summary=" + summary
				+ ", author=" + author + ", createDate=" + createDate + ", updateDate=" + updateDate + "]";
	}
	
	
}
