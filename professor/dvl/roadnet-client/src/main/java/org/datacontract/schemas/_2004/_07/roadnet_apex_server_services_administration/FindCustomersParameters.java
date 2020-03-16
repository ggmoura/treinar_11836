
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_administration;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlList;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de FindCustomersParameters complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="FindCustomersParameters"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CustomerUsageFlags" type="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts}CustomerUsageFlags" minOccurs="0"/&gt;
 *         &lt;element name="MobileDeviceUsageFlags" type="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts}MobileDeviceUsageFlags" minOccurs="0"/&gt;
 *         &lt;element name="OmnitracsOneFeatureUsageFlags" type="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts}OmnitracsOneFeatureUsageFlags" minOccurs="0"/&gt;
 *         &lt;element name="OrderUsageFlags" type="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts}OrderUsageFlags" minOccurs="0"/&gt;
 *         &lt;element name="PurchasedModulesFlags" type="{http://roadnet.com/apex/DataContracts/}PurchasableModules" minOccurs="0"/&gt;
 *         &lt;element name="RouteUsageFlags" type="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts}RouteUsageFlags" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FindCustomersParameters", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.FindCustomerUsage", propOrder = {
    "customerUsageFlags",
    "mobileDeviceUsageFlags",
    "omnitracsOneFeatureUsageFlags",
    "orderUsageFlags",
    "purchasedModulesFlags",
    "routeUsageFlags"
})
public class FindCustomersParameters {

    @XmlList
    @XmlElement(name = "CustomerUsageFlags")
    @XmlSchemaType(name = "anySimpleType")
    protected List<String> customerUsageFlags;
    @XmlList
    @XmlElement(name = "MobileDeviceUsageFlags")
    @XmlSchemaType(name = "anySimpleType")
    protected List<String> mobileDeviceUsageFlags;
    @XmlList
    @XmlElement(name = "OmnitracsOneFeatureUsageFlags")
    @XmlSchemaType(name = "anySimpleType")
    protected List<String> omnitracsOneFeatureUsageFlags;
    @XmlList
    @XmlElement(name = "OrderUsageFlags")
    @XmlSchemaType(name = "anySimpleType")
    protected List<String> orderUsageFlags;
    @XmlList
    @XmlElement(name = "PurchasedModulesFlags")
    @XmlSchemaType(name = "anySimpleType")
    protected List<String> purchasedModulesFlags;
    @XmlList
    @XmlElement(name = "RouteUsageFlags")
    @XmlSchemaType(name = "anySimpleType")
    protected List<String> routeUsageFlags;

    /**
     * Gets the value of the customerUsageFlags property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the customerUsageFlags property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCustomerUsageFlags().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getCustomerUsageFlags() {
        if (customerUsageFlags == null) {
            customerUsageFlags = new ArrayList<String>();
        }
        return this.customerUsageFlags;
    }

    /**
     * Gets the value of the mobileDeviceUsageFlags property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mobileDeviceUsageFlags property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMobileDeviceUsageFlags().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getMobileDeviceUsageFlags() {
        if (mobileDeviceUsageFlags == null) {
            mobileDeviceUsageFlags = new ArrayList<String>();
        }
        return this.mobileDeviceUsageFlags;
    }

    /**
     * Gets the value of the omnitracsOneFeatureUsageFlags property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the omnitracsOneFeatureUsageFlags property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOmnitracsOneFeatureUsageFlags().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getOmnitracsOneFeatureUsageFlags() {
        if (omnitracsOneFeatureUsageFlags == null) {
            omnitracsOneFeatureUsageFlags = new ArrayList<String>();
        }
        return this.omnitracsOneFeatureUsageFlags;
    }

    /**
     * Gets the value of the orderUsageFlags property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the orderUsageFlags property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrderUsageFlags().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getOrderUsageFlags() {
        if (orderUsageFlags == null) {
            orderUsageFlags = new ArrayList<String>();
        }
        return this.orderUsageFlags;
    }

    /**
     * Gets the value of the purchasedModulesFlags property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the purchasedModulesFlags property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPurchasedModulesFlags().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getPurchasedModulesFlags() {
        if (purchasedModulesFlags == null) {
            purchasedModulesFlags = new ArrayList<String>();
        }
        return this.purchasedModulesFlags;
    }

    /**
     * Gets the value of the routeUsageFlags property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the routeUsageFlags property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRouteUsageFlags().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getRouteUsageFlags() {
        if (routeUsageFlags == null) {
            routeUsageFlags = new ArrayList<String>();
        }
        return this.routeUsageFlags;
    }

}
