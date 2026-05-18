package ejercicio15;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import java.io.File;

public class LectorConfiguracion {
    public static void main(String[] args) {

        try {
            // Crear la factoria y el constructor 
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance(); // factora crea objetos para trabajar con XML

            // Constructor que parseará el XML
            DocumentBuilder builder = factory.newDocumentBuilder();

            // Parsear el archivo XML

            // Cargamos el archivo XML
            Document documento = builder.parse(new File("config.xml"));

            // Normaliza el árbol XML
            documento.getDocumentElement().normalize();  // Junta nodos de texto cercanos y limpia el DOM

            // Obtener el elemento raíz
            Element raiz = documento.getDocumentElement(); // Recupera <configuracion>

            System.out.println("Elemento raiz: "
                    + raiz.getNodeName());

            //Obtener <base-datos>

            NodeList listaBaseDatos = documento.getElementsByTagName("base-datos"); // Busca todos los elementos llamados "base-datos"

            // Tomamos el primero
            Node nodoBaseDatos = listaBaseDatos.item(0);

            // Obtener sus hijos
            NodeList hijos = nodoBaseDatos.getChildNodes();

            System.out.println("\nNumero de hijos encontrados: " + hijos.getLength());

            System.out.println("\nListando hijos");

            // Recorremos todos los hijos
            for (int i = 0; i < hijos.getLength(); i++) {

                Node hijo = hijos.item(i);

                System.out.println(
                        "Hijo " + i + " - Tipo: " + hijo.getNodeType() + " | Nombre: " + hijo.getNodeName()
                );
            }

            // Filtrar SOLO elementos reales
            System.out.println("\nDatos reales del XML");

            for (int i = 0; i < hijos.getLength(); i++) {

                Node hijo = hijos.item(i);

                // Filtramos solo nodos de tipo ELEMENT_NODE
                if (hijo.getNodeType() == Node.ELEMENT_NODE) {

                    Element elemento = (Element) hijo;

                    System.out.println(
                            elemento.getTagName() + ": " + elemento.getTextContent()
                    );
                }
            }

        } catch (Exception e) {

            e.printStackTrace();
        }
    }
}	
