/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package davisbase;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.RandomAccessFile;
import java.nio.charset.StandardCharsets;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map.Entry;
import java.util.TreeMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Preethi
 */

public class SchemaInfo {
    static int i=1;
    public static void CreateSchema() throws IOException
    {
        try {
            //initial meta-data
                     
            RandomAccessFile davisbasetables= new RandomAccessFile("data\\catalog\\davisbase_tables.tbl","rw");
            RandomAccessFile davisbasecolumns= new RandomAccessFile("data\\catalog\\davisbase_columns.tbl","rw");
            //davisbase_tables.tbl
            
            //Initailly there are 2 rows
                        
            davisbasetables.writeInt(i);                //Rowid
            davisbasetables.writeByte("davisbase_tables".length());  //Table_name
            davisbasetables.writeBytes("davisbase_tables");
            
            davisbasetables.writeInt(i);                //Rowid
            davisbasetables.writeByte("davisbase_columns".length());  //Table_name
            davisbasetables.writeBytes("davisbase_columns");
            
            //davisbase_columns.tbl
            
            //Initially there are 8 rows
            davisbasecolumns.writeInt(1);           //Rowid
            davisbasecolumns.writeByte("davisbase_tables".length()); //table_name
            davisbasecolumns.writeBytes("davisbase_tables");
            davisbasecolumns.writeByte("rowid".length());   //column_name
            davisbasecolumns.writeBytes("rowid");
            davisbasecolumns.writeByte("INT".length()); //data_type
            davisbasecolumns.writeBytes("INT");  
            davisbasecolumns.writeByte(1);           //ordinal_position
            davisbasecolumns.writeByte("NO".length());  //is_nullable
            davisbasecolumns.writeBytes("NO");
            davisbasecolumns.writeByte("".length()); // COLUMN_KEY
            davisbasecolumns.writeBytes("");
            
            davisbasecolumns.writeInt(2); //Rowid
            davisbasecolumns.writeByte("davisbase_tables".length()); //table_name
            davisbasecolumns.writeBytes("davisbase_tables");
            davisbasecolumns.writeByte("table_name".length());   //column_name
            davisbasecolumns.writeBytes("table_name");
            davisbasecolumns.writeByte("TEXT".length()); //data_type
            davisbasecolumns.writeBytes("TEXT");
            davisbasecolumns.writeByte(2);   //ordinal_position
            davisbasecolumns.writeByte("NO".length());  //is_nullable
            davisbasecolumns.writeBytes("NO");
            davisbasecolumns.writeByte("".length()); // COLUMN_KEY
            davisbasecolumns.writeBytes("");
            
            davisbasecolumns.writeInt(3); //Rowid
            davisbasecolumns.writeByte("davisbase_columns".length()); //table_name
            davisbasecolumns.writeBytes("davisbase_columns");
            davisbasecolumns.writeByte("rowid".length());   //column_name
            davisbasecolumns.writeBytes("rowid");
            davisbasecolumns.writeByte("INT".length()); //data_type
            davisbasecolumns.writeBytes("INT");
            davisbasecolumns.writeByte(1);   //ordinal_position
            davisbasecolumns.writeByte("NO".length());  //is_nullable
            davisbasecolumns.writeBytes("NO");
            davisbasecolumns.writeByte("".length()); // COLUMN_KEY
            davisbasecolumns.writeBytes("");
            
            davisbasecolumns.writeInt(4); //Rowid
            davisbasecolumns.writeByte("davisbase_columns".length()); //table_name
            davisbasecolumns.writeBytes("davisbase_columns");
            davisbasecolumns.writeByte("table_name".length());   //column_name
            davisbasecolumns.writeBytes("table_name");
            davisbasecolumns.writeByte("TEXT".length()); //data_type
            davisbasecolumns.writeBytes("TEXT");
            davisbasecolumns.writeByte(2);   //ordinal_position
            davisbasecolumns.writeByte("NO".length());  //is_nullable
            davisbasecolumns.writeBytes("NO");
            davisbasecolumns.writeByte("".length()); // COLUMN_KEY
            davisbasecolumns.writeBytes("");
            
            davisbasecolumns.writeInt(5); //Rowid
            davisbasecolumns.writeByte("davisbase_columns".length()); //table_name
            davisbasecolumns.writeBytes("davisbase_columns");
            davisbasecolumns.writeByte("column_name".length());   //column_name
            davisbasecolumns.writeBytes("column_name");
            davisbasecolumns.writeByte("TEXT".length()); //data_type
            davisbasecolumns.writeBytes("TEXT");
            davisbasecolumns.writeByte(3);   //ordinal_position
            davisbasecolumns.writeByte("NO".length());  //is_nullable
            davisbasecolumns.writeBytes("NO");
            davisbasecolumns.writeByte("".length()); // COLUMN_KEY
            davisbasecolumns.writeBytes("");
            
            davisbasecolumns.writeInt(6); //Rowid
            davisbasecolumns.writeByte("davisbase_columns".length()); //table_name
            davisbasecolumns.writeBytes("davisbase_columns");
            davisbasecolumns.writeByte("data_type".length());   //column_name
            davisbasecolumns.writeBytes("data_type");
            davisbasecolumns.writeByte("TEXT".length()); //data_type
            davisbasecolumns.writeBytes("TEXT");
            davisbasecolumns.writeByte(4);   //ordinal_position
            davisbasecolumns.writeByte("NO".length());  //is_nullable
            davisbasecolumns.writeBytes("NO");
            davisbasecolumns.writeByte("".length()); // COLUMN_KEY
            davisbasecolumns.writeBytes("");
            
            davisbasecolumns.writeInt(7); //Rowid
            davisbasecolumns.writeByte("davisbase_columns".length()); //table_name
            davisbasecolumns.writeBytes("davisbase_columns");
            davisbasecolumns.writeByte("ordinal_position".length());   //column_name
            davisbasecolumns.writeBytes("ordinal_position");
            davisbasecolumns.writeByte("TINYINT".length()); //data_type
            davisbasecolumns.writeBytes("TINYINT");
            davisbasecolumns.writeByte(5);   //ordinal_position
            davisbasecolumns.writeByte("NO".length());  //is_nullable
            davisbasecolumns.writeBytes("NO");
            davisbasecolumns.writeByte("".length()); // COLUMN_KEY
            davisbasecolumns.writeBytes("");
            
            davisbasecolumns.writeInt(8); //Rowid
            davisbasecolumns.writeByte("davisbase_columns".length()); //table_name
            davisbasecolumns.writeBytes("davisbase_columns");
            davisbasecolumns.writeByte("is_nullable".length());   //column_name
            davisbasecolumns.writeBytes("is_nullable");
            davisbasecolumns.writeByte("TEXT".length()); //data_type
            davisbasecolumns.writeBytes("TEXT");
            davisbasecolumns.writeByte(6);   //ordinal_position
            davisbasecolumns.writeByte("NO".length());  //is_nullable
            davisbasecolumns.writeBytes("NO");
            davisbasecolumns.writeByte("".length()); // COLUMN_KEY
            davisbasecolumns.writeBytes("");
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(SchemaInfo.class.getName()).log(Level.SEVERE, null, ex);
        }
        

    }

    public static void CreateTable(Table t) throws IOException, Exception {
        try {
            System.out.println(t.getTableName());
            String path="data\\user_data\\"+t.getTableName().trim()+".tbl";
            RandomAccessFile tf=new RandomAccessFile(path,"rw");
            System.out.println(t.getTableColumn());
            if(!t.getTableColumn().isEmpty())
            {
            for(int i=0;i<t.getTableColumn().size();i++)
            {
                String tpath="data\\user_data\\"+t.getTableName().trim()+"."+t.getTableColumn().get(i).AttributeName.trim()+".ndx";
                RandomAccessFile tindex=new RandomAccessFile(tpath,"rw");
                
            }
            }
            UpdateTablesTable(t,"create");
            System.out.println("Table created successfully");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(SchemaInfo.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    static int j=3;
    static int k=9;
    private static void UpdateTablesTable(Table t, String create) throws IOException, Exception {
       
        try {
            boolean iftableexist=false;
            String path="data\\catalog\\davisbase_tables.tbl";
            File f1=new File("data\\catalog\\davisbase_tables.tbl");
            String path1="data\\catalog\\davisbase_columns.tbl";
            File f2=new File("data\\catalog\\davisbase_columns.tbl");
            RandomAccessFile tf=new RandomAccessFile(f1,"rw");
            RandomAccessFile tc=new RandomAccessFile(f2,"rw");
            iftableexist=IsTableExist(t.getTableName());
            if(create.equals("create"))
            {
                
                if(!iftableexist)
                {
                tf.seek(f1.length());
                System.out.println(tf.length());
                tf.writeInt(j++);   //RowId
                tf.writeByte(t.getTableName().trim().length());  //Table_name
                tf.writeBytes(t.getTableName().trim());
                
                for(int i=0;i<t.getTableColumn().size();i++)
                {
                tc.seek(f2.length());
                tc.writeInt(k++); //Rowid
                tc.writeByte(t.getTableName().trim().length()); //table_name
                tc.writeBytes(t.getTableName().trim());
                tc.writeByte(t.getTableColumn().get(i).AttributeName.trim().length());   //column_name
                tc.writeBytes(t.getTableColumn().get(i).AttributeName.trim());
                tc.writeByte(t.getTableColumn().get(i).AttributeType.trim().length()); //data_type
                tc.writeBytes(t.getTableColumn().get(i).AttributeType.trim());
                tc.writeByte(i+1);   //ordinal_position
                            if(t.getTableColumn().get(i).getAttributeConstraint().equals("not null")){
                                tc.writeByte("YES".length()); // IS_NULLABLE
                                tc.writeBytes("YES");
                                tc.writeByte("".length()); // COLUMN_KEY
                                tc.writeBytes("");
                            }
                            else if(t.getTableColumn().get(i).getAttributeConstraint().equals("primary key")){
                                tc.writeByte("NO".length()); // IS_NULLABLE
                                tc.writeBytes("NO");
                                tc.writeByte("PRIMARY".length()); // COLUMN_KEY
                                tc.writeBytes("PRIMARY");                                    
                            }
                            else{
                                tc.writeByte("NO".length()); // IS_NULLABLE
                                tc.writeBytes("NO");
                                tc.writeByte("".length()); // COLUMN_KEY
                                tc.writeBytes("");                                    
                                }  
                }
                
                } 
                else 
                {
                    throw new Exception("Table Already Exists");
                    
                }
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(SchemaInfo.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    private static boolean IsTableExist(String tableName) throws FileNotFoundException, IOException {
        boolean Istableexist = false;
        File f=new File("data\\catalog\\davisbase_tables.tbl");
        RandomAccessFile tf=new RandomAccessFile(f,"rw");
        tf.seek(0);
        while(!(tf.getFilePointer()>=tf.length()))
        {
        int rowid=tf.readInt();
        int len1=tf.readByte();
        byte[] table=new byte[len1];
        int j=0;
        while(j<len1)
        {
        table[j]=tf.readByte();
        j++;
        }
        String table1= new String(table,StandardCharsets.UTF_8);
        if(table1.equals(tableName))
        {
        Istableexist=true;
        }
        }
        return Istableexist;
    }

    public static void insertTable(Table t) throws IOException, Exception {
        if(IsTableExist(t.getTableName()))
        {
            //System.out.println(t.getTableColumn().get(0).getAttributeLength());
            String TableFilePath="data\\user_data\\"+t.getTableName().trim()+".tbl";
            File f1= new File(TableFilePath);
            RandomAccessFile TableFile = new RandomAccessFile(TableFilePath, "rw");
                
            File f = new File("data\\catalog\\davisbase_columns.tbl");
            RandomAccessFile columnsTableFile = new RandomAccessFile(f, "rw");
            List<Attribute> LstAttribute =  dummy(t);
            for(int i=0;i<t.getTableColumn().size();i++)
            {
            System.out.println(t.getTableColumn().get(i).getAttributeName());
            }
            for(int i = 0; i < t.getTableColumn().size(); i++)
                {
                    System.out.println(t.getTableColumn().get(i).AttributeLength);
                }
            if(LstAttribute.size() == t.getTableColumn().size())
            {
                TableFile.seek(f1.length());
                int IndexAddress = Math.abs((int)TableFile.getFilePointer()%1000);
                
                for(int i = 0; i < t.getTableColumn().size(); i++)
                {
                    TableFile.seek(f1.length());
                    String TableIndexFilePath="data\\user_data\\"+t.getTableName().trim()+"."+LstAttribute.get(i).AttributeName.trim()+".ndx";
                    File f2 = new File(TableIndexFilePath);
                    RandomAccessFile tablesIndex = new RandomAccessFile(TableIndexFilePath, "rw");
                            
                    if(LstAttribute.get(i).getAttributeType().contains("(") && LstAttribute.get(i).getAttributeType().contains(")"))
                    {
                    LstAttribute.get(i).setAttributeLength(Integer.parseInt(LstAttribute.get(i).getAttributeType().substring(LstAttribute.get(i).getAttributeType().indexOf("(")+1,LstAttribute.get(i).getAttributeType().indexOf(")"))));
                    System.out.println(LstAttribute.get(i).getAttributeLength());
                    System.out.println("jo");
                    LstAttribute.get(i).setAttributeType(LstAttribute.get(i).getAttributeType().substring(0, LstAttribute.get(i).getAttributeType().indexOf("(")));
                    }
                    System.out.println(LstAttribute.get(i).getAttributeLength());
                    System.out.println(LstAttribute.get(i).getAttributeType());
                    boolean valueExist = false;
                    if(t.getTableColumn().get(i).AttributeValue.equals("null") && (LstAttribute.get(i).getAttributeConstraint().equals("NOT NULL") ||LstAttribute.get(i).getAttributeConstraint().equals("PRIMARY")))
                    {
                    throw new Exception("NOT NULL CONSTRAINT VIOLATION");
                    }
                    else
                    {
                        switch (LstAttribute.get(i).AttributeType.trim().toUpperCase())
                        {
                                case "BYTE":                                    
                                case "UNSIGNED BYTE":                                    
                                    
                                    byte bvalue;
                                    if(t.getTableColumn().get(i).AttributeValue.toUpperCase().equals("NULL"))
                                    {
                                       bvalue = Byte.MIN_VALUE;
                                    }
                                    else{
                                       bvalue = Byte.parseByte(t.getTableColumn().get(i).AttributeValue); 
                                    }
                                    
                                    tablesIndex.seek(0);        
                                    
                                    while(!(tablesIndex.getFilePointer()>=f2.length())){
                                        byte v = (byte)tablesIndex.read();
                                        if(bvalue==v ){
                                            valueExist=true;
                                            break;
                                        }
                                        int count = tablesIndex.readInt();
                                        long pointer = tablesIndex.getFilePointer() + count*4;
                                        tablesIndex.seek(pointer);

                                    }


                                    if(!valueExist) {
                                       tablesIndex.seek(f2.length());
                                       tablesIndex.write(bvalue);
                                       tablesIndex.writeInt(1);
                                       tablesIndex.writeInt(IndexAddress); 
                                       TableFile.writeByte(bvalue);
                                    }
                                    else if(valueExist && !LstAttribute.get(i).getAttributeConstraint().equals("PRIMARY")){
                                        int count = tablesIndex.readInt();
                                        long pointer = tablesIndex.getFilePointer() + count*4;
                                        tablesIndex.seek(pointer);
                                        long LenToShift = f2.length()-tablesIndex.getFilePointer();
                                        int c=0;
                                        byte[] BytesToShift = new byte[(int)LenToShift];
                                        while(c<LenToShift){
                                            BytesToShift[c]=tablesIndex.readByte();
                                            c++;
                                        }

                                        tablesIndex.seek(pointer-count*4-4);
                                        tablesIndex.writeInt(count+1);
                                        tablesIndex.seek(pointer);
                                        tablesIndex.writeInt(IndexAddress);
                                        tablesIndex.write(BytesToShift);
                                        TableFile.writeByte(bvalue);

                                    }
                                    else if(valueExist && LstAttribute.get(i).getAttributeConstraint().equals("PRIMARY")){
                                        throw new Exception("PRIMARY KEY VIOLATION");
                                    }

                                    break;
                                case "SHORT":
                                case "UNSIGNED SHORT":
                                    
                                    tablesIndex.seek(0);        
                                    short svalue;
                                    
                                    if(t.getTableColumn().get(i).AttributeValue.toUpperCase().equals("NULL"))
                                    {
                                       svalue = Short.MIN_VALUE;
                                    }
                                    else{    
                                       svalue = Short.parseShort(t.getTableColumn().get(i).AttributeValue);
                                    }
                                    while(!(tablesIndex.getFilePointer()>=f2.length())){
                                        short v = (short)tablesIndex.readShort();
                                        if(svalue==v ){
                                            valueExist=true;
                                            break;
                                        }
                                        int count = tablesIndex.readInt();
                                        long pointer = tablesIndex.getFilePointer() + count*4;
                                        tablesIndex.seek(pointer);

                                    }

                                    if(!valueExist) {
                                       tablesIndex.seek(f2.length());
                                       tablesIndex.writeShort(svalue);
                                       tablesIndex.writeInt(1);
                                       tablesIndex.writeInt(IndexAddress); 
                                       TableFile.writeShort(svalue);
                                    }
                                    else if(valueExist && !LstAttribute.get(i).getAttributeConstraint().equals("PRIMARY")){
                                            int count = tablesIndex.readInt();
                                            long pointer = tablesIndex.getFilePointer() + count*4;
                                            tablesIndex.seek(pointer);
                                            long LenToShift = f2.length()-tablesIndex.getFilePointer();
                                            int c=0;
                                            byte[] BytesToShift = new byte[(int)LenToShift];
                                            while(c<LenToShift){
                                                BytesToShift[c]=tablesIndex.readByte();

                                            }

                                            tablesIndex.seek(pointer-count*4-4);
                                            tablesIndex.writeInt(count+1);
                                            tablesIndex.seek(pointer);
                                            tablesIndex.writeInt(IndexAddress);
                                            tablesIndex.write(BytesToShift);
                                            TableFile.writeShort(svalue);

                                        }
                                    else if(valueExist && LstAttribute.get(i).getAttributeConstraint().equals("PRIMARY")){
                                            throw new Exception("PRIMARY KEY VIOLATION");
                                    }
                                    
                                    break;  
                                
                                      
                                case "INT":
                                case "UNSIGNED INT":    
                                    System.out.println("memememe");
                                    tablesIndex.seek(0);        
                                    int ivalue; 
                                    if(t.getTableColumn().get(i).AttributeValue.toUpperCase().equals("NULL"))
                                    {
                                       ivalue = Integer.MIN_VALUE;
                                    }
                                    else{
                                       ivalue = Integer.parseInt(t.getTableColumn().get(i).AttributeValue);
                                    }
                                    
                                    while(!(tablesIndex.getFilePointer()>=f2.length())){
                                        int v = (int)tablesIndex.readInt();
                                        if(ivalue==v ){
                                            valueExist=true;
                                            break;
                                        }
                                        int count = tablesIndex.readInt();
                                        long pointer = tablesIndex.getFilePointer() + count*4;
                                        tablesIndex.seek(pointer);

                                    }

                                    if(!valueExist) {
                                       tablesIndex.seek(f2.length());
                                       tablesIndex.writeInt(ivalue);
                                       tablesIndex.writeInt(1);
                                       tablesIndex.writeInt(IndexAddress); 
                                       TableFile.writeInt(ivalue);
                                    }
                                    else if(valueExist && !LstAttribute.get(i).getAttributeConstraint().equals("PRIMARY")){
                                        int count = tablesIndex.readInt();
                                        long pointer = tablesIndex.getFilePointer() + count*4;
                                        tablesIndex.seek(pointer);
                                        long LenToShift = f2.length()-tablesIndex.getFilePointer();
                                        int c=0;
                                        byte[] BytesToShift = new byte[(int)LenToShift];
                                        while(c<LenToShift){
                                            BytesToShift[c]=tablesIndex.readByte();
                                            c++;
                                        }

                                        tablesIndex.seek(pointer-count*4-4);
                                        tablesIndex.writeInt(count+1);
                                        tablesIndex.seek(pointer);
                                        tablesIndex.writeInt(IndexAddress);
                                        tablesIndex.write(BytesToShift);
                                        TableFile.writeInt(ivalue);

                                    }
                                    else if(valueExist && LstAttribute.get(i).getAttributeConstraint().equals("PRIMARY")){
                                        throw new Exception("PRIMARY KEY VIOLATION");
                                    }
                                    
                                    break;
                                
                                case "LONG":
                                case "UNSIGNED LONG":    		                    
                                    
                                    tablesIndex.seek(0);        
                                    long lvalue;
                                    
                                    if(t.getTableColumn().get(i).AttributeValue.toUpperCase().equals("NULL"))
                                    {
                                       lvalue = Long.MIN_VALUE;
                                    }
                                    else{
                                       lvalue = Long.parseLong(t.getTableColumn().get(i).AttributeValue);
                                    }
                                        
                                    while(!(tablesIndex.getFilePointer()>=f2.length())){
                                        long v = (long)tablesIndex.readLong();
                                        if(lvalue==v ){
                                            valueExist=true;
                                            break;
                                        }
                                        int count = tablesIndex.readInt();
                                        long pointer = tablesIndex.getFilePointer() + count*4;
                                        tablesIndex.seek(pointer);

                                    }

                                    if(!valueExist) {
                                       tablesIndex.seek(f2.length());
                                       tablesIndex.writeLong(lvalue);
                                       tablesIndex.writeInt(1);
                                       tablesIndex.writeInt(IndexAddress); 
                                       TableFile.writeLong(lvalue);
                                    }
                                    else if(valueExist && !LstAttribute.get(i).getAttributeConstraint().equals("PRIMARY")){
                                        int count = tablesIndex.readInt();
                                        long pointer = tablesIndex.getFilePointer() + count*4;
                                        tablesIndex.seek(pointer);
                                        long LenToShift = f2.length()-tablesIndex.getFilePointer();
                                        int c=0;
                                        byte[] BytesToShift = new byte[(int)LenToShift];
                                        while(c<LenToShift){
                                            BytesToShift[c]=tablesIndex.readByte();
                                            c++;
                                        }

                                        tablesIndex.seek(pointer-count*4-4);
                                        tablesIndex.writeInt(count+1);
                                        tablesIndex.seek(pointer);
                                        tablesIndex.writeInt(IndexAddress);
                                        tablesIndex.write(BytesToShift);
                                        TableFile.writeLong(lvalue);

                                    }
                                    else if(valueExist && LstAttribute.get(i).getAttributeConstraint().equals("PRIMARY")){
                                        throw new Exception("PRIMARY KEY VIOLATION");
                                    }
                                    
                                    break;  
                                
                                    
                                case "CHAR":
                                    
                                    String strvalue;
                                    if(t.getTableColumn().get(i).AttributeValue.toUpperCase().equals("NULL"))
                                    {
                                       strvalue = "NULL";
                                    }
                                    else{
                                        strvalue = t.getTableColumn().get(i).AttributeValue;
                                        if (!strvalue.toUpperCase().trim().matches("NULL") && !strvalue.matches("\'.*\'") ) {
                                         throw new Exception("InCompatible Type");
                                        }
                                       
                                       strvalue=strvalue.substring(strvalue.indexOf("'")+1, strvalue.lastIndexOf("'"));
                                       if(strvalue.length() > LstAttribute.get(i).getAttributeLength()){
                                        //throw new Exception("Out of Bound");
                                       }
                                       else if(strvalue.length() < LstAttribute.get(i).getAttributeLength()) {
                                            int diff =LstAttribute.get(i).getAttributeLength()-strvalue.length();
                                            while(diff>0){
                                                strvalue = strvalue+"\0";
                                                diff--;
                                            }

                                        }
                                    }    
                                    
                                    
                                    tablesIndex.seek(0);        

                                    while(!(tablesIndex.getFilePointer()>=f2.length())){

                                        int StringLen = tablesIndex.readByte();
                                        byte[] StringBytes = new byte[StringLen];    
                                        int j=0;
                                        while(j<StringLen){
                                             StringBytes[j]=tablesIndex.readByte();
                                             j++;
                                        }
                                        String v = new String(StringBytes,StandardCharsets.UTF_8);
                                        if(strvalue.equals(v) ){
                                            valueExist=true;
                                            break;
                                        }
                                        int count = tablesIndex.readInt();
                                        long pointer = tablesIndex.getFilePointer() + count*4;
                                        tablesIndex.seek(pointer);

                                    }

                                    if(!valueExist) {
                                       tablesIndex.seek(f2.length());
                                       tablesIndex.writeByte(strvalue.length());
                                       tablesIndex.writeBytes(strvalue);
                                       tablesIndex.writeInt(1);
                                       tablesIndex.writeInt(IndexAddress); 
                                       TableFile.writeByte(strvalue.length());
                                       TableFile.writeBytes(strvalue);
                                    }
                                    else if(valueExist && !LstAttribute.get(i).getAttributeConstraint().equals("PRIMARY")){
                                        int count = tablesIndex.readInt();
                                        long pointer = tablesIndex.getFilePointer() + count*4;
                                        tablesIndex.seek(pointer);
                                        long LenToShift = f2.length()-tablesIndex.getFilePointer();
                                        int c=0;
                                        byte[] BytesToShift = new byte[(int)LenToShift];
                                        while(c<LenToShift){
                                            BytesToShift[c]=tablesIndex.readByte();

                                        }

                                        tablesIndex.seek(pointer-count*4-4);
                                        tablesIndex.writeInt(count+1);
                                        tablesIndex.seek(pointer);
                                        tablesIndex.writeInt(IndexAddress);
                                        tablesIndex.write(BytesToShift);
                                        TableFile.writeByte(strvalue.length());
                                        TableFile.writeBytes(strvalue);

                                    }
                                    else if(valueExist && LstAttribute.get(i).getAttributeConstraint().equals("PRIMARY")){
                                        throw new Exception("PRIMARY KEY VIOLATION");
                                    }
                                    
                                    break;
                                case "VARCHAR":
                                    
                                    String strvalue1;

                                    if(t.getTableColumn().get(i).AttributeValue.toUpperCase().equals("NULL"))
                                    {
                                       strvalue1 = "NULL";
                                    }
                                    else{
                                         strvalue1 = t.getTableColumn().get(i).AttributeValue;
                                         if (( !strvalue1.toUpperCase().trim().matches("NULL") && !strvalue1.matches("\'.*\'"))) {
                                         throw new Exception("InCompatible Type");
                                         }
                                         strvalue1=strvalue1.substring(strvalue1.indexOf("'")+1, strvalue1.lastIndexOf("'"));
                                         System.out.println(strvalue1.length());
                                         System.out.println(LstAttribute.get(i).getAttributeLength());
                                        if(strvalue1.length() > LstAttribute.get(i).getAttributeLength()){
                                            //throw new Exception("Out of Bound");
                                        }
                                    }    
                                    
                                   
                                    tablesIndex.seek(0);        

                                    while(!(tablesIndex.getFilePointer()>=f2.length())){

                                        int StringLen = tablesIndex.readByte();
                                        byte[] StringBytes = new byte[StringLen];    
                                        int j=0;
                                        while(j<StringLen){
                                             StringBytes[j]=tablesIndex.readByte();
                                             j++;
                                        }
                                        String v = new String(StringBytes,StandardCharsets.UTF_8);
                                        if(strvalue1.equals(v) ){
                                            valueExist=true;
                                            break;
                                        }
                                        int count = tablesIndex.readInt();
                                        long pointer = tablesIndex.getFilePointer() + count*4;
                                        tablesIndex.seek(pointer);

                                    }

                                    if(!valueExist) {
                                       tablesIndex.seek(f2.length());
                                       tablesIndex.writeByte(strvalue1.length());
                                       tablesIndex.writeBytes(strvalue1);
                                       tablesIndex.writeInt(1);
                                       tablesIndex.writeInt(IndexAddress); 
                                       TableFile.writeByte(strvalue1.length());
                                       TableFile.writeBytes(strvalue1);
                                    }
                                    else if(valueExist && !LstAttribute.get(i).getAttributeConstraint().equals("PRIMARY")){
                                        int count = tablesIndex.readInt();
                                        long pointer = tablesIndex.getFilePointer() + count*4;
                                        tablesIndex.seek(pointer);
                                        long LenToShift = f2.length()-tablesIndex.getFilePointer();
                                        int c=0;
                                        byte[] BytesToShift = new byte[(int)LenToShift];
                                        while(c<LenToShift){
                                            BytesToShift[c]=tablesIndex.readByte();

                                        }

                                        tablesIndex.seek(pointer-count*4-4);
                                        tablesIndex.writeInt(count+1);
                                        tablesIndex.seek(pointer);
                                        tablesIndex.writeInt(IndexAddress);
                                        tablesIndex.write(BytesToShift);
                                        TableFile.writeByte(strvalue1.length());
                                        TableFile.writeBytes(strvalue1);

                                    }
                                    else if(valueExist && LstAttribute.get(i).getAttributeConstraint().equals("PRIMARY")){
                                        throw new Exception("PRIMARY KEY VIOLATION");
                                    }
                                    
                                    break;
                                case "FLOAT":
                                    
                                    tablesIndex.seek(0);        
                                    float fvalue;
                                    if(t.getTableColumn().get(i).AttributeValue.toUpperCase().equals("NULL"))
                                    {
                                       fvalue = Float.MIN_VALUE;
                                    }
                                    else{
                                        fvalue = Float.parseFloat(t.getTableColumn().get(i).AttributeValue);
                                    }    
                                    while(!(tablesIndex.getFilePointer()>=f2.length())){
                                        float v = (float)tablesIndex.readFloat();
                                        if(fvalue==v ){
                                            valueExist=true;
                                            break;
                                        }
                                        int count = tablesIndex.readInt();
                                        long pointer = tablesIndex.getFilePointer() + count*4;
                                        tablesIndex.seek(pointer);

                                    }

                                    if(!valueExist) {
                                       tablesIndex.seek(f2.length());
                                       tablesIndex.writeFloat(fvalue);
                                       tablesIndex.writeInt(1);
                                       tablesIndex.writeInt(IndexAddress); 
                                       TableFile.writeFloat(fvalue);
                                    }
                                    else if(valueExist && !LstAttribute.get(i).getAttributeConstraint().equals("PRIMARY")){
                                        int count = tablesIndex.readInt();
                                        long pointer = tablesIndex.getFilePointer() + count*4;
                                        tablesIndex.seek(pointer);
                                        long LenToShift = f2.length()-tablesIndex.getFilePointer();
                                        int c=0;
                                        byte[] BytesToShift = new byte[(int)LenToShift];
                                        while(c<LenToShift){
                                            BytesToShift[c]=tablesIndex.readByte();
                                            c++;
                                        }

                                        tablesIndex.seek(pointer-count*4-4);
                                        tablesIndex.writeInt(count+1);
                                        tablesIndex.seek(pointer);
                                        tablesIndex.writeInt(IndexAddress);
                                        tablesIndex.write(BytesToShift);
                                        TableFile.writeFloat(fvalue);

                                    }
                                    else if(valueExist && LstAttribute.get(i).getAttributeConstraint().equals("PRIMARY")){
                                        throw new Exception("PRIMARY KEY VIOLATION");
                                    }
                                    
                                    break;
                                case "DOUBLE":
                                    
                                    tablesIndex.seek(0);        
                                    double dvalue;
                                    if(t.getTableColumn().get(i).AttributeValue.toUpperCase().equals("NULL")){
                                       dvalue = Double.MIN_VALUE;
                                    }
                                    else{
                                        dvalue = Double.parseDouble(t.getTableColumn().get(i).AttributeValue);
                                    }
                                    while(!(tablesIndex.getFilePointer()>=f2.length())){
                                        double v = (double)tablesIndex.readDouble();
                                        if(dvalue==v ){
                                            valueExist=true;
                                            break;
                                        }
                                        int count = tablesIndex.readInt();
                                        long pointer = tablesIndex.getFilePointer() + count*4;
                                        tablesIndex.seek(pointer);

                                    }

                                    if(!valueExist) {
                                       tablesIndex.seek(f2.length());
                                       tablesIndex.writeDouble(dvalue);
                                       tablesIndex.writeInt(1);
                                       tablesIndex.writeInt(IndexAddress); 
                                       TableFile.writeDouble(dvalue);
                                    }
                                    else if(valueExist && !LstAttribute.get(i).getAttributeConstraint().equals("PRIMARY")){
                                        int count = tablesIndex.readInt();
                                        long pointer = tablesIndex.getFilePointer() + count*4;
                                        tablesIndex.seek(pointer);
                                        long LenToShift = f2.length()-tablesIndex.getFilePointer();
                                        int c=0;
                                        byte[] BytesToShift = new byte[(int)LenToShift];
                                        while(c<LenToShift){
                                            BytesToShift[c]=tablesIndex.readByte();
                                            c++;
                                        }

                                        tablesIndex.seek(pointer-count*4-4);
                                        tablesIndex.writeInt(count+1);
                                        tablesIndex.seek(pointer);
                                        tablesIndex.writeInt(IndexAddress);
                                        tablesIndex.write(BytesToShift);
                                        TableFile.writeDouble(dvalue);

                                    }
                                    else if(valueExist && LstAttribute.get(i).getAttributeConstraint().equals("PRIMARY")){
                                        throw new Exception("PRIMARY KEY VIOLATION");
                                    }
                                    
                                    break;
                                case "DATE":
                                    
                                    tablesIndex.seek(0);
                                    String Date=t.getTableColumn().get(i).AttributeValue;
                                    long dlvalue;
                                    if (( !Date.toUpperCase().trim().matches("NULL") && !Date.matches("\'.*\'"))) {
                                             throw new Exception("InCompatible Type");
                                    }
                                    if(t.getTableColumn().get(i).AttributeValue.toUpperCase().equals("NULL"))
                                    {
                                       dlvalue = Long.MIN_VALUE;
                                    }
                                    else{
                                        
                                        Date=Date.substring(Date.indexOf("'")+1, Date.lastIndexOf("'"));
                                        SimpleDateFormat DateFormat = new SimpleDateFormat("yyyy-MM-dd");
                                        Date d = DateFormat.parse(Date);
                                        dlvalue= d.getTime();
                                    }    
                                        
                                        
                                    while(!(tablesIndex.getFilePointer()>=f2.length())){
                                        long v = (long)tablesIndex.readLong();
                                        if(dlvalue==v ){
                                            valueExist=true;
                                            break;
                                        }
                                        int count = tablesIndex.readInt();
                                        long pointer = tablesIndex.getFilePointer() + count*4;
                                        tablesIndex.seek(pointer);

                                    }

                                    if(!valueExist) {
                                       tablesIndex.seek(f2.length());
                                       tablesIndex.writeLong(dlvalue);
                                       tablesIndex.writeInt(1);
                                       tablesIndex.writeInt(IndexAddress); 
                                       TableFile.writeLong(dlvalue);
                                    }
                                    else if(valueExist && !LstAttribute.get(i).getAttributeConstraint().equals("PRIMARY")){
                                        int count = tablesIndex.readInt();
                                        long pointer = tablesIndex.getFilePointer() + count*4;
                                        tablesIndex.seek(pointer);
                                        long LenToShift = f2.length()-tablesIndex.getFilePointer();
                                        int c=0;
                                        byte[] BytesToShift = new byte[(int)LenToShift];
                                        while(c<LenToShift){
                                            BytesToShift[c]=tablesIndex.readByte();
                                            c++;
                                        }

                                        tablesIndex.seek(pointer-count*4-4);
                                        tablesIndex.writeInt(count+1);
                                        tablesIndex.seek(pointer);
                                        tablesIndex.writeInt(IndexAddress);
                                        tablesIndex.write(BytesToShift);
                                        TableFile.writeLong(dlvalue);

                                    }
                                    else if(valueExist && LstAttribute.get(i).getAttributeConstraint().equals("PRIMARY")){
                                        throw new Exception("PRIMARY KEY VIOLATION");
                                    }
                                    
                                    break;
                                case "DATETIME":
                                    
                                    tablesIndex.seek(0);
                                    String DateTime = t.getTableColumn().get(i).AttributeValue;
                                    long dlvalue1;
                                    if (( !DateTime.toUpperCase().trim().matches("NULL") && !DateTime.matches("\'.*\'"))) {
                                             throw new Exception("InCompatible Type");
                                    }
                                    if(t.getTableColumn().get(i).AttributeValue.toUpperCase().equals("NULL"))
                                    {
                                       dlvalue1 = Long.MIN_VALUE;
                                    }
                                    else{
                                        
                                       DateTime=DateTime.substring(DateTime.indexOf("'")+1, DateTime.lastIndexOf("'"));
                                       SimpleDateFormat DateFormat1 = new SimpleDateFormat("yyyy-MM-dd_HH:mm:ss");
                                       Date d1 = DateFormat1.parse(DateTime);
                                       dlvalue1 = d1.getTime();
                                    }
                                    while(!(tablesIndex.getFilePointer()>=f2.length())){
                                        long v = (long)tablesIndex.readLong();
                                        if(dlvalue1==v ){
                                            valueExist=true;
                                            break;
                                        }
                                        int count = tablesIndex.readInt();
                                        long pointer = tablesIndex.getFilePointer() + count*4;
                                        tablesIndex.seek(pointer);

                                    }

                                    if(!valueExist) {
                                       tablesIndex.seek(f2.length());
                                       tablesIndex.writeLong(dlvalue1);
                                       tablesIndex.writeInt(1);
                                       tablesIndex.writeInt(IndexAddress); 
                                       TableFile.writeLong(dlvalue1);
                                    }
                                    else if(valueExist && !LstAttribute.get(i).getAttributeConstraint().equals("PRIMARY")){
                                        int count = tablesIndex.readInt();
                                        long pointer = tablesIndex.getFilePointer() + count*4;
                                        tablesIndex.seek(pointer);
                                        long LenToShift = f2.length()-tablesIndex.getFilePointer();
                                        int c=0;
                                        byte[] BytesToShift = new byte[(int)LenToShift];
                                        while(c<LenToShift){
                                            BytesToShift[c]=tablesIndex.readByte();
                                            c++;
                                        }

                                        tablesIndex.seek(pointer-count*4-4);
                                        tablesIndex.writeInt(count+1);
                                        tablesIndex.seek(pointer);
                                        tablesIndex.writeInt(IndexAddress);
                                        tablesIndex.write(BytesToShift);
                                        TableFile.writeLong(dlvalue1);

                                    }
                                    else if(valueExist && LstAttribute.get(i).getAttributeConstraint().equals("PRIMARY")){
                                        throw new Exception("PRIMARY KEY VIOLATION");
                                    }

                                    break;
                                default:
                                    break;
                        }
                    }
                    
                }
            }
            else
            {
                throw new Exception("Attribute size does not match");
            }
        }
        else
        {
            throw new Exception("Table does not exist");
        }
        
        
    }

    private static List<Attribute> dummy(Table t) throws IOException, Exception {
               List<Attribute> LstAttribute = new ArrayList();
               if(IsTableExist(t.getTableName()))
               {
                    String TableFilePath="data\\user_data\\"+t.getTableName().trim()+".tbl";
                    File f1= new File(TableFilePath);
                    RandomAccessFile TableFile = new RandomAccessFile(TableFilePath, "rw");
                    long filePointer = 0;
                    File f = new File("data\\catalog\\davisbase_columns.tbl");
                    RandomAccessFile columnsTableFile = new RandomAccessFile(f, "rw");
                     while(!(columnsTableFile.getFilePointer()>=f.length()))
                     {
                        //System.out.println("hello");
                        int rowid=columnsTableFile.readInt();
                        
                        int len1 = columnsTableFile.readByte();
                        byte[] tablename = new byte[len1];
                        int yupo=0;
                        while(yupo<len1){
                            tablename[yupo]=columnsTableFile.readByte();
                            yupo++;
                            String tabnam= new String(tablename,StandardCharsets.UTF_8);
                            //System.out.println(tabnam);
                        }
                        String tabnam= new String(tablename,StandardCharsets.UTF_8);
                        if(tabnam.equals(t.getTableName().trim()))
                        {
                        Attribute a = new Attribute();
                        int len2 = columnsTableFile.readByte();
                        byte[] columnname = new byte[len2];
                        int j=0;
                        while(j<len2){
                            columnname[j]=columnsTableFile.readByte();
                            j++;
                        }
                        String ColumnName= new String(columnname,StandardCharsets.UTF_8);
                        
                        int len4 = columnsTableFile.readByte();
                        byte[] columnType = new byte[len4];
                        int j2=0;
                        while(j2<len4){
                          columnType[j2]=columnsTableFile.readByte();
                        j2++;
                        }
                        String ColumnType= new String(columnType,StandardCharsets.UTF_8);   
                        
                        
                        byte ordinalposition=columnsTableFile.readByte();
                                                
                        int len5 = columnsTableFile.readByte();
                        byte[] notNULL = new byte[len5];
                        int j3=0;
                        while(j3<len5){
                          notNULL[j3]=columnsTableFile.readByte();
                        j3++;
                        }
                        String NOTNULL= new String(notNULL,StandardCharsets.UTF_8);
                        
                        int len6 = columnsTableFile.readByte();
                        byte[] primary = new byte[len6];
                        int j4=0;
                        while(j4<len6){
                          primary[j4]=columnsTableFile.readByte();
                        j4++;
                        }
                        String PRIMARY= new String(primary,StandardCharsets.UTF_8);
                        
                        a.setAttributename(ColumnName);
                        a.setAttributeType(ColumnType);
                        if(NOTNULL.toUpperCase().equals("YES")){
                            a.setAttributeConstraint("NOT NULL");
                        }
                        else if(PRIMARY.equals("PRIMARY")){
                            a.setAttributeConstraint("PRIMARY");                            
                        }    
                        //System.out.println(a.getAttributeConstraint());
                        //System.out.println(a.getAttributeName());
                        //System.out.println(a.getAttributeConstraint());
                        
                        LstAttribute.add(a);

                        }
                        else{
                        int lenColumnName = columnsTableFile.readByte();
                        filePointer=columnsTableFile.getFilePointer()+lenColumnName;
                        columnsTableFile.seek(filePointer);
                        int lenType=columnsTableFile.readByte();
                        filePointer=columnsTableFile.getFilePointer()+lenType;
                        columnsTableFile.seek(filePointer);
                        int op=columnsTableFile.readByte();
                        int lenNull=columnsTableFile.readByte();
                        filePointer=columnsTableFile.getFilePointer()+lenNull;
                        columnsTableFile.seek(filePointer);
                        int lenPri=columnsTableFile.readByte();
                        filePointer=columnsTableFile.getFilePointer()+lenPri;
                        columnsTableFile.seek(filePointer);
                    }
                     }
               }
               else
               {
                   throw new Exception("Table does not exist");
               }
               return LstAttribute;
               }

    static void ReadFromTable(Table t) throws IOException, Exception {
        if(IsTableExist(t.getTableName()))
        {
            String TableFilePath="data\\user_data\\"+t.getTableName().trim()+".tbl";
            File f1= new File(TableFilePath);
            RandomAccessFile TableFile = new RandomAccessFile(TableFilePath, "rw");
            int[] address=GetIndexValues(t);
            List<Attribute> LstAttribute =  dummy(t);
            for (int i = 0; i < LstAttribute.size(); i++) 
            {
            System.out.print(LstAttribute.get(i).getAttributeName()+"\t");
            }
            
            for (int i = 0; i < address.length; i++) 
            {
                System.out.println("");
                TableFile.seek((long)address[i]);
                for (int j = 0; j < LstAttribute.size(); j++)
                {
                    if(LstAttribute.get(j).getAttributeType().contains("(") && LstAttribute.get(j).getAttributeType().contains(")"))
                    {
                    LstAttribute.get(j).setAttributeLength(Integer.parseInt(LstAttribute.get(j).getAttributeType().substring(LstAttribute.get(j).getAttributeType().indexOf("(")+1,LstAttribute.get(j).getAttributeType().indexOf(")"))));
                    LstAttribute.get(j).setAttributeType(LstAttribute.get(j).getAttributeType().substring(0, LstAttribute.get(j).getAttributeType().indexOf("(")));
                    }
                    String type = LstAttribute.get(j).getAttributeType().toUpperCase();
                    
                    
                    //System.out.println(type);
                     switch(type){
                                    case "BYTE":      
                                    case "UNSIGNED BYTE":                                        
                                            byte ByteValue = (byte)TableFile.read();
                                            if(ByteValue == Byte.MIN_VALUE){
                                                System.out.print("null"+"\t");
                                            }
                                            else{
                                                System.out.print(ByteValue+"\t");
                                            }
                                            break;


                                    case "SHORT":
                                    case "UNSIGNED SHORT":    
                                            short ShortValue = (short)TableFile.readShort();
                                            if(ShortValue == Short.MIN_VALUE){
                                                System.out.print("null"+"\t");
                                            }
                                            else{
                                                System.out.print(ShortValue+"\t");
                                            }
                                            break;  

                                    case "INT":
                                    case "UNSIGNED INT":   
                                            
                                            int IntValue = (int)TableFile.readInt();  
                                            if(IntValue == Integer.MIN_VALUE){
                                                System.out.print("null"+"\t");
                                            }
                                            else{
                                                System.out.print(IntValue+"\t");
                                            }

                                            break;    

                                    case "LONG":
                                    case "UNSIGNED LONG":

                                            long LongValue = (long)TableFile.readLong();
                                            if(LongValue == Long.MIN_VALUE){
                                                System.out.print("null"+"\t");
                                            }
                                            else{
                                                System.out.print(LongValue+"\t");
                                            }
                                            break;  

                                    case "CHAR":

                                            int CharLen = TableFile.readByte();
                                            byte[] CharBytes = new byte[CharLen];    
                                            int len=0;
                                            while(len<CharLen){
                                                CharBytes[len]=TableFile.readByte();
                                                len++;
                                            }
                                            String CharValue = new String(CharBytes,StandardCharsets.UTF_8);

                                            if(CharValue.equals("NULL")){
                                                System.out.print("null"+"\t");
                                            }
                                            else{
                                                System.out.print(CharValue+"\t");
                                            }

                                            break;
                                    case "VARCHAR":
                                            int StringLen = TableFile.readByte();
                                            byte[] StringBytes = new byte[StringLen];    
                                            int len1=0;
                                            while(len1<StringLen){
                                                StringBytes[len1]=TableFile.readByte();
                                                len1++;
                                            }
                                            String StringValue = new String(StringBytes,StandardCharsets.UTF_8);

                                            if(StringValue.equals("NULL")){
                                                System.out.print("null"+"\t");
                                            }
                                            else{
                                                System.out.print(StringValue+"\t");
                                            }

                                            break;
                                    case "FLOAT":
                                            float FloatValue = (float)TableFile.readFloat();
                                            if(FloatValue == Float.MIN_VALUE){
                                                System.out.print("null"+"\t");
                                            }
                                            else{
                                                System.out.print(FloatValue+"\t");
                                            }

                                            break; 
                                    case "DOUBLE":
                                            double DoubleValue = (double)TableFile.readDouble();
                                            if(DoubleValue == Double.MIN_VALUE){
                                                System.out.print("null"+"\t");
                                            }
                                            else{
                                                System.out.print(DoubleValue+"\t");
                                            }

                                            break;  
                                    case "DATE":
                                            long LongDate = (long)TableFile.readLong();
                                            if(LongDate == Long.MIN_VALUE){
                                                System.out.print("null"+"\t");
                                            }
                                            else{
                                                SimpleDateFormat DateFormat = new SimpleDateFormat("yyyy-MM-dd");
                                                Date date = new Date(LongDate);
                                                System.out.print(DateFormat.format(date)+"\t");
                                            }

                                            break;
                                    case "DATETIME":
                                            long LongDateTime = (long)TableFile.readLong();
                                            if(LongDateTime == Long.MIN_VALUE){
                                                System.out.print("null"+"\t");
                                            }
                                            else{
                                                SimpleDateFormat DateFormat1 = new SimpleDateFormat("yyyy-MM-dd_HH:mm:ss");
                                                Date date1 = new Date(LongDateTime);
                                                System.out.print(DateFormat1.format(date1)+"\t");   
                                            }
                                            break;
                                    default:
                                            break;
                            }
                    
                }
            }
            System.out.println();   
        }
        else
        {       
            throw new Exception("Table does not exist");
        }
    }

    static void SelectALL(Table t) throws IOException, Exception {
        if( t.TableName.toUpperCase().trim().equals("TABLES") ||  t.TableName.toUpperCase().trim().equals("COLUMNS"))
        {
            selectinfo(t.getTableName());
        }
        else
        {
           //System.out.println("hellogjgjhgjghjghj");
           String TableFilePath="data\\user_data\\"+t.getTableName().trim()+".tbl";
           File f1= new File(TableFilePath);
           RandomAccessFile TableFile = new RandomAccessFile(TableFilePath, "rw");
           List<Attribute> LstAttribute =  dummy(t);
           for (int h = 0; h < LstAttribute.size(); h++) 
           {
           System.out.print(LstAttribute.get(h).getAttributeName()+"\t");
           }
           TableFile.seek(0);
           while(f1.length()>TableFile.getFilePointer())
           {
               System.out.println("");
               for (int j = 0; j < LstAttribute.size(); j++)
               {
               if(LstAttribute.get(j).getAttributeType().contains("(") && LstAttribute.get(j).getAttributeType().contains(")"))
               {    
                LstAttribute.get(j).setAttributeLength(Integer.parseInt(LstAttribute.get(j).getAttributeType().substring(LstAttribute.get(j).getAttributeType().indexOf("(")+1,LstAttribute.get(j).getAttributeType().indexOf(")"))));
                LstAttribute.get(j).setAttributeType(LstAttribute.get(j).getAttributeType().substring(0, LstAttribute.get(j).getAttributeType().indexOf("(")));
               }
               String type = LstAttribute.get(j).getAttributeType().toUpperCase();
               switch(type){
                                        case "BYTE":      
                                        case "UNSIGNED BYTE":                                        
                                                byte ByteValue = (byte)TableFile.read();
                                                if(ByteValue == Byte.MIN_VALUE){
                                                    System.out.print("null"+"\t");
                                                }
                                                else{
                                                    System.out.print(ByteValue+"\t");
                                                }
                                                break;
                                        case "SHORT":
                                        case "UNSIGNED SHORT":    
                                                short ShortValue = (short)TableFile.readShort();
                                                if(ShortValue == Short.MIN_VALUE){
                                                    System.out.print("null"+"\t");
                                                }
                                                else{
                                                    System.out.print(ShortValue+"\t");
                                                }
                                                break; 
                                        case "INT":
                                        case "UNSIGNED INT":                                        
                                                int IntValue = (int)TableFile.readInt();  
                                                if(IntValue == Integer.MIN_VALUE){
                                                    System.out.print("null"+"\t");
                                                }
                                                else{
                                                    System.out.print(IntValue+"\t");
                                                }

                                                break;    

                                        case "LONG":
                                        case "UNSIGNED LONG":

                                                long LongValue = (long)TableFile.readLong();
                                                if(LongValue == Long.MIN_VALUE){
                                                    System.out.print("null"+"\t");
                                                }
                                                else{
                                                    System.out.print(LongValue+"\t");
                                                }
                                                break;  

                                        case "CHAR":

                                                int CharLen = TableFile.readByte();
                                                byte[] CharBytes = new byte[CharLen];    
                                                int len=0;
                                                while(len<CharLen){
                                                    CharBytes[len]=TableFile.readByte();
                                                    len++;
                                                }
                                                String CharValue = new String(CharBytes,StandardCharsets.UTF_8);

                                                if(CharValue.equals("NULL")){
                                                    System.out.print("null"+"\t");
                                                }
                                                else{
                                                    System.out.print(CharValue+"\t");
                                                }

                                                break;
                                        case "VARCHAR":
                                                int StringLen = TableFile.readByte();
                                                byte[] StringBytes = new byte[StringLen];    
                                                int len1=0;
                                                while(len1<StringLen){
                                                    StringBytes[len1]=TableFile.readByte();
                                                    len1++;
                                                }
                                                String StringValue = new String(StringBytes,StandardCharsets.UTF_8);

                                                if(StringValue.equals("NULL")){
                                                    System.out.print("null"+"\t");
                                                }
                                                else{
                                                    System.out.print(StringValue+"\t");
                                                }

                                                break;
                                        case "FLOAT":
                                                float FloatValue = (float)TableFile.readFloat();
                                                if(FloatValue == Float.MIN_VALUE){
                                                    System.out.print("null"+"\t");
                                                }
                                                else{
                                                    System.out.print(FloatValue+"\t");
                                                }

                                                break; 
                                        case "DOUBLE":
                                                double DoubleValue = (double)TableFile.readDouble();
                                                if(DoubleValue == Double.MIN_VALUE){
                                                    System.out.print("null"+"\t");
                                                }
                                                else{
                                                    System.out.print(DoubleValue+"\t");
                                                }

                                                break;  
                                        case "DATE":
                                                long LongDate = (long)TableFile.readLong();
                                                if(LongDate == Long.MIN_VALUE){
                                                    System.out.print("null"+"\t");
                                                }
                                                else{
                                                    SimpleDateFormat DateFormat = new SimpleDateFormat("yyyy-MM-dd");
                                                    Date date = new Date(LongDate);
                                                    System.out.print(DateFormat.format(date)+"\t");
                                                }

                                                break;
                                        case "DATETIME":
                                                long LongDateTime = (long)TableFile.readLong();
                                                if(LongDateTime == Long.MIN_VALUE){
                                                    System.out.print("null"+"\t");
                                                }
                                                else{
                                                    SimpleDateFormat DateFormat1 = new SimpleDateFormat("yyyy-MM-dd_HH:mm:ss");
                                                    Date date1 = new Date(LongDateTime);
                                                    System.out.print(DateFormat1.format(date1)+"\t");   
                                                }
                                                break;
                                        default:
                                                break;
                            }
               }
           }
           System.out.println();
        }
    }

    public static void selectinfo(String tableName) throws FileNotFoundException, IOException {
        switch(tableName.toUpperCase().trim())
                {
                case "TABLES":
                    File f2 = new File("data\\catalog\\davisbase_tables.tbl");
                    RandomAccessFile TablesTableFile = new RandomAccessFile(f2, "rw");
                    System.out.print("ROW_ID"+"\t");
                    System.out.print("TABLE_NAME"+"\t");
                    while(TablesTableFile.getFilePointer()<f2.length())
                    {
                        System.out.println("");
                        int row = TablesTableFile.readInt();
                        System.out.print(row+"\t");
                        int len1 = TablesTableFile.readByte();
                        byte[] tableN = new byte[len1];
                        int i=0;
                        while(i<len1){
                            tableN[i]=TablesTableFile.readByte();
                            i++;
                        }
                        String tablename1= new String(tableN,StandardCharsets.UTF_8);
                        System.out.print(tablename1+"\t");
                    }
                    System.out.println("");
                    break;
                case "COLUMNS":
                    File f3 = new File("data\\catalog\\davisbase_columns.tbl");
                    RandomAccessFile columnsTableFile = new RandomAccessFile(f3, "rw");
                    
                    System.out.print("ROWID"+"\t");
                    System.out.print("TABLE_NAME"+"\t");
                    System.out.print("COLUMN_NAME"+"\t");
                    System.out.print("DATA_TYPE"+"\t");
                    System.out.print("ORDINAL_POSITION"+"\t");
                    System.out.print("IS_NULLABLE"+"\t");
                    System.out.print("COLUMN_KEY"+"\t");
                    while(columnsTableFile.getFilePointer()<f3.length())
                    {
                        System.out.println("");
                        
                        int rowid = columnsTableFile.readInt();
                        System.out.print(rowid+"\t");
                        
                        int len2 = columnsTableFile.readByte();
                        byte[] Table = new byte[len2];
                        int j=0;
                        while(j<len2){
                            Table[j]=columnsTableFile.readByte();
                            j++;
                        }
                        String table= new String(Table,StandardCharsets.UTF_8);
                        System.out.print(table+"\t");
                        
                        int len3 = columnsTableFile.readByte();
                        byte[] Column = new byte[len3];
                        int k=0;
                        while(k<len3){
                            Column[k]=columnsTableFile.readByte();
                            k++;
                        }
                        String column= new String(Column,StandardCharsets.UTF_8);
                        System.out.print(column+"\t");
                        
                        int len4 = columnsTableFile.readByte();
                        byte[] Type = new byte[len4];
                        int l=0;
                        while(l<len4){
                            Type[l]=columnsTableFile.readByte();
                            l++;
                        }
                        String type = new String(Type,StandardCharsets.UTF_8);
                        System.out.print(type+"\t");
                        
                        int op = columnsTableFile.readByte();
                        System.out.print(op+"\t");
                        
                        int len5 = columnsTableFile.readByte();
                        byte[] NOTNULL = new byte[len5];
                        int m=0;
                        while(m<len5){
                            NOTNULL[m]=columnsTableFile.readByte();
                            m++;
                        }
                        String notnull = new String(NOTNULL,StandardCharsets.UTF_8);
                        System.out.print(notnull+"\t");
                        
                        int len6 = columnsTableFile.readByte();
                        byte[] Key = new byte[len6];
                        int n=0;
                        while(n<len6){
                            Key[n]=columnsTableFile.readByte();
                            n++;
                        }
                        String key = new String(Key,StandardCharsets.UTF_8);
                        System.out.print(key+"\t");
                    }
                    System.out.println("");
                    break;
                default:
                    break;
                }

        
    }

    private static int[] GetIndexValues(Table t) throws Exception {
        TreeMap<Object,ArrayList> tree = new TreeMap();
        ArrayList<Integer> Address = new ArrayList<Integer>();
        List<Attribute> LstAttribute =  dummy(t);
        boolean result=false;
        String Operator = t.getOperator();
        //System.out.println(t.getTableColumn());
        for (int i = 0; i < LstAttribute.size(); i++) {
            //System.out.println(LstAttribute.get(i).getAttributeName().trim());
        if(t.getTableColumn().get(0).getAttributeName().trim().equals(LstAttribute.get(i).getAttributeName().trim()))
        {
        t.getTableColumn().get(0).setAttributeType(LstAttribute.get(i).getAttributeType());
        t.getTableColumn().get(0).setAttributeLength(LstAttribute.get(i).getAttributeLength());
        }
        }
        String TableIndexFilePath="data\\user_data\\"+t.getTableName().trim()+"."+t.getTableColumn().get(0).getAttributeName().trim()+".ndx";
        File f2 = new File(TableIndexFilePath);
        RandomAccessFile tablesIndex = new RandomAccessFile(TableIndexFilePath, "rw");
               
        if(t.getTableColumn().get(0).getAttributeType().contains("(") && t.getTableColumn().get(0).getAttributeType().contains(")"))
        {
        t.getTableColumn().get(0).setAttributeLength(Integer.parseInt(t.getTableColumn().get(0).getAttributeType().substring(t.getTableColumn().get(0).getAttributeType().indexOf("(")+1,t.getTableColumn().get(0).getAttributeType().indexOf(")"))));
        t.getTableColumn().get(0).setAttributeType(t.getTableColumn().get(0).getAttributeType().substring(0, t.getTableColumn().get(0).getAttributeType().indexOf("(")));
        }
    
    switch(t.getTableColumn().get(0).getAttributeType().toUpperCase().trim()){
                
                    case "BYTE":                                    
                    case "UNSIGNED BYTE":            
                                while(!(tablesIndex.getFilePointer()>=f2.length())){
                                    byte v = (byte)tablesIndex.read();
                                    int count = tablesIndex.readInt();
                                    int c=0;
                                    ArrayList<Integer> values= new ArrayList();
                                    while(c<count){
                                        values.add(tablesIndex.readInt());
                                        c++;
                                    }
                                    tree.put(v, values);
                                }
                                byte bvalue;
                                if(t.getTableColumn().get(0).AttributeValue.toUpperCase().equals("NULL")){
                                    bvalue=Byte.MIN_VALUE;
                                }
                                else{
                                    bvalue = Byte.parseByte(t.getTableColumn().get(0).AttributeValue);
                                }
                                
                                for(Entry<Object,ArrayList> entry : tree.entrySet()) {
                                    byte key = (byte)entry.getKey();         
                                    ArrayList<Integer> value = entry.getValue();  
                                    if(key==bvalue){
                                        for(int i=0; i < value.size();i++) {  
				            Address.add(value.get(i));
			                }
                                      
                                    }
                                }
                                
                                break;

                    case "SHORT":
                    case "UNSIGNED SHORT":      
                                
                                while(!(tablesIndex.getFilePointer()>=f2.length())){
                                    short v = (short)tablesIndex.readShort();
                                    int count = tablesIndex.readInt();
                                    int c=0;
                                    ArrayList<Integer> values= new ArrayList();
                                    while(c<count){
                                        values.add(tablesIndex.readInt());
                                        c++;
                                    }
                                    tree.put(v, values);
                                }
                                
                                short svalue;
                                if(t.getTableColumn().get(0).AttributeValue.toUpperCase().equals("NULL")){
                                    svalue=Short.MIN_VALUE;
                                }
                                else{
                                    svalue=Short.parseShort(t.getTableColumn().get(0).AttributeValue);
                                }
                                
                                for(Entry<Object,ArrayList> entry : tree.entrySet()) {
                                    short key = (short)entry.getKey();         
                                    ArrayList<Integer> value = entry.getValue();
                                    switch(Operator){
                                        case "=":
                                            if(key==svalue){
                                               for(int i=0; i < value.size();i++) {  
				               Address.add(value.get(i));
			                       }
                                            }
                                            break;
                                        case "<":
                                            if(key< svalue){
                                               for(int i=0; i < value.size();i++) {  
				               Address.add(value.get(i));
			                       }
                                            }
                                            break;
                                        case ">":
                                            if(key> svalue){
                                               for(int i=0; i < value.size();i++) {  
				               Address.add(value.get(i));
			                       }
                                            }
                                            break;
                                        case ">=":
                                            if(key >= svalue){
                                               for(int i=0; i < value.size();i++) {  
				               Address.add(value.get(i));
			                       }
                                            }
                                            break;  
                                        case "<=":
                                            if(key <= svalue){
                                               for(int i=0; i < value.size();i++) {  
				               Address.add(value.get(i));
			                       }
                                            }
                                            break;
                                        case "<>":
                                            if(key!= svalue){
                                               for(int i=0; i < value.size();i++) {  
				               Address.add(value.get(i));
			                       }
                                            }
                                            break;
                                        default:
                                            System.out.println("Invalid operator");
                                            break;
                                    }
                                    
                                }
                                break;  

                    case "INT":
                    case "UNSIGNED INT":  
                        
                                while(!(tablesIndex.getFilePointer()>=f2.length())){
                                    int v = (int)tablesIndex.readInt();
                                    int count = tablesIndex.readInt();
                                    int c=0;
                                    ArrayList<Integer> values= new ArrayList();
                                    while(c<count){
                                        values.add(tablesIndex.readInt());
                                        c++;
                                    }
                                    tree.put(v, values);
                                }
                                
                                int ivalue;
                                if(t.getTableColumn().get(0).AttributeValue.toUpperCase().equals("NULL")){
                                    ivalue =Integer.MIN_VALUE;
                                }
                                else{
                                    ivalue = Integer.parseInt(t.getTableColumn().get(0).AttributeValue);
                                }
                                
                                for(Entry<Object,ArrayList> entry : tree.entrySet()) {
                                    int key = (int)entry.getKey();         
                                    ArrayList<Integer> value = entry.getValue();
                                    switch(Operator){
                                        case "=":
                                            if(key==ivalue){
                                               for(int i=0; i < value.size();i++) {  
                                               
				               Address.add(value.get(i));
			                       }
                                            }
                                            break;
                                        case "<":
                                            if(key< ivalue){
                                               for(int i=0; i < value.size();i++) {  
				               Address.add(value.get(i));
			                       }
                                            }
                                            break;
                                        case ">":
                                            if(key> ivalue){
                                               for(int i=0; i < value.size();i++) {  
				               Address.add(value.get(i));
			                       }
                                            }
                                            break;
                                        case ">=":
                                            if(key >= ivalue){
                                               for(int i=0; i < value.size();i++) {  
				               Address.add(value.get(i));
			                       }
                                            }
                                            break;  
                                        case "<=":
                                            if(key <= ivalue){
                                               for(int i=0; i < value.size();i++) {  
				               Address.add(value.get(i));
			                       }
                                            }
                                            break;
                                        case "<>":
                                            if(key!= ivalue){
                                               for(int i=0; i < value.size();i++) {  
				               Address.add(value.get(i));
			                       }
                                            }
                                            break;
                                        default:
                                            System.out.println("Invalid operator");
                                            break;
                                    }
                                    
                                }
                                break;  


                    case "LONG":
                    case "UNSIGNED LONG":    

                                while(!(tablesIndex.getFilePointer()>=f2.length())){
                                    long v = (long)tablesIndex.readLong();
                                    int count = tablesIndex.readInt();
                                    int c=0;
                                    ArrayList<Integer> values= new ArrayList();
                                    while(c<count){
                                        values.add(tablesIndex.readInt());
                                        c++;
                                    }
                                    tree.put(v, values);
                                }
                                
                                long lvalue;
                                
                                if(t.getTableColumn().get(0).AttributeValue.toUpperCase().equals("NULL")){
                                    lvalue = Long.MIN_VALUE;
                                }
                                else{
                                    lvalue = Long.parseLong(t.getTableColumn().get(0).AttributeValue);
                                }
                                
                                for(Entry<Object,ArrayList> entry : tree.entrySet()) {
                                    long key = (long)entry.getKey();         
                                    ArrayList<Integer> value = entry.getValue();
                                    switch(Operator){
                                        case "=":
                                            if(key==lvalue){
                                               for(int i=0; i < value.size();i++) {  
				               Address.add(value.get(i));
			                       }
                                            }
                                            break;
                                        case "<":
                                            if(key< lvalue){
                                               for(int i=0; i < value.size();i++) {  
				               Address.add(value.get(i));
			                       }
                                            }
                                            break;
                                        case ">":
                                            if(key> lvalue){
                                               for(int i=0; i < value.size();i++) {  
				               Address.add(value.get(i));
			                       }
                                            }
                                            break;
                                        case ">=":
                                            if(key >= lvalue){
                                               for(int i=0; i < value.size();i++) {  
				               Address.add(value.get(i));
			                       }
                                            }
                                            break;  
                                        case "<=":
                                            if(key <= lvalue){
                                               for(int i=0; i < value.size();i++) {  
				               Address.add(value.get(i));
			                       }
                                            }
                                            break;
                                        case "<>":
                                            if(key!= lvalue){
                                               for(int i=0; i < value.size();i++) {  
				               Address.add(value.get(i));
			                       }
                                            }
                                            break;
                                        default:
                                            System.out.println("Invalid operator");
                                            break;
                                    }
                                    
                                }
                                break;  
                                
                    case "CHAR":
                        
                                while(!(tablesIndex.getFilePointer()>=f2.length())){
                                    int StringLen = tablesIndex.readByte();
                                    byte[] StringBytes = new byte[StringLen];    
                                    int j=0;
                                    while(j<StringLen){
                                         StringBytes[j]=tablesIndex.readByte();
                                         j++;
                                    }
                                    String v = new String(StringBytes,StandardCharsets.UTF_8);
                                    int count = tablesIndex.readInt();
                                    int c=0;
                                    ArrayList<Integer> values= new ArrayList();
                                    while(c<count){
                                        values.add(tablesIndex.readInt());
                                        c++;
                                    }
                                    tree.put(v, values);
                                }
                                    
                                String strvalue;
                                
                                if(t.getTableColumn().get(0).AttributeValue.toUpperCase().equals("NULL")){
                                    strvalue = "NULL";
                                }
                                else{
                                    
                                    strvalue = t.getTableColumn().get(0).AttributeValue;
                                    strvalue=strvalue.substring(strvalue.indexOf("'")+1, strvalue.lastIndexOf("'"));
                                    if(strvalue.length() < t.getTableColumn().get(0).getAttributeLength()) {
                                        int diff =t.getTableColumn().get(0).getAttributeLength()-strvalue.length();
                                        while(diff>0){
                                            strvalue = strvalue+"\0";
                                            diff--;
                                        }
                                    }
                                
                                }
                                
                                
                                for(Entry<Object,ArrayList> entry : tree.entrySet()) {
                                    String key = (String)entry.getKey();         
                                    ArrayList<Integer> value = entry.getValue();
                                    if(key.equals(strvalue)){
                                        for(int i=0; i < value.size();i++) {  
				            Address.add(value.get(i));
			                }
                                    }
                                    
                                }
                                break;  
                                
                    case "VARCHAR":

                                while(!(tablesIndex.getFilePointer()>=f2.length())){
                                    int StringLen = tablesIndex.readByte();
                                    byte[] StringBytes = new byte[StringLen];    
                                    int j=0;
                                    while(j<StringLen){
                                         StringBytes[j]=tablesIndex.readByte();
                                         j++;
                                    }
                                    String v = new String(StringBytes,StandardCharsets.UTF_8);
                                    int count = tablesIndex.readInt();
                                    int c=0;
                                    ArrayList<Integer> values= new ArrayList();
                                    while(c<count){
                                        values.add(tablesIndex.readInt());
                                        c++;
                                    }
                                    tree.put(v, values);
                                }
                                
                                String strvalue1;
                                
                                if(t.getTableColumn().get(0).AttributeValue.toUpperCase().equals("NULL")){
                                    strvalue1 = "NULL";
                                }
                                else{
                                    strvalue1 = t.getTableColumn().get(0).AttributeValue;
                                    strvalue1=strvalue1.substring(strvalue1.indexOf("'")+1, strvalue1.lastIndexOf("'"));
                                }
                                
                                for(Entry<Object,ArrayList> entry : tree.entrySet()) {
                                    String key = (String)entry.getKey();         
                                    ArrayList<Integer> value = entry.getValue();
                                    if(key.equals(strvalue1)){
                                        for(int i=0; i < value.size();i++) {  
				            Address.add(value.get(i));
			                }
                                    }
                                    
                                }
                                break;  
                                
                    case "FLOAT":
                        
                                while(!(tablesIndex.getFilePointer()>=f2.length())){
                                    float v = (float)tablesIndex.readFloat();
                                    int count = tablesIndex.readInt();
                                    int c=0;
                                    ArrayList<Integer> values= new ArrayList();
                                    while(c<count){
                                        values.add(tablesIndex.readInt());
                                        c++;
                                    }
                                    tree.put(v, values);
                                }
                                
                                
                                float fvalue;
                                if(t.getTableColumn().get(0).AttributeValue.toUpperCase().equals("NULL")){
                                    fvalue = Float.MIN_VALUE;
                                }
                                else{
                                    fvalue= Float.parseFloat(t.getTableColumn().get(0).AttributeValue);
                                }
                                
                                for(Entry<Object,ArrayList> entry : tree.entrySet()) {
                                    float key = (float)entry.getKey();         
                                    ArrayList<Integer> value = entry.getValue();
                                    switch(Operator){
                                        case "=":
                                            if(key==fvalue){
                                               for(int i=0; i < value.size();i++) {  
				               Address.add(value.get(i));
			                       }
                                            }
                                            break;
                                        case "<":
                                            if(key< fvalue){
                                               for(int i=0; i < value.size();i++) {  
				               Address.add(value.get(i));
			                       }
                                            }
                                            break;
                                        case ">":
                                            if(key> fvalue){
                                               for(int i=0; i < value.size();i++) {  
				               Address.add(value.get(i));
			                       }
                                            }
                                            break;
                                        case ">=":
                                            if(key >= fvalue){
                                               for(int i=0; i < value.size();i++) {  
				               Address.add(value.get(i));
			                       }
                                            }
                                            break;  
                                        case "<=":
                                            if(key <= fvalue){
                                               for(int i=0; i < value.size();i++) {  
				               Address.add(value.get(i));
			                       }
                                            }
                                            break;
                                        case "<>":
                                            if(key!= fvalue){
                                               for(int i=0; i < value.size();i++) {  
				               Address.add(value.get(i));
			                       }
                                            }
                                            break;
                                        default:
                                            System.out.println("Invalid operator");
                                            break;
                                    }
                                    
                                }
                                break;  
                                 
                    case "DOUBLE":
                                
                                while(!(tablesIndex.getFilePointer()>=f2.length())){
                                    double v = (double)tablesIndex.readDouble();
                                    int count = tablesIndex.readInt();
                                    int c=0;
                                    ArrayList<Integer> values= new ArrayList();
                                    while(c<count){
                                        values.add(tablesIndex.readInt());
                                        c++;
                                    }
                                    tree.put(v, values);
                                }
                                
                                double dvalue;
                                if(t.getTableColumn().get(0).AttributeValue.toUpperCase().equals("NULL")){
                                    dvalue = Double.MIN_VALUE;
                                }
                                else{
                                    dvalue=Double.parseDouble(t.getTableColumn().get(0).AttributeValue);
                                }
                                
                                for(Entry<Object,ArrayList> entry : tree.entrySet()) {
                                    double key = (double)entry.getKey();         
                                    ArrayList<Integer> value = entry.getValue();
                                    switch(Operator){
                                        case "=":
                                            if(key==dvalue){
                                               for(int i=0; i < value.size();i++) {  
				               Address.add(value.get(i));
                                               
			                       }
                                            }
                                            break;
                                        case "<":
                                            if(key< dvalue){
                                               for(int i=0; i < value.size();i++) {  
				               Address.add(value.get(i));
			                       }
                                            }
                                            break;
                                        case ">":
                                            if(key> dvalue){
                                               for(int i=0; i < value.size();i++) {  
				               Address.add(value.get(i));
			                       }
                                            }
                                            break;
                                        case ">=":
                                            if(key >= dvalue){
                                               for(int i=0; i < value.size();i++) {  
				               Address.add(value.get(i));
			                       }
                                            }
                                            break;  
                                        case "<=":
                                            if(key <= dvalue){
                                               for(int i=0; i < value.size();i++) {  
				               Address.add(value.get(i));
			                       }
                                            }
                                            break;
                                        case "<>":
                                            if(key!= dvalue){
                                               for(int i=0; i < value.size();i++) {  
				               Address.add(value.get(i));
			                       }
                                            }
                                            break;
                                        default:
                                            System.out.println("Invalid operator");
                                            break;
                                    }
                                    
                                }
                                break;  
                                 
                    case "DATE":

                                String Date = t.getTableColumn().get(0).AttributeValue;
                                if (( !Date.toUpperCase().trim().matches("NULL") && !Date.matches("\'.*\'"))) {
                                     throw new Exception("InCompatible Type");
                                }
                                long dlvalue;
                                if(t.getTableColumn().get(0).AttributeValue.toUpperCase().equals("NULL")){
                                    dlvalue = Long.MIN_VALUE;
                                }
                                else{
                                    Date=Date.substring(Date.indexOf("'")+1, Date.lastIndexOf("'"));
                                    SimpleDateFormat DateFormat = new SimpleDateFormat("yyyy-MM-dd");
                                    Date d = DateFormat.parse(Date);
                                    dlvalue= d.getTime();
                                }
                                
                                while(!(tablesIndex.getFilePointer()>=f2.length())){
                                    long v = (long)tablesIndex.readLong();
                                    int count = tablesIndex.readInt();
                                    int c=0;
                                    ArrayList<Integer> values= new ArrayList();
                                    while(c<count){
                                        values.add(tablesIndex.readInt());
                                        c++;
                                    }
                                    tree.put(v, values);
                                }
                                
                                
                                for(Entry<Object,ArrayList> entry : tree.entrySet()) {
                                    long key = (long)entry.getKey();         
                                    ArrayList<Integer> value = entry.getValue();
                                    switch(Operator){
                                        case "=":
                                            if(key==dlvalue){
                                               for(int i=0; i < value.size();i++) {  
				               Address.add(value.get(i));
			                       }
                                            }
                                            break;
                                        case "<":
                                            if(key< dlvalue){
                                               for(int i=0; i < value.size();i++) {  
				               Address.add(value.get(i));
			                       }
                                            }
                                            break;
                                        case ">":
                                            if(key> dlvalue){
                                               for(int i=0; i < value.size();i++) {  
				               Address.add(value.get(i));
			                       }
                                            }
                                            break;
                                        case ">=":
                                            if(key >= dlvalue){
                                               for(int i=0; i < value.size();i++) {  
				               Address.add(value.get(i));
			                       }
                                            }
                                            break;  
                                        case "<=":
                                            if(key <= dlvalue){
                                               for(int i=0; i < value.size();i++) {  
				               Address.add(value.get(i));
			                       }
                                            }
                                            break;
                                        case "<>":
                                            if(key!= dlvalue){
                                               for(int i=0; i < value.size();i++) {  
				               Address.add(value.get(i));
			                       }
                                            }
                                            break;
                                        default:
                                            System.out.println("Invalid operator");
                                            break;
                                    }
                                    
                                }
                                break;  
                                
                    case "DATETIME":    

                                String DateTime = t.getTableColumn().get(0).AttributeValue;
                                if (( !DateTime.toUpperCase().trim().matches("NULL") && !DateTime.matches("\'.*\'"))) {
                                     throw new Exception("InCompatible Type");
                                }
                                
                                long dlvalue1;
                                if(t.getTableColumn().get(0).AttributeValue.toUpperCase().equals("NULL")){
                                    dlvalue1 = Long.MIN_VALUE;
                                }
                                else{
                                    DateTime=DateTime.substring(DateTime.indexOf("'")+1, DateTime.lastIndexOf("'"));
                                    SimpleDateFormat DateFormat1 = new SimpleDateFormat("yyyy-MM-dd_HH:mm:ss");
                                    Date d1 = DateFormat1.parse(DateTime);
                                    dlvalue1 = d1.getTime();
                                }
                                
                                while(!(tablesIndex.getFilePointer()>=f2.length())){
                                    long v = (long)tablesIndex.readLong();
                                    int count = tablesIndex.readInt();
                                    int c=0;
                                    ArrayList<Integer> values= new ArrayList();
                                    while(c<count){
                                        values.add(tablesIndex.readInt());
                                        c++;
                                    }
                                    tree.put(v, values);
                                }
                                
                                
                                for(Entry<Object,ArrayList> entry : tree.entrySet()) {
                                    long key = (long)entry.getKey();         
                                    ArrayList<Integer> value = entry.getValue();
                                    switch(Operator){
                                        case "=":
                                            if(key==dlvalue1){
                                               for(int i=0; i < value.size();i++) {  
				               Address.add(value.get(i));
			                       }
                                            }
                                            break;
                                        case "<":
                                            if(key< dlvalue1){
                                               for(int i=0; i < value.size();i++) {  
				               Address.add(value.get(i));
			                       }
                                            }
                                            break;
                                        case ">":
                                            if(key> dlvalue1){
                                               for(int i=0; i < value.size();i++) {  
				               Address.add(value.get(i));
			                       }
                                            }
                                            break;
                                        case ">=":
                                            if(key >= dlvalue1){
                                               for(int i=0; i < value.size();i++) {  
				               Address.add(value.get(i));
			                       }
                                            }
                                            break;  
                                        case "<=":
                                            if(key <= dlvalue1){
                                               for(int i=0; i < value.size();i++) {  
				               Address.add(value.get(i));
			                       }
                                            }
                                            break;
                                        case "<>":
                                            if(key!= dlvalue1){
                                               for(int i=0; i < value.size();i++) {  
				               Address.add(value.get(i));
			                       }
                                            }
                                            break;
                                        default:
                                            System.out.println("Invalid operator");
                                            break;
                                    }
                                    
                                }
                                break;
                    default:
                                break;

                    }
    int[] arr = new int[Address.size()];
        for(int i = 0; i < Address.size(); i++) {
            arr[i] = Address.get(i);
        }
    return arr;
    }
    private static Logger logger = Logger.getLogger("delete");
    public static void deletetable(Table t) throws FileNotFoundException, Exception
    {       
          String TableFilePath="data\\user_data\\"+t.getTableName().trim()+".tbl";
          File f1= new File(TableFilePath);
          String value=t.getTableColumn().get(0).AttributeValue;
          RandomAccessFile raf = new RandomAccessFile(TableFilePath, "rw");
           System.out.println(value);
          //Setting file pointer to start of file
          raf.seek(0);
          String data = raf.readLine();
          System.out.println(data);
          while (data != null ){
            String[] recordToBeSearched = data.split("");
            //System.out.println(recordToBeSearched);
            String contactNo = recordToBeSearched[0];
            if(contactNo != null && contactNo.equals(value)){
              String blankData = new String();
              raf.writeBytes(blankData);
              break ;
            }
      data = raf.readLine();
    }
        String charset="UTF-8";
        
        /*File file = new File(TableFilePath);
        File temp = File.createTempFile(TableFilePath, ".tbl", file.getParentFile());
        BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(file), charset));
        PrintWriter writer = new PrintWriter(new OutputStreamWriter(new FileOutputStream(temp), charset));
        for (String line; (line = reader.readLine()) != null;) {
                    line = line.replace(value, "");
                    writer.println(line);

        }
        reader.close();
        writer.close();
        file.delete();
        temp.renameTo(file);
*/
    }
    
    
    public static void updatetable(Table t,String a,String b)
    {
        
        
        
    }
       
}
