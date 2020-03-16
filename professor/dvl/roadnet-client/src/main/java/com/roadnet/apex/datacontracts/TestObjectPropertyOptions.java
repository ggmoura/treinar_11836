
package com.roadnet.apex.datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.DomainEntityPropertyOptions;


/**
 * <p>Classe Java de TestObjectPropertyOptions complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="TestObjectPropertyOptions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DomainEntityPropertyOptions"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Age" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="CategoryEntityKey" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Children" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ChildrenOptions" type="{http://roadnet.com/apex/DataContracts/}TestChildObjectPropertyOptions" minOccurs="0"/&gt;
 *         &lt;element name="Contact" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ContainedCategory" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ContainedCategoryOptions" type="{http://roadnet.com/apex/DataContracts/}TestObjectCategoryPropertyOptions" minOccurs="0"/&gt;
 *         &lt;element name="ContainedEntityKey" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ContainedName" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Date" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="DateTime" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Distance" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Identifier" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Length" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="RelatedEntityKeys" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="SecondChildrenEntityKeys" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="SecondChildrenEntityKeysOptions" type="{http://roadnet.com/apex/DataContracts/}TestRelatedObjectPropertyOptions" minOccurs="0"/&gt;
 *         &lt;element name="Speed" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Test" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Weight" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TestObjectPropertyOptions", propOrder = {
    "age",
    "categoryEntityKey",
    "children",
    "childrenOptions",
    "contact",
    "containedCategory",
    "containedCategoryOptions",
    "containedEntityKey",
    "containedName",
    "date",
    "dateTime",
    "distance",
    "identifier",
    "length",
    "name",
    "relatedEntityKeys",
    "secondChildrenEntityKeys",
    "secondChildrenEntityKeysOptions",
    "speed",
    "test",
    "weight"
})
public class TestObjectPropertyOptions
    extends DomainEntityPropertyOptions
{

    @XmlElement(name = "Age")
    protected Boolean age;
    @XmlElement(name = "CategoryEntityKey")
    protected Boolean categoryEntityKey;
    @XmlElement(name = "Children")
    protected Boolean children;
    @XmlElementRef(name = "ChildrenOptions", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<TestChildObjectPropertyOptions> childrenOptions;
    @XmlElement(name = "Contact")
    protected Boolean contact;
    @XmlElement(name = "ContainedCategory")
    protected Boolean containedCategory;
    @XmlElementRef(name = "ContainedCategoryOptions", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<TestObjectCategoryPropertyOptions> containedCategoryOptions;
    @XmlElement(name = "ContainedEntityKey")
    protected Boolean containedEntityKey;
    @XmlElement(name = "ContainedName")
    protected Boolean containedName;
    @XmlElement(name = "Date")
    protected Boolean date;
    @XmlElement(name = "DateTime")
    protected Boolean dateTime;
    @XmlElement(name = "Distance")
    protected Boolean distance;
    @XmlElement(name = "Identifier")
    protected Boolean identifier;
    @XmlElement(name = "Length")
    protected Boolean length;
    @XmlElement(name = "Name")
    protected Boolean name;
    @XmlElement(name = "RelatedEntityKeys")
    protected Boolean relatedEntityKeys;
    @XmlElement(name = "SecondChildrenEntityKeys")
    protected Boolean secondChildrenEntityKeys;
    @XmlElementRef(name = "SecondChildrenEntityKeysOptions", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<TestRelatedObjectPropertyOptions> secondChildrenEntityKeysOptions;
    @XmlElement(name = "Speed")
    protected Boolean speed;
    @XmlElement(name = "Test")
    protected Boolean test;
    @XmlElement(name = "Weight")
    protected Boolean weight;

    /**
     * Obtém o valor da propriedade age.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAge() {
        return age;
    }

    /**
     * Define o valor da propriedade age.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAge(Boolean value) {
        this.age = value;
    }

    /**
     * Obtém o valor da propriedade categoryEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCategoryEntityKey() {
        return categoryEntityKey;
    }

    /**
     * Define o valor da propriedade categoryEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCategoryEntityKey(Boolean value) {
        this.categoryEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade children.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isChildren() {
        return children;
    }

    /**
     * Define o valor da propriedade children.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setChildren(Boolean value) {
        this.children = value;
    }

    /**
     * Obtém o valor da propriedade childrenOptions.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TestChildObjectPropertyOptions }{@code >}
     *     
     */
    public JAXBElement<TestChildObjectPropertyOptions> getChildrenOptions() {
        return childrenOptions;
    }

    /**
     * Define o valor da propriedade childrenOptions.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TestChildObjectPropertyOptions }{@code >}
     *     
     */
    public void setChildrenOptions(JAXBElement<TestChildObjectPropertyOptions> value) {
        this.childrenOptions = value;
    }

    /**
     * Obtém o valor da propriedade contact.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isContact() {
        return contact;
    }

    /**
     * Define o valor da propriedade contact.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setContact(Boolean value) {
        this.contact = value;
    }

    /**
     * Obtém o valor da propriedade containedCategory.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isContainedCategory() {
        return containedCategory;
    }

    /**
     * Define o valor da propriedade containedCategory.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setContainedCategory(Boolean value) {
        this.containedCategory = value;
    }

    /**
     * Obtém o valor da propriedade containedCategoryOptions.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TestObjectCategoryPropertyOptions }{@code >}
     *     
     */
    public JAXBElement<TestObjectCategoryPropertyOptions> getContainedCategoryOptions() {
        return containedCategoryOptions;
    }

    /**
     * Define o valor da propriedade containedCategoryOptions.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TestObjectCategoryPropertyOptions }{@code >}
     *     
     */
    public void setContainedCategoryOptions(JAXBElement<TestObjectCategoryPropertyOptions> value) {
        this.containedCategoryOptions = value;
    }

    /**
     * Obtém o valor da propriedade containedEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isContainedEntityKey() {
        return containedEntityKey;
    }

    /**
     * Define o valor da propriedade containedEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setContainedEntityKey(Boolean value) {
        this.containedEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade containedName.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isContainedName() {
        return containedName;
    }

    /**
     * Define o valor da propriedade containedName.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setContainedName(Boolean value) {
        this.containedName = value;
    }

    /**
     * Obtém o valor da propriedade date.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDate() {
        return date;
    }

    /**
     * Define o valor da propriedade date.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDate(Boolean value) {
        this.date = value;
    }

    /**
     * Obtém o valor da propriedade dateTime.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDateTime() {
        return dateTime;
    }

    /**
     * Define o valor da propriedade dateTime.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDateTime(Boolean value) {
        this.dateTime = value;
    }

    /**
     * Obtém o valor da propriedade distance.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDistance() {
        return distance;
    }

    /**
     * Define o valor da propriedade distance.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDistance(Boolean value) {
        this.distance = value;
    }

    /**
     * Obtém o valor da propriedade identifier.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIdentifier() {
        return identifier;
    }

    /**
     * Define o valor da propriedade identifier.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIdentifier(Boolean value) {
        this.identifier = value;
    }

    /**
     * Obtém o valor da propriedade length.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLength() {
        return length;
    }

    /**
     * Define o valor da propriedade length.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLength(Boolean value) {
        this.length = value;
    }

    /**
     * Obtém o valor da propriedade name.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isName() {
        return name;
    }

    /**
     * Define o valor da propriedade name.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setName(Boolean value) {
        this.name = value;
    }

    /**
     * Obtém o valor da propriedade relatedEntityKeys.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRelatedEntityKeys() {
        return relatedEntityKeys;
    }

    /**
     * Define o valor da propriedade relatedEntityKeys.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRelatedEntityKeys(Boolean value) {
        this.relatedEntityKeys = value;
    }

    /**
     * Obtém o valor da propriedade secondChildrenEntityKeys.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSecondChildrenEntityKeys() {
        return secondChildrenEntityKeys;
    }

    /**
     * Define o valor da propriedade secondChildrenEntityKeys.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSecondChildrenEntityKeys(Boolean value) {
        this.secondChildrenEntityKeys = value;
    }

    /**
     * Obtém o valor da propriedade secondChildrenEntityKeysOptions.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TestRelatedObjectPropertyOptions }{@code >}
     *     
     */
    public JAXBElement<TestRelatedObjectPropertyOptions> getSecondChildrenEntityKeysOptions() {
        return secondChildrenEntityKeysOptions;
    }

    /**
     * Define o valor da propriedade secondChildrenEntityKeysOptions.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TestRelatedObjectPropertyOptions }{@code >}
     *     
     */
    public void setSecondChildrenEntityKeysOptions(JAXBElement<TestRelatedObjectPropertyOptions> value) {
        this.secondChildrenEntityKeysOptions = value;
    }

    /**
     * Obtém o valor da propriedade speed.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSpeed() {
        return speed;
    }

    /**
     * Define o valor da propriedade speed.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSpeed(Boolean value) {
        this.speed = value;
    }

    /**
     * Obtém o valor da propriedade test.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTest() {
        return test;
    }

    /**
     * Define o valor da propriedade test.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTest(Boolean value) {
        this.test = value;
    }

    /**
     * Obtém o valor da propriedade weight.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWeight() {
        return weight;
    }

    /**
     * Define o valor da propriedade weight.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWeight(Boolean value) {
        this.weight = value;
    }

}
