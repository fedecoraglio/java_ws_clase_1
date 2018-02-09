
package jwclase1_1.pkg4.wsdl.reponse;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the jwclase1_1.pkg4.wsdl.reponse package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _SaludosConNombre_QNAME = new QName("http://ws.pkg3.jwclase1_1/", "saludosConNombre");
    private final static QName _Saludos_QNAME = new QName("http://ws.pkg3.jwclase1_1/", "saludos");
    private final static QName _SaludosResponse_QNAME = new QName("http://ws.pkg3.jwclase1_1/", "saludosResponse");
    private final static QName _SaludosConNombreResponse_QNAME = new QName("http://ws.pkg3.jwclase1_1/", "saludosConNombreResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: jwclase1_1.pkg4.wsdl.reponse
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SaludosConNombre }
     * 
     */
    public SaludosConNombre createSaludosConNombre() {
        return new SaludosConNombre();
    }

    /**
     * Create an instance of {@link Saludos }
     * 
     */
    public Saludos createSaludos() {
        return new Saludos();
    }

    /**
     * Create an instance of {@link SaludosResponse }
     * 
     */
    public SaludosResponse createSaludosResponse() {
        return new SaludosResponse();
    }

    /**
     * Create an instance of {@link SaludosConNombreResponse }
     * 
     */
    public SaludosConNombreResponse createSaludosConNombreResponse() {
        return new SaludosConNombreResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaludosConNombre }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.pkg3.jwclase1_1/", name = "saludosConNombre")
    public JAXBElement<SaludosConNombre> createSaludosConNombre(SaludosConNombre value) {
        return new JAXBElement<SaludosConNombre>(_SaludosConNombre_QNAME, SaludosConNombre.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Saludos }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.pkg3.jwclase1_1/", name = "saludos")
    public JAXBElement<Saludos> createSaludos(Saludos value) {
        return new JAXBElement<Saludos>(_Saludos_QNAME, Saludos.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaludosResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.pkg3.jwclase1_1/", name = "saludosResponse")
    public JAXBElement<SaludosResponse> createSaludosResponse(SaludosResponse value) {
        return new JAXBElement<SaludosResponse>(_SaludosResponse_QNAME, SaludosResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaludosConNombreResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.pkg3.jwclase1_1/", name = "saludosConNombreResponse")
    public JAXBElement<SaludosConNombreResponse> createSaludosConNombreResponse(SaludosConNombreResponse value) {
        return new JAXBElement<SaludosConNombreResponse>(_SaludosConNombreResponse_QNAME, SaludosConNombreResponse.class, null, value);
    }

}
