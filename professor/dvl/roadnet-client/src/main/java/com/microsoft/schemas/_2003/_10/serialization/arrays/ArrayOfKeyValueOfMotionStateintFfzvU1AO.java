
package com.microsoft.schemas._2003._10.serialization.arrays;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import com.roadnet.apex.datacontracts.MotionState;


/**
 * <p>Classe Java de ArrayOfKeyValueOfMotionStateintFfzvU1aO complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfKeyValueOfMotionStateintFfzvU1aO"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="KeyValueOfMotionStateintFfzvU1aO" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Key" type="{http://roadnet.com/apex/DataContracts/}MotionState"/&gt;
 *                   &lt;element name="Value" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
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
@XmlType(name = "ArrayOfKeyValueOfMotionStateintFfzvU1aO", propOrder = {
    "keyValueOfMotionStateintFfzvU1AO"
})
public class ArrayOfKeyValueOfMotionStateintFfzvU1AO {

    @XmlElement(name = "KeyValueOfMotionStateintFfzvU1aO")
    protected List<ArrayOfKeyValueOfMotionStateintFfzvU1AO.KeyValueOfMotionStateintFfzvU1AO> keyValueOfMotionStateintFfzvU1AO;

    /**
     * Gets the value of the keyValueOfMotionStateintFfzvU1AO property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the keyValueOfMotionStateintFfzvU1AO property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getKeyValueOfMotionStateintFfzvU1AO().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayOfKeyValueOfMotionStateintFfzvU1AO.KeyValueOfMotionStateintFfzvU1AO }
     * 
     * 
     */
    public List<ArrayOfKeyValueOfMotionStateintFfzvU1AO.KeyValueOfMotionStateintFfzvU1AO> getKeyValueOfMotionStateintFfzvU1AO() {
        if (keyValueOfMotionStateintFfzvU1AO == null) {
            keyValueOfMotionStateintFfzvU1AO = new ArrayList<ArrayOfKeyValueOfMotionStateintFfzvU1AO.KeyValueOfMotionStateintFfzvU1AO>();
        }
        return this.keyValueOfMotionStateintFfzvU1AO;
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
     *         &lt;element name="Key" type="{http://roadnet.com/apex/DataContracts/}MotionState"/&gt;
     *         &lt;element name="Value" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
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
    public static class KeyValueOfMotionStateintFfzvU1AO {

        @XmlElement(name = "Key", required = true)
        @XmlSchemaType(name = "string")
        protected MotionState key;
        @XmlElement(name = "Value")
        protected int value;

        /**
         * Obtém o valor da propriedade key.
         * 
         * @return
         *     possible object is
         *     {@link MotionState }
         *     
         */
        public MotionState getKey() {
            return key;
        }

        /**
         * Define o valor da propriedade key.
         * 
         * @param value
         *     allowed object is
         *     {@link MotionState }
         *     
         */
        public void setKey(MotionState value) {
            this.key = value;
        }

        /**
         * Obtém o valor da propriedade value.
         * 
         */
        public int getValue() {
            return value;
        }

        /**
         * Define o valor da propriedade value.
         * 
         */
        public void setValue(int value) {
            this.value = value;
        }

    }

}
