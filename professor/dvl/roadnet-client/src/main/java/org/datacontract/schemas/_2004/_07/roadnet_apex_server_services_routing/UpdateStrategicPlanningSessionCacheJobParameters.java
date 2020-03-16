
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_routing;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de UpdateStrategicPlanningSessionCacheJobParameters complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="UpdateStrategicPlanningSessionCacheJobParameters"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SaveChangesToDB" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="StrategicRoutingSessionPkey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateStrategicPlanningSessionCacheJobParameters", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.Routing", propOrder = {
    "saveChangesToDB",
    "strategicRoutingSessionPkey"
})
public class UpdateStrategicPlanningSessionCacheJobParameters {

    @XmlElement(name = "SaveChangesToDB")
    protected Boolean saveChangesToDB;
    @XmlElement(name = "StrategicRoutingSessionPkey")
    protected Long strategicRoutingSessionPkey;

    /**
     * Obtém o valor da propriedade saveChangesToDB.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSaveChangesToDB() {
        return saveChangesToDB;
    }

    /**
     * Define o valor da propriedade saveChangesToDB.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSaveChangesToDB(Boolean value) {
        this.saveChangesToDB = value;
    }

    /**
     * Obtém o valor da propriedade strategicRoutingSessionPkey.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getStrategicRoutingSessionPkey() {
        return strategicRoutingSessionPkey;
    }

    /**
     * Define o valor da propriedade strategicRoutingSessionPkey.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setStrategicRoutingSessionPkey(Long value) {
        this.strategicRoutingSessionPkey = value;
    }

}
