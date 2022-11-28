class StringBufferExample{  
public static void main(String args[]){  
StringBuffer sb=new StringBuffer("Hello ");  
sb.append("Java");
System.out.println(sb); 
}  
}  
__________________________________________________________________________

class StringBufferExample{  
public static void main(String args[]){  
StringBuffer sb=new StringBuffer("Hello ");  
sb.insert(1,"Java");
System.out.println(sb);
}  
}  

__________________________________________________________________________

class StringBufferExample3{  
public static void main(String args[]){  
StringBuffer sb=new StringBuffer("Hello");  
sb.replace(1,3,"Java");  
System.out.println(sb); 
}  
}  
