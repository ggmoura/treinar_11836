
package com.microsoft.schemas._2003._10.serialization.arrays;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import com.roadnet.apex.datacontracts.WorkerDutyStatus;


/**
 * <p>Classe Java de ArrayOfKeyValueOfWorkerDutyStatusintFfzvU1aO complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfKeyValueOfWorkerDutyStatusintFfzvU1aO"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="KeyValueOfWorkerDutyStatusintFfzvU1aO" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Key" type="{http://roadnet.com/apex/DataContracts/}WorkerDutyStatus"/&gt;
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
@XmlType(name = "ArrayOfKeyValueOfWorkerDutyStatusintFfzvU1aO", propOrder = {
    "keyValueOfWorkerDutyStatusintFfzvU1AO"
})
public class ArrayOfKeyValueOfWorkerDutyStatusintFfzvU1AO {

    @XmlElement(name = "KeyValueOfWorkerDutyStatusintFfzvU1aO")
    protected List<ArrayOfKeyValueOfWorkerDutyStatusintFfzvU1AO.KeyValueOfWorkerDutyStatusintFfzvU1AO> keyValueOfWorkerDutyStatusintFfzvU1AO;

    /**
     * Gets the value of the keyValueOfWorkerDutyStatusintFfzvU1AO property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the keyValueOfWorkerDutyStatusintFfzvU1AO property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getKeyValueOfWorkerDutyStatusintFfzvU1AO().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayOfKeyValueOfWorkerDutyStatusintFfzvU1AO.KeyValueOfWorkerDutyStatusintFfzvU1AO }
     * 
     * 
     */
    public List<ArrayOfKeyValueOfWorkerDutyStatusintFfzvU1AO.KeyValueOfWorkerDutyStatusintFfzvU1AO> getKeyValueOfWorkerDutyStatusintFfzvU1AO() {
        if (keyValueOfWorkerDutyStatusintFfzvU1AO == null) {
            keyValueOfWorkerDutyStatusintFfzvU1AO = new ArrayList<ArrayOfKeyValueOfWorkerDutyStatusintFfzvU1AO.KeyValueOfWorkerDutyStatusintFfzvU1AO>();
        }
        return this.keyValueOfWorkerDutyStatusintFfzvU1AO;
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
     *         &lt;element name="Key" type="{http://roadnet.com/apex/DataContracts/}WorkerDutyStatus"/&gt;
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
    public static class KeyValueOfWorkerDutyStatusintFfzvU1AO {

        @XmlElement(name = "Key", required = true)
        @XmlSchemaType(name = "string")
        protected WorkerDutyStatus key;
        @XmlElement(name = "Value")
        protected int value;

        /**
         * Obtém o valor da propriedade key.
         * 
         * @return
         *     possible object is
         *     {@link WorkerDutyStatus }
         *     
         */
        public WorkerDutyStatus getKey() {
            return key;
        }

        /**
         * Define o valor da propriedade key.
         * 
         * @param value
         *     allowed object is
         *     {@link WorkerDutyStatus }
         *     
         */
        public void setKey(WorkerDutyStatus value) {
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
