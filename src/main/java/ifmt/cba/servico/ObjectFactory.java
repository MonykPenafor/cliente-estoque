
package ifmt.cba.servico;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ifmt.cba.servico package. 
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

    private final static QName _Exception_QNAME = new QName("http://servico.cba.ifmt/", "Exception");
    private final static QName _AdicionarEstoqueProduto_QNAME = new QName("http://servico.cba.ifmt/", "adicionarEstoqueProduto");
    private final static QName _AdicionarEstoqueProdutoResponse_QNAME = new QName("http://servico.cba.ifmt/", "adicionarEstoqueProdutoResponse");
    private final static QName _AdicionarProduto_QNAME = new QName("http://servico.cba.ifmt/", "adicionarProduto");
    private final static QName _AdicionarProdutoResponse_QNAME = new QName("http://servico.cba.ifmt/", "adicionarProdutoResponse");
    private final static QName _BaixarEstoqueProduto_QNAME = new QName("http://servico.cba.ifmt/", "baixarEstoqueProduto");
    private final static QName _BaixarEstoqueProdutoResponse_QNAME = new QName("http://servico.cba.ifmt/", "baixarEstoqueProdutoResponse");
    private final static QName _BuscarProdutoPorCodigo_QNAME = new QName("http://servico.cba.ifmt/", "buscarProdutoPorCodigo");
    private final static QName _BuscarProdutoPorCodigoResponse_QNAME = new QName("http://servico.cba.ifmt/", "buscarProdutoPorCodigoResponse");
    private final static QName _ContadorProduto_QNAME = new QName("http://servico.cba.ifmt/", "contadorProduto");
    private final static QName _ContadorProdutoResponse_QNAME = new QName("http://servico.cba.ifmt/", "contadorProdutoResponse");
    private final static QName _ListaProduto_QNAME = new QName("http://servico.cba.ifmt/", "listaProduto");
    private final static QName _ListaProdutoResponse_QNAME = new QName("http://servico.cba.ifmt/", "listaProdutoResponse");
    private final static QName _RemoverProduto_QNAME = new QName("http://servico.cba.ifmt/", "removerProduto");
    private final static QName _RemoverProdutoResponse_QNAME = new QName("http://servico.cba.ifmt/", "removerProdutoResponse");
    private final static QName _TotalEstoqueFisico_QNAME = new QName("http://servico.cba.ifmt/", "totalEstoqueFisico");
    private final static QName _TotalEstoqueFisicoResponse_QNAME = new QName("http://servico.cba.ifmt/", "totalEstoqueFisicoResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ifmt.cba.servico
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Exception }
     * 
     */
    public Exception createException() {
        return new Exception();
    }

    /**
     * Create an instance of {@link AdicionarEstoqueProduto }
     * 
     */
    public AdicionarEstoqueProduto createAdicionarEstoqueProduto() {
        return new AdicionarEstoqueProduto();
    }

    /**
     * Create an instance of {@link AdicionarEstoqueProdutoResponse }
     * 
     */
    public AdicionarEstoqueProdutoResponse createAdicionarEstoqueProdutoResponse() {
        return new AdicionarEstoqueProdutoResponse();
    }

    /**
     * Create an instance of {@link AdicionarProduto }
     * 
     */
    public AdicionarProduto createAdicionarProduto() {
        return new AdicionarProduto();
    }

    /**
     * Create an instance of {@link AdicionarProdutoResponse }
     * 
     */
    public AdicionarProdutoResponse createAdicionarProdutoResponse() {
        return new AdicionarProdutoResponse();
    }

    /**
     * Create an instance of {@link BaixarEstoqueProduto }
     * 
     */
    public BaixarEstoqueProduto createBaixarEstoqueProduto() {
        return new BaixarEstoqueProduto();
    }

    /**
     * Create an instance of {@link BaixarEstoqueProdutoResponse }
     * 
     */
    public BaixarEstoqueProdutoResponse createBaixarEstoqueProdutoResponse() {
        return new BaixarEstoqueProdutoResponse();
    }

    /**
     * Create an instance of {@link BuscarProdutoPorCodigo }
     * 
     */
    public BuscarProdutoPorCodigo createBuscarProdutoPorCodigo() {
        return new BuscarProdutoPorCodigo();
    }

    /**
     * Create an instance of {@link BuscarProdutoPorCodigoResponse }
     * 
     */
    public BuscarProdutoPorCodigoResponse createBuscarProdutoPorCodigoResponse() {
        return new BuscarProdutoPorCodigoResponse();
    }

    /**
     * Create an instance of {@link ContadorProduto }
     * 
     */
    public ContadorProduto createContadorProduto() {
        return new ContadorProduto();
    }

    /**
     * Create an instance of {@link ContadorProdutoResponse }
     * 
     */
    public ContadorProdutoResponse createContadorProdutoResponse() {
        return new ContadorProdutoResponse();
    }

    /**
     * Create an instance of {@link ListaProduto }
     * 
     */
    public ListaProduto createListaProduto() {
        return new ListaProduto();
    }

    /**
     * Create an instance of {@link ListaProdutoResponse }
     * 
     */
    public ListaProdutoResponse createListaProdutoResponse() {
        return new ListaProdutoResponse();
    }

    /**
     * Create an instance of {@link RemoverProduto }
     * 
     */
    public RemoverProduto createRemoverProduto() {
        return new RemoverProduto();
    }

    /**
     * Create an instance of {@link RemoverProdutoResponse }
     * 
     */
    public RemoverProdutoResponse createRemoverProdutoResponse() {
        return new RemoverProdutoResponse();
    }

    /**
     * Create an instance of {@link TotalEstoqueFisico }
     * 
     */
    public TotalEstoqueFisico createTotalEstoqueFisico() {
        return new TotalEstoqueFisico();
    }

    /**
     * Create an instance of {@link TotalEstoqueFisicoResponse }
     * 
     */
    public TotalEstoqueFisicoResponse createTotalEstoqueFisicoResponse() {
        return new TotalEstoqueFisicoResponse();
    }

    /**
     * Create an instance of {@link ProdutoVO }
     * 
     */
    public ProdutoVO createProdutoVO() {
        return new ProdutoVO();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Exception }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Exception }{@code >}
     */
    @XmlElementDecl(namespace = "http://servico.cba.ifmt/", name = "Exception")
    public JAXBElement<Exception> createException(Exception value) {
        return new JAXBElement<Exception>(_Exception_QNAME, Exception.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdicionarEstoqueProduto }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AdicionarEstoqueProduto }{@code >}
     */
    @XmlElementDecl(namespace = "http://servico.cba.ifmt/", name = "adicionarEstoqueProduto")
    public JAXBElement<AdicionarEstoqueProduto> createAdicionarEstoqueProduto(AdicionarEstoqueProduto value) {
        return new JAXBElement<AdicionarEstoqueProduto>(_AdicionarEstoqueProduto_QNAME, AdicionarEstoqueProduto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdicionarEstoqueProdutoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AdicionarEstoqueProdutoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://servico.cba.ifmt/", name = "adicionarEstoqueProdutoResponse")
    public JAXBElement<AdicionarEstoqueProdutoResponse> createAdicionarEstoqueProdutoResponse(AdicionarEstoqueProdutoResponse value) {
        return new JAXBElement<AdicionarEstoqueProdutoResponse>(_AdicionarEstoqueProdutoResponse_QNAME, AdicionarEstoqueProdutoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdicionarProduto }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AdicionarProduto }{@code >}
     */
    @XmlElementDecl(namespace = "http://servico.cba.ifmt/", name = "adicionarProduto")
    public JAXBElement<AdicionarProduto> createAdicionarProduto(AdicionarProduto value) {
        return new JAXBElement<AdicionarProduto>(_AdicionarProduto_QNAME, AdicionarProduto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdicionarProdutoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AdicionarProdutoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://servico.cba.ifmt/", name = "adicionarProdutoResponse")
    public JAXBElement<AdicionarProdutoResponse> createAdicionarProdutoResponse(AdicionarProdutoResponse value) {
        return new JAXBElement<AdicionarProdutoResponse>(_AdicionarProdutoResponse_QNAME, AdicionarProdutoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BaixarEstoqueProduto }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BaixarEstoqueProduto }{@code >}
     */
    @XmlElementDecl(namespace = "http://servico.cba.ifmt/", name = "baixarEstoqueProduto")
    public JAXBElement<BaixarEstoqueProduto> createBaixarEstoqueProduto(BaixarEstoqueProduto value) {
        return new JAXBElement<BaixarEstoqueProduto>(_BaixarEstoqueProduto_QNAME, BaixarEstoqueProduto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BaixarEstoqueProdutoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BaixarEstoqueProdutoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://servico.cba.ifmt/", name = "baixarEstoqueProdutoResponse")
    public JAXBElement<BaixarEstoqueProdutoResponse> createBaixarEstoqueProdutoResponse(BaixarEstoqueProdutoResponse value) {
        return new JAXBElement<BaixarEstoqueProdutoResponse>(_BaixarEstoqueProdutoResponse_QNAME, BaixarEstoqueProdutoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscarProdutoPorCodigo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BuscarProdutoPorCodigo }{@code >}
     */
    @XmlElementDecl(namespace = "http://servico.cba.ifmt/", name = "buscarProdutoPorCodigo")
    public JAXBElement<BuscarProdutoPorCodigo> createBuscarProdutoPorCodigo(BuscarProdutoPorCodigo value) {
        return new JAXBElement<BuscarProdutoPorCodigo>(_BuscarProdutoPorCodigo_QNAME, BuscarProdutoPorCodigo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscarProdutoPorCodigoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BuscarProdutoPorCodigoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://servico.cba.ifmt/", name = "buscarProdutoPorCodigoResponse")
    public JAXBElement<BuscarProdutoPorCodigoResponse> createBuscarProdutoPorCodigoResponse(BuscarProdutoPorCodigoResponse value) {
        return new JAXBElement<BuscarProdutoPorCodigoResponse>(_BuscarProdutoPorCodigoResponse_QNAME, BuscarProdutoPorCodigoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ContadorProduto }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ContadorProduto }{@code >}
     */
    @XmlElementDecl(namespace = "http://servico.cba.ifmt/", name = "contadorProduto")
    public JAXBElement<ContadorProduto> createContadorProduto(ContadorProduto value) {
        return new JAXBElement<ContadorProduto>(_ContadorProduto_QNAME, ContadorProduto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ContadorProdutoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ContadorProdutoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://servico.cba.ifmt/", name = "contadorProdutoResponse")
    public JAXBElement<ContadorProdutoResponse> createContadorProdutoResponse(ContadorProdutoResponse value) {
        return new JAXBElement<ContadorProdutoResponse>(_ContadorProdutoResponse_QNAME, ContadorProdutoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListaProduto }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ListaProduto }{@code >}
     */
    @XmlElementDecl(namespace = "http://servico.cba.ifmt/", name = "listaProduto")
    public JAXBElement<ListaProduto> createListaProduto(ListaProduto value) {
        return new JAXBElement<ListaProduto>(_ListaProduto_QNAME, ListaProduto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListaProdutoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ListaProdutoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://servico.cba.ifmt/", name = "listaProdutoResponse")
    public JAXBElement<ListaProdutoResponse> createListaProdutoResponse(ListaProdutoResponse value) {
        return new JAXBElement<ListaProdutoResponse>(_ListaProdutoResponse_QNAME, ListaProdutoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoverProduto }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RemoverProduto }{@code >}
     */
    @XmlElementDecl(namespace = "http://servico.cba.ifmt/", name = "removerProduto")
    public JAXBElement<RemoverProduto> createRemoverProduto(RemoverProduto value) {
        return new JAXBElement<RemoverProduto>(_RemoverProduto_QNAME, RemoverProduto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoverProdutoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RemoverProdutoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://servico.cba.ifmt/", name = "removerProdutoResponse")
    public JAXBElement<RemoverProdutoResponse> createRemoverProdutoResponse(RemoverProdutoResponse value) {
        return new JAXBElement<RemoverProdutoResponse>(_RemoverProdutoResponse_QNAME, RemoverProdutoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TotalEstoqueFisico }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TotalEstoqueFisico }{@code >}
     */
    @XmlElementDecl(namespace = "http://servico.cba.ifmt/", name = "totalEstoqueFisico")
    public JAXBElement<TotalEstoqueFisico> createTotalEstoqueFisico(TotalEstoqueFisico value) {
        return new JAXBElement<TotalEstoqueFisico>(_TotalEstoqueFisico_QNAME, TotalEstoqueFisico.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TotalEstoqueFisicoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TotalEstoqueFisicoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://servico.cba.ifmt/", name = "totalEstoqueFisicoResponse")
    public JAXBElement<TotalEstoqueFisicoResponse> createTotalEstoqueFisicoResponse(TotalEstoqueFisicoResponse value) {
        return new JAXBElement<TotalEstoqueFisicoResponse>(_TotalEstoqueFisicoResponse_QNAME, TotalEstoqueFisicoResponse.class, null, value);
    }

}
