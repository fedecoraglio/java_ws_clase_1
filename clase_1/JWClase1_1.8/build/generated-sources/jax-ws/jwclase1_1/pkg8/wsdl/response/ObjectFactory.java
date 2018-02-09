
package jwclase1_1.pkg8.wsdl.response;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the jwclase1_1.pkg8.wsdl.response package. 
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

    private final static QName _OperationSaludos_QNAME = new QName("http://ws.pkg3.jwclase1_1/", "operationSaludos");
    private final static QName _GetPrimerModel_QNAME = new QName("http://ws.pkg3.jwclase1_1/", "getPrimerModel");
    private final static QName _OperationSaludosResponse_QNAME = new QName("http://ws.pkg3.jwclase1_1/", "operationSaludosResponse");
    private final static QName _Saludos_QNAME = new QName("http://ws.pkg3.jwclase1_1/", "saludos");
    private final static QName _SaludosResponse_QNAME = new QName("http://ws.pkg3.jwclase1_1/", "saludosResponse");
    private final static QName _GetPrimerModelResponse_QNAME = new QName("http://ws.pkg3.jwclase1_1/", "getPrimerModelResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: jwclase1_1.pkg8.wsdl.response
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link OperationSaludos }
     * 
     */
    public OperationSaludos createOperationSaludos() {
        return new OperationSaludos();
    }

    /**
     * Create an instance of {@link GetPrimerModel }
     * 
     */
    public GetPrimerModel createGetPrimerModel() {
        return new GetPrimerModel();
    }

    /**
     * Create an instance of {@link OperationSaludosResponse }
     * 
     */
    public OperationSaludosResponse createOperationSaludosResponse() {
        return new OperationSaludosResponse();
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
     * Create an instance of {@link GetPrimerModelResponse }
     * 
     */
    public GetPrimerModelResponse createGetPrimerModelResponse() {
        return new GetPrimerModelResponse();
    }

    /**
     * Create an instance of {@link MiPrimerModel }
     * 
     */
    public MiPrimerModel createMiPrimerModel() {
        return new MiPrimerModel();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OperationSaludos }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.pkg3.jwclase1_1/", name = "operationSaludos")
    public JAXBElement<OperationSaludos> createOperationSaludos(OperationSaludos value) {
        return new JAXBElement<OperationSaludos>(_OperationSaludos_QNAME, OperationSaludos.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPrimerModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.pkg3.jwclase1_1/", name = "getPrimerModel")
    public JAXBElement<GetPrimerModel> createGetPrimerModel(GetPrimerModel value) {
        return new JAXBElement<GetPrimerModel>(_GetPrimerModel_QNAME, GetPrimerModel.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OperationSaludosResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.pkg3.jwclase1_1/", name = "operationSaludosResponse")
    public JAXBElement<OperationSaludosResponse> createOperationSaludosResponse(OperationSaludosResponse value) {
        return new JAXBElement<OperationSaludosResponse>(_OperationSaludosResponse_QNAME, OperationSaludosResponse.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPrimerModelResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.pkg3.jwclase1_1/", name = "getPrimerModelResponse")
    public JAXBElement<GetPrimerModelResponse> createGetPrimerModelResponse(GetPrimerModelResponse value) {
        return new JAXBElement<GetPrimerModelResponse>(_GetPrimerModelResponse_QNAME, GetPrimerModelResponse.class, null, value);
    }

}
