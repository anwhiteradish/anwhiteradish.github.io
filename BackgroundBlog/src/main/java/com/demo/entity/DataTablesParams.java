package com.demo.entity;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

public class DataTablesParams implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 2857152917674496699L;

	/**
	 * 绘制计数器。这个是用来确保Ajax从服务器返回的是对应的（Ajax是异步的，因此返回的顺序是不确定的）。 要求在服务器接收到此参数后再返回（具体看 下面）
	 */
	private Integer draw;
	
	private Integer start;
	
	private Integer length;
	
	private Map<String,Object> search;
	
	private List<Map<String,Object>> order;
	
	public Integer getDraw() {
		return draw;
	}

	public void setDraw(Integer draw) {
		this.draw = draw;
	}

	public Integer getStart() {
		return start;
	}

	public void setStart(Integer start) {
		this.start = start;
	}

	public Integer getLength() {
		return length;
	}

	public void setLength(Integer length) {
		this.length = length;
	}

	public Map<String,Object> getSearch() {
		return search;
	}

	public void setSearch(Map<String,Object> search) {
		this.search = search;
	}

	public List<Map<String,Object>> getOrder() {
		return order;
	}

	public void setOrder(List<Map<String,Object>> order) {
		this.order = order;
	}

}
