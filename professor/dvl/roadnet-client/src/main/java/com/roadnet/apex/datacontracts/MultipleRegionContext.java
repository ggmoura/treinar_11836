
package com.roadnet.apex.datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOflong;


/**
 * <p>Classe Java de MultipleRegionContext complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="MultipleRegionContext"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://roadnet.com/apex/DataContracts/}RegionContext"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Mode" type="{http://roadnet.com/apex/DataContracts/}MultipleRegionMode" minOccurs="0"/&gt;
 *         &lt;element name="RegionEntityKeys" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOflong" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MultipleRegionContext", propOrder = {
    "mode",
    "regionEntityKeys"
})
public class MultipleRegionContext
    extends RegionContext
{

    @XmlElement(name = "Mode")
    @XmlSchemaType(name = "string")
    protected MultipleRegionMode mode;
    @XmlElementRef(name = "RegionEntityKeys", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOflong> regionEntityKeys;

    /**
     * Obtém o valor da propriedade mode.
     * 
     * @return
     *     possible object is
     *     {@link MultipleRegionMode }
     *     
     */
    public MultipleRegionMode getMode() {
        return mode;
    }

    /**
     * Define o valor da propriedade mode.
     * 
     * @param value
     *     allowed object is
     *     {@link MultipleRegionMode }
     *     
     */
    public void setMode(MultipleRegionMode value) {
        this.mode = value;
    }

    /**
     * Obtém o valor da propriedade regionEntityKeys.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOflong }{@code >}
     *     
     */
    public JAXBElement<ArrayOflong> getRegionEntityKeys() {
        return regionEntityKeys;
    }

    /**
     * Define o valor da propriedade regionEntityKeys.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOflong }{@code >}
     *     
     */
    public void setRegionEntityKeys(JAXBElement<ArrayOflong> value) {
        this.regionEntityKeys = value;
    }

}
