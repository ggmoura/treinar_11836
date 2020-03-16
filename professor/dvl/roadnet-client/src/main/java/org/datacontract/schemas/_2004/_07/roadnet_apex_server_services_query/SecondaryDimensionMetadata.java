
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_query;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_wcfshared_datacontracts.DataWarehouseSecondaryDimensionType;


/**
 * <p>Classe Java de SecondaryDimensionMetadata complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="SecondaryDimensionMetadata"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse}DimensionMetadata"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Attributes" type="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse}ArrayOfDimensionMetadata" minOccurs="0"/&gt;
 *         &lt;element name="Type" type="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse}DataWarehouseSecondaryDimensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecondaryDimensionMetadata", propOrder = {
    "attributes",
    "type"
})
public class SecondaryDimensionMetadata
    extends DimensionMetadata
{

    @XmlElementRef(name = "Attributes", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfDimensionMetadata> attributes;
    @XmlElement(name = "Type")
    @XmlSchemaType(name = "string")
    protected DataWarehouseSecondaryDimensionType type;

    /**
     * Obtém o valor da propriedade attributes.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfDimensionMetadata }{@code >}
     *     
     */
    public JAXBElement<ArrayOfDimensionMetadata> getAttributes() {
        return attributes;
    }

    /**
     * Define o valor da propriedade attributes.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfDimensionMetadata }{@code >}
     *     
     */
    public void setAttributes(JAXBElement<ArrayOfDimensionMetadata> value) {
        this.attributes = value;
    }

    /**
     * Obtém o valor da propriedade type.
     * 
     * @return
     *     possible object is
     *     {@link DataWarehouseSecondaryDimensionType }
     *     
     */
    public DataWarehouseSecondaryDimensionType getType() {
        return type;
    }

    /**
     * Define o valor da propriedade type.
     * 
     * @param value
     *     allowed object is
     *     {@link DataWarehouseSecondaryDimensionType }
     *     
     */
    public void setType(DataWarehouseSecondaryDimensionType value) {
        this.type = value;
    }

}
