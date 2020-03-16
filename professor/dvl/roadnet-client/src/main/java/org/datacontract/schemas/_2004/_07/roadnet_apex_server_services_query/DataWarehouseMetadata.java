
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_query;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de DataWarehouseMetadata complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="DataWarehouseMetadata"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Measures" type="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse}ArrayOfMeasureMetadata" minOccurs="0"/&gt;
 *         &lt;element name="SecondaryDimensions" type="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse}ArrayOfSecondaryDimensionMetadata" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DataWarehouseMetadata", propOrder = {
    "measures",
    "secondaryDimensions"
})
public class DataWarehouseMetadata {

    @XmlElementRef(name = "Measures", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfMeasureMetadata> measures;
    @XmlElementRef(name = "SecondaryDimensions", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfSecondaryDimensionMetadata> secondaryDimensions;

    /**
     * Obtém o valor da propriedade measures.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfMeasureMetadata }{@code >}
     *     
     */
    public JAXBElement<ArrayOfMeasureMetadata> getMeasures() {
        return measures;
    }

    /**
     * Define o valor da propriedade measures.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfMeasureMetadata }{@code >}
     *     
     */
    public void setMeasures(JAXBElement<ArrayOfMeasureMetadata> value) {
        this.measures = value;
    }

    /**
     * Obtém o valor da propriedade secondaryDimensions.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfSecondaryDimensionMetadata }{@code >}
     *     
     */
    public JAXBElement<ArrayOfSecondaryDimensionMetadata> getSecondaryDimensions() {
        return secondaryDimensions;
    }

    /**
     * Define o valor da propriedade secondaryDimensions.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfSecondaryDimensionMetadata }{@code >}
     *     
     */
    public void setSecondaryDimensions(JAXBElement<ArrayOfSecondaryDimensionMetadata> value) {
        this.secondaryDimensions = value;
    }

}
