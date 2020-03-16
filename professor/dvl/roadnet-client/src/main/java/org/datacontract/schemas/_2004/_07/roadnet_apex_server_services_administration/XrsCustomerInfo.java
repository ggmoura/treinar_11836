
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_administration;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.DataTransferObject;


/**
 * <p>Classe Java de XrsCustomerInfo complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="XrsCustomerInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DataTransferObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="XrsCompanyIdentity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="XrsCompanySid" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="XrsTopLevelOrganizationSid" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "XrsCustomerInfo", propOrder = {
    "xrsCompanyIdentity",
    "xrsCompanySid",
    "xrsTopLevelOrganizationSid"
})
public class XrsCustomerInfo
    extends DataTransferObject
{

    @XmlElementRef(name = "XrsCompanyIdentity", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> xrsCompanyIdentity;
    @XmlElementRef(name = "XrsCompanySid", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> xrsCompanySid;
    @XmlElementRef(name = "XrsTopLevelOrganizationSid", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> xrsTopLevelOrganizationSid;

    /**
     * Obtém o valor da propriedade xrsCompanyIdentity.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getXrsCompanyIdentity() {
        return xrsCompanyIdentity;
    }

    /**
     * Define o valor da propriedade xrsCompanyIdentity.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setXrsCompanyIdentity(JAXBElement<String> value) {
        this.xrsCompanyIdentity = value;
    }

    /**
     * Obtém o valor da propriedade xrsCompanySid.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getXrsCompanySid() {
        return xrsCompanySid;
    }

    /**
     * Define o valor da propriedade xrsCompanySid.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setXrsCompanySid(JAXBElement<Long> value) {
        this.xrsCompanySid = value;
    }

    /**
     * Obtém o valor da propriedade xrsTopLevelOrganizationSid.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getXrsTopLevelOrganizationSid() {
        return xrsTopLevelOrganizationSid;
    }

    /**
     * Define o valor da propriedade xrsTopLevelOrganizationSid.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setXrsTopLevelOrganizationSid(JAXBElement<Long> value) {
        this.xrsTopLevelOrganizationSid = value;
    }

}
