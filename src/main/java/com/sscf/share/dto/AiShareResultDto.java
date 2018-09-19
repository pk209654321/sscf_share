package com.sscf.share.dto;

import javax.validation.constraints.NotNull;

import com.sscf.education.common.entity.PageInfo;

public class AiShareResultDto extends PageInfo{
	private String start_time;
	private String end_time;
	private Integer recommend_id;
	private Integer share_scene;
	private Integer share_channel;
	private String sortType;
	private String sortField;
	public String getStart_time() {
		return start_time;
	}
	public void setStart_time(String start_time) {
		this.start_time = start_time;
	}
	public String getEnd_time() {
		return end_time;
	}
	public void setEnd_time(String end_time) {
		this.end_time = end_time;
	}
	public Integer getRecommend_id() {
		return recommend_id;
	}
	public void setRecommend_id(Integer recommend_id) {
		this.recommend_id = recommend_id;
	}
	public Integer getShare_scene() {
		return share_scene;
	}
	public void setShare_scene(Integer share_scene) {
		this.share_scene = share_scene;
	}
	public Integer getShare_channel() {
		return share_channel;
	}
	public void setShare_channel(Integer share_channel) {
		this.share_channel = share_channel;
	}
	public String getSortType() {
		return sortType;
	}
	public void setSortType(String sortType) {
		this.sortType = sortType;
	}
	public String getSortField() {
		return sortField;
	}
	public void setSortField(String sortField) {
		this.sortField = sortField;
	}
	@Override
	public String toString() {
		return "AiShareResultDto [start_time=" + start_time + ", end_time=" + end_time + ", recommend_id=" + recommend_id + ", share_scene=" + share_scene + ", share_channel=" + share_channel + ", sortType=" + sortType + ", sortField=" + sortField + ", getPage_no()=" + getPage_no() + ", getPage_size()=" + getPage_size() + ", getRows()=" + getRows() + ", getOffset()=" + getOffset() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	
	
	
	
	
}
