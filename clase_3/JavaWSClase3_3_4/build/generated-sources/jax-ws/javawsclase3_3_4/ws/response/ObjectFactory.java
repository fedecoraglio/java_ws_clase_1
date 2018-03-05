
package javawsclase3_3_4.ws.response;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the javawsclase3_3_4.ws.response package. 
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

    private final static QName _ProductoException_QNAME = new QName("http://ws.javawsclase3_3_3/", "ProductoException");
    private final static QName _GuardarProductoResponse_QNAME = new QName("http://ws.javawsclase3_3_3/", "guardarProductoResponse");
    private final static QName _GuardarProducto_QNAME = new QName("http://ws.javawsclase3_3_3/", "guardarProducto");
    private final static QName _ObtenerProductos_QNAME = new QName("http://ws.javawsclase3_3_3/", "obtenerProductos");
    private final static QName _ObtenerProductosResponse_QNAME = new QName("http://ws.javawsclase3_3_3/", "obtenerProductosResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: javawsclase3_3_4.ws.response
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ProductoException }
     * 
     */
    public ProductoException createProductoException() {
        return new ProductoException();
    }

    /**
     * Create an instance of {@link GuardarProducto }
     * 
     */
    public GuardarProducto createGuardarProducto() {
        return new GuardarProducto();
    }

    /**
     * Create an instance of {@link GuardarProductoResponse }
     * 
     */
    public GuardarProductoResponse createGuardarProductoResponse() {
        return new GuardarProductoResponse();
    }

    /**
     * Create an instance of {@link ObtenerProductosResponse }
     * 
     */
    public ObtenerProductosResponse createObtenerProductosResponse() {
        return new ObtenerProductosResponse();
    }

    /**
     * Create an instance of {@link ObtenerProductos }
     * 
     */
    public ObtenerProductos createObtenerProductos() {
        return new ObtenerProductos();
    }

    /**
     * Create an instance of {@link Producto }
     * 
     */
    public Producto createProducto() {
        return new Producto();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProductoException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.javawsclase3_3_3/", name = "ProductoException")
    public JAXBElement<ProductoException> createProductoException(ProductoException value) {
        return new JAXBElement<ProductoException>(_ProductoException_QNAME, ProductoException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GuardarProductoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.javawsclase3_3_3/", name = "guardarProductoResponse")
    public JAXBElement<GuardarProductoResponse> createGuardarProductoResponse(GuardarProductoResponse value) {
        return new JAXBElement<GuardarProductoResponse>(_GuardarProductoResponse_QNAME, GuardarProductoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GuardarProducto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.javawsclase3_3_3/", name = "guardarProducto")
    public JAXBElement<GuardarProducto> createGuardarProducto(GuardarProducto value) {
        return new JAXBElement<GuardarProducto>(_GuardarProducto_QNAME, GuardarProducto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerProductos }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.javawsclase3_3_3/", name = "obtenerProductos")
    public JAXBElement<ObtenerProductos> createObtenerProductos(ObtenerProductos value) {
        return new JAXBElement<ObtenerProductos>(_ObtenerProductos_QNAME, ObtenerProductos.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerProductosResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.javawsclase3_3_3/", name = "obtenerProductosResponse")
    public JAXBElement<ObtenerProductosResponse> createObtenerProductosResponse(ObtenerProductosResponse value) {
        return new JAXBElement<ObtenerProductosResponse>(_ObtenerProductosResponse_QNAME, ObtenerProductosResponse.class, null, value);
    }

}
