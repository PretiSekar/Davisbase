/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package davisbase;

/**
 *
 * @author Preethi
 */
public class Attribute {
    String AttributeName="";
    String AttributeType="";
    String AttributeValue="";
    String AttributeConstraint="";
    int AttributeLength;
    
    public void setAttributename(String AttributeName)
    {
        this.AttributeName=AttributeName;
    }
    public String getAttributeName()
    {
        return this.AttributeName;
    }
    public void setAttributeType(String AttributeType)
    {
        this.AttributeType=AttributeType;
    }
    public String getAttributeType()
    {
        return this.AttributeType;
    }
    public void setAttributeValue(String AttributeValue)
    {
        this.AttributeValue=AttributeValue;
    }
    public String getAttributeValue()
    {
        return this.AttributeValue;
    }
    public void setAttributeLength(int AttributeLength1)
    {
        this.AttributeLength = AttributeLength1;
    }
    public int getAttributeLength()
    {
        return this.AttributeLength;
    }
    public void setAttributeConstraint(String AttributeConstraint)
    {
        this.AttributeConstraint=AttributeConstraint;
    }
    public String getAttributeConstraint()
    {
        return this.AttributeConstraint;
    }

}