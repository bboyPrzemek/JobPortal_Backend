
package com.example.demo.wsdl;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="woj" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="pow" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="gmi" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="rodz" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="formatDanych" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DataStanu" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
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
    "woj",
    "pow",
    "gmi",
    "rodz",
    "formatDanych",
    "dataStanu"
})
@XmlRootElement(name = "AdresyBudynkowZIdentyfikatoremBudynku")
public class AdresyBudynkowZIdentyfikatoremBudynku {

    @XmlElementRef(name = "woj", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> woj;
    @XmlElementRef(name = "pow", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> pow;
    @XmlElementRef(name = "gmi", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> gmi;
    @XmlElementRef(name = "rodz", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> rodz;
    @XmlElementRef(name = "formatDanych", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> formatDanych;
    @XmlElement(name = "DataStanu")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataStanu;

    /**
     * Gets the value of the woj property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getWoj() {
        return woj;
    }

    /**
     * Sets the value of the woj property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setWoj(JAXBElement<String> value) {
        this.woj = value;
    }

    /**
     * Gets the value of the pow property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPow() {
        return pow;
    }

    /**
     * Sets the value of the pow property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPow(JAXBElement<String> value) {
        this.pow = value;
    }

    /**
     * Gets the value of the gmi property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGmi() {
        return gmi;
    }

    /**
     * Sets the value of the gmi property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGmi(JAXBElement<String> value) {
        this.gmi = value;
    }

    /**
     * Gets the value of the rodz property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRodz() {
        return rodz;
    }

    /**
     * Sets the value of the rodz property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRodz(JAXBElement<String> value) {
        this.rodz = value;
    }

    /**
     * Gets the value of the formatDanych property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFormatDanych() {
        return formatDanych;
    }

    /**
     * Sets the value of the formatDanych property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFormatDanych(JAXBElement<String> value) {
        this.formatDanych = value;
    }

    /**
     * Gets the value of the dataStanu property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataStanu() {
        return dataStanu;
    }

    /**
     * Sets the value of the dataStanu property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataStanu(XMLGregorianCalendar value) {
        this.dataStanu = value;
    }

}
