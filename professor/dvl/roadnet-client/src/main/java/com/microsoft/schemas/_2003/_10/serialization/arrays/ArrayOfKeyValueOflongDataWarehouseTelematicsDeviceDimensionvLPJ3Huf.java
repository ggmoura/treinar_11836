
package com.microsoft.schemas._2003._10.serialization.arrays;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_wcfshared_datacontracts.DataWarehouseTelematicsDeviceDimension;


/**
 * <p>Classe Java de ArrayOfKeyValueOflongDataWarehouseTelematicsDeviceDimensionvLPJ3Huf complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfKeyValueOflongDataWarehouseTelematicsDeviceDimensionvLPJ3Huf"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="KeyValueOflongDataWarehouseTelematicsDeviceDimensionvLPJ3Huf" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Key" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *                   &lt;element name="Value" type="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse}DataWarehouseTelematicsDeviceDimension"/&gt;
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
@XmlType(name = "ArrayOfKeyValueOflongDataWarehouseTelematicsDeviceDimensionvLPJ3Huf", propOrder = {
    "keyValueOflongDataWarehouseTelematicsDeviceDimensionvLPJ3Huf"
})
public class ArrayOfKeyValueOflongDataWarehouseTelematicsDeviceDimensionvLPJ3Huf {

    @XmlElement(name = "KeyValueOflongDataWarehouseTelematicsDeviceDimensionvLPJ3Huf")
    protected List<ArrayOfKeyValueOflongDataWarehouseTelematicsDeviceDimensionvLPJ3Huf.KeyValueOflongDataWarehouseTelematicsDeviceDimensionvLPJ3Huf> keyValueOflongDataWarehouseTelematicsDeviceDimensionvLPJ3Huf;

    /**
     * Gets the value of the keyValueOflongDataWarehouseTelematicsDeviceDimensionvLPJ3Huf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the keyValueOflongDataWarehouseTelematicsDeviceDimensionvLPJ3Huf property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getKeyValueOflongDataWarehouseTelematicsDeviceDimensionvLPJ3Huf().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayOfKeyValueOflongDataWarehouseTelematicsDeviceDimensionvLPJ3Huf.KeyValueOflongDataWarehouseTelematicsDeviceDimensionvLPJ3Huf }
     * 
     * 
     */
    public List<ArrayOfKeyValueOflongDataWarehouseTelematicsDeviceDimensionvLPJ3Huf.KeyValueOflongDataWarehouseTelematicsDeviceDimensionvLPJ3Huf> getKeyValueOflongDataWarehouseTelematicsDeviceDimensionvLPJ3Huf() {
        if (keyValueOflongDataWarehouseTelematicsDeviceDimensionvLPJ3Huf == null) {
            keyValueOflongDataWarehouseTelematicsDeviceDimensionvLPJ3Huf = new ArrayList<ArrayOfKeyValueOflongDataWarehouseTelematicsDeviceDimensionvLPJ3Huf.KeyValueOflongDataWarehouseTelematicsDeviceDimensionvLPJ3Huf>();
        }
        return this.keyValueOflongDataWarehouseTelematicsDeviceDimensionvLPJ3Huf;
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
     *         &lt;element name="Value" type="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse}DataWarehouseTelematicsDeviceDimension"/&gt;
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
    public static class KeyValueOflongDataWarehouseTelematicsDeviceDimensionvLPJ3Huf {

        @XmlElement(name = "Key")
        protected long key;
        @XmlElement(name = "Value", required = true, nillable = true)
        protected DataWarehouseTelematicsDeviceDimension value;

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
         *     {@link DataWarehouseTelematicsDeviceDimension }
         *     
         */
        public DataWarehouseTelematicsDeviceDimension getValue() {
            return value;
        }

        /**
         * Define o valor da propriedade value.
         * 
         * @param value
         *     allowed object is
         *     {@link DataWarehouseTelematicsDeviceDimension }
         *     
         */
        public void setValue(DataWarehouseTelematicsDeviceDimension value) {
            this.value = value;
        }

    }

}
