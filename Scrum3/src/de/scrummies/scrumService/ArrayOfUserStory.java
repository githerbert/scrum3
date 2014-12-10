
package de.scrummies.scrumService;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfUserStory complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfUserStory">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="UserStory" type="{http://www.fuldaai.de}UserStory" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfUserStory", namespace = "http://www.fuldaai.de", propOrder = {
    "userStory"
})
public class ArrayOfUserStory {

    @XmlElement(name = "UserStory", nillable = true)
    protected List<UserStory> userStory;

    /**
     * Gets the value of the userStory property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the userStory property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUserStory().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UserStory }
     * 
     * 
     */
    public List<UserStory> getUserStory() {
        if (userStory == null) {
            userStory = new ArrayList<UserStory>();
        }
        return this.userStory;
    }

}
