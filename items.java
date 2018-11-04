package xml3;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="items")
public class items {

	private List<item> item;
	@XmlElement
	public List<item> getItem() {
		return item;
	}

	public void setItem(List<item> item) {
		this.item = item;
	}
	
	
	
}
