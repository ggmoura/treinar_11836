
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_administration;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.PropertyOptions;


/**
 * <p>Classe Java de DataRetentionPolicyPropertyOptions complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="DataRetentionPolicyPropertyOptions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}PropertyOptions"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DataWarehouseEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="DataWarehouseMonths" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="OperationalEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="OperationalMonths" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DataRetentionPolicyPropertyOptions", propOrder = {
    "dataWarehouseEnabled",
    "dataWarehouseMonths",
    "operationalEnabled",
    "operationalMonths"
})
public class DataRetentionPolicyPropertyOptions
    extends PropertyOptions
{

    @XmlElement(name = "DataWarehouseEnabled")
    protected Boolean dataWarehouseEnabled;
    @XmlElement(name = "DataWarehouseMonths")
    protected Boolean dataWarehouseMonths;
    @XmlElement(name = "OperationalEnabled")
    protected Boolean operationalEnabled;
    @XmlElement(name = "OperationalMonths")
    protected Boolean operationalMonths;

    /**
     * Obtém o valor da propriedade dataWarehouseEnabled.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDataWarehouseEnabled() {
        return dataWarehouseEnabled;
    }

    /**
     * Define o valor da propriedade dataWarehouseEnabled.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDataWarehouseEnabled(Boolean value) {
        this.dataWarehouseEnabled = value;
    }

    /**
     * Obtém o valor da propriedade dataWarehouseMonths.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDataWarehouseMonths() {
        return dataWarehouseMonths;
    }

    /**
     * Define o valor da propriedade dataWarehouseMonths.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDataWarehouseMonths(Boolean value) {
        this.dataWarehouseMonths = value;
    }

    /**
     * Obtém o valor da propriedade operationalEnabled.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOperationalEnabled() {
        return operationalEnabled;
    }

    /**
     * Define o valor da propriedade operationalEnabled.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOperationalEnabled(Boolean value) {
        this.operationalEnabled = value;
    }

    /**
     * Obtém o valor da propriedade operationalMonths.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOperationalMonths() {
        return operationalMonths;
    }

    /**
     * Define o valor da propriedade operationalMonths.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOperationalMonths(Boolean value) {
        this.operationalMonths = value;
    }

}
