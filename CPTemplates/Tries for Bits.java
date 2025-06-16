class Trie 
{
  private static class TrieNode 
  {
    TrieNode[] children = new TrieNode[2];
    int count = 0; 
  }
  private final TrieNode root;
  public Trie() 
  {
    root = new TrieNode();
  }
  public void insert(int num) 
  {
    TrieNode node = root;
    for(int i=30;i>=0;i--)
    {
      int bit = (num>>i)&1;
      if(node.children[bit]==null) 
      node.children[bit] = new TrieNode();
      node = node.children[bit];
      node.count++;
    }
  }
  public void remove(int num) 
  {
    if(!contains(num)) 
    return; 
    TrieNode node = root;
    for(int i=30;i>=0;i--) 
    {
      int bit = (num>>i)&1;
      node = node.children[bit];
      node.count--;
    }
  }
  public int maxxor(int num) 
  {
    TrieNode node = root;
    int maxxor = 0;
    for (int i=30;i>=0;i--) 
    {
      int bit = (num>>i)&1;
      int oppositeBit = 1-bit;
      if(node==null)
      break;
      if(node.children[oppositeBit]!=null&&node.children[oppositeBit].count>0) 
      {
        maxxor |= (1<<i);
        node = node.children[oppositeBit];
      } 
      else if(node.children[bit]!=null) 
      node = node.children[bit];
      else
      break;
    }
    return maxxor;
  }
  public boolean contains(int num) 
  {
    TrieNode node = root;
    for(int i=30;i>=0;i--) 
    {
      int bit = (num>>i)&1;
      if(node.children[bit]==null||node.children[bit].count==0) 
      return false;
      node = node.children[bit];
    }
    return true;
  }
}