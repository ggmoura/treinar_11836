
package com.microsoft.schemas._2003._10.serialization.arrays;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_wcfshared_datacontracts.DataWarehouseSecondaryDimensionType;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_wcfshared_datacontracts.DimensionFilterValues;


/**
 * <p>Classe Java de ArrayOfKeyValueOfDataWarehouseSecondaryDimensionTypeDimensionFilterValues_SBicUMQs complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfKeyValueOfDataWarehouseSecondaryDimensionTypeDimensionFilterValues_SBicUMQs"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="KeyValueOfDataWarehouseSecondaryDimensionTypeDimensionFilterValues_SBicUMQs" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Key" type="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse}DataWarehouseSecondaryDimensionType"/&gt;
 *                   &lt;element name="Value" type="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse}DimensionFilterValues"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfKeyValueOfDataWarehouseSecondaryDimensionTypeDimensionFilterValues_SBicUMQs", propOrder = {
    "keyValueOfDataWarehouseSecondaryDimensionTypeDimensionFilterValuesSBicUMQs"
})
public class ArrayOfKeyValueOfDataWarehouseSecondaryDimensionTypeDimensionFilterValuesSBicUMQs {

    @XmlElement(name = "KeyValueOfDataWarehouseSecondaryDimensionTypeDimensionFilterValues_SBicUMQs")
    protected List<ArrayOfKeyValueOfDataWarehouseSecondaryDimensionTypeDimensionFilterValuesSBicUMQs.KeyValueOfDataWarehouseSecondaryDimensionTypeDimensionFilterValuesSBicUMQs> keyValueOfDataWarehouseSecondaryDimensionTypeDimensionFilterValuesSBicUMQs;

    /**
     * Gets the value of the keyValueOfDataWarehouseSecondaryDimensionTypeDimensionFilterValuesSBicUMQs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the keyValueOfDataWarehouseSecondaryDimensionTypeDimensionFilterValuesSBicUMQs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getKeyValueOfDataWarehouseSecondaryDimensionTypeDimensionFilterValuesSBicUMQs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayOfKeyValueOfDataWarehouseSecondaryDimensionTypeDimensionFilterValuesSBicUMQs.KeyValueOfDataWarehouseSecondaryDimensionTypeDimensionFilterValuesSBicUMQs }
     * 
     * 
     */
    public List<ArrayOfKeyValueOfDataWarehouseSecondaryDimensionTypeDimensionFilterValuesSBicUMQs.KeyValueOfDataWarehouseSecondaryDimensionTypeDimensionFilterValuesSBicUMQs> getKeyValueOfDataWarehouseSecondaryDimensionTypeDimensionFilterValuesSBicUMQs() {
        if (keyValueOfDataWarehouseSecondaryDimensionTypeDimensionFilterValuesSBicUMQs == null) {
            keyValueOfDataWarehouseSecondaryDimensionTypeDimensionFilterValuesSBicUMQs = new ArrayList<ArrayOfKeyValueOfDataWarehouseSecondaryDimensionTypeDimensionFilterValuesSBicUMQs.KeyValueOfDataWarehouseSecondaryDimensionTypeDimensionFilterValuesSBicUMQs>();
        }
        return this.keyValueOfDataWarehouseSecondaryDimensionTypeDimensionFilterValuesSBicUMQs;
    }


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
     *         &lt;element name="Key" type="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse}DataWarehouseSecondaryDimensionType"/&gt;
     *         &lt;element name="Value" type="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse}DimensionFilterValues"/&gt;
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
        "key",
        "value"
    })
    public static class KeyValueOfDataWarehouseSecondaryDimensionTypeDimensionFilterValuesSBicUMQs {

        @XmlElement(name = "Key", required = true)
        @XmlSchemaType(name = "string")
        protected DataWarehouseSecondaryDimensionType key;
        @XmlElement(name = "Value", required = true, nillable = true)
        protected DimensionFilterValues value;

        /**
         * Obtém o valor da propriedade key.
         * 
         * @return
         *     possible object is
         *     {@link DataWarehouseSecondaryDimensionType }
         *     
         */
        public DataWarehouseSecondaryDimensionType getKey() {
            return key;
        }

        /**
         * Define o valor da propriedade key.
         * 
         * @param value
         *     allowed object is
         *     {@link DataWarehouseSecondaryDimensionType }
         *     
         */
        public void setKey(DataWarehouseSecondaryDimensionType value) {
            this.key = value;
        }

        /**
         * Obtém o valor da propriedade value.
         * 
         * @return
         *     possible object is
         *     {@link DimensionFilterValues }
         *     
         */
        public DimensionFilterValues getValue() {
            return value;
        }

        /**
         * Define o valor da propriedade value.
         * 
         * @param value
         *     allowed object is
         *     {@link DimensionFilterValues }
         *     
         */
        public void setValue(DimensionFilterValues value) {
            this.value = value;
        }

    }

}
