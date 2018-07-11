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
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Davisbase {
    
    static String prompt = "davisql> ";
    static String version = "v1.0b(example)";
    static String copyright = "©2016 Chris Irwin Davis";
    static boolean isExit = false;
    static long pageSize = 512;
    static String name1;
    static String value1;
    static Scanner scanner = new Scanner(System.in).useDelimiter(";");
    public static void main(String[] args) throws IOException, Exception {
        splashScreen();
        String userCommand = "";
        File f=new File("data\\catalog\\davisbase_tables.tbl");
        File f1=new File("data\\catalog\\davisbase_tables.tbl");
        if(!f.exists())
            if(!f1.exists())
                SchemaInfo.CreateSchema();
        while(!isExit) {
        System.out.print(prompt);
        userCommand = scanner.next().replace("\n", "").replace("\r","").trim().toLowerCase();
        parseUserCommand(userCommand);
        }
        System.out.println("Exiting...");
    }
    public static void splashScreen() {
        System.out.println(line("‐",80));
        System.out.println("Welcome to DavisBaseLite"); // Display the string.
        System.out.println("DavisBaseLite Version " + getVersion());
        System.out.println(getCopyright());
        System.out.println("\nType \"help;\" to display supported commands.");
        System.out.println(line("‐",80));
    }
    public static String line(String s,int num) {
        String a = "";
        for(int i=0;i<num;i++) {
        a += s;
        }
        return a;
    }
    public static String getVersion() {
        return version;
    }
    public static String getCopyright() {
        return copyright;
    }
    public static void displayVersion() {
        System.out.println("DavisBaseLite Version " + getVersion());
        System.out.println(getCopyright());
    }
    public static void help() {
        System.out.println(line("*",80));
        System.out.println("SUPPORTED COMMANDS");
        System.out.println("All commands below are case insensitive");
        System.out.println();
        System.out.println("\tSELECT * FROM table_name;Display all records in the table.");
        System.out.println("\tSELECT * FROM table_name WHERE rowid = <value>;Display records whose rowid is <id>.");
        System.out.println("\tDROP TABLE table_name;Remove table data and its schema.");
        System.out.println("\tVERSION;Show the program version.");
        System.out.println("\tHELP;Show this help information");
        System.out.println("\tEXIT;Exit the program");
        System.out.println();
        System.out.println();
        System.out.println(line("*",80));
    }
    public static void parseUserCommand (String userCommand) throws IOException, Exception {
        ArrayList<String> commandTokens = new ArrayList<String> (Arrays.asList(userCommand.split(" ")));
        Table t;
        switch (commandTokens.get(0)) {
        case "select":
        t = parseQueryString(userCommand);
        if(userCommand.contains("where"))
        {
            SchemaInfo.ReadFromTable(t);
        }
        else
        {
            SchemaInfo.SelectALL(t);
        }
        break;
        case "drop":
        System.out.println("STUB: Calling your method to drop items");
        dropTable(userCommand);
        break;
        case "delete":
        System.out.println("STUB: Calling your method to delete items");
        t=deleteTable(userCommand);
        SchemaInfo.deletetable(t);
        break;
        case "update":
        System.out.println("STUB: Calling your method to update items");
        t=updateTable(userCommand);
        SchemaInfo.updatetable(t,name1,value1);
        break;
        case "create":
        t=parseCreateTable(userCommand);
        SchemaInfo.CreateTable(t);
        break;
        case "insert":
        t = parseinsertInto(userCommand);
        SchemaInfo.insertTable(t);
        break;
        case "help":
        help();
        break;
        case "show":
        showTable(userCommand);
        break;
        case "version":
        displayVersion();
        break;
        case "exit":
        isExit = true;
        break;
        case "quit":
        isExit = true;
        default:
        System.out.println("I didn't understand the command: \"" +
        userCommand + "\"");
        break;
    }
    }
    public static void dropTable(String dropTableString) {
        System.out.println("STUB: Calling dropQueryString(String s) to process queries");
        System.out.println("Parsing the string:\"" + dropTableString + "\"");
        ArrayList<String> dropTableTokens = new ArrayList<String> (Arrays.asList(dropTableString.split(" ")));
        String tableFileName = dropTableTokens.get(2) + ".tbl";
        File file = new File(tableFileName);
        file.delete();     
    }
    public static Table parseQueryString(String queryString) throws java.lang.Exception {
        System.out.println("STUB: Calling parseQueryString(String s) to process queries");
        System.out.println("Parsing the string:\"" + queryString + "\"");
        Table t=new Table();
        String[] selectTableTokens=queryString.split("\\s+");
        List<Attribute> Ltc = new ArrayList<>();
        Attribute tc= new Attribute();
        if(selectTableTokens.length==4 || selectTableTokens.length==5 || selectTableTokens.length==6)
        {
            if(selectTableTokens[0].equals("select") && selectTableTokens[1].equals("*") && selectTableTokens[2].equals("from"))
            {
                t.setTableName(selectTableTokens[3]);
                if(queryString.contains("where"))
                {
                    String condition;
                    condition = queryString.substring(queryString.indexOf("where")+5, queryString.length());
                    String op="";
                    if(condition.contains(">=")){
                            op=">=";
                        }
                        else if(condition.contains("<=")){
                            op="<=";
                        }
                        else if(condition.contains("<>")){
                            op="<>";
                        }
                        else if(condition.contains("=")){
                            op="=";
                        }
                        else if(condition.contains(">")){
                            op=">";
                        }
                        else if(condition.contains("<")){
                            op="<";
                        }
                        else
                        {
                            throw new Exception("Error in SQL Syntax"); 
                        }
                        if(condition.split(op).length==2){
                            tc.setAttributename(condition.split(op)[0].trim());
                            tc.setAttributeValue(condition.split(op)[1].trim());
                            Ltc.add(tc);
                            t.setOperator(op);
                        }
                        else
                        {
                            throw new Exception("Error in SQL Syntax");  
                        }
                            
                }
            }
            else
            {
                throw new Exception("Error in Syntax");
            }
            t.setTableColumn(Ltc);
        }
        else
        {
            throw new Exception("Error in Syntax");
        }
        //System.out.println(t.getTableColumn().get(0).AttributeName);
        //System.out.println(t.getTableColumn().get(0).AttributeValue);
        return t;
        
    }
    public static Table parseCreateTable(String createTableString) throws Exception {
        System.out.println("STUB: Calling your method to create a table");
        System.out.println("Parsing the string:\"" + createTableString + "\"");
        /*String a="";
        String b=",";
        ArrayList<String> createTableTokens;
        createTableTokens = new ArrayList<String> (Arrays.asList(createTableString.split(",| ")));
        System.out.println(createTableTokens);
        String tableFileName = createTableTokens.get(2) + ".tbl";
        String path="C:\\Users\\Preethi\\Documents\\NetBeansProjects\\Davisbase\\data\\user_data\\";
        String tf=path+tableFileName;
        System.out.println(tf);
        try {
        RandomAccessFile tableFile = new RandomAccessFile(tf, "rw");
        tableFile.setLength(pageSize);
        //code for inserting contentnts into file
        tableFile.close();
        }
        catch(Exception e) {
        System.out.println(e);
        }*/
        String[] createTableTokens=createTableString.split("\\s+");
        for(int i=0;i<createTableTokens.length;i++)
        System.out.println(createTableTokens[i]);
        Table t=new Table();
        List<Attribute> tabcol=new ArrayList();
        ArrayList<String> tabcon=new ArrayList();
        int charlen=0;
        
        
        if(createTableTokens[0].equals("create") && createTableTokens[1].equals("table"))
        {
            if(createTableTokens[2].contains("("))
            {
                System.out.println(createTableTokens[2].substring(0, createTableTokens[2].indexOf("(")));
                t.setTableName(createTableTokens[2].substring(0, createTableTokens[2].indexOf("(")));
                System.out.println(t.TableName);
                if(createTableString.contains("(") && createTableString.contains(")") && createTableString.indexOf("(")<createTableString.lastIndexOf(")") )
                {
                System.out.println(createTableTokens[2]);
                
                    
                
                /**/
                
                String tattr=createTableString.substring(createTableString.indexOf("(")+1,createTableString.lastIndexOf(")"));
//                System.out.println("yo"+tattr);
                String[] attrli = tattr.split(",");
                for (int i=0;i<attrli.length; i++)
                {
                Attribute a = new Attribute();
                attrli[i]=attrli[i].trim();
                if(attrli[i].split("\\s+").length>=2 ||attrli[i].split("\\s+").length<=5)
                {
                    String attrtype="";
                    String attr="";
                    String attrname=attrli[i].split("\\s+")[0];
                    String constraint="";
                    System.out.println(attrli[i].split("\\s+").length);
                    if(attrli[i].split("\\s+").length==5)
                    {
                        attrtype= attrli[i].split("\\s+")[1]+" "+attrli[i].split("\\s+")[2];
                        constraint=attrli[i].split("\\s+")[3]+" "+attrli[i].split("\\s+")[4];
                             if(constraint.equals("primary key") ||constraint.equals("not null")){
                                 a.setAttributeConstraint(constraint.trim());
                             }
                             else{
                                 throw new Exception("Error in Syntax");
                             }
                    }
                    else if(attrli[i].split("\\s+").length==4)
                    {
                        System.out.println(a.AttributeType);
                        attrtype= attrli[i].split("\\s+")[1];
                        constraint=attrli[i].split("\\s+")[2]+" "+attrli[i].split("\\s+")[3];
                        System.out.println(constraint);
                             if(constraint.equals("primary key") ||constraint.equals("not null")){
                                 a.setAttributeConstraint(constraint.trim());
                                 System.out.println(a.AttributeConstraint);
                             }
                             else{
                                 throw new Exception("Error in Syntax");
                             }
                    }
                    else if(attrli[i].split("\\s+").length==3)
                    {
                        attrtype= attrli[i].substring(attrli[i].indexOf("("),attrli[i].length());                    }
                    else
                    {
                        attrtype=attrli[i].split("\\s+")[1];
                    }
                    if(attrtype.contains("(") && attrtype.contains(")"))
                    {
                        charlen=Integer.parseInt(attrtype.substring(attrtype.indexOf("(")+1,attrtype.indexOf(")")));
                        attr=attrtype;
                        attrtype=attrtype.substring(0, attrtype.indexOf("("));
                    }
                    System.out.println("hi"+charlen);
                    System.out.println("green"+attrtype);
                    switch(attrtype.trim())
                    {
                        
                        case "byte":
                                a.setAttributename(attrname);
                                a.setAttributeType(attrtype);
                                break;
                        case "unsigned byte":
                                a.setAttributename(attrname);
                                a.setAttributeType(attrtype);
                                break;
                        case "short":
                                a.setAttributename(attrname);
                                a.setAttributeType(attrtype);
                                break;
                        case "unsigned short":
                                a.setAttributename(attrname);
                                a.setAttributeType(attrtype);
                                break;
                        case "int":
                                a.setAttributename(attrname);
                                a.setAttributeType(attrtype);
                                break;
                        case "unsigned int":
                                a.setAttributename(attrname);
                                a.setAttributeType(attrtype);
                                break;
                        case "char":
                                a.setAttributename(attrname);
                                a.setAttributeType(attrtype);
                                a.setAttributeLength(charlen);
                                break;       
                        case "varchar":
                                a.setAttributename(attrname);
                                a.setAttributeType(attrtype);
                                a.setAttributeLength(charlen);
                                break;
                        case "float":
                                a.setAttributename(attrname);
                                a.setAttributeType(attrtype);
                                break;
                        case "double":
                                a.setAttributename(attrname);
                                a.setAttributeType(attrtype);
                                break;
                        case "datetime":
                                a.setAttributename(attrname);
                                a.setAttributeType(attrtype);
                                break;
                        case "date":
                                a.setAttributename(attrname);
                                a.setAttributeType(attrtype);
                                break;
                        default:
                            throw new Exception("Error in syntax");
                            
                    
                    }
                    System.out.println(a.getAttributeLength());
                    tabcol.add(a);
                }
                else 
                {
                    throw new Exception("Error in Syntax");
                }
                }
            }
        }
        else
        {
        t.setTableName(createTableTokens[2]);
        System.out.println("blah");
        }
        
        t.setTableColumn(tabcol);
        }
        
        else
        {
            throw new Exception("Error in SQL Syntax;");
            
        }

        
        System.out.println("tablename");
        System.out.println(t.TableName);
        System.out.println("operator");
        System.out.println(t.operator);
        System.out.println("list attr");
        int i;
        for(i=0;i<t.getTableColumn().size();i++)
        System.out.println(t.getTableColumn().get(i).AttributeName);
        System.out.println("costraints");
        System.out.println(t.getTableConstraint());
        System.out.println("tablename");
        System.out.println("tablename");
        
        
        return t;
        
    }

    public static void showTable(String showTables) {
        System.out.println("STUB: Calling your method to show all the tables");
        System.out.println("Parsing nsertthe string:\"" + showTables + "\"");
        File dir = new File("C:\\Users\\Preethi\\Documents\\NetBeansProjects\\Davisbase\\data\\user_data");
        File dir1 = new File("C:\\Users\\Preethi\\Documents\\NetBeansProjects\\Davisbase\\data\\catalog");
        File[] files1 = dir1.listFiles(new FilenameFilter() {
            public boolean accept(File dir1, String name) {
                
                return name.toLowerCase().endsWith(".tbl");                
            }
        });
        if(files1.length!=0)
        {
        for(int i=0;i<files1.length;i++)
        {
            String fileName1 = files1[i].getName();
            fileName1 = fileName1.substring(0, fileName1.lastIndexOf(".")+1);
            System.out.println(fileName1);
        }
        }
                
        File[] files = dir.listFiles(new FilenameFilter() {
            public boolean accept(File dir, String name) {
                
                return name.toLowerCase().endsWith(".tbl");                
            }
        });
        if(files.length!=0)
        {
        for(int i=0;i<files.length;i++)
        {
            String fileName = files[i].getName();
            fileName = fileName.substring(0, fileName.lastIndexOf(".")+1);
            System.out.println(fileName);
        }
        }
        else 
        {
            System.out.println("There are  no user tables");
        }

    }

    public static Table parseinsertInto(String insertintoString) throws IOException, Exception {
        System.out.println("STUB: Calling your method to insert into tables");
        System.out.println("Parsing the string:\"" + insertintoString + "\"");
        /*ArrayList<String> insertIntoTokens = new ArrayList<String> (Arrays.asList(insertintoString.split(" ")));
        String tableFileName = insertIntoTokens.get(3) + ".tbl";
        for(int i=3;i<insertIntoTokens.size();i++)
        {
            if(insertIntoTokens.get(i).contains("("))s
            {   
                String replace=insertIntoTokens.get(i).replace("(", "");
                insertIntoTokens.set(i, replace);
            }
            if(insertIntoTokens.get(i).contains(")"))
            {   
                String replace=insertIntoTokens.get(i).replace(")", "");
                insertIntoTokens.set(i, replace);
            }
            if(insertIntoTokens.get(i).contains(","))
            {   
                String replace=insertIntoTokens.get(i).replace(",", "");
                insertIntoTokens.set(i, replace);
            }
        }
        System.out.println(insertIntoTokens);
        try {
            RandomAccessFile tableFile = new RandomAccessFile(tableFileName, "rw");
            for(int i=3;i<insertIntoTokens.size();i++)
            {
            System.out.println(insertIntoTokens.get(i));
            tableFile.writeBytes(insertIntoTokens.get(i));
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Davisbase.class.getName()).log(Level.SEVERE, null, ex);
        }
        */
        String[] inserttokens = insertintoString.split("\\s+");
        Table t=new Table();
        List<Attribute> ltcol = new ArrayList<>();
        if(inserttokens.length==4 || inserttokens.length==5)
        {
            if(inserttokens[0].equals("insert") && inserttokens[1].equals("into") && inserttokens[3].equals("values"))
            {
                if(insertintoString.contains("(") && insertintoString.contains(")") && insertintoString.indexOf("(")<insertintoString.indexOf(")"))
                {
                t.setTableName(inserttokens[2]);
                String ta = insertintoString.substring(insertintoString.indexOf("(")+1,insertintoString.indexOf(")"));
                String[] al = ta.split(",");
                for (int i=0;i<al.length; i++) 
                {    
                    Attribute tc= new Attribute();
                    al[i]=al[i].trim();
                    tc.setAttributeValue(al[i]);
                    ltcol.add(tc);
                    System.out.println(al[i]);
                }
                }
                else
                {
                    throw new Exception("Error in SQL Syntax");
                }
            }
            else
            {
                throw new Exception("Error in SQL Syntax");
            }
        }
        else
        {
            throw new Exception("Error in SQL Syntax");
        }
        t.setTableColumn(ltcol);   
        //System.out.println(t.getTableColumn().get(0).getAttributeLength());
        return t;
    }
public static Table updateTable(String updateTableString) throws Exception
{
    System.out.println("STUB: Calling your method to delete into tables");
    System.out.println("Parsing the string:\"" + updateTableString + "\"");
    String[] updatetokens = updateTableString.split("\\s+");
    Table t = new Table();
    List<Attribute> ltcol = new ArrayList<>();
    Attribute tc= new Attribute();
    
    if(updatetokens.length==6 || updatetokens.length==8)
    {
        if(updatetokens[0].equals("update") && updatetokens[2].equals("set") && updatetokens[4].equals("=") )
            {
                t.setTableName(updatetokens[1]);
                name1=updatetokens[3];
                value1=updatetokens[5];
                if(updateTableString.contains("where"))
                {
                String condition;
                condition = updateTableString.substring(updateTableString.indexOf("where")+5, updateTableString.length());
                System.out.println("yo"+condition);
                String op="";
                if(condition.contains(">=")){
                    op=">=";
                    }
                else if(condition.contains("<=")){
                    op="<=";
                    }
                else if(condition.contains("<>")){
                    op="<>";
                    }
                else if(condition.contains("=")){
                    op="=";
                    }
                else if(condition.contains(">")){
                    op=">";
                    }
                else if(condition.contains("<")){
                    op="<";
                    }
                else
                    {
                    throw new Exception("Error in SQL Syntax"); 
                    }
                if(condition.split(op).length==2){
                    tc.setAttributename(condition.split(op)[0].trim());
                    tc.setAttributeValue(condition.split(op)[1].trim());
                    ltcol.add(tc);
                    t.setOperator(op);
                    }
                else
                   {
                   throw new Exception("Error in SQL Syntax");  
                   }
                }
            }
        else
        {
            throw new Exception("Error in Syntax");
        }
    }
    else
    {
        throw new Exception("Error in Syntax");
    }
    t.setTableColumn(ltcol);
    
    return t;
    
}
public static Table deleteTable(String deleteTableString) throws Exception
{
    List<Attribute> ltcol = new ArrayList<>();
    System.out.println("STUB: Calling your method to delee into tables");
    System.out.println("Parsing the string:\"" + deleteTableString + "\"");
    String[] deletetokens = deleteTableString.split("\\s+");
    Table t = new Table();
    Attribute a=new Attribute();
    if(deletetokens.length==4 || deletetokens.length==5)
    {
        if(deletetokens[0].equals("delete") && deletetokens[1].equals("from") && deletetokens[3].equals("where"))
        {
                t.setTableName(deletetokens[2]);
                String condition;
                condition = deleteTableString.substring(deleteTableString.indexOf("where")+5, deleteTableString.length());
                System.out.println("yo"+condition);
                String op="";
                if(condition.contains(">=")){
                    op=">=";
                    }
                else if(condition.contains("<=")){
                    op="<=";
                    }
                else if(condition.contains("<>")){
                    op="<>";
                    }
                else if(condition.contains("=")){
                    op="=";
                    }
                else if(condition.contains(">")){
                    op=">";
                    }
                else if(condition.contains("<")){
                    op="<";
                    }
                else
                    {
                    throw new Exception("Error in SQL Syntax"); 
                    }
                if(condition.split(op).length==2){
                    a.setAttributename(condition.split(op)[0].trim());
                    a.setAttributeValue(condition.split(op)[1].trim());
                    ltcol.add(a);
                    t.setOperator(op);
                    }
                    else
                    {
                        throw new Exception("Error in Syntax");
                    }
                
        }
        else
        {
            throw new Exception("Error in Syntax");
        } 
    }
    else
    {
        throw new Exception("Error in Syntax");
    }
    t.setTableColumn(ltcol);
    return t;
}
    
    
}
