
package com.roadnet.apex;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.roadnet.apex.datacontracts.RegionContext;
import com.roadnet.apex.datacontracts.SaveEquipmentServiceArgs;


/**
 * <p>Classe Java de anonymous complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="regionContext" type="{http://roadnet.com/apex/DataContracts/}RegionContext" minOccurs="0"/&gt;
 *         &lt;element name="saveEquipmentServiceArgs" type="{http://roadnet.com/apex/DataContracts/}SaveEquipmentServiceArgs" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "regionContext",
    "saveEquipmentServiceArgs"
})
@XmlRootElement(name = "UpdateEquipmentService")
public class UpdateEquipmentService {

    @XmlElementRef(name = "regionContext", namespace = "http://roadnet.com/apex/", type = JAXBElement.class, required = false)
    protected JAXBElement<RegionContext> regionContext;
    @XmlElementRef(name = "saveEquipmentServiceArgs", namespace = "http://roadnet.com/apex/", type = JAXBElement.class, required = false)
    protected JAXBElement<SaveEquipmentServiceArgs> saveEquipmentServiceArgs;

    /**
     * Obtém o valor da propriedade regionContext.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RegionContext }{@code >}
     *     
     */
    public JAXBElement<RegionContext> getRegionContext() {
        return regionContext;
    }

    /**
     * Define o valor da propriedade regionContext.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RegionContext }{@code >}
     *     
     */
    public void setRegionContext(JAXBElement<RegionContext> value) {
        this.regionContext = value;
    }

    /**
     * Obtém o valor da propriedade saveEquipmentServiceArgs.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SaveEquipmentServiceArgs }{@code >}
     *     
     */
    public JAXBElement<SaveEquipmentServiceArgs> getSaveEquipmentServiceArgs() {
        return saveEquipmentServiceArgs;
    }

    /**
     * Define o valor da propriedade saveEquipmentServiceArgs.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SaveEquipmentServiceArgs }{@code >}
     *     
     */
    public void setSaveEquipmentServiceArgs(JAXBElement<SaveEquipmentServiceArgs> value) {
        this.saveEquipmentServiceArgs = value;
    }

}
