
package de.scrummies.scrumService;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfBugExtention complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfBugExtention">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BugExtention" type="{http://www.fuldaai.de}BugExtention" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfBugExtention", namespace = "http://www.fuldaai.de", propOrder = {
    "bugExtention"
})
public class ArrayOfBugExtention {

    @XmlElement(name = "BugExtention", nillable = true)
    protected List<BugExtention> bugExtention;

    /**
     * Gets the value of the bugExtention property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bugExtention property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBugExtention().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BugExtention }
     * 
     * 
     */
    public List<BugExtention> getBugExtention() {
        if (bugExtention == null) {
            bugExtention = new ArrayList<BugExtention>();
        }
        return this.bugExtention;
    }

}
