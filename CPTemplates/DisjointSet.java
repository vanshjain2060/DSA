class DisjointSet//DisjointSet
{
  int[] size;
  int[] rank;
  int[] parent;
  public DisjointSet(int n)
  {
    size = new int[n+1];
    rank = new int[n+1];
    parent = new int[n+1];
    for(int i=0;i<=n;i++)
    {
      size[i] = 1;
      rank[i] = 0;
      parent[i] = i;
    }
  }
  public int findUpar(int node)
  {
    if(node==parent[node])
    return node;
    int ulp = findUpar(parent[node]);
    parent[node] = ulp;
    return parent[node];
  }
  public void UnionBySize(int u,int v)
  {
    int ulp = findUpar(u), ulv = findUpar(v);
    if(ulp==ulv)
    return;
    else if(size[ulp]<size[ulv])
    {
      parent[ulp] = ulv;
      size[ulv] += size[ulp];
    }
    else
    {
      parent[ulv] = ulp;
      size[ulp] += size[ulv];
    }
  }
  public void UnionByRank(int u,int v)
  {
    int ulp = findUpar(u), ulv = findUpar(v);
    if(ulp==ulv)
    return;
    else if(rank[ulp]<rank[ulv])
    parent[ulp] = ulv;
    else if(rank[ulp]>rank[ulv])
    parent[ulv] = ulp;
    else
    {
      parent[ulv] = ulp;
      int ranku = rank[ulp];
      rank[ulp] = ranku+1;
    }
  }
}