package control;

import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.annotation.PostConstruct;
import javax.faces.model.SelectItem;
import javax.faces.model.SelectItemGroup;

@ManagedBean
public class sinifyonetim {

	
	private String sinif;
	private List<SelectItem>siniff;
 
	
	
    @PostConstruct
    public void init() {
    	
    	SelectItemGroup g1 = new SelectItemGroup("10.sınıf");
        g1.setSelectItems(new SelectItem[] {new SelectItem("10A", "10A"), new SelectItem("10B", "10B"), new SelectItem("10C", "10C")});
    	
        SelectItemGroup g2 = new SelectItemGroup("11.sınıf");
        g2.setSelectItems(new SelectItem[] {new SelectItem("11A", "11A"), new SelectItem("11B", "11B"), new SelectItem("11C", "11C")});
         
        siniff = new ArrayList<SelectItem>();
        siniff.add(g1);
        siniff.add(g2);
        
    }
    
    
	public sinifyonetim() {
		// TODO Auto-generated constructor stub
	}


	public List<SelectItem> getSiniff() {
		return siniff;
	}


	public void setSiniff(List<SelectItem> siniff) {
		this.siniff = siniff;
	}


	public String getSinif() {
		return sinif;
	}


	public void setSinif(String sinif) {
		this.sinif = sinif;
	}





	


}
