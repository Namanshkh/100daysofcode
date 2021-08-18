
    public static void levelOrder(Node node){
      Queue<Node> queue = new ArrayDeque<>();
      queue.add(node);

      while(queue.size() > 0){
        node = queue.remove();

        System.out.print(node.data + " ");

        for(Node child: node.children){
          queue.add(child);
        }
      }

      System.out.println(".");
    }
