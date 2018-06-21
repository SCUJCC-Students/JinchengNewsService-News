package com.example.JC;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class NewsNews {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	private String news_content;
	private String news_img;
	private Date news_releaseTime;
	private Date news_updateTime;
	private String news_auther;
	private String news_title;
	private String news_keywords;
	
	/*@ToOne(joinProperty="catrgoryId") */
	@ManyToOne
	private Category category;
	private int views;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNews_content() {
		return news_content;
	}
	public void setNews_content(String news_content) {
		this.news_content = news_content;
	}
	public String getNews_img() {
		return news_img;
	}
	public void setNews_img(String news_img) {
		this.news_img = news_img;
	}
	public Date getNews_releaseTime() {
		return news_releaseTime;
	}
	public void setNews_releaseTime(Date news_releaseTime) {
		this.news_releaseTime = news_releaseTime;
	}
	public Date getNews_updateTime() {
		return news_updateTime;
	}
	public void setNews_updateTime(Date news_updateTime) {
		this.news_updateTime = news_updateTime;
	}
	public String getNews_auther() {
		return news_auther;
	}
	public void setNews_auther(String news_auther) {
		this.news_auther = news_auther;
	}
	public String getNews_title() {
		return news_title;
	}
	public void setNews_title(String news_title) {
		this.news_title = news_title;
	}
	public String getNews_keywords() {
		return news_keywords;
	}
	public void setNews_keywords(String news_keywords) {
		this.news_keywords = news_keywords;
	}

	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	public int getViews() {
		return views;
	}
	public void setViews(int views) {
		this.views = views;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((category == null) ? 0 : category.hashCode());
		result = prime * result + (int) (id ^ (id >>> 32));
		result = prime * result + ((news_auther == null) ? 0 : news_auther.hashCode());
		result = prime * result + ((news_content == null) ? 0 : news_content.hashCode());
		result = prime * result + ((news_img == null) ? 0 : news_img.hashCode());
		result = prime * result + ((news_keywords == null) ? 0 : news_keywords.hashCode());
		result = prime * result + ((news_releaseTime == null) ? 0 : news_releaseTime.hashCode());
		result = prime * result + ((news_title == null) ? 0 : news_title.hashCode());
		result = prime * result + ((news_updateTime == null) ? 0 : news_updateTime.hashCode());
		result = prime * result + views;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		NewsNews other = (NewsNews) obj;
		if (category == null) {
			if (other.category != null)
				return false;
		} else if (!category.equals(other.category))
			return false;
		if (id != other.id)
			return false;
		if (news_auther == null) {
			if (other.news_auther != null)
				return false;
		} else if (!news_auther.equals(other.news_auther))
			return false;
		if (news_content == null) {
			if (other.news_content != null)
				return false;
		} else if (!news_content.equals(other.news_content))
			return false;
		if (news_img == null) {
			if (other.news_img != null)
				return false;
		} else if (!news_img.equals(other.news_img))
			return false;
		if (news_keywords == null) {
			if (other.news_keywords != null)
				return false;
		} else if (!news_keywords.equals(other.news_keywords))
			return false;
		if (news_releaseTime == null) {
			if (other.news_releaseTime != null)
				return false;
		} else if (!news_releaseTime.equals(other.news_releaseTime))
			return false;
		if (news_title == null) {
			if (other.news_title != null)
				return false;
		} else if (!news_title.equals(other.news_title))
			return false;
		if (news_updateTime == null) {
			if (other.news_updateTime != null)
				return false;
		} else if (!news_updateTime.equals(other.news_updateTime))
			return false;
		if (views != other.views)
			return false;
		return true;
	}
}
	
	