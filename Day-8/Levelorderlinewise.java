public static void levelOrderLinewise(Node node)
  {
      Queue<Node> q = new ArrayDeque<>();
      Queue<Node> secq = new ArrayDeque<>();
      q.add(node);
      while(!q.isEmpty())
      {
        node = q.remove();
        System.out.print(node.data + " ");
        
        for(Node child : node.children)
        {
            secq.add(child);
        }
        
        if(q.isEmpty())
        {
            q = secq;
            secq = new ArrayDeque<Node>();
            System.out.println();
        }
      }
      
  }
