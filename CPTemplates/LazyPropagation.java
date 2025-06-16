class SegmentTree
{
  int[] segval;
  int[] lazy;
  SegmentTree(int n)
  {
    segval = new int[4*n+1];
    lazy = new int[4*n+1];
  }
  public void build(int ind,int low,int high,int[] a)
  {
    if(low==high)
    {
      segval[ind] = a[low];
      return;
    }
    int mid = ((high-low)/2)+low;
    build(2*ind+1,low,mid,a);
    build(2*ind+2,mid+1,high,a);
    segval[ind] = segval[2*ind+1]+segval[2*ind+2];
  }
  public int query(int ind,int low,int high,int l,int r)
  {
    if(lazy[ind]!=0)
    {
      segval[ind] += ((high-low+1)*lazy[ind]);
      if(low!=high)
      {
        lazy[2*ind+1] += lazy[ind];
        lazy[2*ind+2] += lazy[ind];
      }
      lazy[ind] = 0;
    }
    if(high<l||r<low)
    return 0;
    if(low>=l&&high<=r)
    return segval[ind];
    int mid = ((high-low)/2)+low;
    int left = query(2*ind+1,low,mid,l,r);
    int right = query(2*ind+2,mid+1,high,l,r);
    return left+right;
  }
  public void update(int ind,int low,int high,int l,int r,int val)
  {
    if(lazy[ind]!=0)
    {
      segval[ind] += ((high-low+1)*lazy[ind]);
      if(low!=high)
      {
        lazy[2*ind+1] += lazy[ind];
        lazy[2*ind+2] += lazy[ind];
      }
      lazy[ind] = 0;
    }
    if(high<l||r<low)
    return;
    else if(low>=l&&high<=r)
    {
      segval[ind] += ((high-low+1)*val);
      if(low!=high)
      {
        lazy[2*ind+1] += val;
        lazy[2*ind+2] += val;
      }
      return;
    }
    else
    {
      int mid = ((high-low)/2)+low;
      update(2*ind+1,low,mid,l,r,val);
      update(2*ind+2,mid+1,high,l,r,val);
      segval[ind] = segval[2*ind+1]+segval[2*ind+2];
    }
  }
}