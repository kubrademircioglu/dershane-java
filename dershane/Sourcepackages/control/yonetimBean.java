package control;

import java.util.List;
import java.util.ArrayList;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;



@ManagedBean
@SessionScoped
public class yonetimBean {
	 private yonetim ogrenci=new yonetim();
	 private List<yonetim> ogrenclistesi = new ArrayList<yonetim>();
 
	 public void kaydet() {
		 ogrenclistesi.add(this.ogrenci);
			this.ogrenci = new yonetim();

		}

	 
	 
	public List<yonetim> getOgrenclistesi() {
		return ogrenclistesi;
	}

	public void setOgrenclistesi(List<yonetim> ogrenclistesi) {
		this.ogrenclistesi = ogrenclistesi;
	}

	public yonetim getOgrenci() {
		return ogrenci;
	}

	public void setOgrenci(yonetim ogrenci) {
		this.ogrenci = ogrenci;
	}

	 
	 
}
