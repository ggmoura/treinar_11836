
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.DataTransferObject;


/**
 * <p>Classe Java de ShadowProductionResult complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ShadowProductionResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DataTransferObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AdminDatabaseUpdated" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ProdAdminDatabaseRestored" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ShadowProductionResult", propOrder = {
    "adminDatabaseUpdated",
    "prodAdminDatabaseRestored"
})
public class ShadowProductionResult
    extends DataTransferObject
{

    @XmlElement(name = "AdminDatabaseUpdated")
    protected Boolean adminDatabaseUpdated;
    @XmlElement(name = "ProdAdminDatabaseRestored")
    protected Boolean prodAdminDatabaseRestored;

    /**
     * Obtém o valor da propriedade adminDatabaseUpdated.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAdminDatabaseUpdated() {
        return adminDatabaseUpdated;
    }

    /**
     * Define o valor da propriedade adminDatabaseUpdated.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAdminDatabaseUpdated(Boolean value) {
        this.adminDatabaseUpdated = value;
    }

    /**
     * Obtém o valor da propriedade prodAdminDatabaseRestored.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isProdAdminDatabaseRestored() {
        return prodAdminDatabaseRestored;
    }

    /**
     * Define o valor da propriedade prodAdminDatabaseRestored.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setProdAdminDatabaseRestored(Boolean value) {
        this.prodAdminDatabaseRestored = value;
    }

}
