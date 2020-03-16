
package com.microsoft.schemas._2003._10.serialization.arrays;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_routing_datacontracts.ArrayOfOperationsUnitParameters;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_routing_datacontracts.OperationsUnitParameters;


/**
 * <p>Classe Java de ArrayOfKeyValueOfOperationsUnitParametersArrayOfOperationsUnitParametersbiGI8PAi complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfKeyValueOfOperationsUnitParametersArrayOfOperationsUnitParametersbiGI8PAi"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="KeyValueOfOperationsUnitParametersArrayOfOperationsUnitParametersbiGI8PAi" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Key" type="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse}OperationsUnitParameters"/&gt;
 *                   &lt;element name="Value" type="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse}ArrayOfOperationsUnitParameters"/&gt;
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
@XmlType(name = "ArrayOfKeyValueOfOperationsUnitParametersArrayOfOperationsUnitParametersbiGI8PAi", propOrder = {
    "keyValueOfOperationsUnitParametersArrayOfOperationsUnitParametersbiGI8PAi"
})
public class ArrayOfKeyValueOfOperationsUnitParametersArrayOfOperationsUnitParametersbiGI8PAi {

    @XmlElement(name = "KeyValueOfOperationsUnitParametersArrayOfOperationsUnitParametersbiGI8PAi")
    protected List<ArrayOfKeyValueOfOperationsUnitParametersArrayOfOperationsUnitParametersbiGI8PAi.KeyValueOfOperationsUnitParametersArrayOfOperationsUnitParametersbiGI8PAi> keyValueOfOperationsUnitParametersArrayOfOperationsUnitParametersbiGI8PAi;

    /**
     * Gets the value of the keyValueOfOperationsUnitParametersArrayOfOperationsUnitParametersbiGI8PAi property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the keyValueOfOperationsUnitParametersArrayOfOperationsUnitParametersbiGI8PAi property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getKeyValueOfOperationsUnitParametersArrayOfOperationsUnitParametersbiGI8PAi().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayOfKeyValueOfOperationsUnitParametersArrayOfOperationsUnitParametersbiGI8PAi.KeyValueOfOperationsUnitParametersArrayOfOperationsUnitParametersbiGI8PAi }
     * 
     * 
     */
    public List<ArrayOfKeyValueOfOperationsUnitParametersArrayOfOperationsUnitParametersbiGI8PAi.KeyValueOfOperationsUnitParametersArrayOfOperationsUnitParametersbiGI8PAi> getKeyValueOfOperationsUnitParametersArrayOfOperationsUnitParametersbiGI8PAi() {
        if (keyValueOfOperationsUnitParametersArrayOfOperationsUnitParametersbiGI8PAi == null) {
            keyValueOfOperationsUnitParametersArrayOfOperationsUnitParametersbiGI8PAi = new ArrayList<ArrayOfKeyValueOfOperationsUnitParametersArrayOfOperationsUnitParametersbiGI8PAi.KeyValueOfOperationsUnitParametersArrayOfOperationsUnitParametersbiGI8PAi>();
        }
        return this.keyValueOfOperationsUnitParametersArrayOfOperationsUnitParametersbiGI8PAi;
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
     *         &lt;element name="Key" type="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse}OperationsUnitParameters"/&gt;
     *         &lt;element name="Value" type="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts.DataWarehouse}ArrayOfOperationsUnitParameters"/&gt;
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
    public static class KeyValueOfOperationsUnitParametersArrayOfOperationsUnitParametersbiGI8PAi {

        @XmlElement(name = "Key", required = true, nillable = true)
        protected OperationsUnitParameters key;
        @XmlElement(name = "Value", required = true, nillable = true)
        protected ArrayOfOperationsUnitParameters value;

        /**
         * Obtém o valor da propriedade key.
         * 
         * @return
         *     possible object is
         *     {@link OperationsUnitParameters }
         *     
         */
        public OperationsUnitParameters getKey() {
            return key;
        }

        /**
         * Define o valor da propriedade key.
         * 
         * @param value
         *     allowed object is
         *     {@link OperationsUnitParameters }
         *     
         */
        public void setKey(OperationsUnitParameters value) {
            this.key = value;
        }

        /**
         * Obtém o valor da propriedade value.
         * 
         * @return
         *     possible object is
         *     {@link ArrayOfOperationsUnitParameters }
         *     
         */
        public ArrayOfOperationsUnitParameters getValue() {
            return value;
        }

        /**
         * Define o valor da propriedade value.
         * 
         * @param value
         *     allowed object is
         *     {@link ArrayOfOperationsUnitParameters }
         *     
         */
        public void setValue(ArrayOfOperationsUnitParameters value) {
            this.value = value;
        }

    }

}
