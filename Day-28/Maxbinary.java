
public static int max(Node node) {
    if(node == null){
      return Integer.MIN_VALUE;
    }

    int lm = max(node.left);
    int rm = max(node.right);
    int tm = Math.max(node.data, Math.max(lm, rm));
    return tm;
  }
