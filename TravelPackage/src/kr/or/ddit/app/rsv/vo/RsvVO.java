package kr.or.ddit.app.rsv.vo;

public class RsvVO {

	private String rsvId;
	private String rsvDate;
	private String rsvQty;
	private String rsvStat;
	private String rsvRef;
	private String memMail;
	private String comPkgId;
	private String rsvApp;
	private String comPkgDay;
	private String pkgNm;

	public String getComPkgDay() {
		return comPkgDay;
	}

	public void setComPkgDay(String comPakDay) {
		this.comPkgDay = comPakDay;
	}

	public String getRsvId() {
		return rsvId;
	}

	public void setRsvId(String rsvId) {
		this.rsvId = rsvId;
	}

	public String getRsvDate() {
		return rsvDate;
	}

	public void setRsvDate(String rsvDate) {
		this.rsvDate = rsvDate;
	}

	public String getRsvQty() {
		return rsvQty;
	}

	public void setRsvQty(String rsvQty) {
		this.rsvQty = rsvQty;
	}

	public String getRsvStat() {
		return rsvStat;
	}

	public void setRsvStat(String rsvStat) {
		this.rsvStat = rsvStat;
	}

	public String getRsvRef() {
		return rsvRef;
	}

	public void setRsvRef(String rsvRef) {
		this.rsvRef = rsvRef;
	}

	public String getMemMail() {
		return memMail;
	}

	public void setMemMail(String memMail) {
		this.memMail = memMail;
	}

	public String getComPkgId() {
		return comPkgId;
	}

	public void setComPkgId(String comPkgId) {
		this.comPkgId = comPkgId;
	}

	public String getRsvApp() {
		return rsvApp;
	}

	public void setRsvApp(String rsvApp) {
		this.rsvApp = rsvApp;
	}

	@Override
	public String toString() {
		return "RsvVO [rsvId=" + rsvId  + ", rsvDate=" + rsvDate +   ", rsvQty=" + rsvQty
				+ ", rsvStat=" + rsvStat + ", rsvRef=" + rsvRef + ", memMail=" + memMail + ", comPkgId=" + comPkgId
				+ ", rsvApp=" + rsvApp + ", comPakDay=" + comPkgDay + "]";
	}

	public String getPkgNm() {
		return pkgNm;
	}

	public void setPkgNm(String pkgNm) {
		this.pkgNm = pkgNm;
	}

}
