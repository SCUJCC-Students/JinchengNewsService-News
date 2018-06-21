package com.example.JC;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class CommentsComments {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String comments_content;
	private String comments_time;
	private String comments_img;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getComments_content() {
		return comments_content;
	}
	public void setComments_content(String comments_content) {
		this.comments_content = comments_content;
	}
	public String getComments_time() {
		return comments_time;
	}
	public void setComments_time(String comments_time) {
		this.comments_time = comments_time;
	}
	public String getComments_img() {
		return comments_img;
	}
	public void setComments_img(String comments_img) {
		this.comments_img = comments_img;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((comments_content == null) ? 0 : comments_content.hashCode());
		result = prime * result + ((comments_img == null) ? 0 : comments_img.hashCode());
		result = prime * result + ((comments_time == null) ? 0 : comments_time.hashCode());
		result = prime * result + id;
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
		CommentsComments other = (CommentsComments) obj;
		if (comments_content == null) {
			if (other.comments_content != null)
				return false;
		} else if (!comments_content.equals(other.comments_content))
			return false;
		if (comments_img == null) {
			if (other.comments_img != null)
				return false;
		} else if (!comments_img.equals(other.comments_img))
			return false;
		if (comments_time == null) {
			if (other.comments_time != null)
				return false;
		} else if (!comments_time.equals(other.comments_time))
			return false;
		if (id != other.id)
			return false;
		return true;
	}
}