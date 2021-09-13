 public static boolean find(Node node, int data){
    if(node == null){
      return false;
    }

    if(node.data == data){
      return true;
    }

    boolean filc = find(node.left, data);
    if(filc){
      return true;
    }

    boolean firc = find(node.right, data);
    if(firc){
      return true;
    }

    return false;
  }
