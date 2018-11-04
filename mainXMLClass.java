package xml3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;


public class mainXMLClass {
	
	public static void main(String[] args) throws IOException, JAXBException {

	File file = new File("C:/Users/asalmo/workspace/poiexel/src/xml3/reportXML.xml");  
	        JAXBContext jaxbContext = JAXBContext.newInstance(worksheets.class);   
            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();  
            worksheets que= (worksheets) jaxbUnmarshaller.unmarshal(file); 
	        
            System.out.println("c="+que.getInput());
            System.out.println("c="+que.getOutput());
            
	        //System.out.println("c="+que.getWorksheet().get(0).getName());
	        
	        for(worksheet i:que.getWorksheet())
	        {
	         System.out.println("q="+i.getName());	
	         
	        for(item s:i.getItems().getItem())
	        {
	        	System.out.println("Sql="+s.getSql());
	        	System.out.println("Location="+s.getLocation().getCellx());
	        }
	        
	         
	        }
	        
	      

	}

}
