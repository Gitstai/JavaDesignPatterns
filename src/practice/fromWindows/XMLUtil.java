package practice.fromWindows;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

public class XMLUtil {
    public static String getBoyFriend(){
        try {
            DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
            Document document;
//            document = documentBuilder.parse(new File("src//com.company.test//config.xml"));
            document = documentBuilder.parse(new File("src/com/company/test/config.xml"));
            NodeList nodeList = document.getElementsByTagName("boyFriend");
            Node node = nodeList.item(0).getFirstChild();
            String boyFriend = node.getNodeValue().trim();
            return boyFriend;
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }
}
