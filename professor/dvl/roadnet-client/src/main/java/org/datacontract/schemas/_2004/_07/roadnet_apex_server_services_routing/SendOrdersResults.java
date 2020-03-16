
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_routing;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOflong;


/**
 * <p>Classe Java de SendOrdersResults complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="SendOrdersResults"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Errors" type="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts}ArrayOfSendOrdersPropertyResult" minOccurs="0"/&gt;
 *         &lt;element name="File" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/&gt;
 *         &lt;element name="LockOrderErrors" type="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts}LockOrderResults" minOccurs="0"/&gt;
 *         &lt;element name="RouteKeyList" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOflong" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SendOrdersResults", propOrder = {
    "errors",
    "file",
    "lockOrderErrors",
    "routeKeyList"
})
public class SendOrdersResults {

    @XmlElementRef(name = "Errors", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfSendOrdersPropertyResult> errors;
    @XmlElementRef(name = "File", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<byte[]> file;
    @XmlElementRef(name = "LockOrderErrors", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<LockOrderResults> lockOrderErrors;
    @XmlElementRef(name = "RouteKeyList", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOflong> routeKeyList;

    /**
     * Obtém o valor da propriedade errors.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfSendOrdersPropertyResult }{@code >}
     *     
     */
    public JAXBElement<ArrayOfSendOrdersPropertyResult> getErrors() {
        return errors;
    }

    /**
     * Define o valor da propriedade errors.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfSendOrdersPropertyResult }{@code >}
     *     
     */
    public void setErrors(JAXBElement<ArrayOfSendOrdersPropertyResult> value) {
        this.errors = value;
    }

    /**
     * Obtém o valor da propriedade file.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     *     
     */
    public JAXBElement<byte[]> getFile() {
        return file;
    }

    /**
     * Define o valor da propriedade file.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     *     
     */
    public void setFile(JAXBElement<byte[]> value) {
        this.file = value;
    }

    /**
     * Obtém o valor da propriedade lockOrderErrors.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link LockOrderResults }{@code >}
     *     
     */
    public JAXBElement<LockOrderResults> getLockOrderErrors() {
        return lockOrderErrors;
    }

    /**
     * Define o valor da propriedade lockOrderErrors.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LockOrderResults }{@code >}
     *     
     */
    public void setLockOrderErrors(JAXBElement<LockOrderResults> value) {
        this.lockOrderErrors = value;
    }

    /**
     * Obtém o valor da propriedade routeKeyList.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOflong }{@code >}
     *     
     */
    public JAXBElement<ArrayOflong> getRouteKeyList() {
        return routeKeyList;
    }

    /**
     * Define o valor da propriedade routeKeyList.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOflong }{@code >}
     *     
     */
    public void setRouteKeyList(JAXBElement<ArrayOflong> value) {
        this.routeKeyList = value;
    }

}
