package com.valueBean;

public class LinkSingle {
	private int id;
	private String linkTitle;
	private String linkSrc;
	private String linkDesc;
	private String linkCata;
	private int linkTag;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getLinkTitle() {
		return linkTitle;
	}
	public String getCutLinkTitle() {
		int len=14;
		if(len>=linkTitle.length()||len<=0)
			return linkTitle;
		else{
			return (linkTitle.substring(0,len)+"..");
		}
	}
	public void setLinkTitle(String linkTitle) {
		this.linkTitle = linkTitle;
	}
	public String getLinkSrc() {
		return linkSrc;
	}
	public void setLinkSrc(String linkSrc) {
		this.linkSrc = linkSrc;
	}
	public String getLinkDesc() {
		return linkDesc;
	}
	public void setLinkDesc(String linkDesc) {
		this.linkDesc = linkDesc;
	}	
	public String getLinkCata() {
		return linkCata;
	}
	public void setLinkCata(String linkCata) {
		this.linkCata = linkCata;
	}	
	public int getLinkTag() {
		return linkTag;
	}
	public void setLinkTag(int linkTag) {
		this.linkTag = linkTag;
	}
}
