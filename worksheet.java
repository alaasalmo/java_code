package xml3;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAttribute;

@XmlRootElement(name="worksheet")
public class worksheet {
	
    private String name;
	private String constant;
	private items items;
	
	@XmlAttribute
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@XmlElement
	public String getConstant() {
		return constant;
	}
	public void setConstant(String constant) {
		this.constant = constant;
	}
	
	@XmlElement
	public items getItems() {
		return items;
	}
	public void setItems(items items) {
		this.items = items;
	}


}
