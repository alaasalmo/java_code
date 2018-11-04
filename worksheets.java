package xml3;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="worksheets")
public class worksheets {
	
	private String input;
	private String output;
	private List<worksheet> worksheet;

	@XmlElement
	public List<worksheet> getWorksheet() {
		return worksheet;
	}

	public void setWorksheet(List<worksheet> worksheet) {
		this.worksheet = worksheet;
	}
	
	@XmlElement
	public String getInput() {
		return input;
	}
	public void setInput(String input) {
		this.input = input;
	}
	
	@XmlElement
	public String getOutput() {
		return output;
	}
	public void setOutput(String output) {
		this.output = output;
	}
	
}
