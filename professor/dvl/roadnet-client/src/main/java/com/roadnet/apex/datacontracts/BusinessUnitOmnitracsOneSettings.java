
package com.roadnet.apex.datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.DataTransferObject;


/**
 * <p>Classe Java de BusinessUnit.OmnitracsOneSettings complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="BusinessUnit.OmnitracsOneSettings"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DataTransferObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DefaultEntityCreateInRegionEntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="DefaultRoleEntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BusinessUnit.OmnitracsOneSettings", propOrder = {
    "defaultEntityCreateInRegionEntityKey",
    "defaultRoleEntityKey"
})
public class BusinessUnitOmnitracsOneSettings
    extends DataTransferObject
{

    @XmlElementRef(name = "DefaultEntityCreateInRegionEntityKey", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> defaultEntityCreateInRegionEntityKey;
    @XmlElementRef(name = "DefaultRoleEntityKey", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> defaultRoleEntityKey;

    /**
     * Obtém o valor da propriedade defaultEntityCreateInRegionEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getDefaultEntityCreateInRegionEntityKey() {
        return defaultEntityCreateInRegionEntityKey;
    }

    /**
     * Define o valor da propriedade defaultEntityCreateInRegionEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setDefaultEntityCreateInRegionEntityKey(JAXBElement<Long> value) {
        this.defaultEntityCreateInRegionEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade defaultRoleEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getDefaultRoleEntityKey() {
        return defaultRoleEntityKey;
    }

    /**
     * Define o valor da propriedade defaultRoleEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setDefaultRoleEntityKey(JAXBElement<Long> value) {
        this.defaultRoleEntityKey = value;
    }

}
