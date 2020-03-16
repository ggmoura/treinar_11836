
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_query;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de CustomMeasureTypeMetadata complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="CustomMeasureTypeMetadata"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse}MeasureTypeMetadata"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MeasureName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MeasurePkey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomMeasureTypeMetadata", propOrder = {
    "measureName",
    "measurePkey"
})
public class CustomMeasureTypeMetadata
    extends MeasureTypeMetadata
{

    @XmlElementRef(name = "MeasureName", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", type = JAXBElement.class, required = false)
    protected JAXBElement<String> measureName;
    @XmlElement(name = "MeasurePkey")
    protected Long measurePkey;

    /**
     * Obtém o valor da propriedade measureName.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMeasureName() {
        return measureName;
    }

    /**
     * Define o valor da propriedade measureName.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMeasureName(JAXBElement<String> value) {
        this.measureName = value;
    }

    /**
     * Obtém o valor da propriedade measurePkey.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMeasurePkey() {
        return measurePkey;
    }

    /**
     * Define o valor da propriedade measurePkey.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMeasurePkey(Long value) {
        this.measurePkey = value;
    }

}
