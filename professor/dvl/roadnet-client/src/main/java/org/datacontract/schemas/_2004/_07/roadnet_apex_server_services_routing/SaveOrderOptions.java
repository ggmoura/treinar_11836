
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_routing;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import com.roadnet.apex.datacontracts.SaveOptions;


/**
 * <p>Classe Java de SaveOrderOptions complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="SaveOrderOptions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="IsAtomicOperation" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="SaveOptions" type="{http://roadnet.com/apex/DataContracts/}SaveOptions" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SaveOrderOptions", propOrder = {
    "isAtomicOperation",
    "saveOptions"
})
public class SaveOrderOptions {

    @XmlElement(name = "IsAtomicOperation")
    protected Boolean isAtomicOperation;
    @XmlElementRef(name = "SaveOptions", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<SaveOptions> saveOptions;

    /**
     * Obtém o valor da propriedade isAtomicOperation.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsAtomicOperation() {
        return isAtomicOperation;
    }

    /**
     * Define o valor da propriedade isAtomicOperation.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsAtomicOperation(Boolean value) {
        this.isAtomicOperation = value;
    }

    /**
     * Obtém o valor da propriedade saveOptions.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SaveOptions }{@code >}
     *     
     */
    public JAXBElement<SaveOptions> getSaveOptions() {
        return saveOptions;
    }

    /**
     * Define o valor da propriedade saveOptions.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SaveOptions }{@code >}
     *     
     */
    public void setSaveOptions(JAXBElement<SaveOptions> value) {
        this.saveOptions = value;
    }

}
