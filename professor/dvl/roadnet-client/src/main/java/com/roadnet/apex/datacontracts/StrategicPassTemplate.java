
package com.roadnet.apex.datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de StrategicPassTemplate complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="StrategicPassTemplate"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://roadnet.com/apex/DataContracts/}PassTemplate"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="StrategicAttributes" type="{http://roadnet.com/apex/DataContracts/}StrategicPassAttributes" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StrategicPassTemplate", propOrder = {
    "strategicAttributes"
})
@XmlSeeAlso({
    AssignDaysPassTemplate.class,
    CreateTerritoriesPassTemplate.class
})
public class StrategicPassTemplate
    extends PassTemplate
{

    @XmlElementRef(name = "StrategicAttributes", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<StrategicPassAttributes> strategicAttributes;

    /**
     * Obtém o valor da propriedade strategicAttributes.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link StrategicPassAttributes }{@code >}
     *     
     */
    public JAXBElement<StrategicPassAttributes> getStrategicAttributes() {
        return strategicAttributes;
    }

    /**
     * Define o valor da propriedade strategicAttributes.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link StrategicPassAttributes }{@code >}
     *     
     */
    public void setStrategicAttributes(JAXBElement<StrategicPassAttributes> value) {
        this.strategicAttributes = value;
    }

}
