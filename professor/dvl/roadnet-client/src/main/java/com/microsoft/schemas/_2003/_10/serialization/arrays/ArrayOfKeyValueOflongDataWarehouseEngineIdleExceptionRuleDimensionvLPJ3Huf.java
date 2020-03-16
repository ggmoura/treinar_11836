
package com.microsoft.schemas._2003._10.serialization.arrays;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_wcfshared_datacontracts.DataWarehouseEngineIdleExceptionRuleDimension;


/**
 * <p>Classe Java de ArrayOfKeyValueOflongDataWarehouseEngineIdleExceptionRuleDimensionvLPJ3Huf complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfKeyValueOflongDataWarehouseEngineIdleExceptionRuleDimensionvLPJ3Huf"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="KeyValueOflongDataWarehouseEngineIdleExceptionRuleDimensionvLPJ3Huf" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Key" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *                   &lt;element name="Value" type="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse}DataWarehouseEngineIdleExceptionRuleDimension"/&gt;
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
@XmlType(name = "ArrayOfKeyValueOflongDataWarehouseEngineIdleExceptionRuleDimensionvLPJ3Huf", propOrder = {
    "keyValueOflongDataWarehouseEngineIdleExceptionRuleDimensionvLPJ3Huf"
})
public class ArrayOfKeyValueOflongDataWarehouseEngineIdleExceptionRuleDimensionvLPJ3Huf {

    @XmlElement(name = "KeyValueOflongDataWarehouseEngineIdleExceptionRuleDimensionvLPJ3Huf")
    protected List<ArrayOfKeyValueOflongDataWarehouseEngineIdleExceptionRuleDimensionvLPJ3Huf.KeyValueOflongDataWarehouseEngineIdleExceptionRuleDimensionvLPJ3Huf> keyValueOflongDataWarehouseEngineIdleExceptionRuleDimensionvLPJ3Huf;

    /**
     * Gets the value of the keyValueOflongDataWarehouseEngineIdleExceptionRuleDimensionvLPJ3Huf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the keyValueOflongDataWarehouseEngineIdleExceptionRuleDimensionvLPJ3Huf property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getKeyValueOflongDataWarehouseEngineIdleExceptionRuleDimensionvLPJ3Huf().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayOfKeyValueOflongDataWarehouseEngineIdleExceptionRuleDimensionvLPJ3Huf.KeyValueOflongDataWarehouseEngineIdleExceptionRuleDimensionvLPJ3Huf }
     * 
     * 
     */
    public List<ArrayOfKeyValueOflongDataWarehouseEngineIdleExceptionRuleDimensionvLPJ3Huf.KeyValueOflongDataWarehouseEngineIdleExceptionRuleDimensionvLPJ3Huf> getKeyValueOflongDataWarehouseEngineIdleExceptionRuleDimensionvLPJ3Huf() {
        if (keyValueOflongDataWarehouseEngineIdleExceptionRuleDimensionvLPJ3Huf == null) {
            keyValueOflongDataWarehouseEngineIdleExceptionRuleDimensionvLPJ3Huf = new ArrayList<ArrayOfKeyValueOflongDataWarehouseEngineIdleExceptionRuleDimensionvLPJ3Huf.KeyValueOflongDataWarehouseEngineIdleExceptionRuleDimensionvLPJ3Huf>();
        }
        return this.keyValueOflongDataWarehouseEngineIdleExceptionRuleDimensionvLPJ3Huf;
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
     *         &lt;element name="Value" type="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse}DataWarehouseEngineIdleExceptionRuleDimension"/&gt;
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
    public static class KeyValueOflongDataWarehouseEngineIdleExceptionRuleDimensionvLPJ3Huf {

        @XmlElement(name = "Key")
        protected long key;
        @XmlElement(name = "Value", required = true, nillable = true)
        protected DataWarehouseEngineIdleExceptionRuleDimension value;

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
         *     {@link DataWarehouseEngineIdleExceptionRuleDimension }
         *     
         */
        public DataWarehouseEngineIdleExceptionRuleDimension getValue() {
            return value;
        }

        /**
         * Define o valor da propriedade value.
         * 
         * @param value
         *     allowed object is
         *     {@link DataWarehouseEngineIdleExceptionRuleDimension }
         *     
         */
        public void setValue(DataWarehouseEngineIdleExceptionRuleDimension value) {
            this.value = value;
        }

    }

}
