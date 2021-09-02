public class Mybtree {
	
	public static class Node
	{
		int data;
		Node left;
		Node right;
		
		Node(int data,Node left, Node right)
		{
			this.data=data;
			this.left=left;
			this.right=right;
		}
	}
	
	public static class pair
	{
		int state;
		Node node;
		
		pair(Node node , int state)
		{
			this.state = state;
			this.node = node;
		}
	}
	
	public static void display(Node node)
	{
		
		if(node==null)
		{
			return;
		}
		
		String str = "" ;
		
		str += node.left == null ? "." :node.left.data+"";
		str += "<--" + node.data +"-->";
		str += node.right == null ? "." :node.right.data+"";
		
		System.out.println(str);
		
		display(node.left);
		display(node.right);
 	}

	public static void main(String[] args) 
	{
		Integer arr[] = {50,25,12,null,null,37,30,null,null,null,75,62,null,70,null,null,87,null,null};
		Stack<pair> s1 = new Stack<>();
		Node root  = new Node(arr[0],null,null);
		pair rtp = new pair(root,1);
		s1.push(rtp);
		int idx = 0;
		while(s1.size()>0)
		{
			pair top = s1.peek();
			if(top.state == 1)
			{
				idx++;
				if(arr[idx] != null)
				{
					Node ln = new Node(arr[idx],null,null);
					top.node.left=ln;
					
					pair lp = new pair(ln,1);
					s1.push(lp);
				}
				else
				{
					top.node.left = null;
				}
				
				top.state++;
			}
			else if(top.state == 2)
			{
				idx++;
				if(arr[idx] != null)
				{
					Node rn = new Node(arr[idx],null,null);
					top.node.right=rn;
					
					pair rp = new pair(rn,1);
					s1.push(rp);
				}
				else
				{
					top.node.right = null;
				}
				
				top.state++;
			}
			else
			{
				s1.pop();
			}
			
		}
		display(root);
	}

}
