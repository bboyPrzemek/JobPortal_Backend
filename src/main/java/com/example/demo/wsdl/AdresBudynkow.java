
package com.example.demo.wsdl;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlRootElement;
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
 *         &lt;element name="symbolMsc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SymUl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "symbolMsc",
    "symUl"
})
@XmlRootElement(name = "AdresBudynkow")
public class AdresBudynkow {

    @XmlElementRef(name = "woj", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> woj;
    @XmlElementRef(name = "pow", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> pow;
    @XmlElementRef(name = "gmi", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> gmi;
    @XmlElementRef(name = "rodz", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> rodz;
    @XmlElementRef(name = "symbolMsc", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> symbolMsc;
    @XmlElementRef(name = "SymUl", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> symUl;

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
     * Gets the value of the symbolMsc property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSymbolMsc() {
        return symbolMsc;
    }

    /**
     * Sets the value of the symbolMsc property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSymbolMsc(JAXBElement<String> value) {
        this.symbolMsc = value;
    }

    /**
     * Gets the value of the symUl property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSymUl() {
        return symUl;
    }

    /**
     * Sets the value of the symUl property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSymUl(JAXBElement<String> value) {
        this.symUl = value;
    }

}
