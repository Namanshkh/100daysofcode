public static boolean find(Node node, int data) 
  {
      Queue<Node> q = new ArrayDeque<>();
      Queue<Node> secq = new ArrayDeque<>();
      List<Integer> mylist = new ArrayList<>();
      
      q.add(node);
      
      while(!q.isEmpty())
      {
        node = q.remove();
        
        mylist.add(node.data);
        
        for(Node child : node.children)
        {
            secq.add(child);
        }
        
        if(q.isEmpty())
        {
            q = secq;
            secq = new ArrayDeque<Node>();
        }
      }
      
      if(mylist.contains(data))
      {
          return true;
      }
      else
      {
         return false; 
      }
  }
