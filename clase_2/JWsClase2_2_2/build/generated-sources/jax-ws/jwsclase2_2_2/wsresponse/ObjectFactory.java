
package jwsclase2_2_2.wsresponse;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the jwsclase2_2_2.wsresponse package. 
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

    private final static QName _GetProducto_QNAME = new QName("http://ws.jwsclase2_2_1/", "getProducto");
    private final static QName _GetProductoResponse_QNAME = new QName("http://ws.jwsclase2_2_1/", "getProductoResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: jwsclase2_2_2.wsresponse
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetProducto }
     * 
     */
    public GetProducto createGetProducto() {
        return new GetProducto();
    }

    /**
     * Create an instance of {@link GetProductoResponse }
     * 
     */
    public GetProductoResponse createGetProductoResponse() {
        return new GetProductoResponse();
    }

    /**
     * Create an instance of {@link Producto }
     * 
     */
    public Producto createProducto() {
        return new Producto();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetProducto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.jwsclase2_2_1/", name = "getProducto")
    public JAXBElement<GetProducto> createGetProducto(GetProducto value) {
        return new JAXBElement<GetProducto>(_GetProducto_QNAME, GetProducto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetProductoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.jwsclase2_2_1/", name = "getProductoResponse")
    public JAXBElement<GetProductoResponse> createGetProductoResponse(GetProductoResponse value) {
        return new JAXBElement<GetProductoResponse>(_GetProductoResponse_QNAME, GetProductoResponse.class, null, value);
    }

}
