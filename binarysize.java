public static int size(Node node)
  {
    if(node == null)
    {
        return 0;
    }
    
    int ls = size(node.left);
    int rs = size(node.right);
    
    return rs+ls+1;
  }
