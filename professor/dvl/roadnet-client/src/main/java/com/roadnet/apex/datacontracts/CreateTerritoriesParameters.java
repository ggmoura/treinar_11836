
package com.roadnet.apex.datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.DataTransferObject;


/**
 * <p>Classe Java de CreateTerritoriesParameters complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="CreateTerritoriesParameters"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DataTransferObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="IgnoreFlags_IgnoreConstraints" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PassEntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreateTerritoriesParameters", propOrder = {
    "ignoreFlagsIgnoreConstraints",
    "passEntityKey"
})
public class CreateTerritoriesParameters
    extends DataTransferObject
{

    @XmlElementRef(name = "IgnoreFlags_IgnoreConstraints", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ignoreFlagsIgnoreConstraints;
    @XmlElement(name = "PassEntityKey")
    protected Long passEntityKey;

    /**
     * Obtém o valor da propriedade ignoreFlagsIgnoreConstraints.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIgnoreFlagsIgnoreConstraints() {
        return ignoreFlagsIgnoreConstraints;
    }

    /**
     * Define o valor da propriedade ignoreFlagsIgnoreConstraints.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIgnoreFlagsIgnoreConstraints(JAXBElement<String> value) {
        this.ignoreFlagsIgnoreConstraints = value;
    }

    /**
     * Obtém o valor da propriedade passEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPassEntityKey() {
        return passEntityKey;
    }

    /**
     * Define o valor da propriedade passEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPassEntityKey(Long value) {
        this.passEntityKey = value;
    }

}
