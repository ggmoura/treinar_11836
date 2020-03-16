
package com.microsoft.schemas._2003._10.serialization.arrays;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import com.roadnet.apex.datacontracts.ErrorCode;
import com.roadnet.apex.datacontracts.Worker;


/**
 * <p>Classe Java de ArrayOfKeyValueOfWorkerErrorCodeHZ9gpz1G complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfKeyValueOfWorkerErrorCodeHZ9gpz1G"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="KeyValueOfWorkerErrorCodeHZ9gpz1G" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Key" type="{http://roadnet.com/apex/DataContracts/}Worker"/&gt;
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
@XmlType(name = "ArrayOfKeyValueOfWorkerErrorCodeHZ9gpz1G", propOrder = {
    "keyValueOfWorkerErrorCodeHZ9Gpz1G"
})
public class ArrayOfKeyValueOfWorkerErrorCodeHZ9Gpz1G {

    @XmlElement(name = "KeyValueOfWorkerErrorCodeHZ9gpz1G")
    protected List<ArrayOfKeyValueOfWorkerErrorCodeHZ9Gpz1G.KeyValueOfWorkerErrorCodeHZ9Gpz1G> keyValueOfWorkerErrorCodeHZ9Gpz1G;

    /**
     * Gets the value of the keyValueOfWorkerErrorCodeHZ9Gpz1G property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the keyValueOfWorkerErrorCodeHZ9Gpz1G property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getKeyValueOfWorkerErrorCodeHZ9Gpz1G().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayOfKeyValueOfWorkerErrorCodeHZ9Gpz1G.KeyValueOfWorkerErrorCodeHZ9Gpz1G }
     * 
     * 
     */
    public List<ArrayOfKeyValueOfWorkerErrorCodeHZ9Gpz1G.KeyValueOfWorkerErrorCodeHZ9Gpz1G> getKeyValueOfWorkerErrorCodeHZ9Gpz1G() {
        if (keyValueOfWorkerErrorCodeHZ9Gpz1G == null) {
            keyValueOfWorkerErrorCodeHZ9Gpz1G = new ArrayList<ArrayOfKeyValueOfWorkerErrorCodeHZ9Gpz1G.KeyValueOfWorkerErrorCodeHZ9Gpz1G>();
        }
        return this.keyValueOfWorkerErrorCodeHZ9Gpz1G;
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
     *         &lt;element name="Key" type="{http://roadnet.com/apex/DataContracts/}Worker"/&gt;
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
    public static class KeyValueOfWorkerErrorCodeHZ9Gpz1G {

        @XmlElement(name = "Key", required = true, nillable = true)
        protected Worker key;
        @XmlElement(name = "Value", required = true)
        @XmlSchemaType(name = "string")
        protected ErrorCode value;

        /**
         * Obtém o valor da propriedade key.
         * 
         * @return
         *     possible object is
         *     {@link Worker }
         *     
         */
        public Worker getKey() {
            return key;
        }

        /**
         * Define o valor da propriedade key.
         * 
         * @param value
         *     allowed object is
         *     {@link Worker }
         *     
         */
        public void setKey(Worker value) {
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
