
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_wcfshared_datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de EnumDimensionDetail complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="EnumDimensionDetail"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse}DimensionDetail"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DataWarehouseDimensionAttributeType_DimensionAttribute" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Value" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EnumDimensionDetail", propOrder = {
    "dataWarehouseDimensionAttributeTypeDimensionAttribute",
    "value"
})
public class EnumDimensionDetail
    extends DimensionDetail
{

    @XmlElementRef(name = "DataWarehouseDimensionAttributeType_DimensionAttribute", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dataWarehouseDimensionAttributeTypeDimensionAttribute;
    @XmlElement(name = "Value")
    protected Integer value;

    /**
     * Obtém o valor da propriedade dataWarehouseDimensionAttributeTypeDimensionAttribute.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDataWarehouseDimensionAttributeTypeDimensionAttribute() {
        return dataWarehouseDimensionAttributeTypeDimensionAttribute;
    }

    /**
     * Define o valor da propriedade dataWarehouseDimensionAttributeTypeDimensionAttribute.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDataWarehouseDimensionAttributeTypeDimensionAttribute(JAXBElement<String> value) {
        this.dataWarehouseDimensionAttributeTypeDimensionAttribute = value;
    }

    /**
     * Obtém o valor da propriedade value.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getValue() {
        return value;
    }

    /**
     * Define o valor da propriedade value.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setValue(Integer value) {
        this.value = value;
    }

}
