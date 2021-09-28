public static Node createLeftCloneTree(Node node)
  {
    if(node == null)
    {
        return null;
    }
    Node cln = createLeftCloneTree(node.left);
    Node crn = createLeftCloneTree(node.right);
    
    Node nn = new Node(node.data,cln,null);
    node.left = nn;
    node.right = crn;
    return node;
  }
