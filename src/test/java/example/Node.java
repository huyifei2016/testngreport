package example;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Node {
 private Object data;
 private Node leftNode;
 private Node rightNode;



    public void display()
 {
     if(data!=null)
     System.out.println(data.toString());
 }
 static class YY{
     public static void main(String[] args) {
         Node node=new Node();

     }
 }

}
