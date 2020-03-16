
package com.microsoft.schemas._2003._10.serialization.arrays;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_wcfshared_datacontracts.DataWarehouseRouteInfoDimension;


/**
 * <p>Classe Java de ArrayOfKeyValueOflongDataWarehouseRouteInfoDimensionvLPJ3Huf complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfKeyValueOflongDataWarehouseRouteInfoDimensionvLPJ3Huf"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="KeyValueOflongDataWarehouseRouteInfoDimensionvLPJ3Huf" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Key" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *                   &lt;element name="Value" type="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse}DataWarehouseRouteInfoDimension"/&gt;
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
@XmlType(name = "ArrayOfKeyValueOflongDataWarehouseRouteInfoDimensionvLPJ3Huf", propOrder = {
    "keyValueOflongDataWarehouseRouteInfoDimensionvLPJ3Huf"
})
public class ArrayOfKeyValueOflongDataWarehouseRouteInfoDimensionvLPJ3Huf {

    @XmlElement(name = "KeyValueOflongDataWarehouseRouteInfoDimensionvLPJ3Huf")
    protected List<ArrayOfKeyValueOflongDataWarehouseRouteInfoDimensionvLPJ3Huf.KeyValueOflongDataWarehouseRouteInfoDimensionvLPJ3Huf> keyValueOflongDataWarehouseRouteInfoDimensionvLPJ3Huf;

    /**
     * Gets the value of the keyValueOflongDataWarehouseRouteInfoDimensionvLPJ3Huf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the keyValueOflongDataWarehouseRouteInfoDimensionvLPJ3Huf property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getKeyValueOflongDataWarehouseRouteInfoDimensionvLPJ3Huf().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayOfKeyValueOflongDataWarehouseRouteInfoDimensionvLPJ3Huf.KeyValueOflongDataWarehouseRouteInfoDimensionvLPJ3Huf }
     * 
     * 
     */
    public List<ArrayOfKeyValueOflongDataWarehouseRouteInfoDimensionvLPJ3Huf.KeyValueOflongDataWarehouseRouteInfoDimensionvLPJ3Huf> getKeyValueOflongDataWarehouseRouteInfoDimensionvLPJ3Huf() {
        if (keyValueOflongDataWarehouseRouteInfoDimensionvLPJ3Huf == null) {
            keyValueOflongDataWarehouseRouteInfoDimensionvLPJ3Huf = new ArrayList<ArrayOfKeyValueOflongDataWarehouseRouteInfoDimensionvLPJ3Huf.KeyValueOflongDataWarehouseRouteInfoDimensionvLPJ3Huf>();
        }
        return this.keyValueOflongDataWarehouseRouteInfoDimensionvLPJ3Huf;
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
     *         &lt;element name="Key" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
     *         &lt;element name="Value" type="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse}DataWarehouseRouteInfoDimension"/&gt;
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
    public static class KeyValueOflongDataWarehouseRouteInfoDimensionvLPJ3Huf {

        @XmlElement(name = "Key")
        protected long key;
        @XmlElement(name = "Value", required = true, nillable = true)
        protected DataWarehouseRouteInfoDimension value;

        /**
         * Obtém o valor da propriedade key.
         * 
         */
        public long getKey() {
            return key;
        }

        /**
         * Define o valor da propriedade key.
         * 
         */
        public void setKey(long value) {
            this.key = value;
        }

        /**
         * Obtém o valor da propriedade value.
         * 
         * @return
         *     possible object is
         *     {@link DataWarehouseRouteInfoDimension }
         *     
         */
        public DataWarehouseRouteInfoDimension getValue() {
            return value;
        }

        /**
         * Define o valor da propriedade value.
         * 
         * @param value
         *     allowed object is
         *     {@link DataWarehouseRouteInfoDimension }
         *     
         */
        public void setValue(DataWarehouseRouteInfoDimension value) {
            this.value = value;
        }

    }

}
