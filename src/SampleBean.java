
public class SampleBean {
@Override
	public String toString() {
		return "SampleBean [patid=" + patid + ", form=" + form
				+ ", formStatus=" + formStatus + ", pKEY=" + pKEY
				+ ", tRIGZZID=" + tRIGZZID + "]";
	}
public String getPatid() {
		return patid;
	}
	public void setPatid(String patid) {
		this.patid = patid;
	}
	public String getForm() {
		return form;
	}
	public void setForm(String form) {
		this.form = form;
	}
	public String getFormStatus() {
		return formStatus;
	}
	public void setFormStatus(String formStatus) {
		this.formStatus = formStatus;
	}
	public String getpKEY() {
		return pKEY;
	}
	public void setpKEY(String pKEY) {
		this.pKEY = pKEY;
	}
	public String gettRIGZZID() {
		return tRIGZZID;
	}
	public void settRIGZZID(String tRIGZZID) {
		this.tRIGZZID = tRIGZZID;
	}
private String patid;
private String form;
private String formStatus;
private String pKEY;
private String tRIGZZID;

}
