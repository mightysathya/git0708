package com.stock.portlet.model;

import java.sql.Date;

public class TradeInfo {
	private String date;
	private String oi;
	private String dayHigh;
	private String dayLow;
	private String levelBreak;
	private String ltp;
	private String ltpChange;
	private String oiChange;
	private String oiInterpretation;
	
	
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getOi() {
		return oi;
	}
	public void setOi(String oi) {
		this.oi = oi;
	}
	public String getDayHigh() {
		return dayHigh;
	}
	public void setDayHigh(String dayHigh) {
		this.dayHigh = dayHigh;
	}
	public String getDayLow() {
		return dayLow;
	}
	public void setDayLow(String dayLow) {
		this.dayLow = dayLow;
	}
	public String getLevelBreak() {
		return levelBreak;
	}
	public void setLevelBreak(String levelBreak) {
		this.levelBreak = levelBreak;
	}
	public String getLtp() {
		return ltp;
	}
	public void setLtp(String ltp) {
		this.ltp = ltp;
	}
	public String getLtpChange() {
		return ltpChange;
	}
	public void setLtpChange(String ltpChange) {
		this.ltpChange = ltpChange;
	}
	public String getOiChange() {
		return oiChange;
	}
	public void setOiChange(String oiChange) {
		this.oiChange = oiChange;
	}
	public String getOiInterpretation() {
		return oiInterpretation;
	}
	public void setOiInterpretation(String oiInterpretation) {
		this.oiInterpretation = oiInterpretation;
	}

	
	
}
