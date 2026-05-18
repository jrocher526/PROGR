package ejercicio16;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import java.io.File;

public class CreadorConfiguracion {
    public static void main(String[] args) {

        try {

            // FASE 1: Crear documento vacío

            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();

            DocumentBuilder builder = factory.newDocumentBuilder();

            // Documento en blanco
            Document documento = builder.newDocument();

            // FASE 2: Construir arbol XML

            // Crear raiz <videojuego>
            Element raiz = documento.createElement("videojuego");

            // Añadirlo al documento
            documento.appendChild(raiz);

            // Crear <pantalla>
            Element pantalla = documento.createElement("pantalla");

            // Asignarle atributo
            pantalla.setAttribute("resolucion", "1920x1080");

            // Asignarle Texto interno 
            pantalla.setTextContent("true");

            // Añadir pantalla a la raíz
            raiz.appendChild(pantalla);

            // Crear <audio>, asignarle atributo y texto interno
            Element audio = documento.createElement("audio");
            audio.setAttribute("volumen", "80");
            audio.setTextContent("false");
            // Añadir audio a la raíz
            raiz.appendChild(audio);

            // FASE 3: Exportar a archivo XML

            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();

            // Formato 
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");
            transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "4");

            // Origen (DOM)
            DOMSource origen = new DOMSource(documento);

            // Destino (archivo)
            StreamResult destino = new StreamResult(new File("juego_config.xml"));

            // ESCRIBIR XML EN DISCO
            transformer.transform(origen, destino);

            System.out.println("XML generado");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
