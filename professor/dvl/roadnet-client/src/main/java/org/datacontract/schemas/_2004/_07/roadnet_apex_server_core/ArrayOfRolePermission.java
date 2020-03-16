
package org.datacontract.schemas._2004._07.roadnet_apex_server_core;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ArrayOfRole.Permission complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfRole.Permission"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Role.Permission" type="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Core.Domain}Role.Permission" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfRole.Permission", propOrder = {
    "rolePermission"
})
public class ArrayOfRolePermission {

    @XmlElementRef(name = "Role.Permission", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Core.Domain", type = JAXBElement.class, required = false)
    protected List<JAXBElement<List<String>>> rolePermission;

    /**
     * Gets the value of the rolePermission property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rolePermission property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRolePermission().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link List }{@code <}{@link String }{@code >}{@code >}
     * 
     * 
     */
    public List<JAXBElement<List<String>>> getRolePermission() {
        if (rolePermission == null) {
            rolePermission = new ArrayList<JAXBElement<List<String>>>();
        }
        return this.rolePermission;
    }

}
