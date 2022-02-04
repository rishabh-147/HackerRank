import java.util.*;
import java.io.*;
class Node{
    Node left,right;
    int data;
    Node(int data){
        this.data=data;
        left=right=null;
    }
}
class day_24{

static void levelOrder(Node root){
      //Write your code here
      Queue<Node> q = new LinkedList<>();
      ArrayList<Node> vis = new ArrayList<>();
      ArrayList<Integer> arr = new ArrayList<>();
            
      vis.add(root);
      q.add(root);
      arr.add(root.data);
      while(!q.isEmpty()){
        Node curr = q.poll();
        Node curL = null, curR = null;
            if(curr.left != null)
            {
             curL = curr.left;
             if(!vis.contains(curL)){
                q.add(curL);
                vis.add(curL);
                arr.add(curL.data);
            }
      }
            if(curr.right != null){
             curR = curr.right;  
            if(!vis.contains(curR)){
                q.add(curR);
                vis.add(curR);
                arr.add(curR.data);
            }
            }
        }
        
        for(int i : arr){
            System.out.print(i + " ");
        }

    }

public static Node insert(Node root,int data){
        if(root==null){
            return new Node(data);
        }
        else{
            Node cur;
            if(data<=root.data){
                cur=insert(root.left,data);
                root.left=cur;
            }
            else{
                cur=insert(root.right,data);
                root.right=cur;
            }
            return root;
        }
    }
    public static void main(String args[]){
            Scanner sc=new Scanner(System.in);
            int T=sc.nextInt();
            Node root=null;
            while(T-->0){
                int data=sc.nextInt();
                root=insert(root,data);
            }
            levelOrder(root);
        }	
}