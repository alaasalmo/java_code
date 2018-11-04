package xml3;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="location")
public class location {
	
	private String cellx;
    private String celly;
    
    @XmlElement
	public String getCellx() {
		return cellx;
	}
	public void setCellx(String cellx) {
		this.cellx = cellx;
	}
	
	@XmlElement
	public String getCelly() {
		return celly;
	}
	public void setCelly(String celly) {
		this.celly = celly;
	}
    
    


}
