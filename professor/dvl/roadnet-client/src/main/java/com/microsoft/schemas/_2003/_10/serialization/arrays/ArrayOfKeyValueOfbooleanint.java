
package com.microsoft.schemas._2003._10.serialization.arrays;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ArrayOfKeyValueOfbooleanint complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfKeyValueOfbooleanint"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="KeyValueOfbooleanint" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Key" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
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
@XmlType(name = "ArrayOfKeyValueOfbooleanint", propOrder = {
    "keyValueOfbooleanint"
})
public class ArrayOfKeyValueOfbooleanint {

    @XmlElement(name = "KeyValueOfbooleanint")
    protected List<ArrayOfKeyValueOfbooleanint.KeyValueOfbooleanint> keyValueOfbooleanint;

    /**
     * Gets the value of the keyValueOfbooleanint property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the keyValueOfbooleanint property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getKeyValueOfbooleanint().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayOfKeyValueOfbooleanint.KeyValueOfbooleanint }
     * 
     * 
     */
    public List<ArrayOfKeyValueOfbooleanint.KeyValueOfbooleanint> getKeyValueOfbooleanint() {
        if (keyValueOfbooleanint == null) {
            keyValueOfbooleanint = new ArrayList<ArrayOfKeyValueOfbooleanint.KeyValueOfbooleanint>();
        }
        return this.keyValueOfbooleanint;
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
     *         &lt;element name="Key" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
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
    public static class KeyValueOfbooleanint {

        @XmlElement(name = "Key")
        protected boolean key;
        @XmlElement(name = "Value")
        protected int value;

        /**
         * Obtém o valor da propriedade key.
         * 
         */
        public boolean isKey() {
            return key;
        }

        /**
         * Define o valor da propriedade key.
         * 
         */
        public void setKey(boolean value) {
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
