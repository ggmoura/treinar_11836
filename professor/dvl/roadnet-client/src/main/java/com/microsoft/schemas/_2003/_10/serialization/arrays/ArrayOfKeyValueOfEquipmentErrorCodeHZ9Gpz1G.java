
package com.microsoft.schemas._2003._10.serialization.arrays;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import com.roadnet.apex.datacontracts.Equipment;
import com.roadnet.apex.datacontracts.ErrorCode;


/**
 * <p>Classe Java de ArrayOfKeyValueOfEquipmentErrorCodeHZ9gpz1G complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfKeyValueOfEquipmentErrorCodeHZ9gpz1G"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="KeyValueOfEquipmentErrorCodeHZ9gpz1G" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Key" type="{http://roadnet.com/apex/DataContracts/}Equipment"/&gt;
 *                   &lt;element name="Value" type="{http://roadnet.com/apex/DataContracts/}ErrorCode"/&gt;
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
@XmlType(name = "ArrayOfKeyValueOfEquipmentErrorCodeHZ9gpz1G", propOrder = {
    "keyValueOfEquipmentErrorCodeHZ9Gpz1G"
})
public class ArrayOfKeyValueOfEquipmentErrorCodeHZ9Gpz1G {

    @XmlElement(name = "KeyValueOfEquipmentErrorCodeHZ9gpz1G")
    protected List<ArrayOfKeyValueOfEquipmentErrorCodeHZ9Gpz1G.KeyValueOfEquipmentErrorCodeHZ9Gpz1G> keyValueOfEquipmentErrorCodeHZ9Gpz1G;

    /**
     * Gets the value of the keyValueOfEquipmentErrorCodeHZ9Gpz1G property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the keyValueOfEquipmentErrorCodeHZ9Gpz1G property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getKeyValueOfEquipmentErrorCodeHZ9Gpz1G().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayOfKeyValueOfEquipmentErrorCodeHZ9Gpz1G.KeyValueOfEquipmentErrorCodeHZ9Gpz1G }
     * 
     * 
     */
    public List<ArrayOfKeyValueOfEquipmentErrorCodeHZ9Gpz1G.KeyValueOfEquipmentErrorCodeHZ9Gpz1G> getKeyValueOfEquipmentErrorCodeHZ9Gpz1G() {
        if (keyValueOfEquipmentErrorCodeHZ9Gpz1G == null) {
            keyValueOfEquipmentErrorCodeHZ9Gpz1G = new ArrayList<ArrayOfKeyValueOfEquipmentErrorCodeHZ9Gpz1G.KeyValueOfEquipmentErrorCodeHZ9Gpz1G>();
        }
        return this.keyValueOfEquipmentErrorCodeHZ9Gpz1G;
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
     *         &lt;element name="Key" type="{http://roadnet.com/apex/DataContracts/}Equipment"/&gt;
     *         &lt;element name="Value" type="{http://roadnet.com/apex/DataContracts/}ErrorCode"/&gt;
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
    public static class KeyValueOfEquipmentErrorCodeHZ9Gpz1G {

        @XmlElement(name = "Key", required = true, nillable = true)
        protected Equipment key;
        @XmlElement(name = "Value", required = true)
        @XmlSchemaType(name = "string")
        protected ErrorCode value;

        /**
         * Obtém o valor da propriedade key.
         * 
         * @return
         *     possible object is
         *     {@link Equipment }
         *     
         */
        public Equipment getKey() {
            return key;
        }

        /**
         * Define o valor da propriedade key.
         * 
         * @param value
         *     allowed object is
         *     {@link Equipment }
         *     
         */
        public void setKey(Equipment value) {
            this.key = value;
        }

        /**
         * Obtém o valor da propriedade value.
         * 
         * @return
         *     possible object is
         *     {@link ErrorCode }
         *     
         */
        public ErrorCode getValue() {
            return value;
        }

        /**
         * Define o valor da propriedade value.
         * 
         * @param value
         *     allowed object is
         *     {@link ErrorCode }
         *     
         */
        public void setValue(ErrorCode value) {
            this.value = value;
        }

    }

}
