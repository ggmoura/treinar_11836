
package com.roadnet.apex.datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ServicePolygon complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ServicePolygon"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://roadnet.com/apex/DataContracts/}ServiceAreaBase"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Area" type="{http://roadnet.com/apex/DataContracts/}Polygon" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServicePolygon", propOrder = {
    "area"
})
public class ServicePolygon
    extends ServiceAreaBase
{

    @XmlElementRef(name = "Area", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Polygon> area;

    /**
     * Obtém o valor da propriedade area.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Polygon }{@code >}
     *     
     */
    public JAXBElement<Polygon> getArea() {
        return area;
    }

    /**
     * Define o valor da propriedade area.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Polygon }{@code >}
     *     
     */
    public void setArea(JAXBElement<Polygon> value) {
        this.area = value;
    }

}
