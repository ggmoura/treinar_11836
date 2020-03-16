
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_routing;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de NavClientWorkerChangedAction complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="NavClientWorkerChangedAction"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts}NavClientAction"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="IsLoggedOn" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="WorkerId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NavClientWorkerChangedAction", propOrder = {
    "isLoggedOn",
    "workerId"
})
public class NavClientWorkerChangedAction
    extends NavClientAction
{

    @XmlElement(name = "IsLoggedOn")
    protected Boolean isLoggedOn;
    @XmlElementRef(name = "WorkerId", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> workerId;

    /**
     * Obtém o valor da propriedade isLoggedOn.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsLoggedOn() {
        return isLoggedOn;
    }

    /**
     * Define o valor da propriedade isLoggedOn.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsLoggedOn(Boolean value) {
        this.isLoggedOn = value;
    }

    /**
     * Obtém o valor da propriedade workerId.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getWorkerId() {
        return workerId;
    }

    /**
     * Define o valor da propriedade workerId.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setWorkerId(JAXBElement<String> value) {
        this.workerId = value;
    }

}
