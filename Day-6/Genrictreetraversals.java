public static int traversals(Node node)
  {
      int data = node.data;
      System.out.println("Node Pre "+data);
      
      for(Node child : node.children)
      {
          System.out.println("Edge Pre "+node.data+"--"+child.data);
          int c = traversals(child);
          System.out.println("Edge Post "+node.data+"--"+c);
      }
      
      System.out.println("Node Post "+ data);
      
      return data;
  }
