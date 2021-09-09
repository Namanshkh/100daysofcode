 public static int sum(Node node) 
  {
    if(node==null)
    {
        return 0;
    }
    int lsum = sum(node.left);
    int rsum = sum(node.right);
    int s = lsum + rsum + node.data;
    
    return s;
  }
