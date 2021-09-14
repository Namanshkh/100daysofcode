public static ArrayList<Integer> nodeToRootPath(Node node, int data)
  {
    if(node==null)
    {
        return new ArrayList<Integer>() ;
    }
    if(node.data == data)
    {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(node.data);
        return list;
    }
    ArrayList<Integer> ll = nodeToRootPath(node.left,data);
    if(ll.size()>0)
    {
        ll.add(node.data);
        return ll;
    }
    ArrayList<Integer> rl = nodeToRootPath(node.right,data);
    if(rl.size()>0)
    {
        rl.add(node.data);
        return rl;
    }
    
    return new ArrayList<Integer>() ;
  }
