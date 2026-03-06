import java.util.*;
import java.io.*;
class BSTNode{
    int data;
    BSTNode left;
    BSTNode right;
    public BSTNode(int data){
        this.data=data;
        this.left=null;
        this.right=null;
    }
    
}

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Solution sol = new Solution();
        BSTNode root = null;
        while(sc.hasNextInt()){
            int x=sc.nextInt();
            root=sol.insert(root,x);
        }
    sol.preOrder(root);
    }
}
class Solution{
    BSTNode insert(BSTNode root,int x){
        if(root==null)return new BSTNode(x);
        if(x<root.data)root.left=insert(root.left,x);
        else root.right=insert(root.right,x);
        return root;
    }
    void preOrder(BSTNode r)
    {
        if(r==null)return;
        System.out.print(r.data+" ");
        preOrder(r.left);
        preOrder(r.right);
    }}
