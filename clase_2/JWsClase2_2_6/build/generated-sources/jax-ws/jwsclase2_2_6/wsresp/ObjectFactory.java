
package jwsclase2_2_6.wsresp;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the jwsclase2_2_6.wsresp package. 
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

    private final static QName _GuardarMsj_QNAME = new QName("http://ws.jwsclase_2_2_5/", "guardarMsj");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: jwsclase2_2_6.wsresp
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GuardarMsj }
     * 
     */
    public GuardarMsj createGuardarMsj() {
        return new GuardarMsj();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GuardarMsj }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.jwsclase_2_2_5/", name = "guardarMsj")
    public JAXBElement<GuardarMsj> createGuardarMsj(GuardarMsj value) {
        return new JAXBElement<GuardarMsj>(_GuardarMsj_QNAME, GuardarMsj.class, null, value);
    }

}
