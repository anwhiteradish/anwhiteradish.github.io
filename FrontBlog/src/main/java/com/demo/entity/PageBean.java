package com.demo.entity;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by xp on 2017/4/14.
 */
public class PageBean<T>  implements Serializable{

    private int currentPage=1;   //当前页数
    private int pageSize=10;   //每页显示的个数
    private long totalCount;      //总记录数
    private long totalPage;
	private int startIndex;
    private List<T> result; //分页查询的结果
    private Map<String,Object> map = new HashMap<String,Object>();   //查询条件
	public int getCurrentPage() {
		return currentPage;
	}
	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	public long getTotalCount() {
		return totalCount;
	}
	public void setTotalCount(long totalCount) {
		this.totalCount = totalCount;
	}
	public long getTotalPage() {
		return totalPage;
	}
	public void setTotalPage(long totalPage) {
		this.totalPage = totalPage;
	}
	public int getStartIndex() {
		return (currentPage-1)*pageSize;
	}
	public void setStartIndex(int startIndex) {
		this.startIndex = startIndex;
	}
	public List<T> getResult() {
		return result;
	}
	public void setResult(List<T> result) {
		this.result = result;
	}
	public Map<String, Object> getMap() {
		return map;
	}
	public void setMap(Map<String, Object> map) {
		this.map = map;
	}
	
}
