package UD9.ejercicio17;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        try {
            // Crear lista de personas
            ArrayList<Persona> contactos = new ArrayList<>();

            // Añadir personas a la lista
            // Creamos personas
            Persona manuel = new Persona("Manuel Rondon", "Anzoategui-Venezuela", 1782739475);
            Persona jose = new Persona("Jose Marquez", "Monagas-Venezuela", 73894020);
            Persona juan = new Persona("Juan Rosado", "Ubrique-España", 728939281);
            Persona maria = new Persona("Fabiana Mendonza", "Caracas-Venezuela", 722344343);

            // Añadimos todas las personas a la lista
            contactos.addAll(List.of(manuel, jose, juan, maria));

            // Creamos el documento XML
            // DocumentBuilderFactory Para Instanciar (El DOM funciona mediante una fabrica (factory))
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();

            // Crear el contructor
            // Esto obtiene un constructor que genera XML
            DocumentBuilder builder = factory.newDocumentBuilder();

            // Creamos el documento
            // Esto crea el documento pero vacio
            Document documento = builder.newDocument();

            // Creamos los nodos
            Element raiz = documento.createElement("contactos");

            // añadimos la raiz
            documento.appendChild(raiz);

            // Recorremos lista
            for(Persona p : contactos) {

                // Creamos persona
                Element persona = documento.createElement("persona");

                // Añadimos nombre
                Element nombre = documento.createElement("nombre");
                nombre.setTextContent(p.getNombre());

                // Añadimos Direccion
                Element direccion = documento.createElement("direccion");
                direccion.setTextContent(p.getDireccion());

                // Añadimos telefono
                Element telefono = documento.createElement("telefono");
                telefono.setTextContent(String.valueOf(p.getTelefono()));

                // añadimos los datos a persona
                persona.appendChild(nombre);
                persona.appendChild(direccion);
                persona.appendChild(telefono);

                // añadimos persona a raiz
                raiz.appendChild(persona);

                // Creamos eñ trasformador
                TransformerFactory tf = TransformerFactory.newInstance();
                Transformer transformer = tf.newTransformer();

                // Damos formato
                transformer.setOutputProperty(OutputKeys.INDENT, "yes");

                // Guardamos el documento
                DOMSource source = new DOMSource(documento); // Indica el origen

                StreamResult resutado = new StreamResult(new File("contactos_JhonalRoca.xml")); // Indica el destino
                transformer.transform(source, resutado); // Crea el xml
                System.out.println("XML generado"); // Mensaje
            }

        } catch (ParserConfigurationException | TransformerException e) {
            throw new RuntimeException(e);
        }

    }
}
