
package com.microsoft.schemas._2003._10.serialization.arrays;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import com.roadnet.apex.datacontracts.DayOfWeek;


/**
 * <p>Classe Java de ArrayOfKeyValueOfDayOfWeekArrayOfKeyValueOfStopAlertFlagsintFfzvU1aOl0R0m5ou complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfKeyValueOfDayOfWeekArrayOfKeyValueOfStopAlertFlagsintFfzvU1aOl0R0m5ou"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="KeyValueOfDayOfWeekArrayOfKeyValueOfStopAlertFlagsintFfzvU1aOl0R0m5ou" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Key" type="{http://roadnet.com/apex/DataContracts/}DayOfWeek"/&gt;
 *                   &lt;element name="Value" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfKeyValueOfStopAlertFlagsintFfzvU1aO"/&gt;
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
@XmlType(name = "ArrayOfKeyValueOfDayOfWeekArrayOfKeyValueOfStopAlertFlagsintFfzvU1aOl0R0m5ou", propOrder = {
    "keyValueOfDayOfWeekArrayOfKeyValueOfStopAlertFlagsintFfzvU1AOl0R0M5Ou"
})
public class ArrayOfKeyValueOfDayOfWeekArrayOfKeyValueOfStopAlertFlagsintFfzvU1AOl0R0M5Ou {

    @XmlElement(name = "KeyValueOfDayOfWeekArrayOfKeyValueOfStopAlertFlagsintFfzvU1aOl0R0m5ou")
    protected List<ArrayOfKeyValueOfDayOfWeekArrayOfKeyValueOfStopAlertFlagsintFfzvU1AOl0R0M5Ou.KeyValueOfDayOfWeekArrayOfKeyValueOfStopAlertFlagsintFfzvU1AOl0R0M5Ou> keyValueOfDayOfWeekArrayOfKeyValueOfStopAlertFlagsintFfzvU1AOl0R0M5Ou;

    /**
     * Gets the value of the keyValueOfDayOfWeekArrayOfKeyValueOfStopAlertFlagsintFfzvU1AOl0R0M5Ou property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the keyValueOfDayOfWeekArrayOfKeyValueOfStopAlertFlagsintFfzvU1AOl0R0M5Ou property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getKeyValueOfDayOfWeekArrayOfKeyValueOfStopAlertFlagsintFfzvU1AOl0R0M5Ou().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayOfKeyValueOfDayOfWeekArrayOfKeyValueOfStopAlertFlagsintFfzvU1AOl0R0M5Ou.KeyValueOfDayOfWeekArrayOfKeyValueOfStopAlertFlagsintFfzvU1AOl0R0M5Ou }
     * 
     * 
     */
    public List<ArrayOfKeyValueOfDayOfWeekArrayOfKeyValueOfStopAlertFlagsintFfzvU1AOl0R0M5Ou.KeyValueOfDayOfWeekArrayOfKeyValueOfStopAlertFlagsintFfzvU1AOl0R0M5Ou> getKeyValueOfDayOfWeekArrayOfKeyValueOfStopAlertFlagsintFfzvU1AOl0R0M5Ou() {
        if (keyValueOfDayOfWeekArrayOfKeyValueOfStopAlertFlagsintFfzvU1AOl0R0M5Ou == null) {
            keyValueOfDayOfWeekArrayOfKeyValueOfStopAlertFlagsintFfzvU1AOl0R0M5Ou = new ArrayList<ArrayOfKeyValueOfDayOfWeekArrayOfKeyValueOfStopAlertFlagsintFfzvU1AOl0R0M5Ou.KeyValueOfDayOfWeekArrayOfKeyValueOfStopAlertFlagsintFfzvU1AOl0R0M5Ou>();
        }
        return this.keyValueOfDayOfWeekArrayOfKeyValueOfStopAlertFlagsintFfzvU1AOl0R0M5Ou;
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
     *         &lt;element name="Key" type="{http://roadnet.com/apex/DataContracts/}DayOfWeek"/&gt;
     *         &lt;element name="Value" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfKeyValueOfStopAlertFlagsintFfzvU1aO"/&gt;
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
    public static class KeyValueOfDayOfWeekArrayOfKeyValueOfStopAlertFlagsintFfzvU1AOl0R0M5Ou {

        @XmlElement(name = "Key", required = true)
        @XmlSchemaType(name = "string")
        protected DayOfWeek key;
        @XmlElement(name = "Value", required = true, nillable = true)
        protected ArrayOfKeyValueOfStopAlertFlagsintFfzvU1AO value;

        /**
         * Obtém o valor da propriedade key.
         * 
         * @return
         *     possible object is
         *     {@link DayOfWeek }
         *     
         */
        public DayOfWeek getKey() {
            return key;
        }

        /**
         * Define o valor da propriedade key.
         * 
         * @param value
         *     allowed object is
         *     {@link DayOfWeek }
         *     
         */
        public void setKey(DayOfWeek value) {
            this.key = value;
        }

        /**
         * Obtém o valor da propriedade value.
         * 
         * @return
         *     possible object is
         *     {@link ArrayOfKeyValueOfStopAlertFlagsintFfzvU1AO }
         *     
         */
        public ArrayOfKeyValueOfStopAlertFlagsintFfzvU1AO getValue() {
            return value;
        }

        /**
         * Define o valor da propriedade value.
         * 
         * @param value
         *     allowed object is
         *     {@link ArrayOfKeyValueOfStopAlertFlagsintFfzvU1AO }
         *     
         */
        public void setValue(ArrayOfKeyValueOfStopAlertFlagsintFfzvU1AO value) {
            this.value = value;
        }

    }

}
