/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package davisbase;

import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author Preethi
 */
public class Table {
    String TableName;
    List<Attribute> tcol=new ArrayList<>();
    ArrayList<String> tconstaint=new ArrayList<>();
    String operator="";
    public void setTableName(String TableName)
    {
        this.TableName=TableName;
    }
    public String getTableName()
    {
        return this.TableName;
    }
    void setTableColumn(List<Attribute> TableColumn)
    {
        this.tcol=TableColumn;
    }
    public List<Attribute> getTableColumn()
    {
        return this.tcol;
    }
    public void setTableConstraint(ArrayList<String> TableContraint)
    {
        this.tconstaint=TableContraint;
    }
    public ArrayList<String> getTableConstraint()
    {
        return this.tconstaint;
    }
    public void setOperator(String Operator)
    {
        this.operator=Operator;
    }
    public String getOperator()
    {
        return this.operator;
    }

    

}
