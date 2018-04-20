/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package archivoxml;

import java.io.File;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/**
 *
 * @author Diego
 */
public class ArchivoXML {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        try {
            File archivo = new File("C:\\Users\\USER\\Desktop\\archivoPrueba.xml");
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder documentBuilder = dbf.newDocumentBuilder();
            Document document = documentBuilder.parse(archivo);     //Todo esto (renglones anteriores tambien) es para hacer un casteo y saber de qué tipo de documento se trata
            System.out.println("Elemento raiz: " + document.getDocumentElement().getNodeName());
            NodeList listaEmpleados = document.getElementsByTagName("empleado");    //Un arreglo de nodos (un nodo es una etiqueta del xml)
            for (int i = 0; i < listaEmpleados.getLength(); i++) {
                Node nodo = listaEmpleados.item(i);     //Para obtener los nodos en una lista de nodos
                System.out.println("Elemento: " + nodo.getNodeName());
                if (nodo.getNodeType() == Node.ELEMENT_NODE) {  //Si es un elemento de tipo nodo
                    Element element = (Element) nodo;
                    System.out.println("ID: " + element.getAttribute("id"));
                    System.out.println("Nombre: " + element.getElementsByTagName("nombre").item(0).getTextContent());
                    System.out.println("Username: " + element.getElementsByTagName("username").item(0).getTextContent());
                    System.out.println("Password: " + element.getElementsByTagName("password").item(0).getTextContent());
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
