package excise;

public class MaxDistance {
	static int  MaxLen=0;  
    
    public void FindMaxLen(Node pRoot){  
        if(pRoot==null){  
            return;  
        }  
        if(pRoot.pLeft==null){  
            pRoot.MaxLeft=0;  
        }  
        if(pRoot.pRight==null){  
            pRoot.MaxRight=0;  
        }  
        if(pRoot.pLeft!=null){  
            FindMaxLen(pRoot.pLeft); 
            int nTempMax=0;  
            nTempMax=pRoot.pLeft.MaxLeft>pRoot.pLeft.MaxRight?pRoot.pLeft.MaxLeft:pRoot.pLeft.MaxRight;  
            pRoot.MaxLeft=nTempMax+1;  
        }  
        if(pRoot.pRight!=null){  
            FindMaxLen(pRoot.pRight); 
            int nTempMax=0;  
            nTempMax=pRoot.pRight.MaxLeft>pRoot.pRight.MaxRight?pRoot.pRight.MaxLeft:pRoot.pRight.MaxRight;  
            pRoot.MaxRight=nTempMax+1;  
        }    
        if(pRoot.MaxLeft+pRoot.MaxRight>MaxLen){  
            MaxLen=pRoot.MaxLeft+pRoot.MaxRight;  
        }  
    }  
    public static void main(String[] args) {  
        Node root=new Node(0);  
        Node p1=new Node(1);  
        Node p2=new Node(2);  
        Node p3=new Node(3);  
        Node p4=new Node(4);  
        Node p5=new Node(5);  
        Node p6=new Node(6);  
        Node p7=new Node(7);  
        Node p8=new Node(8);  
        root.pLeft=p1;  
        root.pRight=p2;  
        p1.pLeft=p3;  
        p3.pLeft=p4;  
        p2.pLeft=p5;  
        p2.pRight=p6;  
        p6.pRight=p7;  
        p7.pRight=p8;  
        System.out.println(MaxLen);  
        new MaxDistance().FindMaxLen(root);  
        System.out.println(MaxLen);  
    }  
}
