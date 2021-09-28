package FactoryPattren.englishe;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

public class XMLUtil {

    private static Object DataBaseFactory;

    public static Object getBean(){
        Object obj = DataBaseFactory;
        try{
            DocumentBuilderFactory dFactory=DocumentBuilderFactory.newInstance();
            DocumentBuilder builder=dFactory.newDocumentBuilder();
            Document doc;
            doc=builder.parse(new File("src//FactoryPattern//englishe//config.xml"));


            NodeList nl= doc.getElementsByTagName("className");
            Node classNode=nl.item(0).getFirstChild();
            String cName=classNode.getNodeValue();

            Class c=Class.forName(cName);
            obj=c.getDeclaredConstructor().newInstance();
            return obj;

        } catch (Exception e) {
            e.printStackTrace();
            return obj;
        }
    }
}
