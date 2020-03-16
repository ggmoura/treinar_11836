
package com.roadnet.apex.datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.ImmutableObject;


/**
 * <p>Classe Java de Polygon complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="Polygon"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}ImmutableObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Points" type="{http://roadnet.com/apex/DataContracts/}ArrayOfCoordinate" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Polygon", propOrder = {
    "points"
})
public class Polygon
    extends ImmutableObject
{

    @XmlElementRef(name = "Points", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfCoordinate> points;

    /**
     * Obtém o valor da propriedade points.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfCoordinate }{@code >}
     *     
     */
    public JAXBElement<ArrayOfCoordinate> getPoints() {
        return points;
    }

    /**
     * Define o valor da propriedade points.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfCoordinate }{@code >}
     *     
     */
    public void setPoints(JAXBElement<ArrayOfCoordinate> value) {
        this.points = value;
    }

}
