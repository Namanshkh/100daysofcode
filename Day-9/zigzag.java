public static void levelOrderLinewiseZZ(Node node){
      Stack<Node> stack = new Stack<>();
      stack.add(node);

      Stack<Node> cstack = new Stack<>();
      int level = 0;

      while(stack.size() > 0){
        node = stack.pop();
        System.out.print(node.data + " ");

        if(level % 2 == 0){
          for(int i = 0; i < node.children.size(); i++){
            Node child = node.children.get(i);
            cstack.push(child);
          }
        } else {
          for(int i = node.children.size() - 1; i >= 0; i--){
            Node child = node.children.get(i);
            cstack.push(child);
          }
        }

        if(stack.size() == 0){
          stack = cstack;
          cstack = new Stack<>();
          level++;
          System.out.println();
        }
      }
    }
