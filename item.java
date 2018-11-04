package xml3;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="item")
public class item {
	
	location Location;
	String Sql;
	
	@XmlElement
	public location getLocation() {
		return Location;
	}
	public void setLocation(location location) {
		Location = location;
	}
	@XmlElement
	public String getSql() {
		return Sql;
	}
	public void setSql(String sql) {
		Sql = sql;
	}
	
	

}
