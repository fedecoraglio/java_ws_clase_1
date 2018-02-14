
package nuevo_directorio.clases;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the nuevo_directorio.clases package. 
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

    private final static QName _GetPersonaResponse_QNAME = new QName("http://ws.jwsclase2_2_3/", "getPersonaResponse");
    private final static QName _GetPersona_QNAME = new QName("http://ws.jwsclase2_2_3/", "getPersona");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: nuevo_directorio.clases
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetPersonaResponse }
     * 
     */
    public GetPersonaResponse createGetPersonaResponse() {
        return new GetPersonaResponse();
    }

    /**
     * Create an instance of {@link GetPersona }
     * 
     */
    public GetPersona createGetPersona() {
        return new GetPersona();
    }

    /**
     * Create an instance of {@link Persona }
     * 
     */
    public Persona createPersona() {
        return new Persona();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPersonaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.jwsclase2_2_3/", name = "getPersonaResponse")
    public JAXBElement<GetPersonaResponse> createGetPersonaResponse(GetPersonaResponse value) {
        return new JAXBElement<GetPersonaResponse>(_GetPersonaResponse_QNAME, GetPersonaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPersona }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.jwsclase2_2_3/", name = "getPersona")
    public JAXBElement<GetPersona> createGetPersona(GetPersona value) {
        return new JAXBElement<GetPersona>(_GetPersona_QNAME, GetPersona.class, null, value);
    }

}
