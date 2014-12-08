
package de.scrummies.scrumService;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sessionToken" type="{http://schemas.microsoft.com/2003/10/Serialization/}guid" minOccurs="0"/>
 *         &lt;element name="userStory" type="{http://www.fuldaai.de}UserStory" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "sessionToken",
    "userStory"
})
@XmlRootElement(name = "UserStoryCreate")
public class UserStoryCreate {

    protected String sessionToken;
    @XmlElementRef(name = "userStory", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<UserStory> userStory;

    /**
     * Gets the value of the sessionToken property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSessionToken() {
        return sessionToken;
    }

    /**
     * Sets the value of the sessionToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSessionToken(String value) {
        this.sessionToken = value;
    }

    /**
     * Gets the value of the userStory property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UserStory }{@code >}
     *     
     */
    public JAXBElement<UserStory> getUserStory() {
        return userStory;
    }

    /**
     * Sets the value of the userStory property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UserStory }{@code >}
     *     
     */
    public void setUserStory(JAXBElement<UserStory> value) {
        this.userStory = value;
    }

}
