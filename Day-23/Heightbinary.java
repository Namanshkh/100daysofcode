public static int height(Node node) {
    if(node == null){
      return -1;
    }
    
    int lh = height(node.left);
    int rh = height(node.right);
    int th = Math.max(lh, rh) + 1;
    return th;
  }
