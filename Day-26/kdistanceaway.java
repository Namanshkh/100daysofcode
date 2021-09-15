public static void printKNodesFar(Node node, int data, int k)
  {
    ArrayList<Node> path = nodeToRootPath(node,data);
    for(int i=0 ; i<path.size() ;i++)
    {
        printKLevelsDown(path.get(i), k-i , i == 0? null: path.get(i-1));
    }
  }
  
  public static ArrayList<Node> nodeToRootPath(Node node, int data)
  {
    if(node==null)
    {
        return new ArrayList<Node>() ;
    }
    if(node.data == data)
    {
        ArrayList<Node> list = new ArrayList<>();
        list.add(node);
        return list;
    }
    ArrayList<Node> ll = nodeToRootPath(node.left,data);
    if(ll.size()>0)
    {
        ll.add(node);
        return ll;
    }
    ArrayList<Node> rl = nodeToRootPath(node.right,data);
    if(rl.size()>0)
    {
        rl.add(node);
        return rl;
    }
    
    return new ArrayList<Node>() ;
  }
